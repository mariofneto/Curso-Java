public class Funcionario {
    private Integer id;
    private String name;
    private Double salary;

    Funcionario(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return getId() + ", " + getName() + ", " + String.format("%.2f", getSalary());
    }

    public void increaseSalary(Double percentage){
        double aumento = percentage * salary / 100;
        salary+=aumento;
    }







}
