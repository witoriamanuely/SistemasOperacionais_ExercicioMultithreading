package questao03;

import java.io.File;

public class PortaRetrato
{
	private File diretorio;
	private FrameImagem frameImagem;
	private long tempo;

	public PortaRetrato(String imagensDir, long tempo) 
	{	this.diretorio = new File(imagensDir);
		this.tempo = tempo;
		this.frameImagem = new FrameImagem("Digital Portrait");
	}
	
	private File[] getArquivosImagens() 
	{	return diretorio.listFiles(new ImageFileFilter());
	}
}
