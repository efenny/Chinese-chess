package tests_echiquier;
import org.junit.jupiter.api.*;
import xiangqi.*;
import static org.junit.jupiter.api.Assertions.*;


public class TestDebut {

    

    @BeforeEach
    public void EchiquierDebut(){
        EchiquierDebut();
    }



    @Test
    public void EchiquierVisuel(){
        for(int ligne = 0; ligne < 10; ligne++){
            for (int colonne = 0; colonne <9 ; colonne++) {
                jeu[ligne][colonne]= new Intersection(null);
            }
        }
    }
}
