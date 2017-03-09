package reconstructure.bueaty;

public class NewReleasePrice extends Price
{

    @Override
    int getPriceCode()
    {
        return Movie.new_release;
    }

    @Override
    double getCharge(int rentDays)
    {
        double amount = 0;
        amount += rentDays * 3;
        return amount;
    }

    @Override
    public int getRentalPoint(int rentDays)
    {
        if(rentDays > 2){
            return 2;
        }else{
            return 1;
        }
    }

}
