public class Main {
	public static void main(String[] a) throws InterruptedException {
		Estacao estacao = new Estacao();
		
		Trem trem1 = new Trem(estacao, "sul-norte");
		Trem trem2 = new Trem(estacao, "sul-norte");
		Trem trem3 = new Trem(estacao, "sul-norte");
		Trem trem4 = new Trem(estacao, "sul-norte");
		Trem trem5 = new Trem(estacao, "sul-norte");
		Trem trem6 = new Trem(estacao, "sul-norte");
		Trem trem7 = new Trem(estacao, "sul-norte");
		Trem trem8 = new Trem(estacao, "sul-norte");
		Trem trem9 = new Trem(estacao, "sul-norte");
		Trem trem10 = new Trem(estacao, "sul-norte");
		Trem trem11 = new Trem(estacao, "sul-norte");
		Trem trem12 = new Trem(estacao, "sul-norte");
		Trem trem13 = new Trem(estacao, "sul-norte");
		Trem trem14 = new Trem(estacao, "sul-norte");
		Trem trem15 = new Trem(estacao, "sul-norte");
		
		Trem trem16 = new Trem(estacao, "norte-sul");
		Trem trem17 = new Trem(estacao, "norte-sul");
		Trem trem18 = new Trem(estacao, "norte-sul");
		Trem trem19 = new Trem(estacao, "norte-sul");
		Trem trem20 = new Trem(estacao, "norte-sul");
		Trem trem21 = new Trem(estacao, "norte-sul");
		Trem trem22 = new Trem(estacao, "norte-sul");
		Trem trem23 = new Trem(estacao, "norte-sul");
		Trem trem24 = new Trem(estacao, "norte-sul");
		Trem trem25 = new Trem(estacao, "norte-sul");
		Trem trem26 = new Trem(estacao, "norte-sul");
		Trem trem27 = new Trem(estacao, "norte-sul");
		Trem trem28 = new Trem(estacao, "norte-sul");
		Trem trem29 = new Trem(estacao, "norte-sul");
		Trem trem30 = new Trem(estacao, "norte-sul");
		
		trem1.start();
		trem2.start();
		trem3.start();
		trem4.start();
		trem5.start();
		trem6.start();
		trem7.start();
		trem8.start();
		trem9.start();
		trem10.start();
		trem11.start();
		trem12.start();
		trem13.start();
		trem14.start();
		trem15.start();
		trem16.start();
		trem17.start();
		trem18.start();
		trem19.start();
		trem20.start();
		trem21.start();
		trem22.start();
		trem23.start();
		trem24.start();
		trem25.start();
		trem26.start();
		trem27.start();
		trem28.start();
		trem29.start();
		trem30.start();
		
		trem1.join();
		trem2.join();
		trem3.join();
		trem4.join();
		trem5.join();
		trem6.join();
		trem7.join();
		trem8.join();
		trem9.join();
		trem10.join();
		trem11.join();
		trem12.join();
		trem13.join();
		trem14.join();
		trem15.join();
		trem16.join();
		trem17.join();
		trem18.join();
		trem19.join();
		trem20.join();
		trem21.join();
		trem22.join();
		trem23.join();
		trem24.join();
		trem25.join();
		trem26.join();
		trem27.join();
		trem28.join();
		trem29.join();
		trem30.join();
		
		System.out.println("Ordem das travessias:");
		estacao.imprimirTravessias();
	}
}
