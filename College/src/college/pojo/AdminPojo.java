
package college.pojo;

/**
 *
 * @author Nitin
 */
public class AdminPojo {
    
   private String name;
   private String desig;
   private String tel;
   private String mob;
   private String email;
   private String other;

    public AdminPojo() {
    }

    public AdminPojo(String name, String desig, String tel, String mob, String email, String other) {
        this.name = name;
        this.desig = desig;
        this.tel = tel;
        this.mob = mob;
        this.email = email;
        this.other = other;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
   
   
}
