package questao03;

public class PortaRetratoDigitalApp 
{   
    private static final long TIME_OUT = 5000;

	public static void main(String[] args) throws InterruptedException
    {   String homePath = System.getProperty("user.home");
    	PortaRetrato portaRetrato = new PortaRetrato(homePath + System.getProperty("file.separator") + "Imagens", TIME_OUT);
    	Thread portaRetratoThread = new Thread(portaRetrato);
    	portaRetratoThread.start();
    }
}
