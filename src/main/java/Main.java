import com.google.gson.Gson;
import pojo.Qualys;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Qualys> dataList = new ArrayList<>() ;
        Gson gson = new Gson();

        PostgreSQLJDBC.loadDataIntoListsFromDatabase();

        // read json and put in java objects
        for(int i=0; i<PostgreSQLJDBC.jsonsList.size(); i++)
        {
            String json = PostgreSQLJDBC.jsonsList.get(i);
            //System.out.println(json+"\n\n");

            if(!json.isEmpty())
            {
                Qualys qualys = gson.fromJson(json, Qualys.class);
                dataList.add(qualys);
            }
        }

        for(int i=0; i<dataList.size(); i++)
        {
            Qualys qualys = dataList.get(i);
        }
    }
}