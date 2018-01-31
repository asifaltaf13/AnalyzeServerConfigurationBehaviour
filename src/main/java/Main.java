import com.google.gson.Gson;
import pojo.Qualys;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Qualys> dataList = new ArrayList<>();
        Gson gson = new Gson();

        //PostgreSQLJDBC.loadDataIntoListsFromDatabase();
        PostgreSQLJDBC.loadDomainsDataFromDatabase();

        PostgreSQLJDBC.domainTableData.forEach((key, value) ->
        {
            // load domainHistoryList
            System.out.println("Key : " + key + " Value : " + value);
            PostgreSQLJDBC.loadHistoryDataFromDatabase((long) key);

            //sort them according to date timestamps
            ArrayList<HistoryRow> domainHistoryList = PostgreSQLJDBC.historyTableData.get(((Long) key).intValue());
            Collections.sort(domainHistoryList, new Comparator<HistoryRow>()
            {
                @Override
                public int compare(HistoryRow lhs, HistoryRow rhs)
                {
                    Date lhsDate = new Date(((long) lhs.getDatein() * 1000));
                    Date rhsDate = new Date(((long) rhs.getDatein() * 1000));

                    if (lhsDate.getTime() < rhsDate.getTime())
                    {
                        return -1;
                    }
                    else if (lhsDate.getTime() == rhsDate.getTime())
                    {
                        return 0;
                    }
                    else
                    {
                        return 1;
                    }
                }
            });

            // perform the analysis
            int numberOfAttemps = domainHistoryList.size();
            String lowestGrading = domainHistoryList.get(0).getRating();
            String highestGrading = domainHistoryList.get(numberOfAttemps-1).getRating();
            String configurationJson = domainHistoryList.get(numberOfAttemps-1).getQualys();
        });


        // read json and put in java objects
//        for (int i = 0; i < PostgreSQLJDBC.jsonsList.size(); i++)
//        {
//            String json = PostgreSQLJDBC.jsonsList.get(i);
//            //System.out.println(json+"\n\n");
//
//            if (!json.isEmpty())
//            {
//                Qualys qualys = gson.fromJson(json, Qualys.class);
//                dataList.add(qualys);
//            }
//        }
//
//        for (int i = 0; i < dataList.size(); i++)
//        {
//            Qualys qualys = dataList.get(i);
//        }


    }
}