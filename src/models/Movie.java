package models;

import java.util.HashMap;

import com.google.common.base.Objects;

import utils.ToJsonString;

public class Movie implements Comparable <Movie>
{
	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return 0;
	}
	static Long counter = 0l;
	public Long id;
	public String title;
	public String year;
	public String url;
	
	public static HashMap<Long, Movie> movies = new HashMap<Long, Movie>();

	public Movie(String title, String year, String url)
	{
		this.id = counter++;
		this.title = title;
		this.year = year;
		this.url = url;
	}

	@Override
	public String toString()
	{
		return new ToJsonString(getClass(), this).toString();
	}

	@Override
	public int hashCode()
	{
		return Objects.hashCode(this.id, this.title, this.year, this.url);
	}

	@Override
	public boolean equals(final Object obj)
	{
		if (obj instanceof Movie)
		{
			final Movie other = (Movie) obj;
			return Objects.equal(title, other.title)
					&& Objects.equal(year, other.year)
					&& Objects.equal(url, other.url);
		}
		else
		{
			return false;
		}
	}

	public Long getId() {
		return this.id;
	
	}


}