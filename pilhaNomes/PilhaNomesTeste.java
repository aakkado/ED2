package pilhaNomes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.jupiter.api.Test;

public class PilhaNomesTeste {

    PilhaNomes pilhaNomes = new PilhaNomes();

    @Test
    void testeOrganizarNomes() {
        pilhaNomes.push("João");
        pilhaNomes.push("Maria");
        pilhaNomes.push("José");
        pilhaNomes.push("Ana");
        pilhaNomes.push("Carlos");

        assertEquals("Maria", pilhaNomes.top());
    }

    @Test
    void testeOrganizarNomesUmElemento(){
        pilhaNomes.push("João");

        assertEquals("João", pilhaNomes.top());
    }

    @Test
    void testeOrganizarNomesAlfabeto(){
        pilhaNomes.push("Ana");
        pilhaNomes.push("Bia");
        pilhaNomes.push("Carla");
        pilhaNomes.push("Daniel");
        pilhaNomes.push("Eduardo");
        pilhaNomes.push("Fernanda");
        pilhaNomes.push("Gustavo");
        pilhaNomes.push("Hugo");
        pilhaNomes.push("Igor");
        pilhaNomes.push("João");
        pilhaNomes.push("Kátia");
        pilhaNomes.push("Ziraldo");
        pilhaNomes.push("Xuxa");
        pilhaNomes.push("Wagner");
        pilhaNomes.push("Vitor");
        pilhaNomes.push("Yuri");
        pilhaNomes.push("Ulisses");
        pilhaNomes.push("Tatiana");
        pilhaNomes.push("Sandra");
        pilhaNomes.push("Ricardo");
        pilhaNomes.push("Quiteria");
        pilhaNomes.push("Paulo");
        pilhaNomes.push("Oscar");
        pilhaNomes.push("Natalia");
        pilhaNomes.push("Mariana");
        pilhaNomes.push("Luis");

        assertEquals("Ziraldo", pilhaNomes.top());
    }

    @Test
    void testeOrganizarNomesRepetidos(){

        pilhaNomes.push("Ana");
        pilhaNomes.push("Paulo");
        pilhaNomes.push("Ana");

        assertEquals("Paulo", pilhaNomes.top());
        assertEquals(2, pilhaNomes.pegaTamanho());

    }

    @Test
    void popPilhaVazia() {;

        assertThrows(RuntimeException.class, () -> {
            pilhaNomes.pop();
        });
    }

    @Test
    void topPilhaVazia() {;

        assertThrows(RuntimeException.class, () -> {
            pilhaNomes.top();
        });
    }
}
