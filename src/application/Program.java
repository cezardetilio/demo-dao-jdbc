package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "Livro");
		System.out.println(obj);

		Seller sel = new Seller(2, "Bob", "bob@gmail.com", new Date(), 3.000, obj);
		System.out.println(sel);
		SellerDao sellerdao= DaoFactory.createSellerDao();
		
		System.out.println(sellerdao);
	
	
	
	}
}
