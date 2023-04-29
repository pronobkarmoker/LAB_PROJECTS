public class Song {
    private String name;
    private String singer;
    private int releaseYear;
    private double averageRating;
    
    public Song(String name, String singer, int releaseYear, double averageRating) {
        this.name = name;
        this.singer = singer;
        this.releaseYear = releaseYear;
        this.averageRating = averageRating;
    }
    
    public void play() {
        System.out.println("Playing " + name + " by " + singer + " (" + releaseYear + ")");
    }
    
    public void rate(int rating) {
        if (rating >= 1 && rating <= 5) {
            double totalRating = averageRating * getNumRatings();
            totalRating += rating;
            averageRating = totalRating / (getNumRatings() + 1);
            System.out.println("Thanks for rating " + name + "! Your rating has been recorded.");
        } else {
            System.out.println("Invalid rating. Please enter a rating between 1 and 5.");
        }
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSinger() {
        return singer;
    }
    
    public void setSinger(String singer) {
        this.singer = singer;
    }
    
    public int getReleaseYear() {
        return releaseYear;
    }
    
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    
    public double getAverageRating() {
        return averageRating;
    }
    
    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }
    
    private int getNumRatings() {
        if (averageRating == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
