package dao;

public class daoImpl implements IDao {
    @Override
    public double getdata() {
        /* se connecter a la base de donnees pour recuperer la trmperature
         */
        System.out.println("version base de donnees");
        double temp= math.random()*40;
        return temp;
    }
}
