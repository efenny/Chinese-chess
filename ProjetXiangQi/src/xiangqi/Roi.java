package xiangqi;

public class Roi extends Piece{
    public Roi(String couleur) {
        super("Roi", couleur);
    }
    @Override
    public boolean estValide(Position depart, Position arrivee) {
        if(super.norme(depart,arrivee)<=1 && super.norme(depart,arrivee)>=0 && super.estDansLePalais(arrivee)){
            return true;}  // déplacement nul OU de 1 permis seulement
        //faut que le roi soit dans le palais a l'arrivee (depart toujours dedans)
        return false;
    }
}
