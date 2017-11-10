package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class Cert_ implements Serializable
{

    @SerializedName("subject")
    @Expose
    private String subject;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("notBefore")
    @Expose
    private long notBefore;
    @SerializedName("notAfter")
    @Expose
    private long notAfter;
    @SerializedName("issuerSubject")
    @Expose
    private String issuerSubject;
    @SerializedName("issuerLabel")
    @Expose
    private String issuerLabel;
    @SerializedName("sigAlg")
    @Expose
    private String sigAlg;
    @SerializedName("issues")
    @Expose
    private long issues;
    @SerializedName("keyAlg")
    @Expose
    private String keyAlg;
    @SerializedName("keySize")
    @Expose
    private long keySize;
    @SerializedName("keyStrength")
    @Expose
    private long keyStrength;
    @SerializedName("revocationStatus")
    @Expose
    private long revocationStatus;
    @SerializedName("crlRevocationStatus")
    @Expose
    private long crlRevocationStatus;
    @SerializedName("ocspRevocationStatus")
    @Expose
    private long ocspRevocationStatus;
    @SerializedName("sha1Hash")
    @Expose
    private String sha1Hash;
    @SerializedName("pinSha256")
    @Expose
    private String pinSha256;
    @SerializedName("raw")
    @Expose
    private String raw;
    private final static long serialVersionUID = -5089713634851195600L;

    /**
     * No args constructor for use in serialization
     */
    public Cert_()
    {
    }

    /**
     * @param raw
     * @param notBefore
     * @param crlRevocationStatus
     * @param issuerLabel
     * @param keySize
     * @param pinSha256
     * @param subject
     * @param label
     * @param notAfter
     * @param ocspRevocationStatus
     * @param sha1Hash
     * @param keyStrength
     * @param keyAlg
     * @param revocationStatus
     * @param issues
     * @param sigAlg
     * @param issuerSubject
     */
    public Cert_(String subject, String label, long notBefore, long notAfter, String issuerSubject, String issuerLabel, String sigAlg, long issues, String keyAlg, long keySize, long keyStrength, long revocationStatus, long crlRevocationStatus, long ocspRevocationStatus, String sha1Hash, String pinSha256, String raw)
    {
        super();
        this.subject = subject;
        this.label = label;
        this.notBefore = notBefore;
        this.notAfter = notAfter;
        this.issuerSubject = issuerSubject;
        this.issuerLabel = issuerLabel;
        this.sigAlg = sigAlg;
        this.issues = issues;
        this.keyAlg = keyAlg;
        this.keySize = keySize;
        this.keyStrength = keyStrength;
        this.revocationStatus = revocationStatus;
        this.crlRevocationStatus = crlRevocationStatus;
        this.ocspRevocationStatus = ocspRevocationStatus;
        this.sha1Hash = sha1Hash;
        this.pinSha256 = pinSha256;
        this.raw = raw;
    }

    public String getSubject()
    {
        return subject;
    }

    public void setSubject(String subject)
    {
        this.subject = subject;
    }

    public String getLabel()
    {
        return label;
    }

    public void setLabel(String label)
    {
        this.label = label;
    }

    public long getNotBefore()
    {
        return notBefore;
    }

    public void setNotBefore(long notBefore)
    {
        this.notBefore = notBefore;
    }

    public long getNotAfter()
    {
        return notAfter;
    }

    public void setNotAfter(long notAfter)
    {
        this.notAfter = notAfter;
    }

    public String getIssuerSubject()
    {
        return issuerSubject;
    }

    public void setIssuerSubject(String issuerSubject)
    {
        this.issuerSubject = issuerSubject;
    }

    public String getIssuerLabel()
    {
        return issuerLabel;
    }

    public void setIssuerLabel(String issuerLabel)
    {
        this.issuerLabel = issuerLabel;
    }

    public String getSigAlg()
    {
        return sigAlg;
    }

    public void setSigAlg(String sigAlg)
    {
        this.sigAlg = sigAlg;
    }

    public long getIssues()
    {
        return issues;
    }

    public void setIssues(long issues)
    {
        this.issues = issues;
    }

    public String getKeyAlg()
    {
        return keyAlg;
    }

    public void setKeyAlg(String keyAlg)
    {
        this.keyAlg = keyAlg;
    }

    public long getKeySize()
    {
        return keySize;
    }

    public void setKeySize(long keySize)
    {
        this.keySize = keySize;
    }

    public long getKeyStrength()
    {
        return keyStrength;
    }

    public void setKeyStrength(long keyStrength)
    {
        this.keyStrength = keyStrength;
    }

    public long getRevocationStatus()
    {
        return revocationStatus;
    }

    public void setRevocationStatus(long revocationStatus)
    {
        this.revocationStatus = revocationStatus;
    }

    public long getCrlRevocationStatus()
    {
        return crlRevocationStatus;
    }

    public void setCrlRevocationStatus(long crlRevocationStatus)
    {
        this.crlRevocationStatus = crlRevocationStatus;
    }

    public long getOcspRevocationStatus()
    {
        return ocspRevocationStatus;
    }

    public void setOcspRevocationStatus(long ocspRevocationStatus)
    {
        this.ocspRevocationStatus = ocspRevocationStatus;
    }

    public String getSha1Hash()
    {
        return sha1Hash;
    }

    public void setSha1Hash(String sha1Hash)
    {
        this.sha1Hash = sha1Hash;
    }

    public String getPinSha256()
    {
        return pinSha256;
    }

    public void setPinSha256(String pinSha256)
    {
        this.pinSha256 = pinSha256;
    }

    public String getRaw()
    {
        return raw;
    }

    public void setRaw(String raw)
    {
        this.raw = raw;
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this).append("subject", subject).append("label", label).append("notBefore", notBefore).append("notAfter", notAfter).append("issuerSubject", issuerSubject).append("issuerLabel", issuerLabel).append("sigAlg", sigAlg).append("issues", issues).append("keyAlg", keyAlg).append("keySize", keySize).append("keyStrength", keyStrength).append("revocationStatus", revocationStatus).append("crlRevocationStatus", crlRevocationStatus).append("ocspRevocationStatus", ocspRevocationStatus).append("sha1Hash", sha1Hash).append("pinSha256", pinSha256).append("raw", raw).toString();
    }

}
