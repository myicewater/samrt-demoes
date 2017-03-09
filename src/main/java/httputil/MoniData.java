package httputil;

import java.util.List;

public class MoniData
{
    private String currentUrl;
    
    private String trackId;
    
    private Long beginTime;
    
    private List<ResourcePerformanceTiming> performanceResource;
    
    private PagePerformanceTiming performanceTiming;

    public String getCurrentUrl()
    {
        return currentUrl;
    }

    public void setCurrentUrl(String currentUrl)
    {
        this.currentUrl = currentUrl;
    }

    public String getTrackId()
    {
        return trackId;
    }

    public void setTrackId(String trackId)
    {
        this.trackId = trackId;
    }

    public Long getBeginTime()
    {
        return beginTime;
    }

    public void setBeginTime(Long beginTime)
    {
        this.beginTime = beginTime;
    }

    public List<ResourcePerformanceTiming> getPerformanceResource()
    {
        return performanceResource;
    }

    public void setPerformanceResource(List<ResourcePerformanceTiming> performanceResource)
    {
        this.performanceResource = performanceResource;
    }

    public PagePerformanceTiming getPerformanceTiming()
    {
        return performanceTiming;
    }

    public void setPerformanceTiming(PagePerformanceTiming performanceTiming)
    {
        this.performanceTiming = performanceTiming;
    }
    
    
}
