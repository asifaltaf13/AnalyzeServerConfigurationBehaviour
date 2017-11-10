package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class List implements Serializable
{

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("cipherStrength")
    @Expose
    private long cipherStrength;
    @SerializedName("ecdhBits")
    @Expose
    private long ecdhBits;
    @SerializedName("ecdhStrength")
    @Expose
    private long ecdhStrength;
    private final static long serialVersionUID = 2523547404371879333L;

    /**
     * No args constructor for use in serialization
     */
    public List()
    {
    }

    /**
     * @param id
     * @param cipherStrength
     * @param ecdhStrength
     * @param ecdhBits
     * @param name
     */
    public List(long id, String name, long cipherStrength, long ecdhBits, long ecdhStrength)
    {
        super();
        this.id = id;
        this.name = name;
        this.cipherStrength = cipherStrength;
        this.ecdhBits = ecdhBits;
        this.ecdhStrength = ecdhStrength;
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

    public long getCipherStrength()
    {
        return cipherStrength;
    }

    public void setCipherStrength(long cipherStrength)
    {
        this.cipherStrength = cipherStrength;
    }

    public long getEcdhBits()
    {
        return ecdhBits;
    }

    public void setEcdhBits(long ecdhBits)
    {
        this.ecdhBits = ecdhBits;
    }

    public long getEcdhStrength()
    {
        return ecdhStrength;
    }

    public void setEcdhStrength(long ecdhStrength)
    {
        this.ecdhStrength = ecdhStrength;
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("cipherStrength", cipherStrength).append("ecdhBits", ecdhBits).append("ecdhStrength", ecdhStrength).toString();
    }

}
