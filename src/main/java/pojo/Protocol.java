package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class Protocol implements Serializable
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
    private final static long serialVersionUID = 7972727126247830249L;

    /**
     * No args constructor for use in serialization
     */
    public Protocol()
    {
    }

    /**
     * @param id
     * @param name
     * @param version
     */
    public Protocol(long id, String name, String version)
    {
        super();
        this.id = id;
        this.name = name;
        this.version = version;
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

    @Override
    public String toString()
    {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("version", version).toString();
    }

}
