package br.com.fiap.exceptions.exception;

//Criando uma exception: Criar uma classe qye herda de exception
public class XpNegativoException  extends Exception{
	public XpNegativoException(String churros) {
		super(churros);
	}
}
