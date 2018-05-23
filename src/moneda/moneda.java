package moneda;
public class moneda {
	//Propiedades
    private String conversion;
    private String moneda;
    private int valor;
    private String dia;
    private int valorpeso;
    private int valordolar;
    
  //Constructor
    public moneda() {
        
    }
    
    public moneda(String conversion, String moneda, int valor, String dia) {
        this.conversion = conversion;
        this.moneda = moneda;
        this.valor = valor;
        this.dia = dia;
    }
    

	public int getValorpeso() {
		return valorpeso;
	}

	public void setValorpeso(int valorpeso) {
		this.valorpeso = valorpeso;
	}

	public int getValordolar() {
		return valordolar;
	}

	public void setValordolar(int valordolar) {
		this.valordolar = valordolar;
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