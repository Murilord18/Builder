package banco.builder;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class ContaBancariaBuilderTest {

    @Test
    void deveRetornarExcecaoParaContaSemNumeroConta() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->
                new ContaBancariaBuilder()
                        .setAgencia("0001")
                        .setCpfTitular("123.456.789-00")
                        .setNomeTitular("João da Silva")
                        .setTipoConta("CORRENTE")
                        .build()
        );
        assertEquals("Número da conta inválido", ex.getMessage());
    }
}
