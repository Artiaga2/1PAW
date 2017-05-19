package com.artiaga.mail;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by artiaga on 19/5/17.
 */
public class ManageEmail {

    public static void main (String[] args) {

        try{
        String email = leeMail();
        }catch (WrongMailException e){
            System.out.println("Email incorrecto.");
        }
    }
    private static String leeMail () throws WrongMailException{

        Scanner s = new Scanner(System.in);
        String email;
        String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(regex);

        System.out.println("Introduce el email");
        email = s.next();

        if (pattern.matcher(email).matches() ){
            System.out.println("Email Correcto");
        }else{
            throw new WrongMailException("Email incorrecto");
        }

        return email;
    }
}

class WrongMailException extends RuntimeException {

    public WrongMailException (){


    }


    public WrongMailException (String msgError){

        super (msgError);
    }
}