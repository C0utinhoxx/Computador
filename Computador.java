package Exercico;

import java.util.Scanner;

public class Computador {
    // Definindo o enum Computador com definições
    public enum ComputadorModelo {
        DELLINSPIRON15("Dell Inspiron 15", "Intel Core i7", 16, 512, "SSD", "NVIDIA GTX 1650", "Windows 11", 15.6, 4500.00),
        MACBOOKPRO("Apple MacBook Pro", "Apple M1", 8, 256, "SSD", "Integrada", "macOS Ventura", 13.3, 9000.00),
        ASUSVIVOBOOK("Asus Vivobook", "Intel Core i5", 8, 512, "SSD", "Intel Iris Xe", "Windows 10", 14.0, 3200.00);

        private final String modelo;
        private final String processador;
        private final int memoriaRAM; // em GB
        private final int armazenamento; // em GB
        private final String tipoArmazenamento; // HDD ou SSD
        private final String placaVideo; // modelo da placa de vídeo
        private final String sistemaOperacional;
        private final double tamanhoTela; // em polegadas
        private final double preco; // em reais

        // Formação do enum Computador
        ComputadorModelo(String modelo, String processador, int memoriaRAM, int armazenamento, String tipoArmazenamento, String placaVideo, String sistemaOperacional, double tamanhoTela, double preco) {
            this.modelo = modelo;
            this.processador = processador;
            this.memoriaRAM = memoriaRAM;
            this.armazenamento = armazenamento;
            this.tipoArmazenamento = tipoArmazenamento;
            this.placaVideo = placaVideo;
            this.sistemaOperacional = sistemaOperacional;
            this.tamanhoTela = tamanhoTela;
            this.preco = preco;
        }

        // Mecanismo para exibir as informações do computador
        public String exibirInformacoes() {
            return "Modelo: " + modelo + "\n" +
                   "Processador: " + processador + "\n" +
                   "Memória RAM: " + memoriaRAM + " GB\n" +
                   "Armazenamento: " + armazenamento + " GB " + tipoArmazenamento + "\n" +
                   "Placa de Vídeo: " + placaVideo + "\n" +
                   "Sistema Operacional: " + sistemaOperacional + "\n" +
                   "Tamanho da Tela: " + tamanhoTela + " polegadas\n" +
                   "Preço: R$ " + preco;
        }

        // Mecanismo para obter o preço do computador
        public double getPreco() {
            return preco;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário para escolher um modelo de computador
        System.out.println("Escolha um modelo de computador:");
        for (ComputadorModelo modelo : ComputadorModelo.values()) {
            System.out.println(modelo.name());
        }

        String escolha = scanner.nextLine().toUpperCase();
        try {
            ComputadorModelo modeloEscolhido = ComputadorModelo.valueOf(escolha);
            System.out.println("Você escolheu: " + modeloEscolhido);
            System.out.println(modeloEscolhido.exibirInformacoes());
        } catch (IllegalArgumentException e) {
            System.out.println("Modelo inválido. Por favor, escolha um modelo válido.");
        }
        scanner.close();
    }
}
