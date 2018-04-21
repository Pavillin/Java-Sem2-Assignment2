package assignment2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;



/**
 *
 * @author Dylan
 */
public class Game{
    private String title, genre, rating;
    private double price;
    
    private String[] validGenres = {"rpg","shooter","sports","open world"}; 
    private String[] validRatings = {"M", "T", "E"};
    
    public Game(String title, String genre, String rating, double price){
        setTitle(title);
        setGenre(genre);
        setRating(rating);
        setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(!"".equals(title)) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Title cannot be empty.");
        }
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if(genre != null){
            for(String validGenre : validGenres)
            {
                if (validGenre.equalsIgnoreCase(genre))
                {
                    this.genre = genre;
                    return;
                }
            }
            throw new IllegalArgumentException("Valid genres are rpg, sports, shooter, and open world.");
        } else {
            throw new IllegalArgumentException("A genre must be selected");
        }
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        if(rating != null){
            for(String validRating : validRatings)
            {
                if (validRating.equalsIgnoreCase(rating))
                {
                    this.rating = rating;
                    return;
                }
            }
            throw new IllegalArgumentException("Valid ratings are M, T, and E.");
        } else {
            throw new IllegalArgumentException("A rating must be selected");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price >= 0 && price <= 100){
            this.price = price;
        } else {
            throw new IllegalArgumentException("The price must be between 0 and 100");
        }
    }  
    
    /**
     * Save the created game to game.txt formatted using toString method
     * @param stringToWrite
     * @throws IOException 
     */
    public void saveGameToFile(String stringToWrite) throws IOException{
        String filename = "game.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true))) {

			bw.write(stringToWrite);

			System.out.println("#### GAME SAVED IN game.txt ####");

		} catch (IOException e) {

			e.printStackTrace();

		}
    }
    
    /**
     * override the toString method returning the title, genre, rating, and price
     * @return 
     */
    @Override
    public String toString()
    {
        return String.format("#### GAME CREATED ####%nTitle: " + title + "%nGenre: " + genre + "%nRating: " + rating + "%nPrice: " + String.format("$%.2f",price) + "%n");
    }
}
