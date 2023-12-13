package tests_pieces;
import org.junit.jupiter.api.*;
import xiangqi.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestChar {

    Char charNoir;
    Char charRouge;
    Position noirDepart;
    Position rougeDepart;

    @BeforeEach
    public void objetChar() {
        charNoir = new Char("noir");
        charRouge = new Char("rouge");
        noirDepart = new Position(0, 8);
        rougeDepart = new Position(9, 0);
    }
    //true
    @Test
    public void NoirPasDeMove(){
        assertTrue(charNoir.estValide(noirDepart, noirDepart));
    }
    @Test
    public void RougePasDeMove(){
        assertTrue(charRouge.estValide(rougeDepart, rougeDepart));
    }
    @Test
    public void NoirEstValideHorizontale() {
        Position arrivee = new Position(0, 5);
        assertTrue(charNoir.estValide(noirDepart, arrivee));
    }
    @Test
    public void RougeEstValideHorizontale() {
        Position arrivee = new Position(9, 3);
        assertTrue(charRouge.estValide(rougeDepart, arrivee));
    }

    @Test
    public void NoirEstValideVerticale() {
        Position arrivee = new Position(4, 8);
        assertTrue(charNoir.estValide(noirDepart, arrivee));
    }
    @Test
    public void RougeEstValideVerticale() {
        Position arrivee = new Position(4, 0);
        assertTrue(charRouge.estValide(rougeDepart, arrivee));
    }
    //false
    @Test
    public void NoirEstValideDiagonale(){
        Position arrivee = new Position(3, 5);
        assertFalse(charNoir.estValide(noirDepart, arrivee));
    }
    @Test
    public void RougeEstValideDiagonale(){
        Position arrivee = new Position(4, 5);
        assertFalse(charRouge.estValide(rougeDepart, arrivee));
    }
}
