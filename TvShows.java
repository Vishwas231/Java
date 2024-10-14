
public class TvShows{
	
public static void main(String[] args) {
        
        TVShow show1 = new TVShow("Breaking Bad", "Drama", 5, 13, 9.5);
        TVShow show2 = new TVShow("Friends", "Comedy", 10, 24, 8.9);
        TVShow show3 = new TVShow("Stranger Things", "Sci-Fi", 4, 9, 8.7);
        TVShow show4 = new TVShow("The Crown", "Drama", 6, 10, 8.6);
        TVShow show5 = new TVShow("The Office", "Comedy", 9, 22, 8.8);
        TVShow show6 = new TVShow("Game of Thrones", "Fantasy", 8, 10, 9.3);
        TVShow show7 = new TVShow("The Witcher", "Fantasy", 3, 8, 8.2);
        TVShow show8 = new TVShow("Money Heist", "Thriller", 5, 10, 8.3);
        TVShow show9 = new TVShow("Sherlock", "Mystery", 4, 3, 9.1);
        TVShow show10 = new TVShow("Black Mirror", "Sci-Fi", 5, 6, 8.9);

        
        show1.getShowInfo();
        show2.getShowInfo();
        show3.getShowInfo();
        show4.getShowInfo();
        show5.getShowInfo();
        show6.getShowInfo();
        show7.getShowInfo();
        show8.getShowInfo();
        show9.getShowInfo();
        show10.getShowInfo();

        
        show1.playEpisode();
        show2.pauseEpisode();
        show3.nextEpisode();
        show4.playEpisode();
    }
}








