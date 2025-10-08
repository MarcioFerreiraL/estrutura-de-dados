package minichef;

import java.util.ArrayList;
import java.util.List;

public class Pilha {
    private List<Character> elementos;

    public Pilha() {
        this.elementos = new ArrayList<>();
    }

    // Adiciona um elemento no topo da pilha.
    public void push(char elemento) {
        elementos.add(elemento);
    }

    // Remove e retorna o elemento do topo da pilha.
    public Character pop() {
        if (empty()) {
            return null; // Retorna null se a pilha estiver vazia.
        }
        return elementos.remove(elementos.size() - 1);
    }

    // Retorna o elemento do topo da pilha sem removê-lo.
    public Character top() {
        if (empty()) {
            return null; // Retorna null se a pilha estiver vazia.
        }
        return elementos.get(elementos.size() - 1);
    }

    // Retorna o número de elementos na pilha.
    public int size() {
        return elementos.size();
    }

    // Verifica se a pilha está vazia.
    public boolean empty() {
        return elementos.isEmpty();
    }

    @Override
    public String toString() {
        return "Pilha: " + elementos.toString();
    }
}
