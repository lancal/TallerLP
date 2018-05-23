package moneda;
public class moneda {
	//Propiedades
    private String conversion;
    private String moneda;
    private int valor;
    private String dia;
    private int valorTotal;
    private int valorConversion;
    
  //Constructor
    public moneda() {
        
    }
    
    public moneda(String conversion, String moneda, int valor, String dia) {
        this.conversion = conversion;
        this.moneda = moneda;
        this.valor = valor;
        this.dia = dia;
    }
    
 
    public int getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}


	public int getValorConversion() {
		return valorConversion;
	}


	public void setValorConversion(int valorConversion) {
		this.valorConversion = valorConversion;
	}


	public String getConversion() {
		return conversion;
	}


	public void setConversion(String conversion) {
		this.conversion = conversion;
	}


	public String getMoneda() {
		return moneda;
	}


	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	public String getDia() {
		return dia;
	}


	public void setDia(String dia) {
		this.dia = dia;
	}
    
}