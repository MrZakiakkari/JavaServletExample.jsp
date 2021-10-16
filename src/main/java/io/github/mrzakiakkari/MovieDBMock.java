package io.github.mrzakiakkari;

import java.util.ArrayList;

/**
 * @author M.Zaki Al Akkari <https://github.com/MrZakiakkari>
 */
public class MovieDBMock
{
	public MovieDBMock()
	{
		init();
	}
	private void init()
	{
		movieList.add(new Movie("Jurrasic Park", 1994));
		movieList.add(new Movie("Jaws", 1975));
		movieList.add(new Movie("The Avengers", 2012));
	}
	public ArrayList<Movie> getMovieList()
	{
		return movieList;
	}
	private final ArrayList<Movie> movieList = new ArrayList<>();
}
