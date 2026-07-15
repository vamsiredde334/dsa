class Employee{
    private String name;
    private double salary;
    public void setName(String n){
        name=n;
    }
    public void setSalary(double s){
        salary=s;
    }
    String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
}

public class e1 {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setName("vamsi");
        e1.setSalary(5000);
        System.out.println("Name : "+e1.getName());
        System.out.println("Salary : "+e1.getSalary());
    }
}
