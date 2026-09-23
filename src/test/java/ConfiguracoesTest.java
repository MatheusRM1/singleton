import org.example.Configuracoes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguracoesTest {

    @Test
    public void deveRetornarNomeEmpresa() {
        Configuracoes.getInstance().setNomeEmpresa("Empresa");
        assertEquals("Empresa", Configuracoes.getInstance().getNomeEmpresa());
    }

    @Test
    public void deveRetornarEndereco() {
        Configuracoes.getInstance().setEndereco("Praca Governador");
        assertEquals("Praca Governador", Configuracoes.getInstance().getEndereco());
    }

}