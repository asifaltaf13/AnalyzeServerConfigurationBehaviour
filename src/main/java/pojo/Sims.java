package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;

public class Sims implements Serializable
{

    @SerializedName("results")
    @Expose
    private ArrayList<Result> results = null;
    private final static long serialVersionUID = -4469442814211698976L;

    /**
     * No args constructor for use in serialization
     */
    public Sims()
    {
    }

    /**
     * @param results
     */
    public Sims(ArrayList<Result> results)
    {
        super();
        this.results = results;
    }

    public ArrayList<Result> getResults()
    {
        return results;
    }

    public void setResults(ArrayList<Result> results)
    {
        this.results = results;
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this).append("results", results).toString();
    }

}
