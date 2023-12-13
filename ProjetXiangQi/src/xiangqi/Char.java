package xiangqi;

public class Char extends Piece {
    public Char(String couleur) {
        super("Char", couleur);
    }



    @Override
    public boolean estValide(Position depart, Position arrivee) {
        for(int ligne = 0; ligne <= 9; ligne++){ // horizontale - ligne change pas
            for(int colonne=0; colonne<=8; colonne++) {
                if((depart.getLigne()-arrivee.getLigne()==0)){
                    return true;
                }
                if((depart.getColonne()-arrivee.getColonne()==0)){
                    return true;
                }
            }
        }
        return false;
    }
}

