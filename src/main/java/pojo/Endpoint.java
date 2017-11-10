package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class Endpoint implements Serializable
{

    @SerializedName("ipAddress")
    @Expose
    private String ipAddress;
    @SerializedName("statusMessage")
    @Expose
    private String statusMessage;
    @SerializedName("grade")
    @Expose
    private String grade;
    @SerializedName("gradeTrustIgnored")
    @Expose
    private String gradeTrustIgnored;
    @SerializedName("hasWarnings")
    @Expose
    private boolean hasWarnings;
    @SerializedName("isExceptional")
    @Expose
    private boolean isExceptional;
    @SerializedName("progress")
    @Expose
    private long progress;
    @SerializedName("duration")
    @Expose
    private long duration;
    @SerializedName("eta")
    @Expose
    private long eta;
    @SerializedName("delegation")
    @Expose
    private long delegation;
    @SerializedName("details")
    @Expose
    private Details details;
    private final static long serialVersionUID = 5934714874997430623L;

    /**
     * No args constructor for use in serialization
     */
    public Endpoint()
    {
    }

    /**
     * @param progress
     * @param delegation
     * @param eta
     * @param duration
     * @param details
     * @param hasWarnings
     * @param grade
     * @param isExceptional
     * @param gradeTrustIgnored
     * @param statusMessage
     * @param ipAddress
     */
    public Endpoint(String ipAddress, String statusMessage, String grade, String gradeTrustIgnored, boolean hasWarnings, boolean isExceptional, long progress, long duration, long eta, long delegation, Details details)
    {
        super();
        this.ipAddress = ipAddress;
        this.statusMessage = statusMessage;
        this.grade = grade;
        this.gradeTrustIgnored = gradeTrustIgnored;
        this.hasWarnings = hasWarnings;
        this.isExceptional = isExceptional;
        this.progress = progress;
        this.duration = duration;
        this.eta = eta;
        this.delegation = delegation;
        this.details = details;
    }

    public String getIpAddress()
    {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress)
    {
        this.ipAddress = ipAddress;
    }

    public String getStatusMessage()
    {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage)
    {
        this.statusMessage = statusMessage;
    }

    public String getGrade()
    {
        return grade;
    }

    public void setGrade(String grade)
    {
        this.grade = grade;
    }

    public String getGradeTrustIgnored()
    {
        return gradeTrustIgnored;
    }

    public void setGradeTrustIgnored(String gradeTrustIgnored)
    {
        this.gradeTrustIgnored = gradeTrustIgnored;
    }

    public boolean isHasWarnings()
    {
        return hasWarnings;
    }

    public void setHasWarnings(boolean hasWarnings)
    {
        this.hasWarnings = hasWarnings;
    }

    public boolean isIsExceptional()
    {
        return isExceptional;
    }

    public void setIsExceptional(boolean isExceptional)
    {
        this.isExceptional = isExceptional;
    }

    public long getProgress()
    {
        return progress;
    }

    public void setProgress(long progress)
    {
        this.progress = progress;
    }

    public long getDuration()
    {
        return duration;
    }

    public void setDuration(long duration)
    {
        this.duration = duration;
    }

    public long getEta()
    {
        return eta;
    }

    public void setEta(long eta)
    {
        this.eta = eta;
    }

    public long getDelegation()
    {
        return delegation;
    }

    public void setDelegation(long delegation)
    {
        this.delegation = delegation;
    }

    public Details getDetails()
    {
        return details;
    }

    public void setDetails(Details details)
    {
        this.details = details;
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this).append("ipAddress", ipAddress).append("statusMessage", statusMessage).append("grade", grade).append("gradeTrustIgnored", gradeTrustIgnored).append("hasWarnings", hasWarnings).append("isExceptional", isExceptional).append("progress", progress).append("duration", duration).append("eta", eta).append("delegation", delegation).append("details", details).toString();
    }

}
