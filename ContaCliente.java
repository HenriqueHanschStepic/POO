import javax.naming.LimitExceededException;

public class ContaCliente
{
    private String numeroConta;
    private Double saldoInicioMes;
    private Double gastoMes;
    private Double creditoAplicado;
    private int limiteCredito;

  
    public ContaCliente(String numeroConta, Double saldoInicioMes, Double gastoMes, Double creditoAplicado, int limiteCredito ){

        this.numeroConta = numeroConta;
        this.saldoInicioMes = saldoInicioMes;
        this.gastoMes = gastoMes;
        this.creditoAplicado = creditoAplicado;
        this.limiteCredito = limiteCredito;
    }
    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }
    public String getNumeroConta(){
		return numeroConta;
    }
    public void setSaldoInicioMes(Double saldoInicioMes){
        this.saldoInicioMes = saldoInicioMes;
    }
    public Double getSaldoInicioMes(){
        return saldoInicioMes;
    }
    public void setGastoMes(Double gastoMes){
        this.gastoMes = gastoMes;
    }
    public Double getGastoMes(){
        return gastoMes;
    }
    public void setCreditoAplicado(Double creditoAplicado){
        this.creditoAplicado = creditoAplicado;
    }
    public Double getCreditoAplicado(){
        return creditoAplicado;
    }
    public void setLimiteCredito(int limiteCredito){
        this.limiteCredito = limiteCredito;
    }
    public int getLimiteCredito(){
        return limiteCredito;
    }
    public Double limite() throws LimitExcedido
    {
        Double i;
        Double novoSaldo;
        i = saldoInicioMes - gastoMes;
        novoSaldo = i + creditoAplicado;

        if(novoSaldo<limiteCredito)
        {
            return novoSaldo;
        }else{
            throw new LimitExcedido();
        }
    }
}
