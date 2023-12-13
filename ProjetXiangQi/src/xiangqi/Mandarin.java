package xiangqi;

public class Mandarin extends Piece {
    public Mandarin(String couleur) {
        super("Mandarin", couleur);
    }

    @Override
    public boolean estValide(Position depart, Position arrivee) {
        if((super.norme(depart,arrivee)==2 || super.norme(depart,arrivee)==0) && super.estDansLePalais(arrivee)){
            return true;}  // déplacement nul OU de 2 permis seulement
        return false;
    }
}

