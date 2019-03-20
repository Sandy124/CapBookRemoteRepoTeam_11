package com.cg.capbook.beans;

public class Password {
	private String newPassword;
	private String reTypeNewPassword;

	public Password() {}

	public Password(String newPassword, String reTypeNewPassword) {
		super();
		this.newPassword = newPassword;
		this.reTypeNewPassword = reTypeNewPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getReTypeNewPassword() {
		return reTypeNewPassword;
	}
	public void setReTypeNewPassword(String reTypeNewPassword) {
		this.reTypeNewPassword = reTypeNewPassword;
	}

	@Override
	public String toString() {
		return "Password [newPassword=" + newPassword + ", reTypeNewPassword=" + reTypeNewPassword + "]";
	}
}
