/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointment;
import java.util.Random;
/**
 *
 * @author morvana.bonin
 */
public class Patient {
    
    private int ID;
    private String name;
    private String phone;
    private String address;
   
    public Patient(String name, String phone, String address) throws Exception {
        this.setName(name);
        this.setPhone(phone);
        this.setAddress(address);
    }

    Patient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getID() {
        return ID = this._randomID();
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
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws Exception {
        if(! phone.isEmpty()) {
            this.phone = phone;
        } else {
            throw new Exception ("Phone date cannot be empty");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws Exception {
        if(! address.isEmpty()) {
            this.address = address;
        } else {
            throw new Exception ("Address cannot be empty");
        }
    }
    
    //Needs to better implementation, because can produce equal numbers and not being validated it.
    private int _randomID () {
        Random random = new Random();
        ID = random.nextInt(99999);
        return ID;
    }
 
}
