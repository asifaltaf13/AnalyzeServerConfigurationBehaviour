package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class Suites implements Serializable
{

    @SerializedName("list")
    @Expose
    private java.util.List<List> list = null;
    @SerializedName("preference")
    @Expose
    private boolean preference;
    private final static long serialVersionUID = 7467974312108665564L;

    /**
     * No args constructor for use in serialization
     */
    public Suites()
    {
    }

    /**
     * @param preference
     * @param list
     */
    public Suites(java.util.List<List> list, boolean preference)
    {
        super();
        this.list = list;
        this.preference = preference;
    }

    public java.util.List<List> getList()
    {
        return list;
    }

    public void setList(java.util.List<List> list)
    {
        this.list = list;
    }

    public boolean isPreference()
    {
        return preference;
    }

    public void setPreference(boolean preference)
    {
        this.preference = preference;
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this).append("list", list).append("preference", preference).toString();
    }

}
