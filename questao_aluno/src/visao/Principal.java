package visao;
import dominio.*;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
 
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		int opc;
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("---------------------------------");
			System.out.println("---------MENU PRINCIPAL----------");
			System.out.println("---------------------------------");
			System.out.println("1 - CADASTRAR ALUNO");
			System.out.println("2 - CADASTRAR NOTAS");
			System.out.println("3 - CALCULAR MEDIA");
			System.out.println("4 - INFORMAR SITUACAO");
			System.out.println("5 - INFORMAR DADOS DE UM ALUNO");
			System.out.println("6 - ALTERAR NOTA");
			System.out.println("7 - SAIR");
			System.out.println("---------------------------------");
			opc = teclado.nextInt();
			
			switch(opc) {
			case 1:
				System.out.println("voce escolheu 'cadastrar aluno'");
				
				System.out.println("cadastrando o aluno 1");				
				System.out.println("digite a matricula ");
				a1.setMatricula(teclado.nextInt());
				teclado.nextLine();
				System.out.println("digite o nome do aluno ");
				a1.setNome(teclado.nextLine());
				
				System.out.println("cadastrando o aluno 2");
				System.out.println("digite a matricula ");
				a2.setMatricula(teclado.nextInt());
				teclado.nextLine();
				System.out.println("digite o nome do aluno ");
				a2.setNome(teclado.nextLine());
				
				System.out.println("cadastrando o aluno 3");
				System.out.println("digite a matricula ");
				a3.setMatricula(teclado.nextInt());
				teclado.nextLine();
				System.out.println("digite o nome do aluno ");
				a3.setNome(teclado.nextLine());
				
				
				break;
			case 2:
				float n1, n2, n3;
				System.out.println("voce escolheu 'cadastrar notas'");
				
				System.out.println("cadastrando as notas do aluno 1");
				System.out.println("digite a nota 1 ");
				n1 = teclado.nextFloat();
				System.out.println("digite a nota 2 ");
				n2 = teclado.nextFloat();
				System.out.println("digite a nota 3 ");
				n3 = teclado.nextFloat();
				a1.setNotas(n1, n2, n3);
				
				
				System.out.println("cadastrando as notas do aluno 2");
				System.out.println("digite a nota 1 ");
				n1 = teclado.nextFloat();
				System.out.println("digite a nota 2 ");
				n2 = teclado.nextFloat();
				System.out.println("digite a nota 3 ");
				n3 = teclado.nextFloat();
				a2.setNotas(n1, n2, n3);
				
				System.out.println("cadastrando as notas do aluno 3");
				System.out.println("digite a nota 1 ");
				n1 = teclado.nextFloat();
				System.out.println("digite a nota 2 ");
				n2 = teclado.nextFloat();
				System.out.println("digite a nota 3 ");
				n3 = teclado.nextFloat();
				a3.setNotas(n1, n2, n3);

				
				break;
			case 3:
				System.out.println("voce escolheu 'calcular media'");
				a1.calcularMedia();
				a2.calcularMedia();
				a3.calcularMedia();
				
				System.out.println("medias calculadas");
				
				break;
			case 4:
				System.out.println("voce escolheu 'informar situacao'");
				System.out.println("o aluno 1 esta " + a1.getSituacao());
				System.out.println("o aluno 2 esta " + a2.getSituacao());
				System.out.println("o aluno 3 esta " + a3.getSituacao());
				
				break;
			case 5:
				int mat;
				System.out.println("voce escolheu 'informar dados de um aluno'");
				System.out.println("digite a matricula do aluno q deseja procurar");
				mat = teclado.nextInt();
				if(mat == a1.getMatricula()) {
					System.out.println("nome: " + a1.getNome());
					System.out.println("media: " + a1.getMedia());
					System.out.println("situacao: " + a1.getSituacao());
				}else {
					if(mat == a2.getMatricula()) {
						System.out.println("nome: " + a2.getNome());
						System.out.println("media: " + a2.getMedia());
						System.out.println("situacao: " + a2.getSituacao());
					}else {
						if(mat == a3.getMatricula()) {
							System.out.println("nome: " + a3.getNome());
							System.out.println("media: " + a3.getMedia());
							System.out.println("situacao: " + a3.getSituacao());
						}else {
							System.out.println("aluno nao cadastrado");
						}
					}
				}
				break;
			case 6:
				int aluno, cod;
				float nota;
				System.out.println("voce escolheu 'alterar nota'");
				System.out.println("qual aluno voce deseja mudar a nota ");
				aluno = teclado.nextInt();
				if(aluno == 1) {
					System.out.println("qual nota voce deseja mudar [1/2/3]");
					cod = teclado.nextInt();
					System.out.println("qual o valor novo da nota ");
					nota = teclado.nextFloat();
					a1.alterarNota(cod, nota);
				}else {
					if(aluno == 2) {
						System.out.println("qual nota voce deseja mudar [1/2/3]");
						cod = teclado.nextInt();
						System.out.println("qual o valor novo da nota ");
						nota = teclado.nextFloat();
						a2.alterarNota(cod, nota);
					}else {
						if(aluno == 3) {
							System.out.println("qual nota voce deseja mudar [1/2/3]");
							cod = teclado.nextInt();
							System.out.println("qual o valor novo da nota ");
							nota = teclado.nextFloat();
							a3.alterarNota(cod, nota);
						}
					}
				}	
				break;
			}
		
		}while(opc != 7);
		System.out.println("sistema desligado");
	}
}