package producao;

import fila.Fila;

import java.util.Scanner;

public class LinhaProducao {


    private Fila maquina_um = new Fila();
    private Fila maquina_dois = new Fila();
    private Fila maquina_tres = new Fila();

    public void adicionar(Object[] elementos){
        for(Object elemento : elementos){
            maquina_um.adicionar(elemento);
        }
    }

    public void processar(int id_maquina){
        if(id_maquina == 1){
            while(!maquina_um.ehVazia()){
                maquina_dois.adicionar(maquina_um.poll());
            }
        } else if(id_maquina == 2){
            while(!maquina_dois.ehVazia()){
                maquina_tres.adicionar(maquina_dois.poll());
            }
        } else if(id_maquina == 3){
            while(!maquina_tres.ehVazia()){
                maquina_tres.remover();
            }
        }
    }

    public void exibirValores() {
        System.out.println("Itens na máquina 1:");
        maquina_um.exibirElementos();
        System.out.println("Itens na máquina 2:");
        maquina_dois.exibirElementos();
        System.out.println("Itens na máquina 3:");
        maquina_tres.exibirElementos();
    }
}


