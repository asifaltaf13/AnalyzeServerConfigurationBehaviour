package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;

public class Cert implements Serializable
{

    @SerializedName("subject")
    @Expose
    private String subject;
    @SerializedName("commonNames")
    @Expose
    private ArrayList<String> commonNames = null;
    @SerializedName("altNames")
    @Expose
    private ArrayList<String> altNames = null;
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
    @SerializedName("revocationInfo")
    @Expose
    private long revocationInfo;
    @SerializedName("crlURIs")
    @Expose
    private ArrayList<String> crlURIs = null;
    @SerializedName("ocspURIs")
    @Expose
    private ArrayList<String> ocspURIs = null;
    @SerializedName("revocationStatus")
    @Expose
    private long revocationStatus;
    @SerializedName("crlRevocationStatus")
    @Expose
    private long crlRevocationStatus;
    @SerializedName("ocspRevocationStatus")
    @Expose
    private long ocspRevocationStatus;
    @SerializedName("sgc")
    @Expose
    private long sgc;
    @SerializedName("validationType")
    @Expose
    private String validationType;
    @SerializedName("issues")
    @Expose
    private long issues;
    @SerializedName("sct")
    @Expose
    private boolean sct;
    @SerializedName("mustStaple")
    @Expose
    private long mustStaple;
    @SerializedName("sha1Hash")
    @Expose
    private String sha1Hash;
    @SerializedName("pinSha256")
    @Expose
    private String pinSha256;
    private final static long serialVersionUID = -795809813055075591L;

    /**
     * No args constructor for use in serialization
     */
    public Cert()
    {
    }

    /**
     * @param mustStaple
     * @param notBefore
     * @param crlRevocationStatus
     * @param issuerLabel
     * @param sct
     * @param sgc
     * @param pinSha256
     * @param subject
     * @param notAfter
     * @param revocationInfo
     * @param ocspRevocationStatus
     * @param sha1Hash
     * @param crlURIs
     * @param commonNames
     * @param altNames
     * @param ocspURIs
     * @param revocationStatus
     * @param issues
     * @param validationType
     * @param sigAlg
     * @param issuerSubject
     */
    public Cert(String subject, ArrayList<String> commonNames, ArrayList<String> altNames, long notBefore, long notAfter, String issuerSubject, String issuerLabel, String sigAlg, long revocationInfo, ArrayList<String> crlURIs, ArrayList<String> ocspURIs, long revocationStatus, long crlRevocationStatus, long ocspRevocationStatus, long sgc, String validationType, long issues, boolean sct, long mustStaple, String sha1Hash, String pinSha256)
    {
        super();
        this.subject = subject;
        this.commonNames = commonNames;
        this.altNames = altNames;
        this.notBefore = notBefore;
        this.notAfter = notAfter;
        this.issuerSubject = issuerSubject;
        this.issuerLabel = issuerLabel;
        this.sigAlg = sigAlg;
        this.revocationInfo = revocationInfo;
        this.crlURIs = crlURIs;
        this.ocspURIs = ocspURIs;
        this.revocationStatus = revocationStatus;
        this.crlRevocationStatus = crlRevocationStatus;
        this.ocspRevocationStatus = ocspRevocationStatus;
        this.sgc = sgc;
        this.validationType = validationType;
        this.issues = issues;
        this.sct = sct;
        this.mustStaple = mustStaple;
        this.sha1Hash = sha1Hash;
        this.pinSha256 = pinSha256;
    }

    public String getSubject()
    {
        return subject;
    }

    public void setSubject(String subject)
    {
        this.subject = subject;
    }

    public ArrayList<String> getCommonNames()
    {
        return commonNames;
    }

    public void setCommonNames(ArrayList<String> commonNames)
    {
        this.commonNames = commonNames;
    }

    public ArrayList<String> getAltNames()
    {
        return altNames;
    }

    public void setAltNames(ArrayList<String> altNames)
    {
        this.altNames = altNames;
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

    public long getRevocationInfo()
    {
        return revocationInfo;
    }

    public void setRevocationInfo(long revocationInfo)
    {
        this.revocationInfo = revocationInfo;
    }

    public ArrayList<String> getCrlURIs()
    {
        return crlURIs;
    }

    public void setCrlURIs(ArrayList<String> crlURIs)
    {
        this.crlURIs = crlURIs;
    }

    public ArrayList<String> getOcspURIs()
    {
        return ocspURIs;
    }

    public void setOcspURIs(ArrayList<String> ocspURIs)
    {
        this.ocspURIs = ocspURIs;
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

    public long getSgc()
    {
        return sgc;
    }

    public void setSgc(long sgc)
    {
        this.sgc = sgc;
    }

    public String getValidationType()
    {
        return validationType;
    }

    public void setValidationType(String validationType)
    {
        this.validationType = validationType;
    }

    public long getIssues()
    {
        return issues;
    }

    public void setIssues(long issues)
    {
        this.issues = issues;
    }

    public boolean isSct()
    {
        return sct;
    }

    public void setSct(boolean sct)
    {
        this.sct = sct;
    }

    public long getMustStaple()
    {
        return mustStaple;
    }

    public void setMustStaple(long mustStaple)
    {
        this.mustStaple = mustStaple;
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

    @Override
    public String toString()
    {
        return new ToStringBuilder(this).append("subject", subject).append("commonNames", commonNames).append("altNames", altNames).append("notBefore", notBefore).append("notAfter", notAfter).append("issuerSubject", issuerSubject).append("issuerLabel", issuerLabel).append("sigAlg", sigAlg).append("revocationInfo", revocationInfo).append("crlURIs", crlURIs).append("ocspURIs", ocspURIs).append("revocationStatus", revocationStatus).append("crlRevocationStatus", crlRevocationStatus).append("ocspRevocationStatus", ocspRevocationStatus).append("sgc", sgc).append("validationType", validationType).append("issues", issues).append("sct", sct).append("mustStaple", mustStaple).append("sha1Hash", sha1Hash).append("pinSha256", pinSha256).toString();
    }

}
