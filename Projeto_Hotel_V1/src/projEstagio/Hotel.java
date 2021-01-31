package projEstagio;

public class Hotel {

	private int estrelas;
	private int txDSRegular, txFSRegular; ;
	private int txDSReward, txFSReward;
	private int custo;
	public Hotel(int estrelas, int txDSRegular, int txDSReward, int txFSRegular, int txFSReward) {
		this.estrelas = estrelas;
		this.txDSRegular = txDSRegular;
		this.txDSReward= txDSReward;
		this.txFSRegular = txFSRegular;
		this.txFSReward = txFSReward;
	}
	public void calculaCusto(String tipo, int numDS, int numFS) {
		if(numDS != 0) {
			if(tipo.equals("Regular")) {
				custo = txDSRegular *numDS;
			}
			else {
				custo = txDSReward * numDS;
			}
		}
		if(numFS != 0) {
			if(tipo.equals("Regular")) {
				custo = txFSRegular *numFS;
			}
			else {
				custo = txFSReward * numFS;
			}
		}
	}
	
	public int getEstrelas(){return estrelas;}
	public int getCusto() {return custo;}
}
