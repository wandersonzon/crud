/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.util.ArrayList;



/**
 *
 * @author senaii04
 */
public class Funcionario {
    private int matricula;
    private String nome;
   private String departamento;
    ArrayList<Funcionario> ListFunc;
    
    
    public Funcionario() {
        ListFunc = new ArrayList();
    }

    
    public Funcionario (int matricula, String nome, String departamento) {
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
    }
    
    
    //Get e Set
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public ArrayList<Funcionario> getListFunc() {
        return ListFunc;
    }

    public void setListFunc(ArrayList<Funcionario> ListFunc) {
        this.ListFunc = ListFunc;
    }
    
    
    
    

    
    
}
