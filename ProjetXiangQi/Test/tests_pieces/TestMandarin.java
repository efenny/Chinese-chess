package tests_pieces;
import org.junit.jupiter.api.*;
import xiangqi.*;
import static org.junit.jupiter.api.Assertions.*;


public class TestMandarin {
    Mandarin mandarinNoir;
    Mandarin mandarinRouge;
    Position noirDepart;
    Position rougeDepart;

    @BeforeEach
    public void objetMandarin() {
        mandarinNoir = new Mandarin("noir");
        mandarinRouge = new Mandarin("rouge");
        noirDepart = new Position(0, 5);
        rougeDepart = new Position(9, 3);
    }
    //true
    @Test
    public void NoirPasDeMove(){
        assertTrue(mandarinNoir.estValide(noirDepart, noirDepart));
    }
    @Test
    public void RougePasDeMove(){
        assertTrue(mandarinRouge.estValide(rougeDepart, rougeDepart));
    }
    @Test
    public void NoirEstValideAvant() {
        Position arrivee = new Position(1, 4);
        assertTrue(mandarinNoir.estValide(noirDepart, arrivee));
    }
    @Test
    public void RougeEstValideArriere() { //test aussi si mouvement du milieu vers coté du palais marche
        Position depart = new Position(8,4);
        Position arrivee = new Position(9, 5);
        assertTrue(mandarinRouge.estValide(depart, arrivee));
    }
    public void NoirEstValideMilieuVersCotePalais(){
        Position depart = new Position(1,4);
        Position arrivee = new Position(0, 3);
        assertTrue(mandarinNoir.estValide(depart, arrivee));
    }

    //false
    @Test
    public void NoirEstValideNormeTrop(){
        Position arrivee = new Position(2, 3);
        assertFalse(mandarinNoir.estValide(noirDepart, arrivee));
    }
    @Test
    public void RougeEstValideNormeTrop(){
        Position arrivee = new Position(7, 5);
        assertFalse(mandarinRouge.estValide(rougeDepart, arrivee));
    }

    @Test
    public void NoirEstValideNorme1(){
        Position arrivee = new Position(0, 4);
        assertFalse(mandarinNoir.estValide(noirDepart, arrivee));
    }
    @Test
    public void RougeEstValideNorme1(){
        Position arrivee = new Position(9, 5);
        assertFalse(mandarinRouge.estValide(rougeDepart, arrivee));
    }
    @Test
    public void NoirHorsPalais(){
        Position depart = new Position(2,3);
        Position arrivee = new Position(3, 2);
        assertFalse(mandarinNoir.estValide(depart, arrivee));
    }
    @Test
    public void RougeHorsPalais(){
        Position depart = new Position(7,5);
        Position arrivee = new Position(6, 6);
        assertFalse(mandarinRouge.estValide(depart, arrivee));
    }
}

