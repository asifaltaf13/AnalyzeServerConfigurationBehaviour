package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class HstsPreload implements Serializable
{

    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("hostname")
    @Expose
    private String hostname;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("sourceTime")
    @Expose
    private long sourceTime;
    private final static long serialVersionUID = -4223546847383163740L;

    /**
     * No args constructor for use in serialization
     */
    public HstsPreload()
    {
    }

    /**
     * @param source
     * @param status
     * @param sourceTime
     * @param hostname
     */
    public HstsPreload(String source, String hostname, String status, long sourceTime)
    {
        super();
        this.source = source;
        this.hostname = hostname;
        this.status = status;
        this.sourceTime = sourceTime;
    }

    public String getSource()
    {
        return source;
    }

    public void setSource(String source)
    {
        this.source = source;
    }

    public String getHostname()
    {
        return hostname;
    }

    public void setHostname(String hostname)
    {
        this.hostname = hostname;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public long getSourceTime()
    {
        return sourceTime;
    }

    public void setSourceTime(long sourceTime)
    {
        this.sourceTime = sourceTime;
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this).append("source", source).append("hostname", hostname).append("status", status).append("sourceTime", sourceTime).toString();
    }

}
