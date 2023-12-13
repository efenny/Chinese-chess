package tests_pieces;
import org.junit.jupiter.api.*;
import xiangqi.*;
import static org.junit.jupiter.api.Assertions.*;


public class TestRoi {
    Roi roiNoir;
    Roi roiRouge;
    Position noirDepart;
    Position rougeDepart;

    @BeforeEach
    public void objetRoi() {
        roiNoir = new xiangqi.Roi("noir");
        roiRouge = new xiangqi.Roi("rouge");
        noirDepart = new Position(0, 4);
        rougeDepart = new Position(9, 4);
    }
    //true
    @Test
    public void NoirPasDeMove(){
        assertTrue(roiNoir.estValide(noirDepart, noirDepart));
    }
    @Test
    public void RougePasDeMove(){
        assertTrue(roiRouge.estValide(rougeDepart, rougeDepart));
    }
    @Test
    public void EstValideVertical() {
        Position arrivee = new Position(1, 4);
        assertTrue(roiNoir.estValide(noirDepart, arrivee));
    }
    @Test
    public void EstValideHorizontal() {
        Position arrivee = new Position(9, 3);
        assertTrue(roiRouge.estValide(rougeDepart, arrivee));
    }
    public void NoirEstValideCoteduPalais(){
        Position depart = new Position(0,5);
        Position arrivee = new Position(1, 5);
        assertTrue(roiNoir.estValide(depart, arrivee));
    }
    public void RougeEstValideCoteduPalais(){
        Position depart = new Position(9,5);
        Position arrivee = new Position(5, 5);
        assertTrue(roiNoir.estValide(depart, arrivee));
    }

    //false
    @Test
    public void NoirEstValideNormeTrop(){
        Position arrivee = new Position(2, 4);
        assertFalse(roiNoir.estValide(noirDepart, arrivee));
    }
    @Test
    public void RougeEstValideNormeTrop(){
        Position arrivee = new Position(7, 4);
        assertFalse(roiRouge.estValide(rougeDepart, arrivee));
    }
    @Test
    public void NoirHorsPalais(){
        Position depart = new Position(2,4);
        Position arrivee = new Position(3, 4);
        assertFalse(roiNoir.estValide(depart, arrivee));
    }
    @Test
    public void RougeHorsPalais(){
        Position depart = new Position(7,4);
        Position arrivee = new Position(6, 4);
        assertFalse(roiRouge.estValide(depart, arrivee));
    }

//NOIR:
    //if(position.getLigne()<=2
    // && position.getColonne()>=3
    // && position.getColonne()<=5){

    //ROUGE
    //if(position.getLigne()>=7
    // position.getLigne()<=9
    // position.getColonne()>=3
    // position.getColonne()<=5){

}
