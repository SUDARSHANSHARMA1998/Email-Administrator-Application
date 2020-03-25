package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity=100;
    private int defalultpasswordlength=10;
    private String alternateEmail;
    private String company_Suffix="gfg.com";

    public Email(String firstName,String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.department=setDepartment();
        this.password=setdefaultpassword(defalultpasswordlength);
        this.email=firstName.toLowerCase()+'.'+lastName.toLowerCase()+"@"+department+"."+company_Suffix;
//        System.out.println("Your department "+this.department);
//        System.out.println("Email Id"+this.email);
//        System.out.println("Password "+this.password);


    }
    private String setDepartment()
    {
        System.out.println("Select the department\n1 for Sales\n2 for Technical\n3 for Accounting\n0 for None");
        Scanner ob=new Scanner(System.in);
        int dept=ob.nextInt();
        if(dept==1) return "sales";
        else if(dept==2) return "tech";
        else if(dept==3) return "account";
        else return "";
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
    public void setMailboxCapacity(int capacity)
    {
        this.mailboxCapacity=capacity;
    }
    public void setAlternateEmail(String alternateEmail)
    {
        this.alternateEmail = alternateEmail;
    }
    public void changePassword(String password)
    {
        this.password=password;
    }

    public int getMailboxCapacity()
    {
        return mailboxCapacity;
    }
    public String getAlternateEmail()
    {
        return alternateEmail;
    }
    public String getPassword()
    {
        return password;
    }
    public void showInfo()
    {
        System.out.println("Hello "+firstName+" "+lastName+"!!!");
        System.out.println("Here are your credentials-");
        System.out.println("Your Company Email-Id is : "+email);
        System.out.println("Password : "+password);
        System.out.println("Mailboxlimit : "+mailboxCapacity+"MB");
        System.out.println("Do you want to change your password[Y/N]");
        Scanner ob=new Scanner(System.in);
        String a=ob.nextLine();
        if(a=="Y"){
            System.out.println("Enter the new password");
            String s=ob.nextLine();
            changePassword(s);
        }
        System.out.println("Please give your alternate Email-Id");
        String s1=ob.next();
        setAlternateEmail(s1);
        System.out.println("Thankyou.!!! Have a nice day "+firstName);
    }
}
