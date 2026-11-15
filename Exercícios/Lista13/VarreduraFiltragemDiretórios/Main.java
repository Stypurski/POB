package Exercícios.Lista13.VarreduraFiltragemDiretórios.Main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;
import java.util.List;

public class Main{
    public static void main(String[] args){
        
        Path pasta = Path.of("Exercícios/Lista13");
        
        try(Stream<Path> stream = Files.walk(pasta)){
            
            List<Path> arquivos = stream
                                .filter(p -> Files.isRegularFile(p) && p.toString().endsWith(".java"))
                                .toList();
                                
            long total = 0;
            long temp;
            
            for(int i=0;i<arquivos.size(); i++){
                
                Path arq = arquivos.get(i);
                Path diferenca = pasta.relativize(arq);
                
                temp = Files.size(arq);
                System.out.println("arquivo: " + diferenca + " tamanho: " + temp + " bytes");
                total += temp;
            }
            
            System.out.println("tamanho total dos arquivos Java =  " + total + " bytes");
            
        }catch(IOException e){
            System.out.println("ERRO : " + e.getMessage());
        }
    }
}
