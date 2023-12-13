package xiangqi;
public class Elephant extends Piece {
    public Elephant(String couleur) {
        super("Elephant", couleur);
    }

    @Override
    public boolean estValide(Position depart, Position arrivee) {
        if((super.norme(depart,arrivee)==8 || super.norme(depart,arrivee)==0) && super.estDansLaRiviere(arrivee)){
            return true;}  // déplacement nul OU de 2 diagonales seulement
        return false;
    }
}
