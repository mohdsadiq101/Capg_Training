package GameProject;

import java.util.ArrayList;
import java.util.List;

public class GameService {
    static List<Game> games = new ArrayList<Game>();

    // better practice is to initialize these details in a static block than in a default constructor
    static {
        games.add(new Game("SnowBird","Danny",300));
        games.add(new Game("FreshFood","Ram",450));
        games.add(new Game("Batsman","Kate",400));
        games.add(new Game("Pokiman","Steeve",600));
        games.add(new Game("YammyTommy","Narayan",350));
    }

//    public GameService(){
//        games.add(new Game("SnowBird","Danny",300));
//        games.add(new Game("FreshFood","Ram",450));
//        games.add(new Game("Batsman","Kate",400));
//        games.add(new Game("Pokiman","Steeve",600));
//        games.add(new Game("YammyTommy","Narayan",350));
//    }

    public List<Game> viewAll() {
        return games;
    }

    public String authorSearch(String author) {
        for (Game li : games){
            if (li.getAuthorName().equals(author))
                return li.getGameName();
        }
        return "Not Found";
    }

//    @Override
//    public String toString(String str){
//        str = gamen + " " + getAuthorName() +" "+ getPrice()
//    }
}
