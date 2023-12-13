package tests_pieces;
import org.junit.jupiter.api.*;
import xiangqi.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestElephant {
    Elephant elephantNoir;
    Elephant elephantRouge;
    Position noirDepart;
    Position rougeDepart;

    @BeforeEach
    public void objetElephant() {
        elephantNoir = new Elephant("noir");
        elephantRouge = new Elephant("rouge");
        noirDepart = new Position(0, 6);
        rougeDepart = new Position(9, 2);
    }
    //true
    @Test
    public void NoirPasDeMove(){
        assertTrue(elephantNoir.estValide(noirDepart, noirDepart));
    }
    @Test
    public void RougePasDeMove(){
        assertTrue(elephantRouge.estValide(rougeDepart, rougeDepart));
    }
    @Test
    public void NoirEstValideGauche() {
        Position arrivee = new Position(2, 8);
        assertTrue(elephantNoir.estValide(noirDepart, arrivee));
    }
    @Test
    public void RougeEstValideDroite() { // teste direction opposé
        Position arrivee = new Position(7, 4);
        assertTrue(elephantRouge.estValide(rougeDepart, arrivee));
    }
    public void NoirEstValideVersCoteRiviere(){
        Position depart = new Position(2, 8);
        Position arrivee = new Position(4, 6);
        assertTrue(elephantNoir.estValide(depart, arrivee));
    }
    @Test
    public void RougeEstValideVersCoteRiviere() {
        Position depart = new Position(7, 0);
        Position arrivee = new Position(5, 2);
        assertTrue(elephantRouge.estValide(depart, arrivee));
    }
    @Test
    public void RougeEstValideCoteRiviereVersMilieu() { // mouvement de reculement
        Position depart = new Position(5, 2);
        Position arrivee = new Position(7, 4);
        assertTrue(elephantRouge.estValide(depart, arrivee));
    }


    //false
    @Test
    public void NoirEstValideNormeTrop(){
        Position arrivee = new Position(4, 2);
        assertFalse(elephantNoir.estValide(noirDepart, arrivee));
    }
    @Test
    public void RougeEstValideNormeTrop(){
        Position arrivee = new Position(5, 6);
        assertFalse(elephantRouge.estValide(rougeDepart, arrivee));
    }
    @Test
    public void NoirEstValideNorme1(){
        Position arrivee = new Position(0, 5);
        assertFalse(elephantNoir.estValide(noirDepart, arrivee));
    }
    @Test
    public void RougeEstValideNorme1(){
        Position arrivee = new Position(9, 3);
        assertFalse(elephantRouge.estValide(rougeDepart, arrivee));
    }
    @Test
    public void NoirEstValideNorme2(){
        Position arrivee = new Position(1, 5);
        assertFalse(elephantNoir.estValide(noirDepart, arrivee));
    }
    @Test
    public void RougeEstValideNorme2(){
        Position arrivee = new Position(8, 3);
        assertFalse(elephantRouge.estValide(rougeDepart, arrivee));
    }
    @Test
    public void NoirHorsRiviere(){
        Position depart = new Position(4,6);
        Position arrivee = new Position(6, 4);
        assertFalse(elephantNoir.estValide(depart, arrivee));
    }
    @Test
    public void RougeHorsRiviere(){
        Position depart = new Position(5, 2);
        Position arrivee = new Position(3, 0);
        assertFalse(elephantRouge.estValide(depart, arrivee));
    }
}
