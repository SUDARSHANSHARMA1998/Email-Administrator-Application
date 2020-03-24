package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private int defalultpasswordlength=10;
    private String alternateEmail;

    public Email(String firstName,String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.department=setDepartment();
        this.password=setdefaultpassword(defalultpasswordlength);
        System.out.println(this.password);
    }
    private String setDepartment()
    {
        System.out.println("Select the department\n1 for Sales\n2 for Technical\n3 for Accounting\n0 for None");
        Scanner ob=new Scanner(System.in);
        int dept=ob.nextInt();
        if(dept==1) return "Sales";
        else if(dept==2) return "Tech";
        else if(dept==3) return "Accounting";
        else return "None";
    }
    private String setdefaultpassword(int length)
    {
        String set="!@?qwertyuiopasdfghjklzxcvbnm1234567890";
        char[] password=new char[length];
        for(int i=0;i<length;i++)
        {
            int c=(int)(Math.random()*set.length());
            password[i]=set.charAt(c);
        }
        return new String(password);
    }
}
