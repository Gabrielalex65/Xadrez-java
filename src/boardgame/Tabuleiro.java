package boardgame;

public class Tabuleiro {
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		if( linhas < 1 || colunas < 1) {
			throw new TabuleiroException("Erro no tabuleiro: deve existir pelo menos uma linha e uma coluna");
		}
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
		if(!posicaoExiste(linha, coluna)) {
			throw new TabuleiroException("Posicao não está no tabuleiro");
		}
		return pecas[linha][coluna];
		
	}
	
	public Peca peca(Posicao posicao) {
		return pecas[posicao.getLinha()][posicao.getColuna()];
		
	}
	
	public void colocarPeca(Peca peca , Posicao posicao) {
		if(temUmaPeca(posicao)) {
			throw new TabuleiroException("já existe uma peça na posição" + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	private boolean posicaoExiste(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
		
	}
	public boolean posicaoExiste(Posicao posicao) {
		return posicaoExiste(posicao.getLinha(), posicao.getColuna());
		
	}
	
	public boolean temUmaPeca(Posicao posicao) {
		if(!posicaoExiste(posicao)) {
			throw new TabuleiroException("Posicao não está no tabuleiro");
		}
		return peca(posicao) != null;
		
	}
}
