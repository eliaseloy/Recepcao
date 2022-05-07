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

		//declaração dasvariáveis
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
		System.out.println("Rotina de agendamento de horários da Cliníca Negramaro");
	
		System.out.println("Vamos entrar com os dados do paciente \n");

		System.out.println("Informe o nome do paciente: ");
		pnome = entrada.nextLine();

		System.out.println("Informe o telefone do paciente: ");
		ptel = entrada.nextLine();

		System.out.println("Informe o convênio médico do paciente: ");
		pconv = entrada.nextLine();

		System.out.println("Informe a finalidade do atendimento: ");
		pdiag = entrada.nextLine();


		//construção da lista de médicos disponíveis
		List<Medico> listamed = new ArrayList<>();
		
		listamed.add(new Medico("FABIO COELHO"));
		listamed.add(new Medico("CASSIO LIMA"));
		listamed.add(new Medico("GABRIEL PORTO"));
		
		System.out.println("Esta é a lista de médicos disponíveis ");

		for(Medico m: listamed) 
		{
			System.out.println(m.getNome());
		}

		System.out.println("\nInforme o médico para agendamento: ");
		pmed = entrada.nextLine().toUpperCase();
		
		//construção da lista de funcionário que realizam agendamento
		List<Funcionario> listaFunc = new ArrayList<>();
		
		listaFunc.add(new Funcionario("BARBARA"));
		listaFunc.add(new Funcionario("RITA"));
		listaFunc.add(new Funcionario("RUTH"));
		
		System.out.println("Informe o(a) funcionário(a) responsável pelo agendamento: ");

		for(Funcionario f: listaFunc) 
		{
			System.out.println(f.getNome());
		}

		System.out.println("\n\nInforme qual funcionário está realizando o agendamento: ");
		pfunc = entrada.nextLine().toUpperCase();

		//Solicitação da data para o agendamento
		System.out.println("\n\nInforme o dia para agendamento: ");
		pDia = entrada.nextInt();

		System.out.println("\nInforme o mês para agendamento: ");
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
		System.out.println("Convênio médico: " + pconv.toUpperCase());
		System.out.println("Informações iniciais: " + pdiag.toUpperCase());
		
		Agenda d1 = new Agenda(pDia, pMes, pAno);
//		d1.obterDataFormatada();
		Agenda h1 = new Agenda(pHora, pMinuto);
//		h1.obterHoraFormatada();
		System.out.println("Agendado para --> " + d1.obterDataFormatada() + " às : " + h1.obterHoraFormatada());

//		System.out.println("Agendado para --> " + h1.obterHoraFormatada() + " às : ");

		int a=0;
		for(int x = 0; x <listamed.size(); )
		{
			a = listamed.indexOf(new Medico(pmed));
			System.out.println("Médico agendamento--> " + listamed.get(a).getNome().toUpperCase());
			break;
		}  

			
			
		int f=0;
		for(int x = 0; x <listaFunc.size(); )
		{
			f = listaFunc.indexOf(new Funcionario(pfunc));
			System.out.println("Funcionário(a) responsável pelo agendamento--> " + listaFunc.get(f).getNome().toUpperCase());
			break;
		} 
			
		
		entrada.close();
	}

}
