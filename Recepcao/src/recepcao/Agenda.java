package recepcao;

public class Agenda 
{
	int dia;
	int mes;
	int ano;
	int hora;
	int minuto;

	Agenda(int dia, int mes, int ano, int hora, int minuto) 
	{
		super();
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);
		this.setHora(hora);
		this.setMinuto(minuto);
	}
	Agenda(int dia, int mes, int ano) 
	{
		super();
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);
	}
	Agenda(int hora, int minuto) 
	{
		super();
		this.setHora(hora);
		this.setMinuto(minuto);
	}
	
	
	Agenda() 
	{
		this(1, 1, 1970);
	}
	
	
	public String obterDataFormatada() 
	{
		final String formato = "%d/%d/%d";
		return String.format(formato, this.dia, mes, ano);
	}
	
	public void imprimirDataFormatada() 
	{
		System.out.println(this.obterDataFormatada());
	}


	public String obterHoraFormatada() 
	{
		final String formato = "%d:%d";
		return String.format(formato, this.hora, minuto);
	}
	
	public void imprimirHoraFormatada() 
	{
		System.out.println(this.obterHoraFormatada());
	}

	public int getDia() 
	{
		return dia;
	}
	public int getMes() 
	{
		return mes;
	}
	public int getAno() {
		return ano;
	}
	public int getHora() {
		return hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setDia(int dia) 
	{
		this.dia = dia;
	}
	public void setMes(int mes) 
	{
		this.mes = mes;
	}
	public void setAno(int ano) 
	{
		this.ano = ano;
	}
	public void setHora(int hora) 
	{
		this.hora = hora;
	}
	public void setMinuto(int minuto) 
	{
		this.minuto = minuto;
	}
	
	
}
