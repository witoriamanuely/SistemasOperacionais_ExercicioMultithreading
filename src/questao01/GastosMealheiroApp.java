package questao01;

public class GastosMealheiroApp 
{
	public static void main(String[] args) throws InterruptedException {
        Mulher mulher = new Mulher();
        Homem homem = new Homem();
        Thread rodaMulher = new Thread(mulher);
        Thread rodaHomem = new Thread(homem);

        rodaHomem.start();
        rodaMulher.start();
        rodaHomem.join();
        rodaMulher.join();
		System.out.println("O ganhador eh quem falou por ultimo");
	}
}
