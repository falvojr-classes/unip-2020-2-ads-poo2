package br.unip.ads.pim;

import br.unip.ads.pim.entidades.Cliente;
import br.unip.ads.pim.entidades.TipoCliente;

public class Program {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setTipo(TipoCliente.PF);
		cliente.setNome("Venilton");
		cliente.setDocumento("36289058851");
		
		boolean ehValido = cliente.validarDocumento();
		System.out.println(ehValido);
	}
}
