package dominio;

public class Aluno {
	private String nome;
	private int matricula;
	private float nota1;
	private float nota2;
	private float nota3;
	private float media;
	private String situacao;
	
	public Aluno() {
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void setNotas(float nt1, float nt2, float nt3) {
		this.nota1 = nt1;
		this.nota2 = nt2;
		this.nota3 = nt3;
	}
	
	public void calcularMedia() {
		this.media = (this.nota1 * 4 + this.nota2 * 5 + this.nota3 * 6) / 3;
	}
	
	public boolean buscarAluno(int matri) {
		if(matri == this.matricula) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getNome() {
		return this.nome;
	}

	public float getNota1() {
		return this.nota1;
	}
	
	public float getNota2() {
		return this.nota2;
	}
	
	public float getNota3() {
		return this.nota3;
	}
	
	public int getMatricula() {
		return matricula;
	}

	public float getMedia() {
		return this.media;
	}
	
	public String getSituacao() {
		if(this.media >= 5) {
			this.situacao = "Aprovado!";
		}else {
			if(this.media >=3 && this.media < 5) {
				this.situacao = "Recuperacao";
			}else {
				if(this.media < 3) {
					this.situacao = "Reprovado";
				}
			}
		}
		
		return this.situacao;
	}
	
	public String alterarNota(int codNota, float valorNota) {
		if(codNota == 1) {
			this.nota1 = valorNota;
		}else {
			if(codNota == 2) {
				this.nota2 = valorNota;
			}else {
				if(codNota == 3) {
					this.nota3 = valorNota;
				}
			}
		}
		return "alterado com sucesso";
	}
		
	
	
	
}
