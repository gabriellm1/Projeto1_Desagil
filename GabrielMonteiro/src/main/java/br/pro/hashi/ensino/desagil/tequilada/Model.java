package br.pro.hashi.ensino.desagil.tequilada;

public class Model {
	private Board board;
	private CpuPlayer cpuPlayer;
	private HumanPlayer humanPlayer;
	private Target target;

	public Model() {
		board = new Board("board.txt");

		cpuPlayer = new CpuPlayer(board.getNumRows() - 1, board.getNumCols() - 1);
		humanPlayer = new HumanPlayer(0, 0);
		
		target = new Target(4,14);
	}

	public void update() {
		cpuPlayer.move(-1, -1);
	}

	public Board getBoard() {
		return board;
	}
	public CpuPlayer getCpuPlayer() {
		return cpuPlayer;
	}
	public HumanPlayer getHumanPlayer() {
		return humanPlayer;
	}
	public Target getTarget(){
		return target;
	}
}
