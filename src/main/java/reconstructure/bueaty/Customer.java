
package reconstructure.bueaty;

import java.util.Enumeration;
import java.util.Vector;

public class Customer
{

    private String name ;
    
    private Vector rentals = new Vector();
    
    public Customer(String name){
        this.name = name;
    }
    
    public void  addRental(Rental rental){
        this.rentals.add(rental);
    }
    
    public String getName(){
        return this.name;
    }
    
    
    
    
    
    /**
     * 计算积分
     * @param rentals
     * @return
     */
    public int getRentalPoint(){
       
        int totalPoint = 0;
        for(Object o : rentals){
            Rental rental = (Rental)o;
            totalPoint += rental.getMovie().getRentalPoint(rental.getRentDays());
        }
        return totalPoint;
    }
    
    /**
     * 计算总的租金
     * @param rentals
     * @return
     */
    public double getAmount(){
        
        double totalRent = 0;
        for(Object o : rentals){
            Rental rental = (Rental)o;
            totalRent += rental.getMovie().getAmount(rental.getRentDays());
        }
        return totalRent;
    }
    
    public String print(){
        String result = "租赁客户名:"+this.name + "\n\n";
        result += "\t" +"电影名称"+"\t"+"租金"+"\n";
        for(Object o : rentals){
            Rental rental = (Rental)o;
            result += "\t" + rental.getMovie().getTitle() +"\t" +rental.getMovie().getAmount(rental.getRentDays())+"\n";
        }
        result += "\n总租金 "+getAmount() +".\n";
        result += "赚取了 "+ getRentalPoint() +" 积分.";
        
        return result;
    }
    
    
    
    
}
