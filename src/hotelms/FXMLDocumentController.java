/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelms;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;
public class FXMLDocumentController implements Initializable {
    @FXML
    private JFXRadioButton male,female; 
    @FXML
    private Button Admin;
    @FXML
    private AnchorPane id1,Authoritypan, wellcomead,roomdetail,ChoiceYourroompan,adid2,superior,delux,Connecting,creatnewAccountadmin;
    @FXML
    private Label un,pass;
    @FXML
    private PasswordField passf;
    @FXML
    private JFXButton adlog,AddRoom,adexit,wellcomadminexit,addingRoomExit,adid2login,
            adid2loginexit,vewroomdetail,choiceroomexit,Superior,superiorExit,deluxx,Deluxexit
            ,connectingexit,creatnewAccount1a,CreatenewExit,admincreatnewaccclogin,AdminReset,
            Admin1,Manager,Employee;
    @FXML
    private JFXTextField AdminFirstName, AdminLastname,AdminUserName,AdminPassWord,AdminResetPassword
            ,adminBackto,unf;
//Manager Button

    int ManagerAug;
    @FXML
    void ManagerButton(ActionEvent event)
    {
       ManagerAug =1;
       adid2.setVisible(true);
       Authoritypan.setVisible(false);
    }
//Admin1 Button
    
     int AdminAug ;
    @FXML
    void Admin1Button(ActionEvent event)
    {   
          AdminAug =1;
       adid2.setVisible(true);
       Authoritypan.setVisible(false);
    }
    //Employee Button
    int EmplyeeAug; 
    @FXML
    void EmployeeButton(ActionEvent event)
    {
         EmplyeeAug=1;
        adid2.setVisible(true);
       Authoritypan.setVisible(false);
    }
    
    @FXML
    void adminBacktoButton(ActionEvent event)
    {
        adid2.setVisible(true);
        id1.setVisible(false);
    }
    @FXML
    void AdminResetButton(ActionEvent event) {
       AdminFirstName.setText("");
       AdminLastname.setText("");
       AdminUserName.setText("");
       AdminPassWord.setText("");
       AdminResetPassword.setText("");
    }
    //admincreatnewacccloginButton
     
    Admin ad;
    
    Manager ma;
    
    Employee em;
    //Create new Account for Autority 
    ObservableList <Authority> AuthortyCreateList = FXCollections.observableArrayList();

    
    @FXML
    void admincreatnewacccloginButton(ActionEvent event) {    
     //  id1.setVisible(true);
     // creatnewAccountadmin.setVisible(false); 
    
    
     if(AdminAug ==1)
       {
           if (AdminFirstName.getText().length()<=0 ||AdminLastname.getText().length()<=0 || AdminUserName.getText().length()<=0
                ||AdminPassWord.getText().length()<=0 || AdminResetPassword.getText().length()<=0 )
        { 
             
            JOptionPane.showMessageDialog(null,"Plase Enter Your Full Details..!!");
            
         
     }
          else if(AdminPassWord.getText().equals(AdminResetPassword.getText())){
               
           
              AuthortyCreateList.add( new Admin(
               AdminFirstName.getText(), AdminLastname.getText(),
               AdminUserName.getText(),AdminPassWord.getText(),
               AdminResetPassword.getText()));
              JOptionPane.showMessageDialog(null, "build succesful");
         }
           else
           {
               JOptionPane.showMessageDialog(null, "retype pass and Pass word can't match");
           }
       }
         
       else if(ManagerAug ==1)
           
               {
                AuthortyCreateList.add( new Manager(AdminFirstName.getText(), AdminLastname.getText(),
               AdminUserName.getText(),AdminPassWord.getText(),
               AdminResetPassword.getText()));
                   
               }
        else if(EmplyeeAug ==1)
     {
        AuthortyCreateList.add(new Employee(AdminFirstName.getText(), AdminLastname.getText(),
               AdminUserName.getText(),AdminPassWord.getText(),
               AdminResetPassword.getText()));
        
     }
     
    }
    @FXML
    void CreatenewExitButton(ActionEvent event) {
        creatnewAccountadmin.setVisible(false);  
    }
    @FXML
    void creatnewAccount1aButton(ActionEvent event) {
        creatnewAccountadmin.setVisible(true);
        adid2.setVisible(false); 
    }
    @FXML
    void ConnectingButton(ActionEvent event) {
        Connecting.setVisible(true);
 }
    @FXML
    void connectingexitButton(ActionEvent event) {
       Connecting.setVisible(false);
    }
    @FXML
    void deluxButton(ActionEvent event) {
       delux.setVisible(true);
    }
    @FXML
    void deluxexitbutton(ActionEvent event) {
       delux.setVisible(false);  
    }  
    @FXML
    void superiorExitButton(ActionEvent event) { 
        superior.setVisible(false);
    }
    @FXML
    void SuperiorButton(ActionEvent event) {  
       superior.setVisible(true);  
    }
    @FXML
    void choiceroomexitButton(ActionEvent event) {
     ChoiceYourroompan.setVisible(false);
    } 
    @FXML
    void adid2loginexitbutton(ActionEvent event) {
      adid2.setVisible(false);
    }
    @FXML
    void adid2loginButton(ActionEvent event) {
         id1.setVisible(true);
         adid2.setVisible(false);
         }
    @FXML
    void addingRoomExitButton(ActionEvent event) {
       roomdetail.setVisible(false);  
    }
    @FXML
    void wellcomadminexitbutton(ActionEvent event) {
       wellcomead.setVisible(false);
    }
    @FXML       
    void admainButton(ActionEvent event) {
      Authoritypan.setVisible(true);
        adid2.setVisible(false);
       cusld3.setVisible(false);
       id2.setVisible(false);
       wellcomead.setVisible(false);
       roomdetail.setVisible(false);
       customardetail.setVisible(false);
       regsuccessfully.setVisible(false);
     }
    @FXML
    private JFXTextField  AdminUserNmae2;
    @FXML
    private JFXPasswordField AdminUserpassword2;
    @FXML
    void adlogIn(ActionEvent event) {
         id1.setVisible(false);
         for(Authority lst : AuthortyCreateList){
        if(AdminUserNmae2.getText().equals(lst.getUser_Name()) && AdminUserpassword2.getText().equals(lst.getPassword()) ){     
             wellcomead.setVisible(true);
                   }
         else if(AdminUserNmae2.getText().equals("") && AdminUserpassword2.getText().equals("") ){
                    
             JOptionPane.showMessageDialog(null, "Please Enter User Name And Password "
                     + "R if You have No Account please Create a New Account !!!");
              id1.setVisible(true);    
         }         
        else
        {
            JOptionPane.showMessageDialog(null, "Please Enter Valid User Name or Password !!!");
            id1.setVisible(true);
        }  
        } 
    }    
    @FXML
    void addroom(ActionEvent event) {
       roomdetail.setVisible(true);
       wellcomead.setVisible(false);
       id1.setVisible(false);
       id2.setVisible(false);
    }
    @FXML
    void adexitbutton(ActionEvent event) {
       id1.setVisible(false);
    }
    @FXML
    void vewroomdetailbutton(ActionEvent event) {
       ChoiceYourroompan.setVisible(true);
       roomdetail.setVisible(false);
    }
    @FXML
    private Button Customar;
    @FXML
    private Label customarln,cun,cpass,cunf;
    @FXML
    private JFXButton cex,clogin,ref,customerexit,CustomarDetailsExit,
            cusld3login,cusld3exit,regsuccessfullyexit,Creatanewaccout,
           resetofdetail ,berofcustomarnewacc,loginofcustomarnewaccount,exitofAuthority;
    @FXML
    private AnchorPane customardetail,regsuccessfully,cusld3,customarnewaccountacpane,id2;
    @FXML 
    private JFXTextField RoomNotext,RoomTypetext;
    @FXML 
    private JFXTextField NameofCustomar,LastNameOfCustomar,AdressOfCustomar,NationalityOfCustomar
            ,CityOfCustomar,CountryOfCustomar,PhoneNuberOfCustomar,mailOfCustomar,cpassf;
   @FXML
    void exitofAuthorityButton(ActionEvent event)
            {
               Authoritypan.setVisible(false);
            }
   
    @FXML
    void resetofdetailButton(ActionEvent event) { 
      NameofCustomar.setText("");
      LastNameOfCustomar.setText("");
      AdressOfCustomar.setText("");
      NationalityOfCustomar.setText("");
      CityOfCustomar.setText("");
      CountryOfCustomar.setText("");
      PhoneNuberOfCustomar.setText("");
      mailOfCustomar.setText("");
    }
    @FXML
    private JFXButton Customarback;
    @FXML
    void CustomarBacktoButton(ActionEvent event)
    {   cusld3.setVisible(true);
        id2.setVisible(false);
    }
    @FXML
    private JFXButton  CustomarReset;
    @FXML
    private JFXTextField CustomarFirstName,CustomarLastName,CustomarUserName,CustomarPassword,CustomarRetypePassword;
    @FXML
    void CustomarResetButton(ActionEvent event) {
       CustomarFirstName.setText("");
       CustomarLastName.setText("");
       CustomarUserName.setText("");
       CustomarPassword.setText("");
       CustomarRetypePassword.setText("");
    }
    int foriencustomar;
    int localCustomar;
    ForeignCustomar fc;
    Local_Customar lc;
    @FXML
    void loginofcustomarnewaccountButton(ActionEvent event) { 
           if(foriencustomar ==1){
            fc = new ForeignCustomar(CustomarFirstName.getText(), CustomarLastName.getText(), 
               CustomarUserName.getText(),CustomarPassword.getText(),CustomarRetypePassword.getText());
            
        }
        else if (localCustomar ==1)
       {
               lc = new Local_Customar(CustomarFirstName.getText(), CustomarLastName.getText(), 
               CustomarUserName.getText(),CustomarPassword.getText(),CustomarRetypePassword.getText());
              
        }
           customarnewaccountacpane.setVisible(false);  
           id2.setVisible(true);
    }
    @FXML
    void xberofcustomarnewaccButton(ActionEvent event) {
          customarnewaccountacpane.setVisible(false);  
    }
    @FXML
    void CreatanewaccoutButton(ActionEvent event) {
          customarnewaccountacpane.setVisible(true);
           cusld3.setVisible(false);
    }
    @FXML
    void regsuccessfullyexitButtton(ActionEvent event) {
        regsuccessfully.setVisible(false);
    }
    @FXML
    void cusld3exitButton(ActionEvent event) {
        cusld3.setVisible(false);
    }
    @FXML
    void cusld3loginButton(ActionEvent event) {
         id2.setVisible(true);
         cusld3.setVisible(false);          
    }
    @FXML
    void CustomarDetailsExitButton(ActionEvent event) {
       customardetail.setVisible(false);
    }
    @FXML
    void CustomarButton(ActionEvent event) {
         cusld3.setVisible(true);
         adid2.setVisible(false);
         id1.setVisible(false);
         wellcomead.setVisible(false);
         roomdetail.setVisible(false);
         customardetail.setVisible(false);
         regsuccessfully.setVisible(false);      
   }
    @FXML
    private JFXTextField Customarusername2;
    @FXML
    private JFXPasswordField Customarpasswordtest2;
    @FXML
    void cloginbuttons(ActionEvent event) {
          id2.setVisible(false);  
        if(Customarusername2.getText().equals("x") && Customarpasswordtest2.getText().equals("1") ){
            JOptionPane.showMessageDialog(null, "You Loged in successful !!!");
             customardetail.setVisible(true);
        }
        else if(Customarusername2.getText().equals("") && Customarpasswordtest2.getText().equals(""))
                {   JOptionPane.showMessageDialog(null, "Please Enter User Name And Password !!!");
                       id2.setVisible(true);
                }
        else{
            JOptionPane.showMessageDialog(null, "Please Enter Valid User Name or Password !!!");
            id2.setVisible(true);
        }
    }
    @FXML
    void CustomarExitButton(ActionEvent event) { 
        id2.setVisible(false);
    }
    //date ::27-11-16..
    @FXML
    void RegisterButton(ActionEvent event) {
       regsuccessfully.setVisible(true);
       customardetail.setVisible(false);
       roomdetail.setVisible(false);
       customardetail.setVisible(false);
      }
    @FXML public ComboBox<String> BedType;
    ObservableList <String> list = FXCollections.observableArrayList("Single","Double","Family");
    @FXML public ComboBox<String> City;
    ObservableList <String> list1 = FXCollections.observableArrayList("Dhaka","Barisal","Bogura","Chitagong");
    @FXML public ComboBox<String> RoomType;
    ObservableList <String> list2 = FXCollections.observableArrayList("AC","Non Ac","Warm");
    @FXML public ComboBox<String> EnterCity;
    ObservableList <String> list3 = FXCollections.observableArrayList("Dhaka","Barisal","Bogura","Chitagong");
   
    
     @FXML public ComboBox<String> Age;
    ObservableList <String> list4 = FXCollections.observableArrayList("10","11","13","14","15","16","17","18","19","20","21"
    ,"22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46",
    "47","48","49","50","51","52","53","54","55","56","57","58","59","60");
   
    @FXML
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        BedType.setItems(list);
        City.setItems(list1);
        RoomType.setItems(list2);
        EnterCity.setItems(list3);
        Age.setItems(list4);
    }    
}
