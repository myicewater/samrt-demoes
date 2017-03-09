package reconstructure.bueaty;

public class ChildrenPrice extends Price
{

    @Override
    int getPriceCode()
    {
        return Movie.childrens;
    }

    @Override
    double getCharge(int rentDays)
    {
        double amount = 0;
        amount += 1.5;
        if(rentDays > 3){
            amount += (rentDays -3)*1.5;
        }
        return amount;
    }


}
