package br.unip.ads.pim.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public abstract class BaseRestController {

	@ExceptionHandler(Throwable.class)
	private ResponseEntity<ApiError> handlerGlobal(Throwable e) {
		ApiError error = new ApiError();
		error.setMensagem("Ops, ocorreu um erro inesperado.");
		return ResponseEntity.badRequest().body(error);
	}
}
