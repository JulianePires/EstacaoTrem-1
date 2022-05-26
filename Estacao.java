import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Estacao {
	private Semaphore semNorteSul;
	private Semaphore semSulNorte;
	private ArrayList<String> travessias;
	
	public Estacao() {
		this.semNorteSul = new Semaphore(2);
		this.semSulNorte = new Semaphore(2);
		 this.travessias = new ArrayList<String>(30);
	}
	
	public void imprimirTravessias() {
		for (int i = 0; i < travessias.size(); i++) {
			System.out.println(travessias.get(i));
		}
	}
	
	public void travessiaPlataformaNorteSul(long id) throws InterruptedException {
		Thread.sleep((long)(Math.random()*500));
		try {
			System.out.println("Trem "+ id +" aguardando travessia na plataforma norte-sul...");
			semNorteSul.acquire();
			System.out.println("Trem "+ id +" atravessando plataforma norte-sul...");
			
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		
		System.out.println("Trem "+ id +" parado na plataforma norte-sul...");
		Thread.sleep(1000);
		System.out.println("Trem "+ id +" saindo da plataforma norte-sul...");
		
		travessias.add("Trem "+id+" na plataforma norte-sul");
		
		semNorteSul.release();
	}
	
	public void travessiaPlataformaSulNorte(long id) throws InterruptedException {
		Thread.sleep((long)(Math.random()*500));
		try {
			System.out.println("Trem "+ id +" aguardando travessia na plataforma sul-norte...");
			semSulNorte.acquire();
			System.out.println("Trem "+ id +" atravessando plataforma sul-norte...");
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		
		System.out.println("Trem "+ id +" parado na plataforma sul-norte...");
		Thread.sleep(1000);
		System.out.println("Trem "+ id +" saindo da plataforma sul-norte...");
		
		travessias.add("Trem "+id+" na plataforma sul-norte");
		
		semSulNorte.release();
	}
}
