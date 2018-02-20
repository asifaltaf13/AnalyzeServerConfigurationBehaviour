import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

public class PostgreSQLJDBC
{
    public static ArrayList<Integer> idsList = new ArrayList<>();
    public static ArrayList<String> urlsList = new ArrayList<>();
    public static ArrayList<String> ratingsList = new ArrayList<>();
    public static ArrayList<Integer> categorysList = new ArrayList<>();
    public static ArrayList<String> jsonsList = new ArrayList<>();

    public static HashMap domainTableData = new HashMap();
    public static HashMap<Integer, ArrayList<HistoryRow>> historyTableData = new HashMap();

    public static void loadDataIntoListsFromDatabase()
    {
        Connection connection = null;
        Statement statement = null;

        try
        {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/fluffy_rainbows",
                            "postgres", "postgres");
            connection.setAutoCommit(false);
            System.out.println("Opened database successfully");

            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "select url, rating, category, qualys " +
                            "from domain, history " +
                            "where domain.id = history.domainhistory AND domain.id<50;");
            System.out.println("Query run successfully");

            while (resultSet.next() && jsonsList.size() < 5)
            {
                String url = resultSet.getString("url");
                String rating = resultSet.getString("rating");
                int category = resultSet.getInt("category");
                String json = resultSet.getString("qualys");

                urlsList.add(url);
                ratingsList.add(rating);
                categorysList.add(category);
                jsonsList.add(json);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e)
        {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Data loaded successfully");
    }

    public static void loadDomainsDataFromDatabase()
    {
        Connection connection;
        Statement statement;

        try
        {
            // open a database connection
            connection = openDatabaseConnection();
            statement = connection.createStatement();


            if(connection != null)
            {
                // run query and obtain results
                ResultSet resultSet = runQuery(connection, statement, "SELECT count(*)" + "FROM domain");

                long rowsCount = 0;
                while (resultSet.next())
                {
                    System.out.println("Processing query results.");
                    rowsCount = resultSet.getLong("count");

                    domainTableData = new HashMap((int) rowsCount);

                    for (int i = 0; i < rowsCount; i = i + 1000)
                    {
                        String query = "select * from domain limit 999 offset " + i;
                        Statement subStatement = connection.createStatement();
                        System.out.println("Running query for " + i + " to " + (i + 999));
                        ResultSet resultSubset = subStatement.executeQuery(query);
                        System.out.println("Sub query results obtained.");

                        while (resultSubset.next())
                        {
                            Long id = resultSubset.getLong("id");
                            String url = resultSubset.getString("url");

                            domainTableData.put(id, url);
                        }

                        resultSubset.close();
                        subStatement.close();
                    }

                    System.out.println("Domain data loaded completely");
                }
                resultSet.close();
                statement.close();
                connection.close();
            }
        } catch (Exception e)
        {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        //System.out.println("Data loaded successfully");
    }

    private static ResultSet runQuery(Connection connection, Statement statement, String s)
    {
        try
        {
            ResultSet resultSet = statement.executeQuery(
                    "SELECT count(*)" +
                            "FROM domain");

            return resultSet;

        } catch (SQLException e)
        {
            e.printStackTrace();
        }

        return null;
    }

    private static Connection openDatabaseConnection()
    {
        Connection connection = null;
        try
        {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/fluffy_rainbows",
                            "postgres", "postgres");
            connection.setAutoCommit(false);
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        System.out.println("Opened database successfully.");
        return connection;
    }

    public static void loadHistoryDataFromDatabase(long domainId)
    {
        Connection connection;
        Statement statement;

        try
        {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/fluffy_rainbows",
                            "postgres", "postgres");
            connection.setAutoCommit(false);
            System.out.println("Opened database successfully.");

            statement = connection.createStatement();
            System.out.println("Running query.");
            String query = "select * from history where domainhistory = '" + domainId + "'";
            ResultSet resultSet = statement.executeQuery(query);
            System.out.println("Query results obtained.");

            while (resultSet.next())
            {
                System.out.println("Processing query results.");

                Integer id = resultSet.getInt("id");
                Integer datein = resultSet.getInt("datein");
                Integer timespan = resultSet.getInt("timespan");
                String rating = resultSet.getString("rating");
                Integer category = resultSet.getInt("category");
                String qualys = resultSet.getString("qualys");
                Integer domainhistory = resultSet.getInt("domainhistory");

                rating = rating.replace("\n", "")
                        .replace("\r", "")
                        .replace("\t", "");

                ArrayList itemsList = (ArrayList) historyTableData.get(domainhistory);
                if (itemsList == null)
                {
                    itemsList = new ArrayList();
                    historyTableData.put(domainhistory, itemsList);
                }
                itemsList.add(new HistoryRow(id, datein, timespan, rating, category, qualys, domainhistory));
            }

            System.out.println("History data loaded completely");

            resultSet.close();
            statement.close();
            connection.close();
        } catch(
                Exception e)

        {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Data loaded successfully");
    }
}
