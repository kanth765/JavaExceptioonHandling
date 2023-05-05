package com.ciq.exceptiondemo;

public class VoterId {
	int age;

	public void voteElections() {
		if (age >= 18) {
			System.out.println("eligible for vote ");
		} else {
//			System.out.println("not eligible for vote ");
			throw new IllegalArgumentException("not eligible for vote ");
//			throw new VoteValidateException("not eligible for vote");
		}
	}

	public static void main(String[] args) {
		VoterId vote = new VoterId();
		vote.age = 1;
//		vote.voteElections();
//		try {
//		vote.voteElections();
//		}catch (IllegalArgumentException e) {
//			System.out.println(e.getMessage());
//		}

		System.out.println("some statement ");
	}
}
