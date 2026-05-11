package banco.builder;

import java.math.BigDecimal;
import java.util.Date;


public class ContaBancariaBuilder {

    private ContaBancaria conta;

    public ContaBancariaBuilder() {
        conta = new ContaBancaria();
    }


    public ContaBancaria build() {
        if (conta.getNumeroConta() == null || conta.getNumeroConta().isBlank()) {
            throw new IllegalArgumentException("Número da conta inválido");
        }
        if (conta.getAgencia() == null || conta.getAgencia().isBlank()) {
            throw new IllegalArgumentException("Agência inválida");
        }
        if (conta.getCpfTitular() == null || conta.getCpfTitular().isBlank()) {
            throw new IllegalArgumentException("CPF do titular inválido");
        }
        if (conta.getNomeTitular() == null || conta.getNomeTitular().isBlank()) {
            throw new IllegalArgumentException("Nome do titular inválido");
        }
        if (conta.getTipoConta() == null || conta.getTipoConta().isBlank()) {
            throw new IllegalArgumentException("Tipo de conta inválido");
        }
        return conta;
    }


    public ContaBancariaBuilder setNumeroConta(String numeroConta) {
        conta.setNumeroConta(numeroConta);
        return this;
    }

    public ContaBancariaBuilder setAgencia(String agencia) {
        conta.setAgencia(agencia);
        return this;
    }

    public ContaBancariaBuilder setCpfTitular(String cpfTitular) {
        conta.setCpfTitular(cpfTitular);
        return this;
    }

    public ContaBancariaBuilder setNomeTitular(String nomeTitular) {
        conta.setNomeTitular(nomeTitular);
        return this;
    }

    public ContaBancariaBuilder setTipoConta(String tipoConta) {
        conta.setTipoConta(tipoConta);
        return this;
    }


    public ContaBancariaBuilder setEmailTitular(String emailTitular) {
        conta.setEmailTitular(emailTitular);
        return this;
    }

    public ContaBancariaBuilder setTelefoneTitular(String telefoneTitular) {
        conta.setTelefoneTitular(telefoneTitular);
        return this;
    }

    public ContaBancariaBuilder setEnderecoLogradouro(String logradouro) {
        conta.setEnderecoLogradouro(logradouro);
        return this;
    }

    public ContaBancariaBuilder setEnderecoNumero(int numero) {
        conta.setEnderecoNumero(numero);
        return this;
    }

    public ContaBancariaBuilder setEnderecoComplemento(String complemento) {
        conta.setEnderecoComplemento(complemento);
        return this;
    }

    public ContaBancariaBuilder setEnderecoBairro(String bairro) {
        conta.setEnderecoBairro(bairro);
        return this;
    }

    public ContaBancariaBuilder setEnderecoCidade(String cidade) {
        conta.setEnderecoCidade(cidade);
        return this;
    }

    public ContaBancariaBuilder setEnderecoUF(String uf) {
        conta.setEnderecoUF(uf);
        return this;
    }

    public ContaBancariaBuilder setCep(String cep) {
        conta.setCep(cep);
        return this;
    }

    public ContaBancariaBuilder setDataAbertura(Date dataAbertura) {
        conta.setDataAbertura(dataAbertura);
        return this;
    }

    public ContaBancariaBuilder setLimiteCredito(BigDecimal limiteCredito) {
        conta.setLimiteCredito(limiteCredito);
        return this;
    }

    public ContaBancariaBuilder setSaldoInicial(BigDecimal saldoInicial) {
        conta.setSaldoInicial(saldoInicial);
        return this;
    }

    public ContaBancariaBuilder setContaDigital(boolean contaDigital) {
        conta.setContaDigital(contaDigital);
        return this;
    }

    public ContaBancariaBuilder setNomeMae(String nomeMae) {
        conta.setNomeMae(nomeMae);
        return this;
    }

    public ContaBancariaBuilder setRgTitular(String rgTitular) {
        conta.setRgTitular(rgTitular);
        return this;
    }
}
