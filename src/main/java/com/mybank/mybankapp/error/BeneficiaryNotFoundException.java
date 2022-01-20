package com.mybank.mybankapp.error;

public class BeneficiaryNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BeneficiaryNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BeneficiaryNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public BeneficiaryNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BeneficiaryNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public BeneficiaryNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
