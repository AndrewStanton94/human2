package afs.apsw.human2.ctrl;

import afs.apsw.human2.bus.InitBus;
import afs.apsw.human2.ent.Human;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author alpha
 */
@Named(value = "sessionCtrl")
@SessionScoped
public class SessionCtrl implements Serializable {

    @EJB
    private InitBus ib;
    private List<Human> people;

    public List<Human> getPeople() {
        return people;
    }

    public void setPeople(List<Human> people) {
        this.people = people;
    }
    /**
     * Creates a new instance of sessionCtrl
     */
    public SessionCtrl() {
    }
    
    public String activate() {
        people = ib.getPeople();
        return "dataView";
    }
    
}
