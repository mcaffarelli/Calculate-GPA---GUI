
package com.csc600.classgrades;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ClassGradesController {
    //Variables
    double total = 0.0; 
    double average;
    //Counter needs to be -1 because sentinal value will trigger counter++
    double counter = -1;
    //Boolean Variable will be == false until sentinal value is entered by user.
    boolean sentinal = false;
    
    
    @FXML
    private TextField gradeText;

    @FXML
    private Button nextButton;

    @FXML
    private TextField gpaText;
    
    @FXML
    private Button closeButton;

    @FXML
    void NextButtonPressed(ActionEvent event) 
    { 
        
        counter++; //Counts Number of User Grades Entered
        
        String user = gradeText.getText(); // User = valued entered by user
        while (sentinal == false) //While sentinal is false-> keep looping
        {
        switch(user.toUpperCase()) //Read user inuput and change to uppercase
        {
            case "A+" :  
                total = total + 4.0; //Add Total + 4.0 fpr A Grade
                gradeText.clear(); //Clear so user can enter new Grade
                break; //Get out of Switch Statement
            case "A" :
                total = total + 4.0;
                gradeText.clear(); //Clear so user can enter new Grade
                break; //Get out of Switch Statement
            case "A-" :
                total = total + 3.7; 
                gradeText.clear(); //Clear so user can enter new Grade
                break; //Get out of Switch Statement
            case "B+" :
                total = total + 3.3; 
                gradeText.clear(); //Clear so user can enter new Grade
                break; //Get out of Switch Statement
            case "B" :
                total = total + 3.0; 
                gradeText.clear();//Clear so user can enter new Grade
                break; //Get out of Switch Statement
            case "B-" :
                total = total + 2.7; 
                gradeText.clear(); //Clear so user can enter new Grade
                break; //Get out of Switch Statement
            case "C+" :
                total = total + 2.3; 
                gradeText.clear(); //Clear so user can enter new Grade
                break; //Get out of Switch Statement 
            case "C" :
                total = total + 2.0; 
                gradeText.clear(); //Clear so user can enter new Grade
                break; //Get out of Switch Statement  
            case "C-" :
                total = total + 1.7; 
                gradeText.clear(); //Clear so user can enter new Grade
                break; //Get out of Switch Statement 
            case "D+" :
                total = total + 1.3; 
                gradeText.clear(); //Clear so user can enter new Grade
                break; //Get out of Switch Statement  
            case "D" :
                total = total + 1.0; 
                gradeText.clear(); //Clear so user can enter new Grade
                break; //Get out of Switch Statement
            case "D-" :
                total = total + 0.7; 
                gradeText.clear(); //Clear so user can enter new Grade
                break; //Get out of Switch Statement 
            case "F" :
                total = total + 0.0; 
                gradeText.clear(); //Clear so user can enter new Grade
                break;  //Get out of Switch Statement 
            case "-1" :
                average = (total/counter); //Calculate Average
                gpaText.setText(String.valueOf(average)); //Set Average to String and Display
                gradeText.clear(); //Clear so user can enter new Grade
                sentinal = true; //Change Sentinal to True to end user inputs
                break; //Get out of Switch Statement  
            default: gradeText.setText("Try Again"); //If bad value is entered
                                                     //instructs user to try again.
        }
        break; //Get out of While Loop
        }  
        } 
    
    @FXML
    void CloseButtonPressed(ActionEvent event) {
    Platform.exit();
    }    
    
    }
    
    
 
