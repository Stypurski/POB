package Exercícios.Lista13.TransformaçãoPipelineGravaçãoNovoArquivo.Main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class Main{
    private static void preenchedor(Path arq){
        
        try{
            Files.write(arq, List.of("   joão silva  ", "", "   ", "MARIA oliveira", "  pedro santos   ", "ana COSTA"));
        }catch(IOException e){
            System.out.println("ERRO : " + e.getMessage());
        }
        
    }
    public static void main(String[] args){
        
        Path arqBruto = Path.of("clientes_bruto.txt");
        Path arqPadronizado = Path.of("clientes_padronizado.txt");
        
        preenchedor(arqBruto);
        
        try(Stream<String> stream =Files.lines(arqBruto)){
            
            List<String> clientes = stream
                                    .map(linha -> linha.trim())
                                    .filter(linha -> !linha.isBlank())
                                    .map(linha -> linha.toUpperCase())
                                    .toList();
            
            Files.write(arqPadronizado, clientes, StandardOpenOption.CREATE);
            
            System.out.println("SUCESSO ao gerar aquivo\n Total de nomes: " + clientes.size());
            
        }catch(IOException e){
            System.out.println("ERRO : " + e.getMessage());
        }
    }
}
