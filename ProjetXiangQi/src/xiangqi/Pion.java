package xiangqi;

public class Pion extends Piece {
    public Pion(String couleur) {
        super("Pion", couleur);
    }

    @Override
    public boolean estValide(Position depart, Position arrivee) {
        if (super.norme(depart, arrivee) <= 1 && super.norme(depart, arrivee) >= 0 && super.estVersAvant(depart, arrivee)) {
            if (super.estDansLaRiviere(depart)) { // dans sa riviere: avance verticalement seulement
                if (depart.getColonne() - arrivee.getColonne() == 0) {
                    return true;
                }
            } else if (!super.estDansLaRiviere(depart)) { // hors de la riviere:n'importe quel mouvement de norme 1
                return true;
            }
        }
        return false;
    }
}