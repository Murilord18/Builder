package banco.builder;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;


class ContaBancariaBuilderTest {



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

    @Test
    void deveRetornarExcecaoParaContaSemAgencia() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->
                new ContaBancariaBuilder()
                        .setNumeroConta("12345-6")
                        .setCpfTitular("123.456.789-00")
                        .setNomeTitular("João da Silva")
                        .setTipoConta("CORRENTE")
                        .build()
        );
        assertEquals("Agência inválida", ex.getMessage());
    }

    @Test
    void deveRetornarExcecaoParaContaSemCpf() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->
                new ContaBancariaBuilder()
                        .setNumeroConta("12345-6")
                        .setAgencia("0001")
                        .setNomeTitular("João da Silva")
                        .setTipoConta("CORRENTE")
                        .build()
        );
        assertEquals("CPF do titular inválido", ex.getMessage());
    }

    @Test
    void deveRetornarExcecaoParaContaSemNomeTitular() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->
                new ContaBancariaBuilder()
                        .setNumeroConta("12345-6")
                        .setAgencia("0001")
                        .setCpfTitular("123.456.789-00")
                        .setTipoConta("CORRENTE")
                        .build()
        );
        assertEquals("Nome do titular inválido", ex.getMessage());
    }

    @Test
    void deveRetornarExcecaoParaContaSemTipoConta() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->
                new ContaBancariaBuilder()
                        .setNumeroConta("12345-6")
                        .setAgencia("0001")
                        .setCpfTitular("123.456.789-00")
                        .setNomeTitular("João da Silva")
                        .build()
        );
        assertEquals("Tipo de conta inválido", ex.getMessage());
    }


    @Test
    void deveRetornarContaValidaComCamposObrigatorios() {
        ContaBancaria conta = new ContaBancariaBuilder()
                .setNumeroConta("12345-6")
                .setAgencia("0001")
                .setCpfTitular("123.456.789-00")
                .setNomeTitular("João da Silva")
                .setTipoConta("CORRENTE")
                .build();

        assertNotNull(conta);
        assertEquals("12345-6", conta.getNumeroConta());
        assertEquals("0001", conta.getAgencia());
        assertEquals("123.456.789-00", conta.getCpfTitular());
        assertEquals("João da Silva", conta.getNomeTitular());
        assertEquals("CORRENTE", conta.getTipoConta());
    }

    @Test
    void deveRetornarContaCompletoComTodosCampos() {
        BigDecimal saldo  = new BigDecimal("1000.00");
        BigDecimal limite = new BigDecimal("5000.00");

        ContaBancaria conta = new ContaBancariaBuilder()
                .setNumeroConta("98765-4")
                .setAgencia("0042")
                .setCpfTitular("987.654.321-00")
                .setNomeTitular("Maria Oliveira")
                .setTipoConta("POUPANCA")
                .setEmailTitular("maria@email.com")
                .setTelefoneTitular("(32) 99999-0000")
                .setEnderecoLogradouro("Rua das Flores")
                .setEnderecoNumero(100)
                .setEnderecoBairro("Centro")
                .setEnderecoCidade("Juiz de Fora")
                .setEnderecoUF("MG")
                .setCep("36010-000")
                .setSaldoInicial(saldo)
                .setLimiteCredito(limite)
                .setContaDigital(true)
                .setNomeMae("Ana Oliveira")
                .setRgTitular("MG-12.345.678")
                .build();

        assertNotNull(conta);
        assertEquals("98765-4",           conta.getNumeroConta());
        assertEquals("POUPANCA",          conta.getTipoConta());
        assertEquals("maria@email.com",   conta.getEmailTitular());
        assertEquals("Juiz de Fora",      conta.getEnderecoCidade());
        assertEquals(saldo,               conta.getSaldoInicial());
        assertEquals(limite,              conta.getLimiteCredito());
        assertTrue(conta.isContaDigital());
    }

    @Test
    void deveRetornarContaDigitalComSaldoZeroPorPadrao() {
        ContaBancaria conta = new ContaBancariaBuilder()
                .setNumeroConta("11111-1")
                .setAgencia("0010")
                .setCpfTitular("111.111.111-11")
                .setNomeTitular("Carlos Souza")
                .setTipoConta("SALARIO")
                .build();

        assertEquals(BigDecimal.ZERO, conta.getSaldoInicial());
        assertEquals(BigDecimal.ZERO, conta.getLimiteCredito());
        assertFalse(conta.isContaDigital());
    }

    @Test
    void devePermitirCriacaoDeDuasContasIndependentes() {
        ContaBancaria conta1 = new ContaBancariaBuilder()
                .setNumeroConta("11111-1")
                .setAgencia("0001")
                .setCpfTitular("111.111.111-11")
                .setNomeTitular("Titular Um")
                .setTipoConta("CORRENTE")
                .build();

        ContaBancaria conta2 = new ContaBancariaBuilder()
                .setNumeroConta("22222-2")
                .setAgencia("0002")
                .setCpfTitular("222.222.222-22")
                .setNomeTitular("Titular Dois")
                .setTipoConta("POUPANCA")
                .build();

        assertNotEquals(conta1.getNumeroConta(), conta2.getNumeroConta());
        assertNotEquals(conta1.getNomeTitular(), conta2.getNomeTitular());
        assertNotEquals(conta1.getTipoConta(),   conta2.getTipoConta());
    }
}
