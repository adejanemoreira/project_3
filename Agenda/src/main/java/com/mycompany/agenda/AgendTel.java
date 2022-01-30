/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenda;

/**
 *
 * @author Adejane Moreira 
 * PROGRAMAÇÃO WEB I 
 */
public class AgendTel {
    private String nome;
    private ContProfissional[] contatos;
    
    public AgendTel(){
        
    }

    public AgendTel(String nome) {
        this.nome = nome;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ContProfissional[] getContatos() {
        return contatos;
    }

    public void setContatos(ContProfissional[] contatos) {
        this.contatos = contatos;
    }
    public String obterInfor(){
        String info = "Nome=" + nome + "\n";
        
        if(contatos != null){
            for(ContProfissional c: contatos){
                info += c.obterInfor()+"\n";
            }
        }
    return info;
    }
    
}
