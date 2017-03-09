package httputil;


import java.io.Serializable;
import java.util.Date;


/**

@author Robot
*/
public class ResourcePerformanceTiming implements Serializable {
	private static final long serialVersionUID = 1L;
   //
   private Integer perforResourceId;
   //
   private Integer performanceId;
   //
   private Double connectEnd;
   //
   private Double connectStart;
   //
   private Integer decodedBodySize;
   //
   private Double domainLookupEnd;
   //
   private Double domainLookupStart;
   //
   private Double duration;
   //
   private Integer encodedBodySize;
   //
   private String entryType;
   //
   private Double fetchStart;
   //
   private String initiatorType;
   //
   private String name;
   //
   private Double redirectEnd;
   //
   private Double redirectStart;
   //
   private Double requestStart;
   //
   private Double responseEnd;
   //
   private Double responseStart;
   //
   private Double secureConnectionStart;
   //
   private Double startTime;
   //
   private Integer transferSize;
   //
   private Double workerStart;
   //
   private Date createTime;
   //
   private String reserve1;
   //
   private String reserve2;
   //
   private String reserve3;

   public void setPerforResourceId(Integer perforResourceId){
         this.perforResourceId = perforResourceId;
   }
   public Integer getPerforResourceId(){
      return this.perforResourceId;
   }
   public void setPerformanceId(Integer performanceId){
         this.performanceId = performanceId;
   }
   public Integer getPerformanceId(){
      return this.performanceId;
   }
   public void setConnectEnd(Double connectEnd){
         this.connectEnd = connectEnd;
   }
   public Double getConnectEnd(){
      return this.connectEnd;
   }
   public void setConnectStart(Double connectStart){
         this.connectStart = connectStart;
   }
   public Double getConnectStart(){
      return this.connectStart;
   }
   public void setDecodedBodySize(Integer decodedBodySize){
         this.decodedBodySize = decodedBodySize;
   }
   public Integer getDecodedBodySize(){
      return this.decodedBodySize;
   }
   public void setDomainLookupEnd(Double domainLookupEnd){
         this.domainLookupEnd = domainLookupEnd;
   }
   public Double getDomainLookupEnd(){
      return this.domainLookupEnd;
   }
   public void setDomainLookupStart(Double domainLookupStart){
         this.domainLookupStart = domainLookupStart;
   }
   public Double getDomainLookupStart(){
      return this.domainLookupStart;
   }
   public void setDuration(Double duration){
         this.duration = duration;
   }
   public Double getDuration(){
      return this.duration;
   }
   public void setEncodedBodySize(Integer encodedBodySize){
         this.encodedBodySize = encodedBodySize;
   }
   public Integer getEncodedBodySize(){
      return this.encodedBodySize;
   }
   public void setEntryType(String entryType){
         this.entryType = entryType;
   }
   public String getEntryType(){
      return this.entryType;
   }
   public void setFetchStart(Double fetchStart){
         this.fetchStart = fetchStart;
   }
   public Double getFetchStart(){
      return this.fetchStart;
   }
   public void setInitiatorType(String initiatorType){
         this.initiatorType = initiatorType;
   }
   public String getInitiatorType(){
      return this.initiatorType;
   }
   public void setName(String name){
         this.name = name;
   }
   public String getName(){
      return this.name;
   }
   public void setRedirectEnd(Double redirectEnd){
         this.redirectEnd = redirectEnd;
   }
   public Double getRedirectEnd(){
      return this.redirectEnd;
   }
   public void setRedirectStart(Double redirectStart){
         this.redirectStart = redirectStart;
   }
   public Double getRedirectStart(){
      return this.redirectStart;
   }
   public void setRequestStart(Double requestStart){
         this.requestStart = requestStart;
   }
   public Double getRequestStart(){
      return this.requestStart;
   }
   public void setResponseEnd(Double responseEnd){
         this.responseEnd = responseEnd;
   }
   public Double getResponseEnd(){
      return this.responseEnd;
   }
   public void setResponseStart(Double responseStart){
         this.responseStart = responseStart;
   }
   public Double getResponseStart(){
      return this.responseStart;
   }
   public void setSecureConnectionStart(Double secureConnectionStart){
         this.secureConnectionStart = secureConnectionStart;
   }
   public Double getSecureConnectionStart(){
      return this.secureConnectionStart;
   }
   public void setStartTime(Double startTime){
         this.startTime = startTime;
   }
   public Double getStartTime(){
      return this.startTime;
   }
   public void setTransferSize(Integer transferSize){
         this.transferSize = transferSize;
   }
   public Integer getTransferSize(){
      return this.transferSize;
   }
   public void setWorkerStart(Double workerStart){
         this.workerStart = workerStart;
   }
   public Double getWorkerStart(){
      return this.workerStart;
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