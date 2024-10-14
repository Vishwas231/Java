class TVShow {
    
    String title;
    String genre;
    int seasons;
    int episodesPerSeason;
    double rating;

    
    public TVShow(String title, String genre, int seasons, int episodesPerSeason, double rating) {
        this.title = title;
        this.genre = genre;
        this.seasons = seasons;
        this.episodesPerSeason = episodesPerSeason;
        this.rating = rating;
    }

   
    public void playEpisode() {
        System.out.println("Playing an episode of " + title);
    }

    public void pauseEpisode() {
        System.out.println("Pausing the episode of " + title);
    }

    public void nextEpisode() {
        System.out.println("Moving to the next episode of " + title);
    }

    public void getShowInfo() {
        System.out.println("Show Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Seasons: " + seasons);
        System.out.println("Episodes per Season: " + episodesPerSeason);
        System.out.println("Rating: " + rating);
        System.out.println("-------------------------------");
    }
}
