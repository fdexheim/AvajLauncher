package src.com.fdexheim.avajlauncherflyers;

public class Coordinates {
	private int		longitude;
	private int		latitude;
	private int		height;

	public int		getLongitude() { return (this.longitude); }
	public int		getLatitude() { return (this.latitude); }
	public int		getHeight() { return (this.height); }

	public void		setLongitude(int longitude) { this.longitude = longitude; }
	public void		setLatitude(int latitude) { this.latitude = latitude; }
	public void		setHeight(int height) { this.height = height; }
	public void		adjustLongitude(int longitude) { this.longitude += longitude; }
	public void		adjustLatitude(int latitude) { this.latitude += latitude; }
	public void		adjustHeight(int height) { this.height += height; }

	Coordinates(int longitude, int latitude, int height) {
		this.longitude = Math.max(0, longitude);
		this.latitude = Math.max(0, latitude);
		if (height > 100)
			this.height = 100;
		else
			this.height = Math.max(height, 0);
	}
}
