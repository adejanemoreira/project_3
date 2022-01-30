/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.agenda;
import java.util.Scanner;
/**
 *
 * @author Adejane
 */
public class Mostrar {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
            System.out.println("Nome da agenda:");
                String nome = scan.nextLine();
                AgendTel agenda = new AgendTel(nome);
                ContProfissional[] contatos = new ContProfissional[4];
                for(int i=0;i<4;i++){
                System.out.println("Entre com o contato -> "+(i+1));
                   ContProfissional c= new ContProfissional();
                    
                    System.out.println("Nome:");  
                    nome = scan.nextLine();
                    c.setNome(nome);
                 
                    System.out.println("Telefone:");
                    String telefone = scan.nextLine();
                    c.setTelefone(telefone);
                    
                    System.out.println("E-mail:");
                    String email = scan.nextLine();
                    c.setEmail(email);
                    
                    System.out.println("Profissional/Pessoal: ");
                    String tipoCont = scan.nextLine();
                    c.setTipoCont(tipoCont);
                    
                    System.out.println("Data em ddmmaa:");
                    String data = scan.nextLine();
                    c.setData(data);
                    
                    System.out.println("Endereço-Rua,Número da casa e Bairro");
                    String endereco = scan.nextLine();
                    c.setEndereco(endereco);
             
                    contatos[i] = c;
                    
            }
            agenda.setContatos(contatos);
            
            
            // tentei realizar as outras funções, mas sempre dava algo errado.
            
            
            
            
    }
 }
