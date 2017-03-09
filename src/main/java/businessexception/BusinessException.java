package businessexception;

public class BusinessException extends Exception
{

    private String errCode;
    
    public BusinessException()
    {
        super();
    }
    
    public BusinessException(String msg, Throwable cause)
    {
        super(msg, cause);
    }
    
    
    
    public BusinessException(String errCode,String errMsg){
        super(errMsg);
        this.errCode = errCode;
    }

    public String getErrCode()
    {
        return errCode;
    }

    public void setErrCode(String errCode)
    {
        this.errCode = errCode;
    }

    
    
    
    
}
