package boardgame;

public class Board {
	private int linhas;
	private int colunas;
	private Piece[][] pieces;
	
	public Board(int linhas, int colunas) {
		if( linhas < 1 || colunas < 1) {
			throw new BoardException("Erro no Board: deve existir pelo menos uma linha e uma coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pieces = new Piece[linhas][colunas];
		
	}
	public int getColunas() {
		return colunas;
	}

	public int getLinhas() {
		return linhas;
	}
	public Piece[][] getPecas() {
		return pieces;
	}
	public void setPecas(Piece[][] pieces) {
		this.pieces = pieces;
	}
	public Piece peca(int linha, int coluna) {
		if(!posicaoExiste(linha, coluna)) {
			throw new BoardException("Position n�o est� no Board");
		}
		return pieces[linha][coluna];
		
	}
	
	public Piece peca(Position position) {
		return pieces[position.getLinha()][position.getColuna()];
		
	}
	
	public void colocarPeca(Piece piece, Position position) {
		if(temUmaPeca(position)) {
			throw new BoardException("j� existe uma pe�a na posi��o" + position);
		}
		pieces[position.getLinha()][position.getColuna()] = piece;
		piece.position = position;
	}
	private boolean posicaoExiste(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
		
	}
	public boolean posicaoExiste(Position position) {
		return posicaoExiste(position.getLinha(), position.getColuna());
		
	}
	
	public boolean temUmaPeca(Position position) {
		if(!posicaoExiste(position)) {
			throw new BoardException("Position n�o est� no Board");
		}
		return peca(position) != null;
		
	}
}
