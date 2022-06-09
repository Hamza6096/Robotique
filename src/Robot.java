public class Robot {
    String nom;
    Lieu lieu;
    static int nb;


    public Robot() {
        nb++;
    }
    public Robot(String nom) {
        this();
        this.nom = nom;
//        Bob est un robot
        System.out.println(this.nom + " est un robot");
    }
    public Robot(String nom,Lieu lieu) {
        this(nom);
        this.lieu = lieu;
        System.out.println(this.nom + " est deja " + this.lieu.nom);
    }

    public void allerDans(Lieu lieu){
        this.lieu = lieu;
//        Bob va dans bureau
        System.out.println(this.nom + " va dans " + lieu.nom);
    }

    public void nettoyer(){
//        Bob nettoie bureau
        System.out.println(this.nom + " nettoie " + lieu.nom);
    }

    public static void arreter() {
        System.out.println("Les " + nb + " robots sont arretes");
    }
}
