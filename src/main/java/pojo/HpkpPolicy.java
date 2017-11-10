package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;

public class HpkpPolicy implements Serializable
{

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("pins")
    @Expose
    private ArrayList<Object> pins = null;
    @SerializedName("matchedPins")
    @Expose
    private ArrayList<Object> matchedPins = null;
    @SerializedName("directives")
    @Expose
    private ArrayList<Object> directives = null;
    private final static long serialVersionUID = 2438819504391133991L;

    /**
     * No args constructor for use in serialization
     */
    public HpkpPolicy()
    {
    }

    /**
     * @param pins
     * @param status
     * @param directives
     * @param matchedPins
     */
    public HpkpPolicy(String status, ArrayList<Object> pins, ArrayList<Object> matchedPins, ArrayList<Object> directives)
    {
        super();
        this.status = status;
        this.pins = pins;
        this.matchedPins = matchedPins;
        this.directives = directives;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public ArrayList<Object> getPins()
    {
        return pins;
    }

    public void setPins(ArrayList<Object> pins)
    {
        this.pins = pins;
    }

    public ArrayList<Object> getMatchedPins()
    {
        return matchedPins;
    }

    public void setMatchedPins(ArrayList<Object> matchedPins)
    {
        this.matchedPins = matchedPins;
    }

    public ArrayList<Object> getDirectives()
    {
        return directives;
    }

    public void setDirectives(ArrayList<Object> directives)
    {
        this.directives = directives;
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this).append("status", status).append("pins", pins).append("matchedPins", matchedPins).append("directives", directives).toString();
    }

}
