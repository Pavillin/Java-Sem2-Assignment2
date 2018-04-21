
package assignment2;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


/**
 * FXML Controller class
 *
 * @author Dylan
 */
public class GameViewController implements Initializable {
    //game controller image
    @FXML private ImageView imageView;
    
    //title text field
    @FXML private TextField titleTextField;
    
    //combo boxes
    @FXML private ComboBox<String> genreComboBox;
    @FXML private ComboBox<String> ratingComboBox;

    //slider stuff
    @FXML private Slider priceSlider;
    @FXML private Label priceSliderLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Game controller image
        imageView.setImage(new Image("game-controller.png"));
        
        //configure the genre combobox
        List genres = Arrays.asList("rpg","shooter","sports","open world");
        genreComboBox.getItems().addAll(genres);
        
        //configure the rating combobox
        List ratings = Arrays.asList("M","T","E");
        ratingComboBox.getItems().addAll(ratings);
        
        //configure priceSlider
        priceSlider.setMin(0);
        priceSlider.setMax(100);
        priceSlider.setValue(60);
        updatePriceSliderLabel();
    }   
    
    /**
     * This will read the value from the slider and update
     * the label formatted with two places after decimal
     */
    public void updatePriceSliderLabel()
    {
        this.priceSliderLabel.setText(String.format("$%.2f",priceSlider.getValue()));
        
    }
    
    /**
     * This will display the created game in the console.
     */
    public void createGameButtonPushed() throws IOException
    {   
        try{
            //Save input into variables
            String title = titleTextField.getText();
            String genre = genreComboBox.getValue();
            String rating = ratingComboBox.getValue();
            double price = priceSlider.getValue();
            
            //create a new game object with the variables
            Game game = new Game(title, genre, rating, price);

            //print created game to console
            System.out.print(game.toString());
            
            //send created game to saveGameToFile method
            game.saveGameToFile(game.toString());
        } 
        catch (IllegalArgumentException e)
        {
            System.err.println(e);
        }
    }
    
}
