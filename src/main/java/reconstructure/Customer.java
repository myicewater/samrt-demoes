
package reconstructure;

import java.util.Enumeration;
import java.util.Vector;

public class Customer
{

    /**
     * 客户名称
     */
    private String name ;
    /**
     * 租赁集合
     */
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
    
    
    public String statement(){
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        String result = "租赁客户名:"+this.name + "\n\n";
        result += "\t" +"电影名称"+"\t"+"租金"+"\n";
        while(rentals.hasMoreElements()){
            double thisAmount = 0;
            Rental each = (Rental)rentals.nextElement();
            switch(each.getMovie().getPriceCode()){//计算每个租赁的租码
                case(Movie.regular):
                    thisAmount += 2;
                    if(each.getRentDays() > 2)
                        thisAmount += (each.getRentDays() -2)*1.5;
                    break;
                case(Movie.new_release):
                    thisAmount += each.getRentDays() * 3;
                    break;
                case(Movie.childrens):
                    thisAmount += 1.5;
                    if(each.getRentDays() > 3)
                        thisAmount += (each.getRentDays() -3)*1.5;
                    break;
            }
            frequentRenterPoints++;//积分计算
            if(each.getMovie().getPriceCode() == Movie.new_release && each.getRentDays() > 2)
                frequentRenterPoints++;
            //打印积分
            result += "\t" + each.getMovie().getTitle() +"\t" +String.valueOf(thisAmount)+"\n";
            totalAmount += thisAmount;
        }
        //打印汇总
        result += "\n总租金 "+totalAmount +".\n";
        result += "您赚取了 "+ frequentRenterPoints +" 租赁分数.";
        return result;
    }
    
}
