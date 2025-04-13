package com.pr;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Praharsha Loves Madhuri";
		String s2 = null;
		for (int i = 0; i < s1.length(); i++) {
			s2 = s2 + s1.charAt(i);
		}
		System.out.println("Reversed String " + s2);
		s2 = null;

		// String Builder
		StringBuilder s21 = new StringBuilder();
		s21.append(s1);
		s21.reverse();
		System.out.println("S21 " + s21);

		// String Buffer
		StringBuilder s22 = new StringBuilder();
		s22.append(s1);
		s22.reverse();
		System.out.println("S22 " + s22);

	}

}
