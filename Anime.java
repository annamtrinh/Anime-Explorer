/**
Anime.java
@ author Annam Trinh
@ since 3/28/2025
This class is to create anime shows and movies
*/



public class Anime {
  private String title;
  private String genre;
  private String description;
  private String trailer;
  private double rating;
  
  
  

  
public Anime(String title, String genre, String description, String trailer, double rating){
 this.title = title;
 this.genre = genre;
 this.description = description;
 this.trailer = trailer;
 this.rating = rating;
}  


  
public String getTitle(){
    return title;
}  
public String getGenre(){
    return genre;
}
public String getDescription(){
    return description;
}
public String getTrailer(){
    return trailer;
}
public double getRating(){
    return rating;
}
  
  @Override
 public String toString() {
        return "Title: " + title + "\n" +
               "Genre: " + genre + "\n" +
               "Rating: " + rating + "\n" +
               "Description: " + description + "\n" +
               "Trailer: " + trailer;
    } 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}