public class Aluguel {
    private String nome;
    private String email;

    public Aluguel(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString(){
        return this.nome + ", " + this.email;
    }






}
