package reconstructure.bueaty;

public abstract class Price
{

    abstract int getPriceCode();
    
    abstract double getCharge(int rentDays);
    
    public int getRentalPoint(int rentDays){
        return 1;
    }
}
