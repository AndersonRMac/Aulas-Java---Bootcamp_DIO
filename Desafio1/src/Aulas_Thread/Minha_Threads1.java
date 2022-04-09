package Aulas_Thread;
//instancia colocando os atributos
public class Minha_Threads1 extends Thread {

    private String nome;
    private int tempo;

//cria o método construtor
    public Minha_Threads1(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
        start();
    }

    //método run onde vai ficar a lógoca do código//
    public void run(){
        System.out.println("Executando a thread");

        for (int i = 0; i < 3; i++ ){
            System.out.println(nome + "contador " + i);
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(nome + "terminou a execução");
    }

}
//Métodos da Thread: *start; sleep;