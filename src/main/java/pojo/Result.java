package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class Result implements Serializable
{

    @SerializedName("client")
    @Expose
    private Client client;
    @SerializedName("errorCode")
    @Expose
    private long errorCode;
    @SerializedName("attempts")
    @Expose
    private long attempts;
    @SerializedName("protocolId")
    @Expose
    private long protocolId;
    @SerializedName("suiteId")
    @Expose
    private long suiteId;
    @SerializedName("kxInfo")
    @Expose
    private String kxInfo;
    private final static long serialVersionUID = 452110147863325131L;

    /**
     * No args constructor for use in serialization
     */
    public Result()
    {
    }

    /**
     * @param client
     * @param attempts
     * @param kxInfo
     * @param errorCode
     * @param suiteId
     * @param protocolId
     */
    public Result(Client client, long errorCode, long attempts, long protocolId, long suiteId, String kxInfo)
    {
        super();
        this.client = client;
        this.errorCode = errorCode;
        this.attempts = attempts;
        this.protocolId = protocolId;
        this.suiteId = suiteId;
        this.kxInfo = kxInfo;
    }

    public Client getClient()
    {
        return client;
    }

    public void setClient(Client client)
    {
        this.client = client;
    }

    public long getErrorCode()
    {
        return errorCode;
    }

    public void setErrorCode(long errorCode)
    {
        this.errorCode = errorCode;
    }

    public long getAttempts()
    {
        return attempts;
    }

    public void setAttempts(long attempts)
    {
        this.attempts = attempts;
    }

    public long getProtocolId()
    {
        return protocolId;
    }

    public void setProtocolId(long protocolId)
    {
        this.protocolId = protocolId;
    }

    public long getSuiteId()
    {
        return suiteId;
    }

    public void setSuiteId(long suiteId)
    {
        this.suiteId = suiteId;
    }

    public String getKxInfo()
    {
        return kxInfo;
    }

    public void setKxInfo(String kxInfo)
    {
        this.kxInfo = kxInfo;
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this).append("client", client).append("errorCode", errorCode).append("attempts", attempts).append("protocolId", protocolId).append("suiteId", suiteId).append("kxInfo", kxInfo).toString();
    }

}
