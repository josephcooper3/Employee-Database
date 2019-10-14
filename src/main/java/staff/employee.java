package staff;

public abstract class employee {

    private String name;
    private String nINumber;
    private double salary;

    public String getName() {
        return name;
    }

    public String getNINumber() {
        return nINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increment){
        salary = salary * (100.0+increment);
    }

    public double payBonus(){
        return salary / 100;
    }

}
