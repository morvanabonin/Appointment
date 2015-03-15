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
public class Medicine {
    
    private int code;
    private String name;
    private String description;
    
    public Medicine(String name, String description) throws Exception {
        this.setName(name);
        this.setDescription(description);
    }
    
    public int getCode() {
        return code = this._randomCode();
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
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    //Needs to better implementation, because can produce equal numbers and not being validated it.
    private int _randomCode () {
        Random random = new Random();
        code = random.nextInt(999999);
        return code;
    }
}
