package com.springWorkout.domain;

/**
 * @author erhun.baycelik
 *
 */
public class Click {
	private int clickCount;

	public int getClickCount() {
		return clickCount;
	}

	public void setClickCount(int clickCount) {
		this.clickCount = clickCount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + clickCount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Click other = (Click) obj;
		if (clickCount != other.clickCount)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Click [clickCount=" + clickCount + "]";
	}

}
