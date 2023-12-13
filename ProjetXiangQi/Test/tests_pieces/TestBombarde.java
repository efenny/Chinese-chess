package tests_pieces;
import org.junit.jupiter.api.*;
import xiangqi.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestBombarde { // A RAJOUTER POUR EST-POSSIBLE - PARTIE 2
    Bombarde bombardeNoir;
    Bombarde bombardeRouge;
    Position noirDepart;
    Position rougeDepart;

    @BeforeEach
    public void objetBombarde() {
        bombardeNoir = new Bombarde("noir");
        bombardeRouge = new Bombarde("rouge");
        noirDepart = new Position(2, 7);
        rougeDepart = new Position(7, 1);
    }
    //true
    @Test
    public void NoirPasDeMove(){
        assertTrue(bombardeNoir.estValide(noirDepart, noirDepart));
    }
    @Test
    public void RougePasDeMove(){
        assertTrue(bombardeRouge.estValide(rougeDepart, rougeDepart));
    }
    @Test
    public void NoirEstValideHorizontale() {
        Position arrivee = new Position(2, 5);
        assertTrue(bombardeNoir.estValide(noirDepart, arrivee));
    }
    @Test
    public void RougeEstValideHorizontale() {
        Position arrivee = new Position(7, 3);
        assertTrue(bombardeRouge.estValide(rougeDepart, arrivee));
    }

    @Test
    public void NoirEstValideVerticale() {
        Position arrivee = new Position(4, 7);
        assertTrue(bombardeNoir.estValide(noirDepart, arrivee));
    }
    @Test
    public void RougeEstValideVerticale() {
        Position arrivee = new Position(5, 1);
        assertTrue(bombardeRouge.estValide(rougeDepart, arrivee));
    }
    //false
    @Test
    public void NoirEstValideDiagonale(){
        Position arrivee = new Position(4, 5);
        assertFalse(bombardeNoir.estValide(noirDepart, arrivee));
    }
    @Test
    public void RougeEstValideDiagonale(){
        Position arrivee = new Position(5, 3);
        assertFalse(bombardeRouge.estValide(rougeDepart, arrivee));
    }
}
