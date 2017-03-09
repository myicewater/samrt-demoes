package reconstructure;

public class ConstructureMain
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {

        Customer c = new Customer("张艺谋");
        Rental rental = new Rental();
        Movie movie = new Movie();
        
        movie.setPriceCode(Movie.regular);
        movie.setTitle("猛龙过江");
        
        rental.setMovie(movie );
        rental.setRentDays(10);
        c.addRental(rental );
        
        String r = c.statement();
        System.out.println(r);
    }

}
