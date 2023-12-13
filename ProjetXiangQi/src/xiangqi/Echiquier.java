package xiangqi;

public class Echiquier implements MethodesEchiquier{
    private Intersection [][] jeu;


    public Echiquier(){
        Intersection[][]jeu = new Intersection[10][9];
        for(int ligne = 0; ligne < 10; ligne++){
            for (int colonne = 0; colonne <9 ; colonne++) {
                jeu[ligne][colonne]= new Intersection(null);
            }
        }
    }

    @Override
    public void debuter() {
        //ech vide
        new Echiquier();
        //CHAR
        Char charnoir = new Char("noir");
        Char charrouge = new Char("rouge");
        jeu[0][0].setPiece(charnoir);
        jeu[0][8].setPiece(charnoir);
        jeu[9][0].setPiece(charrouge);
        jeu[9][8].setPiece(charrouge);
        //CAVALIER
        Cavalier cavaliernoir = new Cavalier("noir");
        Cavalier cavalierrouge = new Cavalier("rouge");
        jeu[0][1].setPiece(cavaliernoir);
        jeu[0][7].setPiece(cavaliernoir);
        jeu[9][1].setPiece(cavalierrouge);
        jeu[9][7].setPiece(cavalierrouge);
        //ELEPHANT
        Elephant elephantnoir = new Elephant("noir");
        Elephant elephantrouge = new Elephant("rouge");
        jeu[0][2].setPiece(elephantnoir);
        jeu[0][6].setPiece(elephantnoir);
        jeu[9][2].setPiece(elephantrouge);
        jeu[9][6].setPiece(elephantrouge);
        //MANDARIN
        Mandarin mandarinnoir = new Mandarin("noir");
        Mandarin mandarinrouge = new Mandarin("rouge");
        jeu[0][3].setPiece(mandarinnoir);
        jeu[0][5].setPiece(mandarinnoir);
        jeu[9][3].setPiece(mandarinrouge);
        jeu[9][5].setPiece(mandarinrouge);
        //ROI
        Roi roinoir = new Roi("noir");
        Roi roirouge = new Roi("rouge");
        jeu[0][4].setPiece(roinoir);
        jeu[9][4].setPiece(roirouge);
        //BOMBARDE
        Bombarde bombardenoir = new Bombarde("noir");
        Bombarde bombarderouge = new Bombarde("rouge");
        jeu[2][1].setPiece(bombardenoir);
        jeu[2][7].setPiece(bombardenoir);
        jeu[7][1].setPiece(bombarderouge);
        jeu[7][7].setPiece(bombarderouge);
        //PION
        Pion pionnoir = new Pion("noir");
        Pion pionrouge = new Pion("rouge");
        for(int ligne=3; ligne<=6; ligne+=3){
            for(int colonne=0;colonne<=8;colonne+=2){
                if(ligne==3){
                    jeu[ligne][colonne].setPiece(pionnoir);
                }
                else if(ligne==6){
                    jeu[ligne][colonne].setPiece(pionrouge);
                }
            }
        }

    }

    @Override
    public Intersection getIntersection(int ligne, int colonne) {
        return jeu[ligne][colonne];
    }

    @Override
    public boolean cheminPossible(Position depart, Position arrivee) {
        return false;
    }

    @Override
    public boolean roisNePouvantPasEtreFaceAFace(Position depart, Position arrivee) {
        return false;
    }
}
