public class HistoryRow
{
    private Integer id;
    private Integer datein;
    private Integer timespan;
    private String rating;
    private Integer category;
    private String qualys;
    private Integer domainhistory;

    public HistoryRow(Integer id, Integer datein, Integer timespan, String rating, Integer category, String qualys, Integer domainhistory)
    {
        this.id = id;
        this.datein = datein;
        this.timespan = timespan;
        this.rating = rating;
        this.category = category;
        this.qualys = qualys;
        this.domainhistory = domainhistory;
    }

    public Integer getId()
    {
        return id;
    }

    public Integer getDatein()
    {
        return datein;
    }

    public Integer getTimespan()
    {
        return timespan;
    }

    public String getRating()
    {
        return rating;
    }

    public Integer getCategory()
    {
        return category;
    }

    public String getQualys()
    {
        return qualys;
    }

    public Integer getDomainhistory()
    {
        return domainhistory;
    }
}
