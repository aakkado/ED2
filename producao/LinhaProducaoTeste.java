package producao;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LinhaProducaoTeste {

    LinhaProducao linhaProducao = new LinhaProducao();

    @Test
    public void testeAdicionar() {
        Object[] elementos = {"fernando", "carlos", "ana"};
        linhaProducao.adicionar(elementos);
    }

    @Test
    public void testeProcessar() {
        linhaProducao.processar(1);
        linhaProducao.processar(2);
        linhaProducao.processar(3);
    }

}
