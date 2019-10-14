package staff;

public abstract class Employee {

    private String name;
    private String nINumber;
    private Double salary;

    public Employee(String name, String nINumber, Double salary) {
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNINumber() {
        return nINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(Double increment){
        salary = salary * (100.0+increment);
    }

    public Double payBonus(){
        return salary / 100;
    }

}
