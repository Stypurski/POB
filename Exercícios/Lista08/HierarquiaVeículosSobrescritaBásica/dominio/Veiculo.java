package Exercícios.Lista08.HierarquiaVeículosSobrescritaBásica.dominio;

public class Veiculo{

    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }



    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }


    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }


    public void exibirDetalhes(){
        System.out.println("\tInformacoes do veiculo");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
    }
}

 public class Carro extends Veiculo{
        
        private int quantidadePortas;

        public Carro(String marca, String modelo, int quantidadePortas){
            super(marca, modelo);
            this.quantidadePortas = quantidadePortas;
        }

        public int getQuantidadePortas(){
            return quantidadePortas;
        }

        public void setQuantidadePortas(int quantidadePortas){
            this.quantidadePortas = quantidadePortas;
        }


        @Override
        public void exibirDetalhes(){

            super.exibirDetalhes();
            System.out.println("Quantidade de portas: " + this.quantidadePortas);
        }
    }

    public class Moto extends Veiculo{

        private int cilindradas;

        public Moto(String marca, String modelo, int cilindradas){
            super(marca, modelo);
            this.cilindradas = cilindradas;
        }


        public int getCilindradas(){
            return cilindradas;
        }

        public void setCilindradas(int cilindradas){
            this.cilindradas = cilindradas;
        }

        @Override
        public void exibirDetalhes(){
            super.exibirDetalhes();
            System.out.println("Cilindradas: " + this.cilindradas);
        }
    }

