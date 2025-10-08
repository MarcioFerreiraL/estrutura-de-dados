package minichef;

public class Main {

    public static void main(String[] args) {
        executarExercicioPilha();
        System.out.println("\n--------------------------------------------\n");
        executarExercicioFila();
        System.out.println("\n--------------------------------------------\n");
        executarExercicioLista();
    }

    public static void executarExercicioPilha() {
        System.out.println("### EXERCÍCIO DE PILHA ###");
        Pilha p = new Pilha();
        Object[] respostas = new Object[4];

        // 1. pop()
        System.out.println("1. pop()");
        p.pop();
        if (p.empty()){
        	System.out.println("   Retorno: Erro (pilha vazia)" + " | " + p);
        } else {
        	System.out.println("   Retorno: " + p);
        }
        
        // 2. push(p, 'a')
        System.out.println("2. push('a')");
        p.push('a');
        System.out.println("   " + p);

        // 3. push(p, 'c')
        System.out.println("3. push('c')");
        p.push('c');
        System.out.println("   " + p);

        // 4. top()
        System.out.println("4. top()");
        respostas[0] = p.top();
        System.out.println("   Retorno: " + respostas[0] + " | " + p);

        // 5. size()
        System.out.println("5. size()");
        respostas[1] = p.size();
        System.out.println("   Retorno: " + respostas[1] + " | " + p);

        // 6. push(p, 'g')
        System.out.println("6. push('g')");
        p.push('g');
        System.out.println("   " + p);

        // 7. pop()
        System.out.println("7. pop()");
        p.pop();
        System.out.println("   " + p);

        // 8. push(p, 'm')
        System.out.println("8. push('m')");
        p.push('m');
        System.out.println("   " + p);

        // 9. pop()
        System.out.println("9. pop()");
        p.pop();
        System.out.println("   " + p);

        // 10. top()
        System.out.println("10. top()");
        respostas[2] = p.top();
        System.out.println("   Retorno: " + respostas[2] + " | " + p);
        
        // 11. pop()
        System.out.println("11. pop()");
        p.pop();
        System.out.println("   " + p);

        // 12. pop()
        System.out.println("12. pop()");
        p.pop();
        System.out.println("   " + p);

        // 13. empty()
        System.out.println("13. empty()");
        respostas[3] = p.empty();
        System.out.println("   Retorno: " + respostas[3] + " | " + p);

        System.out.println("\n>> Respostas Finais (Pilha):");
        System.out.println("a) Qual o retorno do passo 1? " + "Erro: A pilha está vazia");
        System.out.println("b) Qual o retorno do passo 4? " + respostas[0]);
        System.out.println("c) Qual o retorno do passo 5? " + respostas[1]);
        System.out.println("d) Qual o retorno do passo 10? " + respostas[2]);
        System.out.println("e) Qual o retorno do passo 13? " + respostas[3]);
    }

    public static void executarExercicioFila() {
        System.out.println("### EXERCÍCIO DE FILA ###");
        Fila f = new Fila();
        Object[] respostas = new Object[5];

        // 1. dequeue()
        System.out.println("1. dequeue()");
        respostas[0] = f.dequeue();
        if (f.empty()){
        	System.out.println("   Retorno: Erro (fila vazia)" + " | " + f);
        } else {
        	System.out.println("   Retorno: " + f);
        }
        
        // 2. enqueue(f, b)
        System.out.println("2. enqueue('b')");
        f.enqueue('b');
        System.out.println("   " + f);

        // 3. dequeue()
        System.out.println("3. dequeue()");
        f.dequeue();
        System.out.println("   " + f);

        // 4. head()
        System.out.println("4. head()");
        respostas[1] = f.head();
        if (f.empty()){
        	System.out.println("   Retorno: Erro (pilha vazia)" + " | " + f);
        } else {
        	System.out.println("   Retorno: " + f);
        };

        // 5. size()
        System.out.println("5. size()");
        respostas[2] = f.size();
        System.out.println("   Retorno: " + respostas[2] + " | " + f);
        
        // 6. empty()
        System.out.println("6. empty()");
        f.empty();
        System.out.println("   " + f);

        // 7. enqueue(f, c)
        System.out.println("7. enqueue('c')");
        f.enqueue('c');
        System.out.println("   " + f);

        // 8. dequeue()
        System.out.println("8. dequeue()");
        f.dequeue();
        System.out.println("   " + f);

        // 9. enqueue(f, d)
        System.out.println("9. enqueue('d')");
        f.enqueue('d');
        System.out.println("   " + f);
        
        // 10. head()
        System.out.println("10. head()");
        respostas[3] = f.head();
        System.out.println("   Retorno: " + respostas[3] + " | " + f);
        
        // 11. dequeue()
        System.out.println("11. dequeue()");
        f.dequeue();
        System.out.println("   " + f);

        // 12. dequeue()
        System.out.println("12. dequeue()");
        f.dequeue();
        System.out.println("   " + f);

        // 13. empty()
        System.out.println("13. empty()");
        respostas[4] = f.empty();
        System.out.println("   Retorno: " + respostas[4] + " | " + f);

        System.out.println("\n>> Respostas Finais (Fila):");
        System.out.println("a) Qual o retorno do passo 1? " + " Erro (fila vazia)");
        System.out.println("b) Qual o retorno do passo 4? " + " Erro (fila vazia)");
        System.out.println("c) Qual o retorno do passo 5? " + respostas[2]);
        System.out.println("d) Qual o retorno do passo 10? " + respostas[3]);
        System.out.println("e) Qual o retorno do passo 13? " + respostas[4]);
    }

    public static void executarExercicioLista() {
        System.out.println("### EXERCÍCIO DE LISTA ###");
        Lista l = new Lista();
        Object[] respostas = new Object[6];

        // 1. add(l, '%')
        System.out.println("1. add('%')");
        l.add('%');
        System.out.println("   " + l);
        
        // 2. add(l, '!')
        System.out.println("2. add('!')");
        l.add('!');
        respostas[0] = l.toString();
        System.out.println("   " + l);

        // 3. size()
        System.out.println("3. size()");
        System.out.println("   Retorno: " + l.size() + " | " + l);

        // 4. add_pos(l, '#', 2)
        System.out.println("4. add_pos('#', 2)");
        l.add_pos('#', 2);
        System.out.println("   " + l);

        // 5. delete(l, 1)
        System.out.println("5. delete(1)");
        l.delete(1);
        respostas[1] = l.toString();
        System.out.println("   " + l);
        
        // 6. set(l, '@', 2)
        System.out.println("6. set('@', 2)");
        l.set('@', 2);
        System.out.println("   " + l);

        // 7. get(l, 2)
        System.out.println("7. get(2)");
        System.out.println("   Retorno: " + l.get(2) + " | " + l);

        // 8. add_pos(l, '&', 2)
        System.out.println("8. add_pos('&', 2)");
        l.add_pos('&', 2);
        respostas[2] = l.toString();
        System.out.println("   " + l);
        
        // 9. add_pos(l, '+', 1)
        System.out.println("9. add_pos('+', 1)");
        l.add_pos('+', 1);
        System.out.println("   " + l);
        
        // 10. get(3)
        System.out.println("10. get(3)");
        respostas[3] = l.get(3);
        System.out.println("   Retorno: " + respostas[3] + " | " + l);
        
        // 11. delete(2)
        System.out.println("11. delete(2)");
        l.delete(2);
        System.out.println("   " + l);

        // 12. set(l, '$', 3)
        System.out.println("12. set('$', 3)");
        l.set('$', 3);
        respostas[4] = l.toString();
        System.out.println("   " + l);

        // 13. size()
        System.out.println("13. size()");
        respostas[5] = l.size();
        System.out.println("   Retorno: " + respostas[5] + " | " + l);
        
        System.out.println("\n>> Respostas Finais (Lista):");
        System.out.println("a) Qual o estado da lista após o passo 2? " + respostas[0]);
        System.out.println("b) Qual o estado da lista após o passo 5? " + respostas[1]);
        System.out.println("c) Qual o estado da lista após o passo 8? " + respostas[2]);
        System.out.println("d) Qual o retorno do passo 10? " + respostas[3]);
        System.out.println("e) Qual o estado da lista após o passo 12? " + respostas[4]);
        System.out.println("f) Qual o retorno do passo 13? " + respostas[5]);
    }
}
