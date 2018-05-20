package questao01;

public class GastosMealheiroApp 
{
	public static void main(String[] args) 
	{	Homem homem = new Homem();
		homem.informarDesejo();
		Mulher mulher = new Mulher();
		mulher.informarDesejo();
		System.out.println("O ganhador � quem falou por �ltimo");
	}
}
