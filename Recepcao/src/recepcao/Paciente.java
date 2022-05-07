package recepcao;

public class Paciente 
{
	private String nome;
	private String telefone;
	private String conv;
	private String diagInicial;
	
	
	public Paciente(String nome, String telefone, String conv, String diagInicial) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.conv = conv;
		this.diagInicial = diagInicial;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getConv() {
		return conv;
	}


	public void setConv(String conv) {
		this.conv = conv;
	}


	public String getDiagInicial() {
		return diagInicial;
	}


	public void setDiagInicial(String diagInicial) {
		this.diagInicial = diagInicial;
	}

	
	public void lista()
	{
		System.out.println("Informações sobre o Paciente: ");
		System.out.println("Paciente: " + " " + this.nome);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Convênio médico: " + this.conv);
		System.out.println("Informações iniciais: " + this.diagInicial);
	}

}
