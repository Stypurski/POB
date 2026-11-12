package Exercícios.Lista13.LeituraLinhaLinhaProcessamentoFuncional;

import java.util.List;
import java.util.stream.Stream;
import java.io.IOException;
import java.nio.file.*;


public class Main{
    public static void main(String[] args){
        
        Path arqLog = Path.of("servidor.log");
        
        try{
            
            Files.writeString(arqLog, "[INFO] Servidor iniciado\n", StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            Files.writeString(arqLog, "[ERROR] Falha de conexao\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            Files.writeString(arqLog, "[ERROR] Timeout no banco\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            
            System.out.println("Arquivos salvos com sucesso");
            
        }catch(IOException e){
            System.out.println("ERRO ao manipular arquivo" + e.getMessage());
        }
        
        
        try(Stream<String> linhas = Files.lines(arqLog)){
            
            List<String> saida = linhas
                .filter(texto -> texto.startsWith("[ERROR]"))
                .map(texto -> texto.replace("[ERROR] ", ""))
                .toList();
                
            System.out.println("Foram encontrados " + saida.size() + " erros");
            
            System.out.println("As mensagens pos ajustes sao : "); 
            saida.forEach(mensagem -> System.out.println(mensagem));
            
        }catch(IOException e){
            System.out.println("Erro ao manipular arquivo: " + e.getMessage());
        }
    }
} 
