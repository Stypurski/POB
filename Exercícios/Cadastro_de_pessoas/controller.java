package Exercícios.Cadastro_de_Pessoas.controller;

import Exercícios.Cadastro_de_Pessoas.model.Pessoa;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class PessoaController{
    
    
    private ArrayList<Pessoa> listaPessoas;
    
    public PessoaController(){
        this.listaPessoas = new ArrayList<>();
        this.mostrador();
    }
    
    
    
    public void adicionar(Pessoa pessoa){
        this.listaPessoas.add(pessoa);
    }
    
    public ArrayList<Pessoa> getListaPessoas(){
        return this.listaPessoas;
    }
    
    
    
    
    
    public void salva(){
        
        String destino = "pessoas.csv";
        
        try(BufferedWriter bw  = new BufferedWriter(new FileWriter(destino))){
        
        for(Pessoa p : this.listaPessoas){
            bw.write(p.retorno());
            bw.newLine();
        }
        
        System.out.println("Dados salvos no arquivo de texto com sucesso");
        
        }catch(IOException e){
            System.out.print("ERRO - nao foi possivel salvar o arquivo - " + e.getMessage());
        }
    }
    
    
    public void mostrador(){
        
        String destino = "pessoas.csv";
        
        File arquivo = new File(destino);
        
        if(!arquivo.exists()){
            return;
        }
        
        try(BufferedReader br =new BufferedReader(new FileReader(destino))){
        
            String linha;
            while((linha = br.readLine()) != null){
                
                String[] dados = linha.split(";");
                
                int id = Integer.parseInt( dados[0]);
                String nome = dados[1];
                int idade = Integer.parseInt( dados[2]);
                double altura = Double.parseDouble( dados[3]);
                
                Pessoa p = new Pessoa(id, idade, altura, nome);
                this.listaPessoas.add(p);
            }
        }catch(IOException e){
            System.out.println("ERRO - nao foi possivel carregar o arquivo" + e.getMessage());
        }catch(NumberFormatException e){
            System.out.println("ERRO -  nao foi possivel converter dados do arquivo");
        }
        
    }
        
}        
                
