package employee_payroll;

import java.io.*;
import java.sql.*;
import static java.sql.JDBCType.BLOB;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class FXMLDocumentController {
    
    int flag=0;
    public static String path;
    
    
    Stage stage=new Stage();
    @FXML
    private AnchorPane rootpane;
    @FXML
    private AnchorPane pane;
    
    @FXML
    private AnchorPane EmpPane;
    
    @FXML
    private AnchorPane AddEmployeePane;
    
    
    
    //viewdetails fxml parts
     @FXML
    private TextField empidview;

    @FXML
    private TextField firstnameview;

    @FXML
    private TextField lastnameview;

    @FXML
    private TextField dobview;

    @FXML
    private TextField genderview;

    @FXML
    private TextField emailview;

    @FXML
    private TextField contactview;

    @FXML
    private TextField address1view;

    @FXML
    private TextField address2view;

    @FXML
    private TextField postcodeview;

    @FXML
    private TextField departmentview;

    @FXML
    private TextField designationview;

    @FXML
    private TextField statusview;

    @FXML
    private TextField dohview;

    @FXML
    private TextField titleview;

    @FXML
    private ImageView imgview;


    
    //login fxml parts --------------------
    
    
    @FXML
    private Button exit;
    @FXML
    private PasswordField password;
    @FXML
    private TextField username;
    @FXML
    private Button LoginEmployee;
    @FXML
    private Button LoginAdmin;
    
    
    //addemployee details fxml parts-------------
    
    
    @FXML 
    private TextField ltuser;
    @FXML
    private TextField ltpassword;
    @FXML
    private TextField addemployeeid;
    @FXML
    private TextField addsalary;
    @FXML
    private Button saveCredentials;
    @FXML
    private Button addemployeereset;
    
    
    
  //admin  page fxml parts -----------------------
    
    @FXML
    private Button AddBtn;
    @FXML
    private Button PaymentBtn;
    @FXML
    private Button DeductionBtn;
    @FXML
    private Button AllowanceBtn;
    @FXML
    private Button SearchBtn;
    @FXML
    private Button UpdateSalaryBtn;
    
    
 
 //employee regestration fxml parts --------------------------------
 
 
    @FXML
    private TextField empiddetails;
    @FXML
    private TextField firstname;
    @FXML
    private TextField lastname;
    @FXML
    private TextField dob;
    @FXML
    private TextField gender;
    @FXML
    private TextField email;
    @FXML
    private TextField contact;
    @FXML
    private TextField address1;
    @FXML
    private TextField address2;
    @FXML
    private TextField postcode;
    @FXML
    private TextField department;
    @FXML
    private TextField designation;
    @FXML
    private TextField jobstatus;
    @FXML
    private TextField jobtitle;
    @FXML
    private TextField doh;
    @FXML
    private ImageView img;
    @FXML
    private Button uploadbtn;
    @FXML
    private Button saveemployeebtn;
    @FXML
    private Button clearemployee;
    
    
    //search page fxml components---------------------------------------------
    
      @FXML
    private Button searchdelete;

    @FXML
    private TextField titlesearch;

    @FXML
    private TextField dohsearch;

    @FXML
    private TextField statussearch;

    @FXML
    private TextField designationsearch;

    @FXML
    private TextField departmentsearch;

    @FXML
    private TextField address2search;

    @FXML
    private TextField address1search;

    @FXML
    private TextField contactsearch;

    @FXML
    private TextField emailsearch;

    @FXML
    private TextField gendersearch;

    @FXML
    private TextField dobsearch;

    @FXML
    private TextField lastnamesearch;

    @FXML
    private TextField firstnamesearch;

    @FXML
    private TextField empidsearch;

    @FXML
    private TextField postcodesearch;

    @FXML
    private Button searchclear;

    @FXML
    private ImageView imgviewsearch;

   
//admin update fxml page-------------------------------------
    
    
    @FXML
    private TextField empidupdate;

    @FXML
    private TextField lastnameupdate;

    @FXML
    private TextField dobupdate;

    @FXML
    private TextField basicsalaryupdate;

    @FXML
    private TextField departmentupdate;

    @FXML
    private TextField firstnameupdate;

    @FXML
    private TextField empidupdate11;

    @FXML
    private TextField amountupdate;

    @FXML
    private Button updatebtn;

   //allowance page fxml components-------------------------
    
      @FXML
    private Button saveallowance;

    @FXML
    private Button clear;

    @FXML
    private Label totalamount;

    @FXML
    private Button calculate;

    @FXML
    private TextField overtimeallowance;

    @FXML
    private TextField bonusallowance;

    @FXML
    private TextField medicalallowance;

    @FXML
    private TextField othersallowance;

    @FXML
    private TextField rateperhour;

    @FXML
    private Label totalovertimeamount;

    @FXML
    private TextField lastnameallowance;

    @FXML
    private TextField doballowance;

    @FXML
    private TextField basicsalaryallowance;

    @FXML
    private TextField departmentallowance;

    @FXML
    private TextField firstnameallowance;

    @FXML
    private TextField empidallowance11;

    @FXML
    private TextField empidallowance;

    //deduction page fxml components--------------------------------------
    
      @FXML
    private TextField empiddeduction;

    @FXML
    private TextField empiddeduction11;

    @FXML
    private TextField firstnamededuction;

    @FXML
    private TextField salarydeduction;

    @FXML
    private TextField departmentdeduction;

    @FXML
    private TextField dobdeduction;

    @FXML
    private TextField lastnamededuction;

    @FXML
    private TextField titlededuction;

    @FXML
    private TextField dohdeduction;

    @FXML
    private TextField statusdeduction;

    @FXML
    private TextField designationdeduction;

    @FXML
    private Button calculatededuction;

    @FXML
    private Label totaldeduction;

    @FXML
    private Button cleardeduction;

    @FXML
    private Button savededuction;

    @FXML
    private Label salaryafterdeduction;

    @FXML
    private TextField amountdeduction;

    @FXML
    private TextField reason;

    //payment fxml page content-----------------------------------------------
       @FXML
    private TextField designationpayment;

    @FXML
    private TextField statuspayment;

    @FXML
    private TextField dohpayment;

    @FXML
    private TextField titlepayment;

    @FXML
    private TextField lastnamepayment;

    @FXML
    private TextField dobpayment;

    @FXML
    private TextField departmentpayment;

    @FXML
    private TextField salarypayment;

    @FXML
    private TextField firstnamepayment;

    @FXML
    private TextField empidpayment11;

    @FXML
    private TextField empidpayment;

    @FXML
    void handleempidpayment(ActionEvent event) {
        int flag2=0;
        String s1=empidpayment.getText();
        s1=s1.trim().toString();
        
        double salary=0;
        double salary1=0;
        double salary2=0;
        double salary3=0;
        
        String sql1="select * from employee_new where emp_id='"+s1+"'";
        String sql2="select * from department where emp_id='"+s1+"'";
        String sql3="select * from emp_allowance where emp_id='"+s1+"'";
        String sql4="select * from emp_empid";
        String sql5="select * from emp_deduction where emp_id='"+s1+"'";
        String sql6="select * from emp_salary where emp_id='"+s1+"'";
        try{
            Statement st=con.createStatement();
            
             ResultSet rs4=st.executeQuery(sql4);
             
               while(rs4.next()){
                   if(s1.equalsIgnoreCase(rs4.getString("emp_id"))){
                       flag2=1;
                       break;
                   }
                       
               }
               if(flag2==0)
                   alertuser("no such employee exists!!");
               else{
                      ResultSet rs=st.executeQuery(sql1);
                       while(rs.next()){
                     empidpayment11.appendText(rs.getString("emp_id"));
                     firstnamepayment.appendText(rs.getString("firstname"));
                      lastnamepayment.appendText(rs.getString("lastname"));
                      dobpayment.appendText(rs.getString("dob"));
                    }
            
                        ResultSet rs1=st.executeQuery(sql2);
                        while(rs1.next()){
                        departmentpayment.appendText(rs1.getString("dept"));
                         designationpayment.appendText(rs1.getString("designation"));
                         statuspayment.appendText(rs1.getString("status"));
                       dohpayment.appendText(rs1.getString("doh"));
                        titlepayment.appendText(rs1.getString("title"));
                 
                          }
             
                        ResultSet rs2=st.executeQuery(sql3);
                        while(rs2.next()){
                           salary1=(rs2.getDouble("total_allowance"));
                        }
                       
                         ResultSet rs3=st.executeQuery(sql5);
                         while(rs3.next()){
                             salary2=rs3.getDouble("deduction_amount");
                         }
                         ResultSet rs5=st.executeQuery(sql6);
                         while(rs5.next()){
                             salary3=rs5.getDouble("basic_salary");
                         }
                                 
                         salary =salary3 +salary1 -salary2;
                         salarypayment.setText(String.valueOf(salary));
               }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
    
    
    // employee deduction page fxml -----------------------------------------
    
       @FXML
    private TextField empiddeduction1;

    @FXML
    private TextField fndeduction;

    @FXML
    private TextField bsdeduction1;

    @FXML
    private TextField departmentdeduction1;

    @FXML
    private TextField dobdeduction1;

    @FXML
    private TextField lndeduction;

    @FXML
    private TextField titlededuction1;

    @FXML
    private TextField dohdeduction1;

    @FXML
    private TextField statusdeduction1;

    @FXML
    private TextField designationdeduction1;

    @FXML
    private Label totaldeduction1;

    @FXML
    private Label salarydeduction1;

    @FXML
    void handleempiddeduction1(ActionEvent event) {
               
        String s1=empiddeduction1.getText();
        s1=s1.trim().toString();
         double bs =0;
         double da =0;
        
        String sql1="select * from employee_new where emp_id='"+s1+"'";
        String sql2="select * from department where emp_id='"+s1+"'";
        String sql3="select * from emp_salary where emp_id='"+s1+"'";
        String sql4="select * from emp_deduction where emp_id='"+s1+"'";
        try{
            Statement st=con.createStatement();
            ResultSet rs1=st.executeQuery(sql1);
            while(rs1.next()){
                fndeduction.appendText(rs1.getString("firstname"));
                lndeduction.appendText(rs1.getString("lastname"));
                dobdeduction1.appendText(rs1.getString("dob"));
                
            }
            
             ResultSet rs2=st.executeQuery(sql2);
             while(rs2.next()){
                 departmentdeduction1.appendText(rs2.getString("dept"));
                 designationdeduction1.appendText(rs2.getString("designation"));
                 statusdeduction1.appendText(rs2.getString("status"));
                 dohdeduction1.appendText(rs2.getString("doh"));
                 titlededuction1.appendText(rs2.getString("title"));
                 
             }
             
               ResultSet rs3=st.executeQuery(sql3);
               while(rs3.next()){
                  bsdeduction1.appendText(rs3.getString("basic_salary"));
                  bs=rs3.getDouble("basic_salary");
               }
               ResultSet rs4=st.executeQuery(sql4);
               while(rs4.next()){
                   totaldeduction1.setText(rs4.getString("deduction_amount"));
                   da=rs4.getDouble("deduction_amount");
               }
               double salary=bs-da;
               salarydeduction1.setText(String.valueOf(salary));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    //salary page fxml components -------------------------------------------
    
      @FXML
    private TextField empidsalary1;

    @FXML
    private TextField fnsalary1;

    @FXML
    private TextField lnsalary1;

    @FXML
    private TextField dobsalary1;

    @FXML
    private TextField gendersalary1;

    @FXML
    private TextField emailsalary1;

    @FXML
    private TextField contactsalary1;

    @FXML
    private TextField departmentsalary1;

    @FXML
    private TextField designationsalary1;

    @FXML
    private TextField statussalary1;

    @FXML
    private TextField dohsalary1;

    @FXML
    private TextField titlesalary1;

    @FXML
    private Label basic1;

    @FXML
    private Label totalallowance1;

    @FXML
    private Label totalsalary11;

    @FXML
    private Label totaldeduction11;

    @FXML
    void handleempidsalary1(ActionEvent event) {
            String s1=empidsalary1.getText();
            s1=s1.trim().toString();
            double bs=0;
            double da=0;
            double ta=0;
            double total=0;
            String sql1="select * from employee_new where emp_id='"+s1+"'";
            String sql2="select * from department where emp_id='"+s1+"'";
            String sql3="select * from emp_salary where emp_id='"+s1+"'";
            String sql4="select * from emp_allowance where emp_id='"+s1+"'";
            String sql5="select * from emp_deduction where emp_id='"+s1+"'";
            try{
                
                Statement st=con.createStatement();
                ResultSet rs1=st.executeQuery(sql1);
                while(rs1.next()){
                    fnsalary1.appendText(rs1.getString("firstname"));
                    lnsalary1.appendText(rs1.getString("lastname"));
                    dobsalary1.appendText(rs1.getString("dob"));
                    gendersalary1.appendText(rs1.getString("gender"));
                    emailsalary1.appendText(rs1.getString("email"));
                    contactsalary1.appendText(rs1.getString("contact"));
                }
                
                  ResultSet rs2=st.executeQuery(sql2);
                   while(rs2.next()){
                       departmentsalary1.appendText(rs2.getString("dept"));
                       designationsalary1.appendText(rs2.getString("designation"));
                       statussalary1.appendText(rs2.getString("status"));
                       dohsalary1.appendText(rs2.getString("doh"));
                       titlesalary1.appendText(rs2.getString("title"));
                       
                   }
                   ResultSet rs3=st.executeQuery(sql3);
                   while(rs3.next()){
                       basic1.setText(rs3.getString("basic_salary"));
                       bs=rs3.getDouble("basic_salary");
                   }
                   
                   ResultSet rs4=st.executeQuery(sql4);
                   while(rs4.next()){
                       totalallowance1.setText(rs4.getString("total_allowance"));
                       ta=rs4.getDouble("total_allowance");
                   }
                 ResultSet rs5=st.executeQuery(sql5);
                 while(rs5.next()){
                     totaldeduction11.setText(rs5.getString("deduction_amount"));
                     da=rs5.getDouble("deduction_amount");
                 }
                 
                 total=bs+ta-da;
                 totalsalary11.setText(String.valueOf(total));
            }catch(Exception e){
                e.printStackTrace();
            }
    }



    
       //employee allowance page ----------------------------------
      @FXML
    private Label totalallowancee;

    @FXML
    private TextField overtimeallowancee;

    @FXML
    private TextField bonusallowancee;

    @FXML
    private TextField medicalallowancee;

    @FXML
    private TextField othersallowancee;

    @FXML
    private TextField rphallowancee;

    @FXML
    private TextField overtimeallowanceamounte;

    @FXML
    private TextField lastnameallowancee;

    @FXML
    private TextField doballowancee;

    @FXML
    private TextField bsallowancee;

    @FXML
    private TextField departmnetallowancee;

    @FXML
    private TextField fnallowancee;

    @FXML
    private TextField empidallowancee;

    @FXML
    private Label totalsalarye;

    @FXML
    void handleempidallowancee(ActionEvent event) {
               
        String s1=empidallowancee.getText();
        s1=s1.trim().toString();
        double bs=0;
        double ta=0;
        double salary;
        
            String sql1="select * from employee_new where emp_id='"+s1+"'";
            String sql2="select * from emp_salary where emp_id='"+s1+"'";
            String sql3="select * from department where emp_id='"+s1+"'";
            String sql4="select * from emp_empid";
            String sql5="select * from emp_allowance where emp_id='"+s1+"'";
            String sql6="select * from emp_deduction where emp_id='"+s1+"'";
            
            try{
                Statement st=con.createStatement();
                ResultSet rs1=st.executeQuery(sql1);
                
                while(rs1.next()){
                    fnallowancee.appendText(rs1.getString("firstname"));
                    lastnameallowancee.appendText(rs1.getString("lastname"));
                    doballowancee.appendText(rs1.getString("dob"));
                    
                }
                
                 ResultSet rs2=st.executeQuery(sql2);
                 while(rs2.next()){
                     bsallowancee.appendText(rs2.getString("basic_salary"));
                     bs=rs2.getDouble("basic_salary");
                 }
                 
                    ResultSet rs3=st.executeQuery(sql3);
                 while(rs3.next()){
                     departmnetallowancee.appendText(rs3.getString("dept"));
                 }
                 ResultSet rs4=st.executeQuery(sql5);
                 while(rs4.next()){
                     bonusallowancee.appendText(rs4.getString("bonus"));
                     medicalallowancee.appendText(rs4.getString("medical"));
                     overtimeallowanceamounte.appendText(rs4.getString("overtime_amount"));
                     totalallowancee.setText(rs4.getString("total_allowance"));
                     ta=rs4.getDouble("total_allowance");
                 }
                 salary=ta+bs;
                 totalsalarye.setText(String.valueOf(salary));
                  
            }catch(Exception e){
                e.printStackTrace();
            }
            
    }







  //static block for making connection with database-----------------------
    
    
    static Connection con;
    
    static{
       
                try{
            
                      String dn="oracle.jdbc.driver.OracleDriver";
                      Class.forName(dn);
                      String sn="localhost";
                      String sp="1521";
                      String aid="XE";
                      String url="jdbc:oracle:thin:@"+sn+":"+sp+":"+aid;
                      String un="myuser1";
                      String pas="27041998";
                      con=DriverManager.getConnection(url,un,pas);
                      System.out.println("connected");
                      
                      
                     }catch(Exception ex){
            
                          System.out.println(ex);
                      }
        }
    
    
    //end of static block ------------------------------------------------
    
    
    @FXML
    void handleclearemployee(ActionEvent event) {
                
                    empiddetails.clear();
                    firstname.clear();
                    lastname.clear();
                    email.clear();
                    doh.clear();
                    dob.clear();
                    designation.clear();
                    jobtitle.clear();
                    jobstatus.clear();
                    department.clear();
                    postcode.clear();
                    address1.clear();
                    address2.clear();
                    gender.clear();
                    contact.clear();
                    img.setImage(null);
        }

    @FXML
    void handleuploadbtn(ActionEvent event) {
        String s1=empiddetails.getText();
         FileChooser fc=new FileChooser();
                  FileChooser.ExtensionFilter filter1=new FileChooser.ExtensionFilter("image file", "*.jpg");
                  FileChooser.ExtensionFilter filter2=new FileChooser.ExtensionFilter("image file", "*.png");
                  fc.getExtensionFilters().addAll(filter1,filter2);
                  File file;
                  FileInputStream fis;
                   
          String sql="insert into emp_image(emp_id ,photo) values(?,?)";
         
                               
                      try{
                            file=fc.showOpenDialog(null);
                            path=file.toURI().toString();
                            if(path!=null){
                                       Image img1=new Image(path);
                                        img.setImage(img1);
                                                              
                                      }
            
                                       /*while(path==null){
                                                         alertuser("Image can not be displayed!!");
                                                         }*/
                                  fis=new FileInputStream(file);  
                                  PreparedStatement ps=con.prepareStatement(sql);
                                  ps.setString(1, s1);
                                  ps.setBinaryStream(2, fis);
                                  ps.executeQuery();
                                 // System.out.println(i+"rows effected");
                        }catch(Exception e){
                                            
                                          alertuser("Image can not be displayed!!");
                                          file=fc.showOpenDialog(null);
                                          path=file.toURI().toString();
                                          Image img1=new Image(path);
                                          img.setImage(img1);
                                           
                                          }

           }
    
    
  
    @FXML
    void handlesaveemployeebtn(ActionEvent event) {
        
                 
            
          
        String s1=empiddetails.getText();
        String s2=firstname.getText();
        String s3=lastname.getText();
        String s4=dob.getText();
        String s5=gender.getText();
        String s6=email.getText();
        String s7=contact.getText();
        String s8=address1.getText();
        String s9=address2.getText();
        String s10=postcode.getText();
        String s11=department.getText();
        String s12=designation.getText();
        String s13=jobstatus.getText();
        String s14=doh.getText();
        String s15=jobtitle.getText();
         
        int flag3=0;
        
        if((s1.isEmpty())||(s2.isEmpty())||(s3.isEmpty())||(s4.isEmpty())||(s5.isEmpty())||(s6.isEmpty())||(s7.isEmpty())||(s8.isEmpty())||(s9.isEmpty())||(s10.isEmpty())||(s11.isEmpty())||(s12.isEmpty())||(s13.isEmpty())||(s14.isEmpty())||(s15.isEmpty())){
              alertuser("Some Field(s) Is(Are) Empty!!");          
           }
       
        String sql="insert into employee_new (emp_id,firstname,lastname,dob,gender,email,contact,address1,address2,postcode)values(?,?,?,?,?,?,?,?,?,?)";
        String sql1="insert into department(dept ,designation,status,doh,title,emp_id)values(?,?,?,?,?,?)";
        String sql2="insert into emp_empid(emp_id) values(?)";
        String sql3="select * from emp_empid";
        String sql4="insert into emp_allowance(emp_id,bonus,overtime_amount,medical,total_allowance) values(?,?,?,?,?)";
        String sql5="insert into emp_deduction(emp_id,reason,deduction_amount) values(?,?,?)";
           try{
                  
               Statement st=con.createStatement();
               ResultSet rs4=st.executeQuery(sql3);
               
               while(rs4.next()){
                   
                   if(s1.equalsIgnoreCase(rs4.getString("emp_id"))){
                       flag3=1;
                       break;
                   }
                       
               }
               
               if(flag3==1){
                   alertuser("employee already exists with that id!!");
               }
               else{ 
                   
               
                     PreparedStatement ps=con.prepareStatement(sql);                    ResultSet rs=null;
                      
                       
                     ps.setString(1, s1);
                     ps.setString(2, s2);
                     ps.setString(3, s3);
                     ps.setString(4, s4);
                     ps.setString(5, s5);
                     ps.setString(6, s6);
                     ps.setString(7,s7);
                     ps.setString(8, s8);
                     ps.setString(9, s9);
                     ps.setString(10, s10);
                     ps.executeQuery();
                 
                
                 
              
                      PreparedStatement ps1=con.prepareStatement(sql1);
           
               
               
                       ps1.setString(1,s11);
                       ps1.setString(2,s12);
                       ps1.setString(3,s13);
                       ps1.setString(4,s14);
                       ps1.setString(5,s15);
                       ps1.setString(6, s1);
                       ps1.executeUpdate();
                
                            PreparedStatement ps2=con.prepareStatement(sql2);
                         ps2.setString(1, s1);
                         ps2.executeUpdate();
                         
                          PreparedStatement ps3=con.prepareStatement(sql4);
                          ps3.setString(1, s1);
                          ps3.setDouble(2, 0);
                          ps3.setDouble(3, 0);
                          ps3.setDouble(4, 0);
                          ps3.setDouble(5, 0);
                          ps3.executeUpdate();
                          
                          PreparedStatement ps4=con.prepareStatement(sql5);
                          ps4.setString(1, s1);
                          ps4.setString(2, "unknown");
                          ps4.setDouble(3, 0);
                          ps4.executeUpdate();
                         
               }
           }catch(Exception e){
               e.printStackTrace();
               System.out.println(e);
             }
       }



    @FXML
    void handleAdmin(ActionEvent event)throws Exception {
        
       if(username.getText().equals("Admin") && (password.getText().equals("password"))){
            pane = FXMLLoader.load(getClass().getResource("AdminPage.fxml"));
            rootpane.getChildren().setAll(pane);
        
            }
       
          else{
                alertuser("Invalid Username Or/And Password!!");
                username.clear();
                password.clear();
         }

    }

  
    @FXML
    void handleEmployee(ActionEvent event) {
                    String s1=username.getText();
                    String s2=password.getText();
            try{
       
                Statement st=con.createStatement();
                ResultSet rs1=st.executeQuery("select * from login");
                 while(rs1.next()){
              
                    if((s1.equals(rs1.getString("username")))&&(s2.equals(rs1.getString("password")))){
                        
                        flag=1;
                        break;
                      }
                   }
                  if(flag==1){
                       EmpPane = FXMLLoader.load(getClass().getResource("EmployeePage.fxml"));
                       rootpane.getChildren().setAll(EmpPane);
                  }
        
                 else{  
                        alertuser("Invalid Username Or/And Password!!");
                        username.clear();
                        password.clear();
                    } 
        
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    @FXML
    void handleExit(ActionEvent event) {
            System.exit(0);
    }
    
    @FXML
    void handleAddEmployee(ActionEvent event)
    {
        try{
        StageSetter("AddEmployee1.fxml");
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    
    @FXML
    void handlesaveCredentials(ActionEvent ae) {
        
        String s1=ltuser.getText();
        String s2=ltpassword.getText();
        String s3=addsalary.getText();
        String s4=addemployeeid.getText();
               try{
               
                   if((s1.trim().isEmpty())||(s2.trim().isEmpty())){
                       alertuser("Some fields Are Empty!! ");
                   } 
                   
                   else{
                       String sql="insert into login(emp_id,username,password) values (?,?,?)";
                       String sql1="select *from login";
                       String sql2="insert into emp_salary(emp_id,basic_salary) values(?,?)";
                      Statement s=con.createStatement();
                       ResultSet rs=s.executeQuery(sql1);
                       while(rs.next()){
                           if(s2.equals(rs.getString("password"))){
                               alertuser("password alredy exists!!");
                               ltuser.clear();
                               ltpassword.clear();
                           }
                       }
                       PreparedStatement ps=con.prepareStatement(sql); 
                       ps.setString(1,s4);
                       ps.setString(2,ltuser.getText());
                       ps.setString(3, ltpassword.getText());
                       ps.executeUpdate();
                      
                       PreparedStatement ps1=con.prepareStatement(sql2);
                        ps1.setString(1,s4);
                        ps1.setString(2,s3);
                         ps1.executeUpdate();
                       
                   }
                   
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    
       @FXML
    void handleaddemployeereset(ActionEvent event) {
                   ltuser.clear();
                   ltpassword.clear();
                   addsalary.clear();
                   addemployeeid.clear();
  
    }
      @FXML
    void handleempidsearch(ActionEvent event) {
              
        String s1=empidsearch.getText();
        s1=s1.trim().toString();
        int flag1=0;
        String path;
        FileOutputStream fout;
        Blob b;
        byte []bt;
        Image img2=null;
        String sql="select * from emp_empid";
        String sql1="select * from employee_new where emp_id ='"+s1+"' ";
        String sql2="select * from department where emp_id ='"+s1+"'";
        String sql3="select * from emp_image where emp_id = '"+s1+"'";
        
         try{
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(sql);
        
        while(rs.next()){
            if(s1.equals(rs.getString("emp_id")))
                flag1=1;
                
        }
        rs.close();
        if(flag1==1){
            ResultSet rs1=st.executeQuery(sql1);
            while(rs1.next()){
                firstnamesearch.appendText(rs1.getString("firstname"));
                lastnamesearch.appendText(rs1.getString("lastname"));
                dobsearch.appendText(rs1.getString("dob"));
                gendersearch.appendText(rs1.getString("gender"));
                emailsearch.appendText(rs1.getString("email"));
                contactsearch.appendText(rs1.getString("contact"));
                address1search.appendText(rs1.getString("address1"));
                address2search.appendText(rs1.getString("address2"));
                postcodesearch.appendText(rs1.getString("postcode"));
            }
            rs1.close();
            
            ResultSet rs2=st.executeQuery(sql2);
            while(rs2.next()){
                
                departmentsearch.appendText(rs2.getString("dept"));
                designationsearch.appendText(rs2.getString("designation"));
                statussearch.appendText(rs2.getString("status"));
                dohsearch.appendText(rs2.getString("doh"));
                titlesearch.appendText(rs2.getString("title"));
            }
            rs2.close();
            
            ResultSet rs3=st.executeQuery(sql3);
            while(rs3.next()){
                
                  b=rs3.getBlob("photo");
               bt=new byte[(int)b.length()];
               bt=b.getBytes(1, (int)b.length());
               
               fout=new FileOutputStream("D:\\stud1.jpg");
               fout.write(bt);
               path="file:D:\\stud1.jpg".toString();
               img2=new Image(path);
                imgviewsearch.setImage(img2);
            }
            rs3.close();
        }
        else{
            alertuser("emp_id does not exists!!");
        }
    }catch(Exception e){
        System.out.println(e);
    }

    }
        
     @FXML
    void handlesearchclear(ActionEvent event) {
           
         empidsearch.clear();
         firstnamesearch.clear();
         lastnamesearch.clear();
         dobsearch.clear();
         gendersearch.clear();
         emailsearch.clear();
         contactsearch.clear();
         address1search.clear();
         address2search.clear();
         postcodesearch.clear();
         departmentsearch.clear();
         designationsearch.clear();
         statussearch.clear();
         titlesearch.clear();
         dohsearch.clear();
         imgviewsearch.setImage(null);
    }

    @FXML
    void handlesearchdelete(ActionEvent event) {
              
        String s1=empidsearch.getText();
        s1=s1.trim().toString();
        int flag4=0;
        String sql1="delete from employee_new where emp_id ='"+s1+"'";
        String sql2="delete from emp_empid where emp_id ='"+s1+"'";
        String sql4="delete from emp_salary where emp_id ='"+s1+"'";
        String sql5="delete from emp_image where emp_id ='"+s1+"'";
        String sql6="delete from department where emp_id ='"+s1+"'";
        String sql7="delete from emp_allowance where emp_id='"+s1+"'";
        String sql8="delete from emp_deduction where emp_id='"+s1+"'";
        String sql9="delete from login where emp_id='"+s1+"'";
        String sql10="select * from emp_empid";
        
        try{
                    Statement st=con.createStatement();
                    
                     ResultSet rs10=st.executeQuery(sql10);
                    
                     while(rs10.next()){
                         if(s1.equalsIgnoreCase(rs10.getString("emp_id"))){
                             flag4=1;
                             break;
                             
                         }
                     }
                     if(flag4==1){
                         
                     
                           ResultSet rs1=st.executeQuery(sql1);
                           ResultSet rs2=st.executeQuery(sql2);
                           ResultSet rs4=st.executeQuery(sql4);
                           ResultSet rs5=st.executeQuery(sql5);
                           ResultSet rs6=st.executeQuery(sql6);
                           ResultSet rs7=st.executeQuery(sql7);
                           ResultSet rs8=st.executeQuery(sql8);
                           ResultSet rs9=st.executeQuery(sql9);
                     }
                     else{
                         alertuser("no such employee exists!!");
                     }
                }catch(Exception e){
                         System.out.println(e);
                         e.printStackTrace();
                     }
  }
    
    
    @FXML
    void handlecalculate(ActionEvent event) {
     String s1=rateperhour.getText();
     double rph= Double.parseDouble(s1);
     
     String s2= overtimeallowance.getText();
     double hours=Double.parseDouble(s2);
     
      double toa=rph*hours;
      totalovertimeamount.setText(String.valueOf(toa));
     String s3=bonusallowance.getText();
     double bonus=Double.parseDouble(s3);
     
     String s4=medicalallowance.getText();
     double medical=Double.parseDouble(s4);
     
     String s5=othersallowance.getText();
     double other=Double.parseDouble(s5);
     
     double total=toa+bonus+medical+other;
     totalamount.setText(String.valueOf(total));
        
    }

    @FXML
    void handleclearallowance(ActionEvent event) {
               
        overtimeallowance.clear();
         bonusallowance.clear();
         medicalallowance.clear();
         othersallowance.clear();
         totalovertimeamount.setText(" ");
         rateperhour.clear();
         lastnameallowance.clear();
         doballowance.clear();
          basicsalaryallowance.clear();
          departmentallowance.clear();
          firstnameallowance.clear();
          empidallowance11.clear();
           empidallowance.clear();
           totalamount.setText(" ");
    }

    @FXML
    void handleempidallowance(ActionEvent event) {
           
        String s1=empidallowance.getText();
        s1=s1.trim().toString();
        
      
          
        String sql1="select * from employee_new where emp_id='"+s1+"'";
        String sql2="select * from department where emp_id='"+s1+"'";
        String sql3="select * from emp_salary where emp_id='"+s1+"'";
        
       
        try{
            Statement st=con.createStatement();
            ResultSet rs1=st.executeQuery(sql1);
            while(rs1.next()){
                empidallowance11.appendText(rs1.getString("emp_id"));
                firstnameallowance.appendText(rs1.getString("firstname"));
                lastnameallowance.appendText(rs1.getString("lastname"));
                doballowance.appendText(rs1.getString("dob"));
            }
            
            ResultSet rs2=st.executeQuery(sql2);
            while(rs2.next()){
                departmentallowance.appendText(rs2.getString("dept"));
            }
            ResultSet rs3=st.executeQuery(sql3);
            while(rs3.next()){
                basicsalaryallowance.appendText(rs3.getString("basic_salary"));
            }
        }
          catch(Exception e){
            System.out.println(e);
            //e.printStackTrace();
        }
          
    }

    @FXML
    void handlesaveallowance(ActionEvent event) {
        
                String s1=empidallowance.getText();
                s1=s1.trim().toString();
                String bonus1=bonusallowance.getText();
                double bonus2=Double.parseDouble(bonus1);
                String medical1=medicalallowance.getText();
                double medical2=Double.parseDouble(medical1);
                String others1=othersallowance.getText();
                double others2=Double.parseDouble(others1);
                String overtime1=totalovertimeamount.getText();
                double overtime2=Double.parseDouble(overtime1);
                
                if(totalamount.getText().trim().isEmpty()){
                    alertuser("calculate total amount first!!");
                }
                else{
                
                String total_amount= totalamount.getText();
      
               double total=Double.parseDouble(total_amount);
                String sql4="update emp_allowance set bonus='"+bonus2+"',overtime_amount='"+overtime2 +"' ,medical='"+medical2+"' ,total_allowance='"+ total+"' where emp_id='"+s1+"'";
                
                
                try{
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery(sql4);
                    alertuser("successfully updated!!");
                }catch(Exception e){
                    e.printStackTrace();
                }
                }
        
    }
    
    
    @FXML
    void handlecalculatededuction(ActionEvent event) {
                     String id=empiddeduction.getText();
                     id=id.trim().toString();
                     double salary_s =0;
                     String s1=amountdeduction.getText();
                     double amount=Double.parseDouble(s1);
                     String reason1=reason.getText();

                     totaldeduction.setText(s1);
                     
                    
                     
                     String sql1="select * from emp_salary where emp_id='"+id+"'";
                     try{
                        
                         Statement st=con.createStatement();
                         ResultSet rs=st.executeQuery(sql1);
                         while(rs.next()){
                               
                             salary_s = rs.getDouble("basic_salary");
                              
                         }
                        System.out.println("salary_s ::"+ salary_s); 
                     double salary=salary_s - (amount);
                    
                      salaryafterdeduction.setText(String.valueOf(salary));
                      
                      alertuser("salary deducted successfully");
                     }catch(Exception e){
                         e.printStackTrace();
                     }
    }

    @FXML
    void handlecleardeduction(ActionEvent event) {
                
        empiddeduction.clear();
        empiddeduction11.clear();
        firstnamededuction.clear();
        salarydeduction.clear();
        departmentdeduction.clear();
        dobdeduction.clear();
        lastnamededuction.clear();
        titlededuction.clear();
        dohdeduction.clear();
        statusdeduction.clear();
        designationdeduction.clear();
        totaldeduction.setText(" ");
        salaryafterdeduction.setText(" ");
        amountdeduction.clear();
        reason.clear();
        
    }

    @FXML
    void handleempiddeduction(ActionEvent event) {
                     
        String s1=empiddeduction.getText();
        s1=s1.trim();
        
        String sql1="select * from employee_new where emp_id='"+s1+"'";
        String sql2="select * from department where emp_id='"+s1+"'";
        String sql3="select * from emp_salary where emp_id='"+s1+"'";
        
        try{
            Statement st=con.createStatement();
            ResultSet rs1=st.executeQuery(sql1);
            
            while(rs1.next()){
                empiddeduction11.appendText(rs1.getString("emp_id"));
                firstnamededuction.appendText(rs1.getString("firstname"));
                lastnamededuction.appendText(rs1.getString("lastname"));
                dobdeduction.appendText(rs1.getString("dob"));
                
            }
            
             ResultSet rs2=st.executeQuery(sql2);
             while(rs2.next()){
                 departmentdeduction.appendText(rs2.getString("dept"));
                 designationdeduction.appendText(rs2.getString("designation"));
                  statusdeduction.appendText(rs2.getString("status"));
                  dohdeduction.appendText(rs2.getString("doh"));
                  titlededuction.appendText(rs2.getString("title"));
             }
             ResultSet rs3=st.executeQuery(sql3);
             
             while(rs3.next()){
                 salarydeduction.appendText(rs3.getString("basic_salary"));
             }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    void handlesavededuction(ActionEvent event) {
            
        String id=empiddeduction.getText();
        id=id.trim().toString();
        
         String s1=amountdeduction.getText();
                     double amount=Double.parseDouble(s1);
                     String reason1=reason.getText();
                     
                     String sql="update emp_deduction set reason='"+reason1+"',deduction_amount='"+amount+"' where emp_id='"+id+"'";
                     try{
                         
                          PreparedStatement ps=con.prepareStatement(sql);
                         ps.executeUpdate();
                     }catch(Exception e){
                         e.printStackTrace();
                     }
    }




    @FXML
    void handleSearchEmployee(ActionEvent event)throws Exception {
        StageSetter("SearchPage1.fxml");
        
    }

    @FXML
    void handleUpdateSalary(ActionEvent event)throws Exception {
        StageSetter("UpdateSalary.fxml");
   
    }

    @FXML
    void handleAllowance(ActionEvent event)throws Exception {
        StageSetter("Allowance.fxml");
    }

    @FXML
    void handleDeduction(ActionEvent event)throws Exception {
        StageSetter("Deductions.fxml");
    }

    @FXML
    void handlePayment(ActionEvent event)throws Exception {
        StageSetter("Payment.fxml");

    }
    
    @FXML
    void handleLogout(ActionEvent event)throws Exception {
        
            rootpane = FXMLLoader.load(getClass().getResource("Login.fxml"));
            
        pane.getChildren().setAll(rootpane);
        
    
    
    }
    
    @FXML
    void handleAddDetails(ActionEvent event)throws Exception {
        StageSetter("EmployeeRegistration.fxml");

    }
    
    @FXML
    void handleEmployeeLogout(ActionEvent event)throws Exception {
        rootpane = FXMLLoader.load(getClass().getResource("Login.fxml"));
            
        EmpPane.getChildren().setAll(rootpane);

    }
    @FXML
    void handleViewDetails(ActionEvent event)throws Exception {
        StageSetter("ViewDetails.fxml");
        

    }
    
        @FXML
    void handleempidview(ActionEvent event) {
        int flag1=0;
        String s1=empidview.getText();
        s1=s1.trim().toString();
         String path;
        FileOutputStream fout;
        Blob b;
        byte []bt;
        Image img2=null;
        String sql="select * from emp_empid";
        String sql1="select * from employee_new where emp_id ='"+s1+"' ";
        String sql2="select * from department where emp_id ='"+s1+"'";
        String sql3="select * from emp_image where emp_id = '"+s1+"'";
        try{
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(sql);
        
        while(rs.next()){
            if(s1.equals(rs.getString("emp_id")))
                flag1=1;
                
        }
        rs.close();
        if(flag1==1){
        
        
         ResultSet rs1 = st.executeQuery(sql1); 
           
              
                while(rs1.next()){
                    firstnameview.appendText(rs1.getString("firstname"));
                    lastnameview.appendText(rs1.getString("lastname"));
                    dobview.appendText(rs1.getString("dob"));
                    genderview.appendText(rs1.getString("gender"));
                    emailview.appendText(rs1.getString("email"));
                    contactview.appendText(rs1.getString("contact"));
                    address1view.appendText(rs1.getString("address1"));
                    address2view.appendText(rs1.getString("address2"));
                    postcodeview.appendText(rs1.getString("postcode"));
                }
                rs1.close();
                 ResultSet rs2= st.executeQuery(sql2);
        while(rs2.next()){
            departmentview.appendText(rs2.getString("dept"));
            designationview.appendText(rs2.getString("designation"));
            statusview.appendText(rs2.getString("status"));
            dohview.appendText(rs2.getString("doh"));
            titleview.appendText(rs2.getString("title"));
        }
        rs2.close();
            ResultSet rs3=st.executeQuery(sql3);
            
            while(rs3.next()){
               b=rs3.getBlob("photo");
               bt=new byte[(int)b.length()];
               bt=b.getBytes(1, (int)b.length());
               
               fout=new FileOutputStream("E:\\stud1.jpg");
               fout.write(bt);
               path="file:E:\\stud1.jpg".toString();
               img2=new Image(path);
                imgview.setImage(img2);
            }
        }
        else{
            alertuser("no such emp_id exists!!");
            empidview.clear();
        }
            
           }catch(Exception e){
               e.printStackTrace();
           }
    }
    
    
     @FXML
    void handleempidupdatebtn(ActionEvent event) {
                 
        String s1=empidupdate.getText();
        s1=s1.trim().toString();
        
        String sql1="select * from employee_new where emp_id='"+s1+"'";
        String sql2="select * from department where emp_id='"+s1+"'";
        String sql3="select * from emp_salary where emp_id='"+s1+"'";
        
        try{
            Statement st=con.createStatement();
            ResultSet rs1=st.executeQuery(sql1);
            
            while(rs1.next()){
                empidupdate11.appendText(rs1.getString("emp_id"));
                firstnameupdate.appendText(rs1.getString("firstname"));
                lastnameupdate.appendText(rs1.getString("lastname"));
                dobupdate.appendText(rs1.getString("dob"));
                
                
            }
             ResultSet rs2=st.executeQuery(sql2);
            
             while(rs2.next()){
                 departmentupdate.appendText(rs2.getString("dept"));
             }
             
              ResultSet rs3=st.executeQuery(sql3);
              
              while(rs3.next()){
                  basicsalaryupdate.appendText(rs3.getString("basic_salary"));
              }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    void handleupdatebtn(ActionEvent event) {
           String id=empidupdate.getText();
           id=id.trim().toString();
        String s1=amountupdate.getText();
        int amount=Integer.parseInt(s1);
        String sql="update emp_salary set basic_salary=basic_salary+'"+amount+"'where emp_id='"+id+"'";
        try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            alertuser("salary amount successfully updated");
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    @FXML
    void handleAllowanceReport(ActionEvent event)throws Exception {
        StageSetter("AllowanceReport.fxml");
        
    }

    @FXML
    void handleDeductionReport(ActionEvent event)throws Exception {
        StageSetter("DeductionReport.fxml");
       
    }

    @FXML
    void handleSalaryReport(ActionEvent event)throws Exception {
         StageSetter("SalaryReport.fxml");
         
    }

    @FXML
    void handleFeedback(ActionEvent event)throws Exception {
        StageSetter("Feedback.fxml");
        
        
    }
    
    void StageSetter(String s)throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource(s));
        
        Scene scene = new Scene(root);
        stage.setMaximized(false);
        stage.setScene(scene);
        
        stage.show();
    }
    
    void alertuser(String s){
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(s);
        alert.showAndWait();
    }

    

}
