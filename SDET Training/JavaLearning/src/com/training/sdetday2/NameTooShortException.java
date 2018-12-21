package com.training.sdetday2;

public class NameTooShortException extends Exception {

	private String msg;
	
	public NameTooShortException(String msg){
		this.msg = msg;
		
	}

	@Override
	public String toString() {
		return "::: " + msg + ":::";
	}
}
