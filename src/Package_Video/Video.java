package Package_Video;

public abstract class Video {
    private String name;
    private String resolution;
    private double duration;

    private String company;

    public Video(String name, String resolution, double duration, String company) {
        this.name = name;
        this.resolution = resolution;
        this.duration = duration;
        this.company = company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getResolution() {
        return resolution;
    }

    public double getDuration() {
        return duration;
    }

    public String getCompany() {
        return company;
    }


    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", resolution='" + resolution + '\'' +
                ", duration=" + duration +
                ", company='" + company + '\'' +
                '}';
    }
}
