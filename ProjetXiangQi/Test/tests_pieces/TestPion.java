package tests_pieces;
import org.junit.jupiter.api.*;
import xiangqi.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestPion {
    Pion pionNoir;
    Pion pionRouge;
    Position noirDepart;
    Position rougeDepart;

    @BeforeEach
    public void objetPion() {
        pionNoir = new Pion("noir");
        pionRouge = new Pion("rouge");
        noirDepart = new Position(3, 8);
        rougeDepart = new Position(6, 0);
    }
    //true
    @Test
    public void NoirPasDeMove(){
        assertTrue(pionNoir.estValide(noirDepart, noirDepart));
    }
    @Test
    public void RougePasDeMove(){
        assertTrue(pionRouge.estValide(rougeDepart, rougeDepart));
    }
    @Test
    public void NoirEstValideRiviere() {
        Position arrivee = new Position(4, 8);
        assertTrue(pionNoir.estValide(noirDepart, arrivee));
    }
    @Test
    public void RougeEstValideRiviere() {
        Position arrivee = new Position(5, 0);
        assertTrue(pionRouge.estValide(rougeDepart, arrivee));
    }
    public void NoirEstValideHorsRiviereVertical(){
        Position depart = new Position(5,7);
        Position arrivee = new Position(6, 7);
        assertTrue(pionNoir.estValide(depart, arrivee));
    }
    public void RougeEstValideHorsRiviereVertical(){
        Position depart = new Position(4,1);
        Position arrivee = new Position(3, 1);
        assertTrue(pionNoir.estValide(depart, arrivee));
    }
    public void NoirEstValideHorsRiviereHorizontal(){
        Position depart = new Position(5,7);
        Position arrivee = new Position(5, 8);
        assertTrue(pionNoir.estValide(depart, arrivee));
    }
    public void RougeEstValideHorsRiviereHorizontal(){
        Position depart = new Position(4,1);
        Position arrivee = new Position(4, 2);
        assertTrue(pionNoir.estValide(depart, arrivee));
    }
    //false
    @Test
    public void NoirEstValideDiagonale(){ //diag de 1
        Position arrivee = new Position(4, 7);
        assertFalse(pionNoir.estValide(noirDepart, arrivee));
    }
    @Test
    public void RougeEstValideDiagonale(){ //diag de 1
        Position arrivee = new Position(5, 1);
        assertFalse(pionRouge.estValide(rougeDepart, arrivee));
    }
    @Test
    public void NoirEstValideRiviereHorizontal(){
        Position arrivee = new Position(3, 7);
        assertFalse(pionNoir.estValide(noirDepart, arrivee));
    }
    @Test
    public void RougeEstValideRiviereHorizontal(){
        Position arrivee = new Position(6, 1);
        assertFalse(pionRouge.estValide(rougeDepart, arrivee));
    }
    @Test
    public void NoirEstValideArriere(){
        Position arrivee = new Position(2, 8);
        assertFalse(pionNoir.estValide(noirDepart, arrivee));
    }
    @Test
    public void RougeEstValideArriere(){
        Position arrivee = new Position(7, 0);
        assertFalse(pionRouge.estValide(rougeDepart, arrivee));
    }

}
