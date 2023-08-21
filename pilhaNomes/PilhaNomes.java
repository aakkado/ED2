package pilhaNomes;

import pilha.Pilha;

public class PilhaNomes{

    private Pilha pilhaNomes = new Pilha();


    public void push(String nome) {
        if (pilhaNomes.pegaTamanho() == 0) {
            pilhaNomes.push(nome);
        } else {
            if (nome.equals((String) pilhaNomes.top())) {
                System.out.println("Nome já existe na pilha");
            } else {
                Pilha pilhaAuxiliar = new Pilha();
                while (nome.compareTo((String) pilhaNomes.top()) < 0) {
                    pilhaAuxiliar.push(pilhaNomes.top());
                    pilhaNomes.pop();
                    if (pilhaNomes.pegaTamanho() == 0) {
                        break;
                    }
                }
                pilhaNomes.push(nome);
                while (pilhaAuxiliar.pegaTamanho() != 0) {
                    pilhaNomes.push(pilhaAuxiliar.top());
                    pilhaAuxiliar.pop();
                }
            }
        }
    }


    public void pop() {
        pilhaNomes.pop();
    }

    public Object top() {
        return pilhaNomes.top();
    }


}
