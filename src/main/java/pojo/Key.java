package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class Key implements Serializable
{

    @SerializedName("size")
    @Expose
    private long size;
    @SerializedName("alg")
    @Expose
    private String alg;
    @SerializedName("strength")
    @Expose
    private long strength;
    private final static long serialVersionUID = 6372461439773932584L;

    /**
     * No args constructor for use in serialization
     */
    public Key()
    {
    }

    /**
     * @param alg
     * @param strength
     * @param size
     */
    public Key(long size, String alg, long strength)
    {
        super();
        this.size = size;
        this.alg = alg;
        this.strength = strength;
    }

    public long getSize()
    {
        return size;
    }

    public void setSize(long size)
    {
        this.size = size;
    }

    public String getAlg()
    {
        return alg;
    }

    public void setAlg(String alg)
    {
        this.alg = alg;
    }

    public long getStrength()
    {
        return strength;
    }

    public void setStrength(long strength)
    {
        this.strength = strength;
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this).append("size", size).append("alg", alg).append("strength", strength).toString();
    }

}
