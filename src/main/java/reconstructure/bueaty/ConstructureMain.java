package reconstructure.bueaty;

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
        movie.setPriceCode(Movie.new_release);
        movie.setTitle("猛龙过江");
        rental.setMovie(movie );
        rental.setRentDays(10);
        c.addRental(rental );
        
        String r = c.print();
        System.out.println(r);
    }

}
