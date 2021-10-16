package io.github.mrzakiakkari;

/**
 * @author M.Zaki Al Akkari <https://github.com/MrZakiakkari>
 */
public class Movie
{
	public Movie()
	{
	}
	public Movie(String name, int year)
	{
		this.name = name;
		this.year = year;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getYear()
	{
		return year;
	}
	public void setYear(int year)
	{
		this.year = year;
	}

	private String name;
	private int year;
}
