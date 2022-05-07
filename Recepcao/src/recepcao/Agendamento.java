package recepcao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * 
 * Main project class who will initialize, load and run
 *
 * @author <a href="mailto:eliaseloylima@gmail.com">Elias Eloy</a>.
 * @version $Revision: 1.1 $
 */


public class Agendamento 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//declara��o dasvari�veis
		String pnome = "";
		String ptel = "";
		String pconv = "";
		String pdiag = "";
		String pmed = "";
		String pfunc = "";
		int pDia;
		int pMes;
		int pAno;
		int pHora;
		int pMinuto;


		Scanner entrada = new Scanner(System.in);
		System.out.println("Rotina de agendamento de hor�rios da Clin�ca Negramaro");
	
		System.out.println("Vamos entrar com os dados do paciente \n");

		System.out.println("Informe o nome do paciente: ");
		pnome = entrada.nextLine();

		System.out.println("Informe o telefone do paciente: ");
		ptel = entrada.nextLine();

		System.out.println("Informe o conv�nio m�dico do paciente: ");
		pconv = entrada.nextLine();

		System.out.println("Informe a finalidade do atendimento: ");
		pdiag = entrada.nextLine();


		//constru��o da lista de m�dicos dispon�veis
		List<Medico> listamed = new ArrayList<>();
		
		listamed.add(new Medico("FABIO COELHO"));
		listamed.add(new Medico("CASSIO LIMA"));
		listamed.add(new Medico("GABRIEL PORTO"));
		
		System.out.println("Esta � a lista de m�dicos dispon�veis ");

		for(Medico m: listamed) 
		{
			System.out.println(m.getNome());
		}

		System.out.println("\nInforme o m�dico para agendamento: ");
		pmed = entrada.nextLine().toUpperCase();
		
		//constru��o da lista de funcion�rio que realizam agendamento
		List<Funcionario> listaFunc = new ArrayList<>();
		
		listaFunc.add(new Funcionario("BARBARA"));
		listaFunc.add(new Funcionario("RITA"));
		listaFunc.add(new Funcionario("RUTH"));
		
		System.out.println("Informe o(a) funcion�rio(a) respons�vel pelo agendamento: ");

		for(Funcionario f: listaFunc) 
		{
			System.out.println(f.getNome());
		}

		System.out.println("\n\nInforme qual funcion�rio est� realizando o agendamento: ");
		pfunc = entrada.nextLine().toUpperCase();

		//Solicita��o da data para o agendamento
		System.out.println("\n\nInforme o dia para agendamento: ");
		pDia = entrada.nextInt();

		System.out.println("\nInforme o m�s para agendamento: ");
		pMes = entrada.nextInt();
		
		System.out.println("\nInforme o ano para agendamento: ");
		pAno = entrada.nextInt();

		System.out.println("\nInforme a hora para agendamento: ");
		pHora = entrada.nextInt();

		System.out.println("\nInforme o minuto para agendamento: ");
		pMinuto = entrada.nextInt();

		
	
		System.out.println("\n\nImprimindo dados do agendamento: ");
		System.out.println("----------------------------------------");
		
		System.out.println("Agendamento para o paciente: " + pnome.toUpperCase());
		System.out.println("Telefone de contato: " + ptel);
		System.out.println("Conv�nio m�dico: " + pconv.toUpperCase());
		System.out.println("Informa��es iniciais: " + pdiag.toUpperCase());
		
		Agenda d1 = new Agenda(pDia, pMes, pAno);
//		d1.obterDataFormatada();
		Agenda h1 = new Agenda(pHora, pMinuto);
//		h1.obterHoraFormatada();
		System.out.println("Agendado para --> " + d1.obterDataFormatada() + " �s : " + h1.obterHoraFormatada());

//		System.out.println("Agendado para --> " + h1.obterHoraFormatada() + " �s : ");

		int a=0;
		for(int x = 0; x <listamed.size(); )
		{
			a = listamed.indexOf(new Medico(pmed));
			System.out.println("M�dico agendamento--> " + listamed.get(a).getNome().toUpperCase());
			break;
		}  

			
			
		int f=0;
		for(int x = 0; x <listaFunc.size(); )
		{
			f = listaFunc.indexOf(new Funcionario(pfunc));
			System.out.println("Funcion�rio(a) respons�vel pelo agendamento--> " + listaFunc.get(f).getNome().toUpperCase());
			break;
		} 
			
		
		entrada.close();
	}

}
