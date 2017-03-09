package reconstructure.bueaty;

public class RegularPrice extends Price
{

    @Override
    int getPriceCode()
    {
        return Movie.regular;
    }

    @Override
    double getCharge(int rentDays)
    {
        double amount = 0;
        amount += 2;
        if(rentDays > 2){
            amount += (rentDays -2)*1.5;
        }
        return amount;
    }


}
