package questao02;

import java.util.GregorianCalendar;

public class Alarme 
{
	private static final int INTERVALO = 100;
	private int hora;
	private int minuto;
	private boolean primeiraVez = true;
	private Relogio[] relogios;
	
	
	public Alarme(Relogio[] relogios)
	{	this.relogios = relogios;
	}
	
	private int getHoraAtual()
	{	//pega o momento atual
		GregorianCalendar momento = new GregorianCalendar();
		//pega a hora atual
		return momento.get(GregorianCalendar.HOUR_OF_DAY);
	}
	
	private int getMinutoAtual()
	{	//pega o momento atual
		GregorianCalendar momento = new GregorianCalendar();
		//pega o minuto atual
		return momento.get(GregorianCalendar.MINUTE);
	}

	private void disparaMinutoMudou(int novoMinuto) 
	{	for (Relogio relogio: relogios) 
		{	relogio.minutoMudou(novoMinuto);	
		}
	}

	private void disparaHoraMudou(int novaHora) 
	{	for (Relogio relogio: relogios) 
		{	relogio.horaMudou(novaHora);	
		}
	}
}
