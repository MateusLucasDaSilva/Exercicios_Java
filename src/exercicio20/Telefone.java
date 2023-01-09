package exercicio20;
public class Telefone {

	private int id;

	private String prefixo;

	private String operadora;

	private String ddd;

	private String numero;

	private Cliente cliente;

    public Telefone() {
    }

    public Telefone(int id, String prefixo, String operadora, String ddd, String numero, Cliente cliente) {
        this.id = id;
        this.prefixo = prefixo;
        this.operadora = operadora;
        this.ddd = ddd;
        this.numero = numero;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


	

}
