package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.google.common.base.Objects;

import utils.ToJsonString;

public class Rating {

	static Long counter = 0l;
	public Long userId;
	public Long itemId;
	public Long rating;
	public Long timestamp;
	public List<Rating> ratings = new ArrayList<>();

	public Rating(Long counter, Long userId, Long rating, Long itemId, Long timestamp)
	{
		this.counter = counter++;
		this.userId = userId;
		this.itemId = itemId;
		this.rating = rating;
		this.timestamp = timestamp;
	}

	




	public static Long getCounter() {
		return counter;
	}



	public static void setCounter(Long counter) {
		Rating.counter = counter;
	}



	public Long getUserId() {
		return userId;
	}



	public void setUserId(Long userId) {
		this.userId = userId;
	}



	public Long getItemId() {
		return itemId;
	}



	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}



	public Long getRating() {
		return rating;
	}



	public void setRating(Long rating) {
		this.rating = rating;
	}



	public Long getTimestamp() {
		return timestamp;
	}



	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}



	public List<Rating> getRatings() {
		return ratings;
	}



	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}



	public String toString()
	{
		return new ToJsonString(getClass(), this).toString();
	}

	
	@Override
	public boolean equals(final Object obj)
	{
		if (obj instanceof Rating)
		{
			final Rating other = (Rating) obj;
			return Objects.equal(userId, other.userId)
					&& Objects.equal(itemId, other.itemId)
					&& Objects.equal(rating, other.rating)
					&& Objects.equal(timestamp, other.timestamp)
					;
		}
		else
		{
			return false;
		}
	}
}
