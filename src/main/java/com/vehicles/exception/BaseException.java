package com.vehicles.exception;

import org.springframework.http.HttpStatus;

public class BaseException extends RuntimeException{

	private static final long serialVersionUID = 8165663702256637414L;
	
	private HttpStatus status;
	private String mensagem;
	
	public BaseException(HttpStatus status, String mensagem) {
		super(mensagem);	
		this.status = status;
		this.mensagem = mensagem;
	}
	
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
