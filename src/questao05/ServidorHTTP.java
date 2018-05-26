package questao05;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServidorHTTP {
	private static final int PORTA_PADRAO = 8080;

	public static void main(String[] args) throws IOException {
		ServerSocket soqueteServidor = null;
		while (true) {
			try {
				soqueteServidor = new ServerSocket(PORTA_PADRAO);
				System.out.println("Servidor aguardando conexao...");
				Socket soquete = soqueteServidor.accept();
				System.out.println("Nova conexao estabelecida em " + new Date());
				TratadorDeRequisicoes tratador = new TratadorDeRequisicoes(soquete);
				Thread novaRequisicao = new Thread(tratador);
				novaRequisicao.start();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				soqueteServidor.close();
			}
		}
	}
}

