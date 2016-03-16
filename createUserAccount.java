/**
 * 
 */
package BankApps;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;




//TODO next: create class for reading user data file so user can log in with their
//			 username and password	

//multiple user with the same name has to have different identifier. to be implemented

//User data file format
//line1 = name
//line2 = address
//line3 = pid
//line4 = username
//line5 = password

	
/**
 * TODO (etedjo): write class javadoc
 * @author etedjo
 * 
 * function to create user account
 * stdin: information needed
 * stdout: file with information of the user. for log in to account, match the username 
 * 			and password from the file with the input from user login info
 */
public class createUserAccount
{			
	BufferedReader in;
	String read;
	
	public static int createUserAccount() throws java.io.IOException
	{
		FileWriter fWriter = null;
        BufferedWriter writer = null;
		
		System.out.println("Do you want to open a new account?(yes/no only)");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        
        System.out.println(text);
        if(text.equals("no"))
        {	
        	System.out.println("exit then");
        	System.exit(0); 
        	return 1;
        }
        else if(text.equals("yes"))
        {
        	
        }
        
        
        
        System.out.println("Enter Your Name");
        String name = scan.nextLine();
        
        if(!name.isEmpty())
        {
        	fWriter = new FileWriter(name);
        	writer = new BufferedWriter(fWriter);   
        	writer.write(name);
        	writer.newLine();
        }
        else
        {
        	System.err.println("name is empty,exit, to be implemented");
        }
        
        System.out.println("Enter your address");
        String address = scan.nextLine();
        
        if(!address.isEmpty())
        {
        	writer.write(address);
        	writer.newLine();
        }
        else
        {
        	System.err.println("address is empty,exit, to be implemented");
        }
        
        
        
        
        System.out.println("please enter your PID");
        String pid = scan.nextLine();
        if(!pid.isEmpty())
        {
        	writer.write(pid);
        	writer.newLine();
        }
        else
        {
        	System.err.println("address is empty,exit, to be implemented");
        }
        
        System.out.println("please enter your phone number");
        String phoneNumber = scan.nextLine();
        if(!pid.isEmpty())
        {
        	writer.write(phoneNumber);
        	writer.newLine();
        }
        else
        {
        	System.err.println("address is empty,exit, to be implemented");
        }
        
        System.out.println("please choose your username");
        
        String username = scan.nextLine();
        if(!username.isEmpty())
        {
        	writer.write(username);
        	writer.newLine();
        }
        else
        {
        	System.err.println("address is empty,exit, to be implemented");
        }
        
        System.out.println("Please choose your password");
        String password = scan.nextLine();
        if(!password.isEmpty())
        {
        	writer.write(password);
        	writer.newLine();
        }
        else
        {
        	System.err.println("address is empty,exit, to be implemented");
        }
       
        
        writer.close();
        System.err.println("Your data was saved.");
        
        return 1;
    }

	 
}
