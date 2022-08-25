class Encap {
    private String name;
    private String idNum;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getIdNum() {
        return idNum;
    }
    
    public void setAge(int newAge) {
        age = newAge;
    }

     public void setName(String newName) {
        name = newName;
    }
    public void setItem(String newId) {
        idNum = newId;
    }

}

public class EncapTest {
    public static void main(String args[]) {
        Encap en = new Encap();
        en.setName("JOHN");
        en.setAge(22);
        en.setItem("28rnsd992KKDS");
    }
}