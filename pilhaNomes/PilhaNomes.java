package pilhaNomes;

import pilha.Pilha;

public class PilhaNomes implements Comparable<PilhaNomes>{

    Pilha pilhaNomes = new Pilha();

    public boolean ehVazia(){
        return pilhaNomes.pegaTamanho() == 0;
    }

    public void insereNome(String nome){
        if(ehVazia()){
            pilhaNomes.push(nome);
        }else{
            String nomeTopo = (String) pilhaNomes.top();
            if(nome.compareTo(nomeTopo) < 0){
                pilhaNomes.push(nome);
            }else if(nome.compareTo(nomeTopo) > 0){
                pilhaNomes.push(nome);
            }
        }
    }

    public void exibeTopo(){
        String nome = (String) pilhaNomes.top();
        System.out.println(nome);
    }


    @Override
    public int compareTo(PilhaNomes outroNome) {
        String nome1 = (String) pilhaNomes.top();
        String nome2 = (String) outroNome.pilhaNomes.top();
        return nome1.compareTo(nome2);
    }
}
