import java.awt.datatransfer.StringSelection;

public class Candidate {
    //static variable
    static  String examyear;
    String Studentnamename;
    String school;
    static int registrationfee;
    static{
        System.out.println("static block is executing");
        examyear="2026";
        redistrationfee ="50000";
        System.out.println("examyear="+2026);
        System.out.println("registrationfee;UGx"+50000);
    }
        String studentname;
        String regstatus;
        String examinationcenter;
        //instance block
    String getStudentname;
    String regstatus;
    String examinationcenter;
        {
            System.out.println("2 intance intialization block is executing....");
            regstatus = "registered";
            examinationcenter = "uneb central center";
        }
        //constructor
    Candidate (String name){
        System.out.println("construction is executing.....");
        this.studentname=studentname;
    }
    void display(){
        System.out.println("Candidate:"+ studentname);
        System.out.println("schooL:"+ school);
        




    }









            }


