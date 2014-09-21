package com.ouyang.ua.exception;

public class OymsException extends RuntimeException {

	private static final long serialVersionUID = -6316742402135537521L;

	public OymsException() {
	}

	public OymsException(String exmsg) {
		super(exmsg);
	}

	public OymsException(String exmsg, Throwable e) {
		super(exmsg, e);
	}
}
