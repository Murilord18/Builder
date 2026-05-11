package banco.builder;

import java.math.BigDecimal;
import java.util.Date;

public class ContaBancaria {

    // Campos obrigatórios
    private String numeroConta;
    private String agencia;
    private String cpfTitular;
    private String nomeTitular;
    private String tipoConta;        // CORRENTE, POUPANCA, SALARIO

    // Campos opcionais
    private String emailTitular;
    private String telefoneTitular;
    private String enderecoLogradouro;
    private int    enderecoNumero;
    private String enderecoComplemento;
    private String enderecoBairro;
    private String enderecoCidade;
    private String enderecoUF;
    private String cep;
    private Date   dataAbertura;
    private BigDecimal limiteCredito;
    private BigDecimal saldoInicial;
    private boolean contaDigital;
    private String nomeMae;
    private String rgTitular;

    public ContaBancaria() {
        this.numeroConta  = "";
        this.agencia      = "";
        this.cpfTitular   = "";
        this.nomeTitular  = "";
        this.tipoConta    = "";
        this.saldoInicial = BigDecimal.ZERO;
        this.limiteCredito = BigDecimal.ZERO;
        this.contaDigital = false;
    }

    // ──────────────────── Getters & Setters ────────────────────

    public String getNumeroConta() { return numeroConta; }
    public void setNumeroConta(String numeroConta) { this.numeroConta = numeroConta; }

    public String getAgencia() { return agencia; }
    public void setAgencia(String agencia) { this.agencia = agencia; }

    public String getCpfTitular() { return cpfTitular; }
    public void setCpfTitular(String cpfTitular) { this.cpfTitular = cpfTitular; }

    public String getNomeTitular() { return nomeTitular; }
    public void setNomeTitular(String nomeTitular) { this.nomeTitular = nomeTitular; }

    public String getTipoConta() { return tipoConta; }
    public void setTipoConta(String tipoConta) { this.tipoConta = tipoConta; }

    public String getEmailTitular() { return emailTitular; }
    public void setEmailTitular(String emailTitular) { this.emailTitular = emailTitular; }

    public String getTelefoneTitular() { return telefoneTitular; }
    public void setTelefoneTitular(String telefoneTitular) { this.telefoneTitular = telefoneTitular; }

    public String getEnderecoLogradouro() { return enderecoLogradouro; }
    public void setEnderecoLogradouro(String enderecoLogradouro) { this.enderecoLogradouro = enderecoLogradouro; }

    public int getEnderecoNumero() { return enderecoNumero; }
    public void setEnderecoNumero(int enderecoNumero) { this.enderecoNumero = enderecoNumero; }

    public String getEnderecoComplemento() { return enderecoComplemento; }
    public void setEnderecoComplemento(String enderecoComplemento) { this.enderecoComplemento = enderecoComplemento; }

    public String getEnderecoBairro() { return enderecoBairro; }
    public void setEnderecoBairro(String enderecoBairro) { this.enderecoBairro = enderecoBairro; }

    public String getEnderecoCidade() { return enderecoCidade; }
    public void setEnderecoCidade(String enderecoCidade) { this.enderecoCidade = enderecoCidade; }

    public String getEnderecoUF() { return enderecoUF; }
    public void setEnderecoUF(String enderecoUF) { this.enderecoUF = enderecoUF; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }

    public Date getDataAbertura() { return dataAbertura; }
    public void setDataAbertura(Date dataAbertura) { this.dataAbertura = dataAbertura; }

    public BigDecimal getLimiteCredito() { return limiteCredito; }
    public void setLimiteCredito(BigDecimal limiteCredito) { this.limiteCredito = limiteCredito; }

    public BigDecimal getSaldoInicial() { return saldoInicial; }
    public void setSaldoInicial(BigDecimal saldoInicial) { this.saldoInicial = saldoInicial; }

    public boolean isContaDigital() { return contaDigital; }
    public void setContaDigital(boolean contaDigital) { this.contaDigital = contaDigital; }

    public String getNomeMae() { return nomeMae; }
    public void setNomeMae(String nomeMae) { this.nomeMae = nomeMae; }

    public String getRgTitular() { return rgTitular; }
    public void setRgTitular(String rgTitular) { this.rgTitular = rgTitular; }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroConta='" + numeroConta + '\'' +
                ", agencia='" + agencia + '\'' +
                ", nomeTitular='" + nomeTitular + '\'' +
                ", tipoConta='" + tipoConta + '\'' +
                ", saldoInicial=" + saldoInicial +
                ", contaDigital=" + contaDigital +
                '}';
    }
}
