/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointment;

/**
 *
 * @author morvana.bonin
 */
public class Patient {
    
    private String name;
    private String birth_date;
    private String gender;
   
    public Patient(String name, String birth_date, String gender) {
        
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
    
    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) throws Exception {
        if(! birth_date.isEmpty()) {
            this.birth_date = birth_date;
        } else {
            throw new Exception ("Birth date cannot be empty");
        }
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
