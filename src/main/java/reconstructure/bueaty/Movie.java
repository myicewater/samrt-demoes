package reconstructure.bueaty;

public class Movie
{

    public static final int childrens = 2;
    
    public static final int regular = 0;
    
    public static final int new_release = 1;
    
    private String title;
    
    private int priceCode;
    
    private Price price;
    
    
    
    
    /**
     * caculate the amount
     * @param this
     * @return
     */
    public double getAmount(int rentDays){
        
        return price.getCharge(rentDays);
    }
    
    
    /**
     * cacluate the rent point of the rental
     * @param rental
     * @return
     */
    public int getRentalPoint(int rentDays){
        
        return price.getRentalPoint(rentDays);
    }
    

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
        return price.getPriceCode();
    }

    public void setPriceCode(int priceCode)
    {
        switch(priceCode){
            case regular:
                price = new RegularPrice();
                break;
            case new_release:
                price = new NewReleasePrice();
                break;
            case childrens:
                price = new ChildrenPrice();
                break;
        }
    }


    public Price getPrice()
    {
        return price;
    }


    public void setPrice(Price price)
    {
        this.price = price;
    }
    
    
    
}
