/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenda;

/**
 *
 * @author Adejane
 */
public class Contato{
    private String nome;
    private String telefone;
    private String data;
    private String endereco;
  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String Endereço) {
        this.endereco = Endereço;
    }
    
    
    public String obterInfor(){
        return "Nome"+ nome+";"+
                "Endereço"+endereco+";"+
                "Telefone"+telefone+";"+
                "Data"+data;
                
    }
}
