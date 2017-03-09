
package reconstructure;

/**
 * 租赁
 * @author gag
 *
 */
public class Rental
{

    /**
     * 电影
     */
    private Movie movie;
    
    /**
     * 租赁时间
     */
    private int rentDays;

    public Movie getMovie()
    {
        return movie;
    }

    public void setMovie(Movie movie)
    {
        this.movie = movie;
    }

    public int getRentDays()
    {
        return rentDays;
    }

    public void setRentDays(int rentDays)
    {
        this.rentDays = rentDays;
    }
    
    
}
