package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class Directives implements Serializable
{

    @SerializedName("includesubdomains")
    @Expose
    private String includesubdomains;
    @SerializedName("max-age")
    @Expose
    private String maxAge;
    @SerializedName("preload")
    @Expose
    private String preload;
    private final static long serialVersionUID = 5007776185847937322L;

    /**
     * No args constructor for use in serialization
     */
    public Directives()
    {
    }

    /**
     * @param maxAge
     * @param includesubdomains
     * @param preload
     */
    public Directives(String includesubdomains, String maxAge, String preload)
    {
        super();
        this.includesubdomains = includesubdomains;
        this.maxAge = maxAge;
        this.preload = preload;
    }

    public String getIncludesubdomains()
    {
        return includesubdomains;
    }

    public void setIncludesubdomains(String includesubdomains)
    {
        this.includesubdomains = includesubdomains;
    }

    public String getMaxAge()
    {
        return maxAge;
    }

    public void setMaxAge(String maxAge)
    {
        this.maxAge = maxAge;
    }

    public String getPreload()
    {
        return preload;
    }

    public void setPreload(String preload)
    {
        this.preload = preload;
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this).append("includesubdomains", includesubdomains).append("maxAge", maxAge).append("preload", preload).toString();
    }

}
