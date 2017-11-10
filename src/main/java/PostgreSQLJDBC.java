import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class PostgreSQLJDBC
{
    public static ArrayList<Integer> idsList = new ArrayList<>();
    public static ArrayList<String> urlsList = new ArrayList<>();
    public static ArrayList<String> ratingsList = new ArrayList<>();
    public static ArrayList<Integer> categorysList = new ArrayList<>();
    public static ArrayList<String> jsonsList = new ArrayList<>();

    public static void loadDataIntoListsFromDatabase()
    {
        Connection connection = null;
        Statement statement = null;

        try
        {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/17-10-26-qualysdump",
                            "Asif", "1");
            connection.setAutoCommit(false);
            System.out.println("Opened database successfully");

            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "select url, rating, category, qualys " +
                            "from domain, history " +
                            "where domain.id = history.domainhistory AND domain.id<50;");
            System.out.println("Query run successfully");

            while (resultSet.next() && jsonsList.size()<5)
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
}
