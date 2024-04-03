package presentation;

import dao.daoImpl;
import metier.MetierImpl;

public class presentation {
    public static void main(String[] args) {
        daoImpl dao= new daoImpl();
        //cretion d un object metier implementation
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);
        System.out.println("resultas="+metier.calcul());
    }
}
