package pojo;

import java.io.Serializable;
import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;


public class Details implements Serializable
{

    @SerializedName("hostStartTime")
    @Expose
    private long hostStartTime;
    @SerializedName("key")
    @Expose
    private Key key;
    @SerializedName("cert")
    @Expose
    private Cert cert;
    @SerializedName("chain")
    @Expose
    private Chain chain;
    @SerializedName("protocols")
    @Expose
    private ArrayList<Protocol> protocols = null;
    @SerializedName("suites")
    @Expose
    private Suites suites;
    @SerializedName("serverSignature")
    @Expose
    private String serverSignature;
    @SerializedName("prefixDelegation")
    @Expose
    private boolean prefixDelegation;
    @SerializedName("nonPrefixDelegation")
    @Expose
    private boolean nonPrefixDelegation;
    @SerializedName("vulnBeast")
    @Expose
    private boolean vulnBeast;
    @SerializedName("renegSupport")
    @Expose
    private long renegSupport;
    @SerializedName("stsStatus")
    @Expose
    private String stsStatus;
    @SerializedName("stsResponseHeader")
    @Expose
    private String stsResponseHeader;
    @SerializedName("stsMaxAge")
    @Expose
    private long stsMaxAge;
    @SerializedName("stsSubdomains")
    @Expose
    private boolean stsSubdomains;
    @SerializedName("stsPreload")
    @Expose
    private boolean stsPreload;
    @SerializedName("sessionResumption")
    @Expose
    private long sessionResumption;
    @SerializedName("compressionMethods")
    @Expose
    private long compressionMethods;
    @SerializedName("supportsNpn")
    @Expose
    private boolean supportsNpn;
    @SerializedName("npnProtocols")
    @Expose
    private String npnProtocols;
    @SerializedName("supportsAlpn")
    @Expose
    private boolean supportsAlpn;
    @SerializedName("sessionTickets")
    @Expose
    private long sessionTickets;
    @SerializedName("ocspStapling")
    @Expose
    private boolean ocspStapling;
    @SerializedName("staplingRevocationStatus")
    @Expose
    private long staplingRevocationStatus;
    @SerializedName("sniRequired")
    @Expose
    private boolean sniRequired;
    @SerializedName("httpStatusCode")
    @Expose
    private long httpStatusCode;
    @SerializedName("supportsRc4")
    @Expose
    private boolean supportsRc4;
    @SerializedName("rc4WithModern")
    @Expose
    private boolean rc4WithModern;
    @SerializedName("rc4Only")
    @Expose
    private boolean rc4Only;
    @SerializedName("forwardSecrecy")
    @Expose
    private long forwardSecrecy;
    @SerializedName("protocolIntolerance")
    @Expose
    private long protocolIntolerance;
    @SerializedName("miscIntolerance")
    @Expose
    private long miscIntolerance;
    @SerializedName("sims")
    @Expose
    private Sims sims;
    @SerializedName("heartbleed")
    @Expose
    private boolean heartbleed;
    @SerializedName("heartbeat")
    @Expose
    private boolean heartbeat;
    @SerializedName("openSslCcs")
    @Expose
    private long openSslCcs;
    @SerializedName("openSSLLuckyMinus20")
    @Expose
    private long openSSLLuckyMinus20;
    @SerializedName("poodle")
    @Expose
    private boolean poodle;
    @SerializedName("poodleTls")
    @Expose
    private long poodleTls;
    @SerializedName("fallbackScsv")
    @Expose
    private boolean fallbackScsv;
    @SerializedName("freak")
    @Expose
    private boolean freak;
    @SerializedName("hasSct")
    @Expose
    private long hasSct;
    @SerializedName("logjam")
    @Expose
    private boolean logjam;
    @SerializedName("hstsPolicy")
    @Expose
    private HstsPolicy hstsPolicy;
    @SerializedName("hstsPreloads")
    @Expose
    private ArrayList<HstsPreload> hstsPreloads = null;
    @SerializedName("hpkpPolicy")
    @Expose
    private HpkpPolicy hpkpPolicy;
    @SerializedName("hpkpRoPolicy")
    @Expose
    private HpkpRoPolicy hpkpRoPolicy;
    @SerializedName("drownHosts")
    @Expose
    private ArrayList<Object> drownHosts = null;
    @SerializedName("drownErrors")
    @Expose
    private boolean drownErrors;
    @SerializedName("drownVulnerable")
    @Expose
    private boolean drownVulnerable;
    private final static long serialVersionUID = 6895943422253141481L;

    /**
     * No args constructor for use in serialization
     */
    public Details()
    {
    }

    /**
     * @param openSslCcs
     * @param drownErrors
     * @param freak
     * @param forwardSecrecy
     * @param hstsPreloads
     * @param hasSct
     * @param hpkpRoPolicy
     * @param poodleTls
     * @param key
     * @param httpStatusCode
     * @param stsPreload
     * @param npnProtocols
     * @param protocols
     * @param sniRequired
     * @param stsSubdomains
     * @param heartbleed
     * @param nonPrefixDelegation
     * @param supportsAlpn
     * @param miscIntolerance
     * @param heartbeat
     * @param sessionResumption
     * @param renegSupport
     * @param poodle
     * @param sims
     * @param vulnBeast
     * @param ocspStapling
     * @param fallbackScsv
     * @param cert
     * @param staplingRevocationStatus
     * @param compressionMethods
     * @param stsMaxAge
     * @param prefixDelegation
     * @param hstsPolicy
     * @param logjam
     * @param supportsRc4
     * @param drownVulnerable
     * @param stsResponseHeader
     * @param stsStatus
     * @param hostStartTime
     * @param serverSignature
     * @param rc4Only
     * @param drownHosts
     * @param supportsNpn
     * @param suites
     * @param openSSLLuckyMinus20
     * @param hpkpPolicy
     * @param rc4WithModern
     * @param sessionTickets
     * @param chain
     * @param protocolIntolerance
     */
    public Details(long hostStartTime, Key key, Cert cert, Chain chain, ArrayList<Protocol> protocols, Suites suites, String serverSignature, boolean prefixDelegation, boolean nonPrefixDelegation, boolean vulnBeast, long renegSupport, String stsStatus, String stsResponseHeader, long stsMaxAge, boolean stsSubdomains, boolean stsPreload, long sessionResumption, long compressionMethods, boolean supportsNpn, String npnProtocols, boolean supportsAlpn, long sessionTickets, boolean ocspStapling, long staplingRevocationStatus, boolean sniRequired, long httpStatusCode, boolean supportsRc4, boolean rc4WithModern, boolean rc4Only, long forwardSecrecy, long protocolIntolerance, long miscIntolerance, Sims sims, boolean heartbleed, boolean heartbeat, long openSslCcs, long openSSLLuckyMinus20, boolean poodle, long poodleTls, boolean fallbackScsv, boolean freak, long hasSct, boolean logjam, HstsPolicy hstsPolicy, ArrayList<HstsPreload> hstsPreloads, HpkpPolicy hpkpPolicy, HpkpRoPolicy hpkpRoPolicy, ArrayList<Object> drownHosts, boolean drownErrors, boolean drownVulnerable)
    {
        super();
        this.hostStartTime = hostStartTime;
        this.key = key;
        this.cert = cert;
        this.chain = chain;
        this.protocols = protocols;
        this.suites = suites;
        this.serverSignature = serverSignature;
        this.prefixDelegation = prefixDelegation;
        this.nonPrefixDelegation = nonPrefixDelegation;
        this.vulnBeast = vulnBeast;
        this.renegSupport = renegSupport;
        this.stsStatus = stsStatus;
        this.stsResponseHeader = stsResponseHeader;
        this.stsMaxAge = stsMaxAge;
        this.stsSubdomains = stsSubdomains;
        this.stsPreload = stsPreload;
        this.sessionResumption = sessionResumption;
        this.compressionMethods = compressionMethods;
        this.supportsNpn = supportsNpn;
        this.npnProtocols = npnProtocols;
        this.supportsAlpn = supportsAlpn;
        this.sessionTickets = sessionTickets;
        this.ocspStapling = ocspStapling;
        this.staplingRevocationStatus = staplingRevocationStatus;
        this.sniRequired = sniRequired;
        this.httpStatusCode = httpStatusCode;
        this.supportsRc4 = supportsRc4;
        this.rc4WithModern = rc4WithModern;
        this.rc4Only = rc4Only;
        this.forwardSecrecy = forwardSecrecy;
        this.protocolIntolerance = protocolIntolerance;
        this.miscIntolerance = miscIntolerance;
        this.sims = sims;
        this.heartbleed = heartbleed;
        this.heartbeat = heartbeat;
        this.openSslCcs = openSslCcs;
        this.openSSLLuckyMinus20 = openSSLLuckyMinus20;
        this.poodle = poodle;
        this.poodleTls = poodleTls;
        this.fallbackScsv = fallbackScsv;
        this.freak = freak;
        this.hasSct = hasSct;
        this.logjam = logjam;
        this.hstsPolicy = hstsPolicy;
        this.hstsPreloads = hstsPreloads;
        this.hpkpPolicy = hpkpPolicy;
        this.hpkpRoPolicy = hpkpRoPolicy;
        this.drownHosts = drownHosts;
        this.drownErrors = drownErrors;
        this.drownVulnerable = drownVulnerable;
    }

    public long getHostStartTime()
    {
        return hostStartTime;
    }

    public void setHostStartTime(long hostStartTime)
    {
        this.hostStartTime = hostStartTime;
    }

    public Key getKey()
    {
        return key;
    }

    public void setKey(Key key)
    {
        this.key = key;
    }

    public Cert getCert()
    {
        return cert;
    }

    public void setCert(Cert cert)
    {
        this.cert = cert;
    }

    public Chain getChain()
    {
        return chain;
    }

    public void setChain(Chain chain)
    {
        this.chain = chain;
    }

    public ArrayList<Protocol> getProtocols()
    {
        return protocols;
    }

    public void setProtocols(ArrayList<Protocol> protocols)
    {
        this.protocols = protocols;
    }

    public Suites getSuites()
    {
        return suites;
    }

    public void setSuites(Suites suites)
    {
        this.suites = suites;
    }

    public String getServerSignature()
    {
        return serverSignature;
    }

    public void setServerSignature(String serverSignature)
    {
        this.serverSignature = serverSignature;
    }

    public boolean isPrefixDelegation()
    {
        return prefixDelegation;
    }

    public void setPrefixDelegation(boolean prefixDelegation)
    {
        this.prefixDelegation = prefixDelegation;
    }

    public boolean isNonPrefixDelegation()
    {
        return nonPrefixDelegation;
    }

    public void setNonPrefixDelegation(boolean nonPrefixDelegation)
    {
        this.nonPrefixDelegation = nonPrefixDelegation;
    }

    public boolean isVulnBeast()
    {
        return vulnBeast;
    }

    public void setVulnBeast(boolean vulnBeast)
    {
        this.vulnBeast = vulnBeast;
    }

    public long getRenegSupport()
    {
        return renegSupport;
    }

    public void setRenegSupport(long renegSupport)
    {
        this.renegSupport = renegSupport;
    }

    public String getStsStatus()
    {
        return stsStatus;
    }

    public void setStsStatus(String stsStatus)
    {
        this.stsStatus = stsStatus;
    }

    public String getStsResponseHeader()
    {
        return stsResponseHeader;
    }

    public void setStsResponseHeader(String stsResponseHeader)
    {
        this.stsResponseHeader = stsResponseHeader;
    }

    public long getStsMaxAge()
    {
        return stsMaxAge;
    }

    public void setStsMaxAge(long stsMaxAge)
    {
        this.stsMaxAge = stsMaxAge;
    }

    public boolean isStsSubdomains()
    {
        return stsSubdomains;
    }

    public void setStsSubdomains(boolean stsSubdomains)
    {
        this.stsSubdomains = stsSubdomains;
    }

    public boolean isStsPreload()
    {
        return stsPreload;
    }

    public void setStsPreload(boolean stsPreload)
    {
        this.stsPreload = stsPreload;
    }

    public long getSessionResumption()
    {
        return sessionResumption;
    }

    public void setSessionResumption(long sessionResumption)
    {
        this.sessionResumption = sessionResumption;
    }

    public long getCompressionMethods()
    {
        return compressionMethods;
    }

    public void setCompressionMethods(long compressionMethods)
    {
        this.compressionMethods = compressionMethods;
    }

    public boolean isSupportsNpn()
    {
        return supportsNpn;
    }

    public void setSupportsNpn(boolean supportsNpn)
    {
        this.supportsNpn = supportsNpn;
    }

    public String getNpnProtocols()
    {
        return npnProtocols;
    }

    public void setNpnProtocols(String npnProtocols)
    {
        this.npnProtocols = npnProtocols;
    }

    public boolean isSupportsAlpn()
    {
        return supportsAlpn;
    }

    public void setSupportsAlpn(boolean supportsAlpn)
    {
        this.supportsAlpn = supportsAlpn;
    }

    public long getSessionTickets()
    {
        return sessionTickets;
    }

    public void setSessionTickets(long sessionTickets)
    {
        this.sessionTickets = sessionTickets;
    }

    public boolean isOcspStapling()
    {
        return ocspStapling;
    }

    public void setOcspStapling(boolean ocspStapling)
    {
        this.ocspStapling = ocspStapling;
    }

    public long getStaplingRevocationStatus()
    {
        return staplingRevocationStatus;
    }

    public void setStaplingRevocationStatus(long staplingRevocationStatus)
    {
        this.staplingRevocationStatus = staplingRevocationStatus;
    }

    public boolean isSniRequired()
    {
        return sniRequired;
    }

    public void setSniRequired(boolean sniRequired)
    {
        this.sniRequired = sniRequired;
    }

    public long getHttpStatusCode()
    {
        return httpStatusCode;
    }

    public void setHttpStatusCode(long httpStatusCode)
    {
        this.httpStatusCode = httpStatusCode;
    }

    public boolean isSupportsRc4()
    {
        return supportsRc4;
    }

    public void setSupportsRc4(boolean supportsRc4)
    {
        this.supportsRc4 = supportsRc4;
    }

    public boolean isRc4WithModern()
    {
        return rc4WithModern;
    }

    public void setRc4WithModern(boolean rc4WithModern)
    {
        this.rc4WithModern = rc4WithModern;
    }

    public boolean isRc4Only()
    {
        return rc4Only;
    }

    public void setRc4Only(boolean rc4Only)
    {
        this.rc4Only = rc4Only;
    }

    public long getForwardSecrecy()
    {
        return forwardSecrecy;
    }

    public void setForwardSecrecy(long forwardSecrecy)
    {
        this.forwardSecrecy = forwardSecrecy;
    }

    public long getProtocolIntolerance()
    {
        return protocolIntolerance;
    }

    public void setProtocolIntolerance(long protocolIntolerance)
    {
        this.protocolIntolerance = protocolIntolerance;
    }

    public long getMiscIntolerance()
    {
        return miscIntolerance;
    }

    public void setMiscIntolerance(long miscIntolerance)
    {
        this.miscIntolerance = miscIntolerance;
    }

    public Sims getSims()
    {
        return sims;
    }

    public void setSims(Sims sims)
    {
        this.sims = sims;
    }

    public boolean isHeartbleed()
    {
        return heartbleed;
    }

    public void setHeartbleed(boolean heartbleed)
    {
        this.heartbleed = heartbleed;
    }

    public boolean isHeartbeat()
    {
        return heartbeat;
    }

    public void setHeartbeat(boolean heartbeat)
    {
        this.heartbeat = heartbeat;
    }

    public long getOpenSslCcs()
    {
        return openSslCcs;
    }

    public void setOpenSslCcs(long openSslCcs)
    {
        this.openSslCcs = openSslCcs;
    }

    public long getOpenSSLLuckyMinus20()
    {
        return openSSLLuckyMinus20;
    }

    public void setOpenSSLLuckyMinus20(long openSSLLuckyMinus20)
    {
        this.openSSLLuckyMinus20 = openSSLLuckyMinus20;
    }

    public boolean isPoodle()
    {
        return poodle;
    }

    public void setPoodle(boolean poodle)
    {
        this.poodle = poodle;
    }

    public long getPoodleTls()
    {
        return poodleTls;
    }

    public void setPoodleTls(long poodleTls)
    {
        this.poodleTls = poodleTls;
    }

    public boolean isFallbackScsv()
    {
        return fallbackScsv;
    }

    public void setFallbackScsv(boolean fallbackScsv)
    {
        this.fallbackScsv = fallbackScsv;
    }

    public boolean isFreak()
    {
        return freak;
    }

    public void setFreak(boolean freak)
    {
        this.freak = freak;
    }

    public long getHasSct()
    {
        return hasSct;
    }

    public void setHasSct(long hasSct)
    {
        this.hasSct = hasSct;
    }

    public boolean isLogjam()
    {
        return logjam;
    }

    public void setLogjam(boolean logjam)
    {
        this.logjam = logjam;
    }

    public HstsPolicy getHstsPolicy()
    {
        return hstsPolicy;
    }

    public void setHstsPolicy(HstsPolicy hstsPolicy)
    {
        this.hstsPolicy = hstsPolicy;
    }

    public ArrayList<HstsPreload> getHstsPreloads()
    {
        return hstsPreloads;
    }

    public void setHstsPreloads(ArrayList<HstsPreload> hstsPreloads)
    {
        this.hstsPreloads = hstsPreloads;
    }

    public HpkpPolicy getHpkpPolicy()
    {
        return hpkpPolicy;
    }

    public void setHpkpPolicy(HpkpPolicy hpkpPolicy)
    {
        this.hpkpPolicy = hpkpPolicy;
    }

    public HpkpRoPolicy getHpkpRoPolicy()
    {
        return hpkpRoPolicy;
    }

    public void setHpkpRoPolicy(HpkpRoPolicy hpkpRoPolicy)
    {
        this.hpkpRoPolicy = hpkpRoPolicy;
    }

    public ArrayList<Object> getDrownHosts()
    {
        return drownHosts;
    }

    public void setDrownHosts(ArrayList<Object> drownHosts)
    {
        this.drownHosts = drownHosts;
    }

    public boolean isDrownErrors()
    {
        return drownErrors;
    }

    public void setDrownErrors(boolean drownErrors)
    {
        this.drownErrors = drownErrors;
    }

    public boolean isDrownVulnerable()
    {
        return drownVulnerable;
    }

    public void setDrownVulnerable(boolean drownVulnerable)
    {
        this.drownVulnerable = drownVulnerable;
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this).append("hostStartTime", hostStartTime).append("key", key).append("cert", cert).append("chain", chain).append("protocols", protocols).append("suites", suites).append("serverSignature", serverSignature).append("prefixDelegation", prefixDelegation).append("nonPrefixDelegation", nonPrefixDelegation).append("vulnBeast", vulnBeast).append("renegSupport", renegSupport).append("stsStatus", stsStatus).append("stsResponseHeader", stsResponseHeader).append("stsMaxAge", stsMaxAge).append("stsSubdomains", stsSubdomains).append("stsPreload", stsPreload).append("sessionResumption", sessionResumption).append("compressionMethods", compressionMethods).append("supportsNpn", supportsNpn).append("npnProtocols", npnProtocols).append("supportsAlpn", supportsAlpn).append("sessionTickets", sessionTickets).append("ocspStapling", ocspStapling).append("staplingRevocationStatus", staplingRevocationStatus).append("sniRequired", sniRequired).append("httpStatusCode", httpStatusCode).append("supportsRc4", supportsRc4).append("rc4WithModern", rc4WithModern).append("rc4Only", rc4Only).append("forwardSecrecy", forwardSecrecy).append("protocolIntolerance", protocolIntolerance).append("miscIntolerance", miscIntolerance).append("sims", sims).append("heartbleed", heartbleed).append("heartbeat", heartbeat).append("openSslCcs", openSslCcs).append("openSSLLuckyMinus20", openSSLLuckyMinus20).append("poodle", poodle).append("poodleTls", poodleTls).append("fallbackScsv", fallbackScsv).append("freak", freak).append("hasSct", hasSct).append("logjam", logjam).append("hstsPolicy", hstsPolicy).append("hstsPreloads", hstsPreloads).append("hpkpPolicy", hpkpPolicy).append("hpkpRoPolicy", hpkpRoPolicy).append("drownHosts", drownHosts).append("drownErrors", drownErrors).append("drownVulnerable", drownVulnerable).toString();
    }

}

