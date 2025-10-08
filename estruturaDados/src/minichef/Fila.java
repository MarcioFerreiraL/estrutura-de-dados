package minichef;

import java.util.LinkedList;
import java.util.List;

public class Fila {
	private List<Character> elementos;

    public Fila() {
        this.elementos = new LinkedList<>();
    }

    // Adiciona um elemento no final da fila.
    public void enqueue(char elemento) {
        elementos.add(elemento);
    }

    // Remove e retorna o elemento do início da fila.
    public Character dequeue() {
        if (empty()) {
            return null; // Retorna null se a fila estiver vazia.
        }
        return ((LinkedList<Character>) elementos).removeFirst();
    }

    // Retorna o elemento do início da fila sem removê-lo.
    public Character head() {
        if (empty()) {
            return null; // Retorna null se a fila estiver vazia.
        }
        return ((LinkedList<Character>) elementos).getFirst();
    }

    // Retorna o número de elementos na fila.
    public int size() {
        return elementos.size();
    }

    // Verifica se a fila está vazia.
    public boolean empty() {
        return elementos.isEmpty();
    }

    @Override
    public String toString() {
        return "Fila: " + elementos.toString();
    }
}