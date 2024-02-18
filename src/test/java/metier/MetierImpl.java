package metier;
import dao.IDao;
public class MetierImpl implements IMetier {
    private IDao dao=null;  // le couplage faible: la class depend d'une interface non pas d'une implémentation

    public double calcule() {
        double t = dao.getData();
        double r =  t*3;
        return r;
    }

    public MetierImpl() {
    }

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    /* le setter pr injecter ds la var dao un objet d'une classe qui impléménte
    * l'injection de dépendance se fait par le setter (on peut aussi utiliser le constructeur pr Injection des dépendances)
    * MetierImpl hérite de l'interface Imetier et depend de l'interface IDao
    *  */
    public void setDao(IDao dao) {  // le setter là est pr faire l'injection des dépendance plus tard
        this.dao = dao;
    }

}
