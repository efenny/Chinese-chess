package xiangqi;

public class Cavalier extends Piece {
    public Cavalier(String couleur) {
        super("Cavalier", couleur);
    }

    @Override
    public boolean estValide(Position depart, Position arrivee) {
        if((super.norme(depart,arrivee)==5 || super.norme(depart,arrivee)==0)){
            return true;}  // déplacement nul OU de ligne+diagonale seulement; ordre compte pas, meme resultat
        return false;
    }
}
