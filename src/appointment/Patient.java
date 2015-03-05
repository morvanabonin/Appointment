/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointment;

import java.util.Date;

/**
 *
 * @author morvana.bonin
 */
public class Patient {
    
    private String name;
    private Date birth_date;
    private String gender;
   
    public Patient(String name, Date birth_date, String gender) throws Exception {
        this.setName(name);
        this.setBirth_date(birth_date);
        this.setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if(! name.isEmpty()) {
            this.name = name;
        } else {
            throw new Exception ("Name cannot be empty");
        }
    }
    
    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
            this.birth_date = birth_date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) throws Exception {
        if(! gender.isEmpty()) {
            this.gender = gender;
        } else {
            throw new Exception ("Gender cannot be empty");
        }
    }
 
}
