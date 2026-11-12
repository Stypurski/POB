package Exercícios.Lista13.CriaçãoEscritaSeguraRelatório.Main;

import java.nio.file.*;
import java.io.IOException;
import java.time.LocalDateTime;

public class Main{
    public static void main(String[] args){
        
        Path diretorio = Path.of("dados/relatorios");
        
        Path arquivo = diretorio.resolve("sumario.txt");
        
        try{
            
            if(Files.notExists(diretorio)){
                Files.createDirectories(diretorio);
            }
            
            Files.writeString(arquivo, "Informacoes de execucao\n Status: OK\n Data e hora: " + LocalDateTime.now(),
                                StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
                                
            System.out.println("Arquivo salvo com sucesso");
            
        }catch(IOException e){
            System.out.println("ERRO ao manipular arquivo: " + e.getMessage());
        }
    }
}
