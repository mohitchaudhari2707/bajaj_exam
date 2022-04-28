package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Response {
	private boolean is_success;
	private String user_id;
	private String email;
	private String roll_number;
	private int[] numbers;
	private String[]  alphabets;
	public void set_success(boolean b) {
		// TODO Auto-generated method stub
		
	}
	public void setAlphabets(String[] alphabets2) {
		// TODO Auto-generated method stub
		
	}
	public void setNumbers(int[] num) {
		// TODO Auto-generated method stub
		
	}
	public void setEmail(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setRoll_number(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setUser_id(String string) {
		// TODO Auto-generated method stub
		
	}
}
