package Aulas;

public class Arrays {
    public static void main(String[] args) {

        int[] vetor = { 16, 12, 14, 20, 56, 32, 40 };
        int count = 0;

        System.out.println("Vetor: ");
// IMPRESSÃO DO VETOR EM ORDEM CRESCENTE

        while (count < (vetor.length)) {
            System.out.println(vetor[count]);
            count++;
        }
//IMPRESSÃO DO VETOR EM ORDEM DECRESCENTE

        for(int i = (vetor.length -1); i >= 0; i-- ){
            System.out.println(vetor[i] + " ");
        }
    }

}
