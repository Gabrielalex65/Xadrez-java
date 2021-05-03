package boardgame;

public class Tabuleiro {
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
		
	}
	public int getColunas() {
		return colunas;
	}

	public int getLinhas() {
		return linhas;
	}
	public Peca[][] getPecas() {
		return pecas;
	}
	public void setPecas(Peca[][] pecas) {
		this.pecas = pecas;
	}
	public Peca peca(int linha, int coluna) {
		return pecas[linha][coluna];
		
	}
	
	public Peca peca(Posicao posicao) {
		return pecas[posicao.getLinha()][posicao.getColuna()];
		
	}
	
	public void colocarPeca(Peca peca , Posicao posicao) {
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
}
