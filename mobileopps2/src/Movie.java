import java.util.*;

public class Movie implements Cloneable{
	
	int movieId;
	String movieName;
	String movieDirector;
	public Movie(int movieId, String movieName, String movieDirector) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieDirector = movieDirector;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieDirector=" + movieDirector + "]";
	}
	@Override
	public int hashCode() {
		return movieId;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}
