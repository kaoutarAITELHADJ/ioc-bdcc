package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();

         MetierImpl metier= new MetierImpl(); // on creer un objet de la classe (l'implémentation)
         metier.calcule(); // on a NullPointerException car dao est null = on n'a pas satisfait les dépendances

        metier.setDao(d);
    }
}
