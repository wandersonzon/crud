package crud;


import java.util.ArrayList;




public class Cliente {
    private String nome;
    private long telefone;
    private long cpf;
    private String email;
    ArrayList<Cliente> ListClient;
    
    
    
    
    public Cliente() {
        ListClient = new ArrayList();
        
    }
    public Cliente(String nome, long telefone, long cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        ListClient = new ArrayList();
    }

    
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefopne(long dataAdms) {
        this.telefone = telefone;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //ListClient

    public ArrayList<Cliente> getListClient() {
        return ListClient;
    }

    public void setListClient(ArrayList<Cliente> ListClient) {
        this.ListClient = ListClient;
    }
    
    
}
