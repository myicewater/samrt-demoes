package httputil;


import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;


/**

@author Robot
*/
public class PagePerformanceTiming implements Serializable {
	private static final long serialVersionUID = 1L;
   //
   private Integer performanceId;
   //当前url
   private String currentUrl;
   //trackId
   private String trackId;
   //预留
   private BigInteger beginTime;
   //HTTP（TCP） 完成建立连接的时间（完成握手）
   private BigInteger connectEnd;
   //HTTP（TCP） 开始建立连接的时间，如果是持久连接，则与 fetchStart 值相等
   private BigInteger connectStart;
   //
   private BigInteger domComplete;
   //
   private BigInteger domContentLoadedEventEnd;
   //
   private BigInteger domContentLoadedEventStart;
   //
   private BigInteger domInteractive;
   //
   private BigInteger domLoading;
   //
   private BigInteger domainLookupEnd;
   //
   private BigInteger domainLookupStart;
   //
   private BigInteger fetchStart;
   //
   private BigInteger loadEventEnd;
   //
   private BigInteger loadEventStart;
   //
   private BigInteger navigationStart;
   //
   private BigInteger redirectEnd;
   //
   private BigInteger redirectStart;
   //
   private BigInteger requestStart;
   //
   private BigInteger responseEnd;
   //
   private BigInteger responseStart;
   //
   private BigInteger secureConnectionStart;
   //
   private BigInteger unloadEventEnd;
   //
   private BigInteger unloadEventStart;
   //
   private Date createTime;
   //
   private String reserve1;
   //
   private String reserve2;
   //
   private String reserve3;

   public void setPerformanceId(Integer performanceId){
         this.performanceId = performanceId;
   }
   public Integer getPerformanceId(){
      return this.performanceId;
   }
   public void setCurrentUrl(String currentUrl){
         this.currentUrl = currentUrl;
   }
   public String getCurrentUrl(){
      return this.currentUrl;
   }
   public void setTrackId(String trackId){
         this.trackId = trackId;
   }
   public String getTrackId(){
      return this.trackId;
   }
   public void setBeginTime(BigInteger beginTime){
         this.beginTime = beginTime;
   }
   public BigInteger getBeginTime(){
      return this.beginTime;
   }
   public void setConnectEnd(BigInteger connectEnd){
         this.connectEnd = connectEnd;
   }
   public BigInteger getConnectEnd(){
      return this.connectEnd;
   }
   public void setConnectStart(BigInteger connectStart){
         this.connectStart = connectStart;
   }
   public BigInteger getConnectStart(){
      return this.connectStart;
   }
   public void setDomComplete(BigInteger domComplete){
         this.domComplete = domComplete;
   }
   public BigInteger getDomComplete(){
      return this.domComplete;
   }
   public void setDomContentLoadedEventEnd(BigInteger domContentLoadedEventEnd){
         this.domContentLoadedEventEnd = domContentLoadedEventEnd;
   }
   public BigInteger getDomContentLoadedEventEnd(){
      return this.domContentLoadedEventEnd;
   }
   public void setDomContentLoadedEventStart(BigInteger domContentLoadedEventStart){
         this.domContentLoadedEventStart = domContentLoadedEventStart;
   }
   public BigInteger getDomContentLoadedEventStart(){
      return this.domContentLoadedEventStart;
   }
   public void setDomInteractive(BigInteger domInteractive){
         this.domInteractive = domInteractive;
   }
   public BigInteger getDomInteractive(){
      return this.domInteractive;
   }
   public void setDomLoading(BigInteger domLoading){
         this.domLoading = domLoading;
   }
   public BigInteger getDomLoading(){
      return this.domLoading;
   }
   public void setDomainLookupEnd(BigInteger domainLookupEnd){
         this.domainLookupEnd = domainLookupEnd;
   }
   public BigInteger getDomainLookupEnd(){
      return this.domainLookupEnd;
   }
   public void setDomainLookupStart(BigInteger domainLookupStart){
         this.domainLookupStart = domainLookupStart;
   }
   public BigInteger getDomainLookupStart(){
      return this.domainLookupStart;
   }
   public void setFetchStart(BigInteger fetchStart){
         this.fetchStart = fetchStart;
   }
   public BigInteger getFetchStart(){
      return this.fetchStart;
   }
   public void setLoadEventEnd(BigInteger loadEventEnd){
         this.loadEventEnd = loadEventEnd;
   }
   public BigInteger getLoadEventEnd(){
      return this.loadEventEnd;
   }
   public void setLoadEventStart(BigInteger loadEventStart){
         this.loadEventStart = loadEventStart;
   }
   public BigInteger getLoadEventStart(){
      return this.loadEventStart;
   }
   public void setNavigationStart(BigInteger navigationStart){
         this.navigationStart = navigationStart;
   }
   public BigInteger getNavigationStart(){
      return this.navigationStart;
   }
   public void setRedirectEnd(BigInteger redirectEnd){
         this.redirectEnd = redirectEnd;
   }
   public BigInteger getRedirectEnd(){
      return this.redirectEnd;
   }
   public void setRedirectStart(BigInteger redirectStart){
         this.redirectStart = redirectStart;
   }
   public BigInteger getRedirectStart(){
      return this.redirectStart;
   }
   public void setRequestStart(BigInteger requestStart){
         this.requestStart = requestStart;
   }
   public BigInteger getRequestStart(){
      return this.requestStart;
   }
   public void setResponseEnd(BigInteger responseEnd){
         this.responseEnd = responseEnd;
   }
   public BigInteger getResponseEnd(){
      return this.responseEnd;
   }
   public void setResponseStart(BigInteger responseStart){
         this.responseStart = responseStart;
   }
   public BigInteger getResponseStart(){
      return this.responseStart;
   }
   public void setSecureConnectionStart(BigInteger secureConnectionStart){
         this.secureConnectionStart = secureConnectionStart;
   }
   public BigInteger getSecureConnectionStart(){
      return this.secureConnectionStart;
   }
   public void setUnloadEventEnd(BigInteger unloadEventEnd){
         this.unloadEventEnd = unloadEventEnd;
   }
   public BigInteger getUnloadEventEnd(){
      return this.unloadEventEnd;
   }
   public void setUnloadEventStart(BigInteger unloadEventStart){
         this.unloadEventStart = unloadEventStart;
   }
   public BigInteger getUnloadEventStart(){
      return this.unloadEventStart;
   }
   public void setCreateTime(Date createTime){
         this.createTime = createTime;
   }
   public Date getCreateTime(){
      return this.createTime;
   }
   public void setReserve1(String reserve1){
         this.reserve1 = reserve1;
   }
   public String getReserve1(){
      return this.reserve1;
   }
   public void setReserve2(String reserve2){
         this.reserve2 = reserve2;
   }
   public String getReserve2(){
      return this.reserve2;
   }
   public void setReserve3(String reserve3){
         this.reserve3 = reserve3;
   }
   public String getReserve3(){
      return this.reserve3;
   }
}