package com.capgemini;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.capgemini.utility.DBConnection;

public class DMLOperations {
	static Connection connection=null;
	static PreparedStatement statement=null;
	static ResultSet resultSet=null;
	static int row=-1;
	static boolean status=false;
	static Scanner scanner=new Scanner(System.in);
	public static void create() {
		try {
			connection=DBConnection.getConnection();
			String query="create table lab3(authorId number(10) primary key,"+"firstName varchar2(50) not null,"+"middleName varchar2(50),"+"lastName varchar2(50),"+"phoneNo number(10))";
			statement=connection.prepareStatement(query);
			status=statement.execute();
			System.out.println("table created "+status);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void insert() {
		try(Connection connection=DBConnection.getConnection();) {
			System.out.println("Enter authorId:");
			int authorId=scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter firstName:");
			String firstName=scanner.nextLine();
			System.out.println("Enter middleName:");
			String middleName=scanner.nextLine();
			System.out.println("Enter lastName:");
			String lastName=scanner.nextLine();
			System.out.println("Enter phone no:");
			long phoneno=scanner.nextLong();
			statement=connection.prepareStatement("insert into lab3 values(?,?,?,?,?)");
			statement.setInt(1, authorId);
			statement.setString(2, firstName);
			statement.setString(3, middleName);
			statement.setString(4, lastName);
			statement.setLong(5, phoneno);
			row=statement.executeUpdate();
			System.out.println("inserted "+row);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void update() {
		try(Connection connection=DBConnection.getConnection();) {
			System.out.println("Enter authorId:");
			int authorId=scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter firstName:");
			String firstName=scanner.nextLine();
			System.out.println("Enter middleName:");
			String middleName=scanner.nextLine();
			System.out.println("Enter lastName:");
			String lastName=scanner.nextLine();
			System.out.println("Enter phone no:");
			long phoneno=scanner.nextLong();
			statement=connection.prepareStatement("update lab3 set firstName=?,middleName=?,lastName=?,phoneNo=? where authorId=?");
			statement.setString(1, firstName);
			statement.setString(2, middleName);
			statement.setString(3, lastName);
			statement.setLong(4, phoneno);
			statement.setInt(5, authorId);
			row=statement.executeUpdate();
			System.out.println("updated "+row);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void delete() {
		try(Connection connection=DBConnection.getConnection();) {
			System.out.println("Enter authorId:");
			int authorId=scanner.nextInt();
			statement=connection.prepareStatement("delete from lab3 where authorId=?");
			statement.setInt(1, authorId);
			row=statement.executeUpdate();
			System.out.println("deleted "+row);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		boolean choiceFlag=false;
		do {
			System.out.println("1)Create\n2)Insert\n3)Update\n4)Delete");
			int choice=scanner.nextInt();
			switch(choice) {
			case 1: create();
			break;
			case 2: insert();
			break;
			case 3: update();
			break;
			case 4: delete();
			break;
			default: System.out.println("enter 1/2/3/4");
			break;
			}
		}while(!choiceFlag);
	}
}
