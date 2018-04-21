/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dylan
 */
public class GameTest {
    
    Game validGame;
    
    public GameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        validGame = new Game("Skyrim", "rpg", "M", 29.99);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTitle method, of class Game.
     */
    @Test
    public void testGetTitle() {
        String expResult = "Skyrim";
        String result = validGame.getTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTitle method, of class Game.
     */
    @Test
    public void testSetTitle() {
        String title = "Rocket League";     
        validGame.setTitle(title);
        assertEquals(title, validGame.getTitle());
    }
    
    /**
     * Test of setTitle method, of class Game.
     */
    @Test
    public void testSetTitleInvalid()
    {
        String title = "";
        try{
            validGame.setTitle(title);
            fail("the setTitle method shouldn't allow empty stings");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of getGenre method, of class Game.
     */
    @Test
    public void testGetGenre() {
        String expResult = "rpg";
        String result = validGame.getGenre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGenre method, of class Game.
     */
    @Test
    public void testSetGenre() {   
        String genre = "Sports";     
        validGame.setGenre(genre);
        assertEquals(genre, validGame.getGenre());
    }
    
    /**
     * Test of setGenre method, of class Game.
     */
    @Test
    public void testSetGenreInvalid()
    {
        String genre = null;
        try{
            validGame.setGenre(genre);
            fail("the setGenre method can't be null.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    
    /**
     * Test of setGenre method, of class Game.
     */
    @Test
    public void testSetGenreInvalidOption()
    {
        String genre = "Q";
        try{
            validGame.setGenre(genre);
            fail("the setGenre method shouldn't allow strings other than rpg, sports, and open world.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of getRating method, of class Game.
     */
    @Test
    public void testGetRating() {
        String expResult = "M";
        String result = validGame.getRating();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRating method, of class Game.
     */
    @Test
    public void testSetRating() {
        String rating = "E";     
        validGame.setRating(rating);
        assertEquals(rating, validGame.getRating());
    }
    
    /**
     * Test of setRating method, of class Game.
     */
    @Test
    public void testSetRatingInvalid()
    {
        String rating = null;
        try{
            validGame.setRating(rating);
            fail("the setRating method can't be null.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    
    /**
     * Test of setRating method, of class Game.
     */
    @Test
    public void testSetRatingInvalidOption()
    {
        String rating = "Q";
        try{
            validGame.setRating(rating);
            fail("the setGenre method shouldn't allow strings other than M, T, and E.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of getPrice method, of class Game.
     */
    @Test
    public void testGetPrice() {
        double expResult = 29.99;
        double result = validGame.getPrice();
        assertEquals(expResult, result,0.0);
    }

    /**
     * Test of setPrice method, of class Game.
     */
    @Test
    public void testSetPrice() {
        validGame.setPrice(10.00);
        assertEquals(10.00, validGame.getPrice(), 0.0);
    }
    
    /**
     * Test of setPrice method, of class Game.
     */
    @Test
    public void testSetPriceInvalidLow()
    {
        try{
            validGame.setPrice(-1);
            fail("the setPrice method shouldn't allow numbers below 0.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    
    /**
     * Test of setPrice method, of class Game.
     */
    @Test
    public void testSetPriceInvalidHigh()
    {
        try{
            validGame.setPrice(101);
            fail("the setPrice method shouldn't allow numbers above 100.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    
}
