package boardgame;

public class Tabuleiro {
	private int linhas;
	private int colunas;
	private Pecas[][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Pecas[linhas][colunas];
		
	}
	public int getColunas() {
		return colunas;
	}

	public int getLinhas() {
		return linhas;
	}
	public Pecas[][] getPecas() {
		return pecas;
	}
	public void setPecas(Pecas[][] pecas) {
		this.pecas = pecas;
	}
	public Pecas peca(int linha, int coluna) {
		return pecas[linha][coluna];
		
	}
	
	public Pecas peca(Posicao posicao) {
		return pecas[posicao.getLinha()][posicao.getColuna()];
		
	}
}
