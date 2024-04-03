package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    //couplage faible
    private IDao dao;
    @Override
    public double calcul() {
        double tmp= dao.getdata();
        double res=tmp*540/math.cos(tmp*math.PI);
        return res;
    }
    //afecter une variable a dao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
