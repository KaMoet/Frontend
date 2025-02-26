package ecommerce;

public class Cliente {
	private int codiceCliente;
	private String generalità, email, dataIscrizione;
	
	public Cliente(int codiceCliente, String generalità, String email, String dataIscrizione) {
		this.codiceCliente = codiceCliente;
		this.generalità = generalità;
		this.email = email;
		this.dataIscrizione = dataIscrizione;
	}

	public String toString() {
		return "Cliente [codiceCliente=" + codiceCliente + ", generalitĂ =" + generalità + ", email=" + email
				+ ", dataIscrizione=" + dataIscrizione + "]";
	} 

}
