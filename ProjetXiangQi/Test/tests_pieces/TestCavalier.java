package tests_pieces;
import org.junit.jupiter.api.*;
import xiangqi.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestCavalier {

    Cavalier cavalierNoir;
    Cavalier cavalierRouge;
    Position noirDepart;
    Position rougeDepart;

    @BeforeEach
    public void objetCavalier() {
        cavalierNoir = new Cavalier("noir");
        cavalierRouge = new Cavalier("rouge");
        noirDepart = new Position(0, 7);
        rougeDepart = new Position(9, 1);
    }
    //true
    @Test
    public void NoirPasDeMove(){
        assertTrue(cavalierNoir.estValide(noirDepart, noirDepart));
    }
    @Test
    public void RougePasDeMove(){
        assertTrue(cavalierRouge.estValide(rougeDepart, rougeDepart));
    }
    @Test
    public void NoirEstValideAvantGauche() {
        Position arrivee = new Position(2, 8);
        assertTrue(cavalierNoir.estValide(noirDepart, arrivee));
    }
    @Test
    public void RougeEstValideAvantDroite() {
        Position arrivee = new Position(7, 2);
        assertTrue(cavalierRouge.estValide(rougeDepart, arrivee));
    }
    @Test
    public void NoirEstValideArriereDroite() {
        Position depart = new Position(2, 8);
        assertTrue(cavalierNoir.estValide(depart, noirDepart));
    }
    @Test
    public void RougeEstValideArriereGauche() {
        Position depart = new Position(7, 2);
        assertTrue(cavalierRouge.estValide(depart, rougeDepart));
    }

    @Test
    public void NoirEstValideHorizontaleGauche() {
        Position depart = new Position(1, 5);
        Position arrivee = new Position(2,7);
        assertTrue(cavalierNoir.estValide(depart, arrivee));
    }
    @Test
    public void RougeEstValideHorizontaleDroite() {
        Position arrivee = new Position(8, 3);
        assertTrue(cavalierRouge.estValide(rougeDepart, arrivee));
    }

    //false
    @Test
    public void NoirEstValideNormeTrop(){
        Position arrivee = new Position(2, 5);
        assertFalse(cavalierNoir.estValide(noirDepart, arrivee));
    }
    @Test
    public void RougeEstValideNormeTrop(){
        Position arrivee = new Position(7, 3);
        assertFalse(cavalierRouge.estValide(rougeDepart, arrivee));
    }
    @Test
    public void NoirEstValideNorme1(){
        Position arrivee = new Position(1, 7);
        assertFalse(cavalierNoir.estValide(noirDepart, arrivee));
    }
    @Test
    public void RougeEstValideNorme1(){
        Position arrivee = new Position(8, 1);
        assertFalse(cavalierRouge.estValide(rougeDepart, arrivee));
    }
    @Test
    public void NoirEstValideNorme2(){
        Position arrivee = new Position(1, 6);
        assertFalse(cavalierNoir.estValide(noirDepart, arrivee));
    }
    @Test
    public void RougeEstValideNorme2(){
        Position arrivee = new Position(8, 2);
        assertFalse(cavalierRouge.estValide(rougeDepart, arrivee));
    }
}
