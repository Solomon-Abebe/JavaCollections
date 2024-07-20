package Classes.Exercises.Inheritance;

public class Person {
    private String name;
    private int age;
    private String address;

    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
    class Staff extends Person{
    private String department;

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        Staff(String name, int age, String address, String department) {
            super(name, age, address);
            this.department = department;
        }
    }
       class PersonDemo{
           public static void main(String[] args) {
               Staff staff =new Staff("Solomon", 38,"Addis Ababa", "FullStack");

               System.out.println(" Name:" + staff.getName()+"\n "+
                       "Age: "+staff.getAge()+ "\n "+
                       "Address:"+ staff.getAddress()+ "\n"+
                       " Department: "+ staff.getDepartment());
               staff.setName("Selam");
               staff.setAge(32);
               staff.setAddress("Chicago");
               staff.setDepartment("Medicine");

               System.out.println("Second Staff:"+"\n" +" Name:" + staff.getName()+"\n "+
                       "Age: "+staff.getAge()+ "\n "+
                       "Address:"+ staff.getAddress()+ "\n"+
                       " Department: "+ staff.getDepartment());
           }

       }
