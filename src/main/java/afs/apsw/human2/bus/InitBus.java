package afs.apsw.human2.bus;

import afs.apsw.human2.ent.Human;
import afs.apsw.human2.pers.HumanFacade;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author alpha
 */
@Stateless
public class InitBus {
    public ArrayList<Human> people;
    
    @EJB
    public HumanFacade hf;

    public List<Human> getPeople() {
        people = new ArrayList<>();
        
//        Collections.addAll(people,
//                new Human("Rick Sanchez", "ffalk \nfdadkfa", new GregorianCalendar(1947, 5, 17).getTime()),
//                new Human("Morty Smith", "ffalk \nfdadkfa", new GregorianCalendar(1994, 8, 29).getTime()),
//                new Human("Light Yagami", "ffalk \nfdadkfa", new GregorianCalendar(1986, 1, 28).getTime()),
//                new Human("Rowan Atkinson", "Consett,\nCounty Durham,\nEngland", new GregorianCalendar(1955, 0, 6).getTime()),
//                new Human("Hugh Laurie", "Oxford,\nOxfordshire,\nEngland", new GregorianCalendar(1959, 10, 14).getTime())
//        );
//        
//        for (Human human : people) {
//            hf.create(human);
//        }

        return hf.findAll();
    }
}
