import java.util.ArrayList; //import arrayList package
public class AnimeLibrary
{
  
     public static ArrayList<Anime> getActionAnime(){
         
         ArrayList<Anime> list = new ArrayList<>();
        list.add(new Anime("Jujutsu Kaisen" , "Action", "Jujutsu Kaisen is about a high school student who joins a secret organization of sorcerers to fight deadly curses after becoming the host of a powerful one.", "https://www.youtube.com/watch?v=pkKu9hLT-t8", 4.9));
        list.add(new Anime("Attack On Titan" , "Action", "Attack on Titan follows humanity's fight for survival against giant man-eating creatures called Titans in a post-apocalyptic world.", "https://youtu.be/HJaUvV9Hwgs?si=aGVmA8sgnVPAsmMG", 4.9));
        list.add(new Anime("Solo Leveling" , "Action", "Solo Leveling follows a weak hunter who gains the power to level up infinitely after surviving a deadly dungeon, becoming humanity's strongest weapon.", "https://youtu.be/YvGSK8mIlt8?si=2HUnxfsQMBX_neh0", 4.9));
        list.add(new Anime("Bleach" , "Action", "Bleach follows a teenager who gains the powers of a Soul Reaper and battles evil spirits to protect both the living and the dead.", "https://youtu.be/1sygUhb8Q2Y?si=ubXqtpOFtQraUTgr", 4.7));
        list.add(new Anime("Naruto" , "Action", "Naruto follows a young ninja with a sealed demon fox inside him as he strives to earn the respect of his village and become the Hokage.", "https://youtu.be/yeUpnIKt6k4?si=utT8AFTXHKI7RBoH", 4.7));
        return list;
}




    public static ArrayList<Anime> getRomanceAnime(){

ArrayList<Anime> list = new ArrayList<>();
    
        list.add(new Anime("Blue Box", "Romance","Blue Box is a sports romance anime that follows the story of a high school boy balancing his love for badminton and his feelings for a girl on the basketball team.","https://www.youtube.com/watch?v=tcK9Eghsfq8", 4.7));
        list.add(new Anime("Your Name", "Romance","Two strangers mysteriously swap bodies and must navigate their lives while uncovering a deep, otherworldly connection.","https://www.youtube.com/watch?v=RuyHIkXdYf8", 4.9));
        list.add(new Anime("A Silent Voice", "Romance","A former bully seeks redemption by befriending the deaf girl he once tormented, exploring themes of guilt, forgiveness, and personal growth.","https://www.youtube.com/watch?v=nfK6UgLra7g", 4.9));
        list.add(new Anime("Toradora", "Romance","A high school romance-comedy about two unlikely friends, each with a secret crush on the other's best friend, as they navigate love and friendship.","https://www.youtube.com/watch?v=ya570uUgQNc", 4.8));
        list.add(new Anime("Love is War", "Romance","Two highly competitive student council leaders engage in a hilarious and strategic battle to make the other confess their love first.","https://www.youtube.com/watch?v=rZ95aZmQu_8", 4.9));
       
        return list;
     
    } 
    

    
    public static ArrayList<Anime> getAllAnime(){
        ArrayList<Anime> list = new ArrayList<>();
       
        
       
        list.addAll(getActionAnime());
        list.addAll(getRomanceAnime());
        return list; 
    }
    
    public static Anime searchByTitle(ArrayList<Anime> animeList, String title){
        for(Anime anime : animeList){
            if(anime.getTitle().equalsIgnoreCase(title)){
                return anime;
            }
        }
        return null;
    }
    
   public static ArrayList<Anime> filterByRating(ArrayList<Anime> list, double minRating){
       ArrayList<Anime> result = new ArrayList<>();
       for (Anime anime : list){
           if (anime.getRating() >= minRating){
               result.add(anime);
           }
       }
       return result;
   } 
}