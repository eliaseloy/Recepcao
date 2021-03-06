package recepcao;

import java.util.Objects;

public class Medico 
{
	private String nome;
	
	public Medico(String nome) 
	{
		super();
		this.nome = nome;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}


	public String toString()
	{
//		return this.nome;
		return getNome();
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medico other = (Medico) obj;
		return Objects.equals(nome, other.nome);
	}
}
