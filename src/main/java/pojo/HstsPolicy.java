package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class HstsPolicy implements Serializable
{

    @SerializedName("LONG_MAX_AGE")
    @Expose
    private long lONGMAXAGE;
    @SerializedName("header")
    @Expose
    private String header;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("maxAge")
    @Expose
    private long maxAge;
    @SerializedName("includeSubDomains")
    @Expose
    private boolean includeSubDomains;
    @SerializedName("preload")
    @Expose
    private boolean preload;
    @SerializedName("directives")
    @Expose
    private Directives directives;
    private final static long serialVersionUID = 2075932969268063174L;

    /**
     * No args constructor for use in serialization
     */
    public HstsPolicy()
    {
    }

    /**
     * @param maxAge
     * @param lONGMAXAGE
     * @param status
     * @param directives
     * @param preload
     * @param header
     * @param includeSubDomains
     */
    public HstsPolicy(long lONGMAXAGE, String header, String status, long maxAge, boolean includeSubDomains, boolean preload, Directives directives)
    {
        super();
        this.lONGMAXAGE = lONGMAXAGE;
        this.header = header;
        this.status = status;
        this.maxAge = maxAge;
        this.includeSubDomains = includeSubDomains;
        this.preload = preload;
        this.directives = directives;
    }

    public long getLONGMAXAGE()
    {
        return lONGMAXAGE;
    }

    public void setLONGMAXAGE(long lONGMAXAGE)
    {
        this.lONGMAXAGE = lONGMAXAGE;
    }

    public String getHeader()
    {
        return header;
    }

    public void setHeader(String header)
    {
        this.header = header;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public long getMaxAge()
    {
        return maxAge;
    }

    public void setMaxAge(long maxAge)
    {
        this.maxAge = maxAge;
    }

    public boolean isIncludeSubDomains()
    {
        return includeSubDomains;
    }

    public void setIncludeSubDomains(boolean includeSubDomains)
    {
        this.includeSubDomains = includeSubDomains;
    }

    public boolean isPreload()
    {
        return preload;
    }

    public void setPreload(boolean preload)
    {
        this.preload = preload;
    }

    public Directives getDirectives()
    {
        return directives;
    }

    public void setDirectives(Directives directives)
    {
        this.directives = directives;
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this).append("lONGMAXAGE", lONGMAXAGE).append("header", header).append("status", status).append("maxAge", maxAge).append("includeSubDomains", includeSubDomains).append("preload", preload).append("directives", directives).toString();
    }

}
