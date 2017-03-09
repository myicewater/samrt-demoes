package reconstructure;

public class Movie
{

    /**
     * 儿童
     */
    public static final int childrens = 2;
    /**
     * 普通电影
     */
    public static final int regular = 0;
    /**
     * 新片
     */
    public static final int new_release = 1;
    
    private String title;
    /**
     * 租金
     */
    private int priceCode;

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public int getPriceCode()
    {
        return priceCode;
    }

    public void setPriceCode(int priceCode)
    {
        this.priceCode = priceCode;
    }
    
    
}
