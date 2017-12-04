package afs.apsw.human2.ent;

import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.persistence.*;

/**
 *
 * @author alpha
 */
@Entity
public class Human implements Serializable {

    private int id;
    private String name;
    private String address;
    private Date dob;

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Human(String name, String address, Date dob) {
        this.name = name;
        this.address = address;
        this.dob = dob;
    }

    public long getAgeInYears() {
        Date now = new Date();
        long duration = now.getTime() - dob.getTime();
        long years = TimeUnit.MILLISECONDS.toHours(duration) / (24 * 365);
        return years;
    }
}
