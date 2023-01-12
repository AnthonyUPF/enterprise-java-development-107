package Package_Video;

public class TvSeries extends Video{
    private String broadcastChannel;
    private int yearIssue;

    public TvSeries(String name, String resolution, double duration, String company, String broadcastChannel, int yearIssue) {
        super(name, resolution, duration, company);
        this.broadcastChannel = broadcastChannel;
        this.yearIssue = yearIssue;
    }

    public void setBroadcastChannel(String broadcastChannel) {
        this.broadcastChannel = broadcastChannel;
    }

    public void setYearIssue(int yearIssue) {
        this.yearIssue = yearIssue;
    }

    public String getBroadcastChannel() {
        return broadcastChannel;
    }

    public int getYearIssue() {
        return yearIssue;
    }
}
