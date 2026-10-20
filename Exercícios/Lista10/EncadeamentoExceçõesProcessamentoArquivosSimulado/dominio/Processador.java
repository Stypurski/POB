package Exercícios.Lista10. EncadeamentoExceçõesProcessamentoArquivosSimulado.dominio;

import java.io.IOException;

class ProcessamentoDadosException extends Exception{
    public ProcessamentoDadosException(String msg, Exception causa){
        super(msg, causa);
    }
}

public class Processador{
    
    private String caminho;
    
    public Processador(String caminho){
        this.caminho =  caminho;
    }
    
    public void processarArquivo(String caminho) throws ProcessamentoDadosException{
        try{
            if(caminho == null || caminho.isEmpty()){
                throw new IOException("Caminho nulo, ou vazio");
            }
            int processado = Integer.parseInt(caminho);
        }catch(IOException e){
            throw new ProcessamentoDadosException ("Erro ao processar arquivo", e);
        }catch(NumberFormatException e){
            throw new ProcessamentoDadosException ("Erro ao processar arquivo", e);
        }
        
    }
}
