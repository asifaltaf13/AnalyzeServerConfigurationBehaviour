package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;

public class Chain implements Serializable
{

    @SerializedName("certs")
    @Expose
    private ArrayList<Cert_> certs = null;
    @SerializedName("issues")
    @Expose
    private long issues;
    private final static long serialVersionUID = -1473103495784018190L;

    /**
     * No args constructor for use in serialization
     */
    public Chain()
    {
    }

    /**
     * @param certs
     * @param issues
     */
    public Chain(ArrayList<Cert_> certs, long issues)
    {
        super();
        this.certs = certs;
        this.issues = issues;
    }

    public ArrayList<Cert_> getCerts()
    {
        return certs;
    }

    public void setCerts(ArrayList<Cert_> certs)
    {
        this.certs = certs;
    }

    public long getIssues()
    {
        return issues;
    }

    public void setIssues(long issues)
    {
        this.issues = issues;
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this).append("certs", certs).append("issues", issues).toString();
    }

}
