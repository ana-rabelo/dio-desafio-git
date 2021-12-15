package dio.fila;

public class Main {
    public static void main(String[] args) {

        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println(minhaFila);

        minhaFila.dequeue();

        minhaFila.enqueue("último");
        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

    }
}
