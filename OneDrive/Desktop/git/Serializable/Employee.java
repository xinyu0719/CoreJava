//Problems: Define a “Employee” POJO class and make it serializable
import java.io.*;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private long id;
    private String name;
    private int age;
    private double salary;

    public Employee(long id, String name, int age, double salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setId(long id){
        this.id = id;
    }
    public void setName(String name){
        this.name =name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }

    private static void serialize(String filepath, Employee employee ) throws IOException{
        File file =new File(filepath);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);
        fileOutputStream.close();
        objectOutputStream.close();
    }


    public static void main(String[] args) throws IOException{
        String filename = "C:\\Users\\47612\\OneDrive\\Desktop\\java.txt";
        Employee employee = new Employee(1234,"wang",20, 3000);
        serialize(filename, employee);
    }
}
