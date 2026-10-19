public class WatchList {
    
    
    private String title;
    private double rating;
    
    
    
    public WatchList(String title, double rating){
        
        this.title = title;
        this.rating = rating;
    }
    
    public String getTitle(){
        return title;
    }
    
    
    
    public double getRating(){
        return rating;
    }
    
    
    public String toString(){
        return "Title: " + title + " Rating:" + rating;
    }
    
    
    
    
}