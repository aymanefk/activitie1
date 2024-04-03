package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Scanner scanner=new Scanner(new File("config.txt"));
        //lire la premiere ligne du fichier texte
        String daoClassename =Scanner.nextLine();
        //instanciation dynamique de la classe
        Class cDao=Class.forName(daoClassename);
        IDao dao=(IDao) cDao.newInstance();
        System.out.println(dao.getdata());

        String metierClassename = Scanner.nextLine();
        Class cMetier=Class.forName(metierClassename);
        IMetier metier=(IMetier) cMetier.newInstance();
        //stters dynamique de classe metier
        Method method=cMetier.getMethod("setDao",IDao.class);
        //executer la methode
        method.invoke(metier,dao);
        System.out.println("resultats=>"+metier.calcul());


    }
}
