/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afs.apsw.human2.pers;

import afs.apsw.human2.ent.Human;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alpha
 */
@Stateless
public class HumanFacade extends AbstractFacade<Human> {

    @PersistenceContext(unitName = "afs.apsw_human2_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HumanFacade() {
        super(Human.class);
    }
    
}
