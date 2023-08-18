package pilhaNomes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.jupiter.api.Test;

public class PilhaNomesTeste {

    PilhaNomes pilhaNomes = new PilhaNomes();

    @Test
    void testePilhaNomesVazia() {
        assertTrue(pilhaNomes.ehVazia());
    }

    @Test
    void testeInserirPilhaVazia() {
        pilhaNomes.insereNome("fernando");
        assertFalse(pilhaNomes.ehVazia());
        assertEquals("fernando", pilhaNomes.pilhaNomes.top());
    }

    @Test
    void testeInserirPilhaVariosElementos() {
        pilhaNomes.insereNome("fernando");
        pilhaNomes.insereNome("marcos");
        pilhaNomes.insereNome("ana");
        assertFalse(pilhaNomes.ehVazia());
        assertEquals("ana", pilhaNomes.pilhaNomes.top());
    }
}
