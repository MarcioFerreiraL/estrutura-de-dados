package minichef;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Character> elementos;

    public Lista() {
        this.elementos = new ArrayList<>();
    }

    // Adiciona um elemento no final da lista.
    public void add(char elemento) {
        elementos.add(elemento);
    }

    // Adiciona um elemento em uma posição específica.
    public void add_pos(char elemento, int pos) {
        // Validação da posição (1 <= pos <= tamanho da lista + 1)
        if (pos < 1 || pos > elementos.size() + 1) {
            System.out.println("Erro: Posição inválida para adição.");
            return;
        }
        elementos.add(pos - 1, elemento);
    }

    // Remove um elemento de uma posição específica.
    public Character delete(int pos) {
        if (pos < 1 || pos > elementos.size()) {
            System.out.println("Erro: Posição inválida para remoção.");
            return null;
        }
        return elementos.remove(pos - 1);
    }

    // Retorna um elemento de uma posição específica.
    public Character get(int pos) {
        if (pos < 1 || pos > elementos.size()) {
            System.out.println("Erro: Posição inválida para consulta.");
            return null;
        }
        return elementos.get(pos - 1);
    }
    
    // Substitui um elemento em uma posição específica.
    public void set(char elemento, int pos) {
        if (pos < 1 || pos > elementos.size()) {
            System.out.println("Erro: Posição inválida para substituição.");
            return;
        }
        elementos.set(pos - 1, elemento);
    }

    // Retorna o número de elementos na lista.
    public int size() {
        return elementos.size();
    }

    // Verifica se a lista está vazia.
    public boolean empty() {
        return elementos.isEmpty();
    }

    @Override
    public String toString() {
        return "Lista: " + elementos.toString();
    }
}