package questao01;

public abstract class Pessoa implements Runnable {
	private static final int QTD_ITERACAO = 10;
	private static final int ESPERA = 1000;
	private static String desejo = "";
	public void informarDesejo() {
		for (int i = 0; i < QTD_ITERACAO; i++){
		    System.out.println(getDesejo());
			try {
			    Thread.sleep(getEspera());
			} catch (InterruptedException e) {
			}
		}
	}

	public abstract String getDesejo();

	public void run(){
        this.informarDesejo();
    }
	private long getEspera(){
        return (long)(Math.random() * ESPERA);
	}

	
}
