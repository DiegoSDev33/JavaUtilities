package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class program {

	public static void main(String[] args) {
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		Post p1 = null;
		try {
		 p1= new Post(sdf.parse("21/06/2018 13:05:44"), "Tavelingg to the new Zealand", "I'm going to visite this wonderful country!", 12);
		}catch(ParseException e) {
			System.out.println("Something is wrong in you date" + e.getMessage());
		}
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("Good night!");
		Comment c4 = new Comment("May the Force be with you!");
		Post p2 = null;
		try {
		 p2= new Post(sdf.parse("28/12/2015 22:22:27"), "Good night guys", "See you tomorrow!", 8);
		}catch(ParseException e) {
			System.out.println("Something is wrong in you date" + e.getMessage());
		}
		p2.addComment(c3);
		p2.addComment(c4);

		System.out.println(p1);
		System.out.println(p2);
	}

}
