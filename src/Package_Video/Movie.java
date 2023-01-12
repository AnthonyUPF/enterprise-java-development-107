package Package_Video;

public class Movie extends Video{

    private int rating;

    private String platform;

    public Movie(String name, String resolution, double duration, String company, int rating, String platform) {
        super(name, resolution, duration, company);
        this.rating = rating;
        this.platform = platform;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getRating() {
        return rating;
    }

    public String getPlatform() {
        return platform;
    }
}
