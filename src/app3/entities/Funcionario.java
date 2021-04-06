package app3.entities;

public class Funcionario {

    private int id;
    private String name;
    private double salary;

    public Funcionario(int id, String name, double salary) {

    }

    public void increaseSalary (double percentage) {
        salary += salary * (percentage / 100.0);
    }

    public Funcionario() {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }


}
