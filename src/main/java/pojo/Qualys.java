package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;

public class Qualys implements Serializable
{

    @SerializedName("host")
    @Expose
    private String host;
    @SerializedName("port")
    @Expose
    private long port;
    @SerializedName("protocol")
    @Expose
    private String protocol;
    @SerializedName("isPublic")
    @Expose
    private boolean isPublic;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("startTime")
    @Expose
    private long startTime;
    @SerializedName("testTime")
    @Expose
    private long testTime;
    @SerializedName("engineVersion")
    @Expose
    private String engineVersion;
    @SerializedName("criteriaVersion")
    @Expose
    private String criteriaVersion;
    @SerializedName("endpoints")
    @Expose
    private ArrayList<Endpoint> endpoints = null;
    private final static long serialVersionUID = 212329626418029181L;

    /**
     * No args constructor for use in serialization
     */
    public Qualys()
    {
    }

    /**
     * @param startTime
     * @param port
     * @param criteriaVersion
     * @param protocol
     * @param host
     * @param status
     * @param endpoints
     * @param isPublic
     * @param testTime
     * @param engineVersion
     */
    public Qualys(String host, long port, String protocol, boolean isPublic, String status, long startTime, long testTime, String engineVersion, String criteriaVersion, ArrayList<Endpoint> endpoints)
    {
        super();
        this.host = host;
        this.port = port;
        this.protocol = protocol;
        this.isPublic = isPublic;
        this.status = status;
        this.startTime = startTime;
        this.testTime = testTime;
        this.engineVersion = engineVersion;
        this.criteriaVersion = criteriaVersion;
        this.endpoints = endpoints;
    }

    public String getHost()
    {
        return host;
    }

    public void setHost(String host)
    {
        this.host = host;
    }

    public long getPort()
    {
        return port;
    }

    public void setPort(long port)
    {
        this.port = port;
    }

    public String getProtocol()
    {
        return protocol;
    }

    public void setProtocol(String protocol)
    {
        this.protocol = protocol;
    }

    public boolean isIsPublic()
    {
        return isPublic;
    }

    public void setIsPublic(boolean isPublic)
    {
        this.isPublic = isPublic;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public long getStartTime()
    {
        return startTime;
    }

    public void setStartTime(long startTime)
    {
        this.startTime = startTime;
    }

    public long getTestTime()
    {
        return testTime;
    }

    public void setTestTime(long testTime)
    {
        this.testTime = testTime;
    }

    public String getEngineVersion()
    {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion)
    {
        this.engineVersion = engineVersion;
    }

    public String getCriteriaVersion()
    {
        return criteriaVersion;
    }

    public void setCriteriaVersion(String criteriaVersion)
    {
        this.criteriaVersion = criteriaVersion;
    }

    public ArrayList<Endpoint> getEndpoints()
    {
        return endpoints;
    }

    public void setEndpoints(ArrayList<Endpoint> endpoints)
    {
        this.endpoints = endpoints;
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this).append("host", host).append("port", port).append("protocol", protocol).append("isPublic", isPublic).append("status", status).append("startTime", startTime).append("testTime", testTime).append("engineVersion", engineVersion).append("criteriaVersion", criteriaVersion).append("endpoints", endpoints).toString();
    }

}
