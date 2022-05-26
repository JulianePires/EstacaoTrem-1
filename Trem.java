public class Trem extends Thread {
	private Estacao estacao;
	private String direcao;
	
	public Trem(Estacao estacao, String direcao) {
		this.estacao = estacao;
		this.direcao = direcao;
	}
	
	@Override
	public void run() {
			try {
				if(direcao == "norte-sul") {
					estacao.travessiaPlataformaNorteSul(this.getId());
				}else {
					estacao.travessiaPlataformaSulNorte(this.getId());
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Trem "+ this.getId() +" atravessou estação");
	}
}
