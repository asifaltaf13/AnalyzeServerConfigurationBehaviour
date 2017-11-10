package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class Client implements Serializable
{

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("isReference")
    @Expose
    private boolean isReference;
    @SerializedName("platform")
    @Expose
    private String platform;
    private final static long serialVersionUID = 7900427261855443150L;

    /**
     * No args constructor for use in serialization
     */
    public Client()
    {
    }

    /**
     * @param id
     * @param platform
     * @param name
     * @param isReference
     * @param version
     */
    public Client(long id, String name, String version, boolean isReference, String platform)
    {
        super();
        this.id = id;
        this.name = name;
        this.version = version;
        this.isReference = isReference;
        this.platform = platform;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getVersion()
    {
        return version;
    }

    public void setVersion(String version)
    {
        this.version = version;
    }

    public boolean isIsReference()
    {
        return isReference;
    }

    public void setIsReference(boolean isReference)
    {
        this.isReference = isReference;
    }

    public String getPlatform()
    {
        return platform;
    }

    public void setPlatform(String platform)
    {
        this.platform = platform;
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("version", version).append("isReference", isReference).append("platform", platform).toString();
    }

}
