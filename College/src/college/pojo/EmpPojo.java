
package college.pojo;

/**
 *
 * @author Nitin
 */
public class EmpPojo {
    
   private String id;
   private String name;
   private String desig;
   private String college;
   private String dept;
   private String tel;
   private String mob;
   private String email;
   private String address;

    public EmpPojo(String id, String name, String desig, String college, String dept, String tel, String mob, String email, String address) {
        this.id = id;
        this.name = name;
        this.desig = desig;
        this.college = college;
        this.dept = dept;
        this.tel = tel;
        this.mob = mob;
        this.email = email;
        this.address = address;
    }

    public EmpPojo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
   
    
   
}
