/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.io.IOException;
import java.io.Serializable;
/**
 *
 * @author azenk
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        StudentInfo stud = new StudentInfo("Al", 3.33);
        stud.save("C:\\Users\\azenk\\Documents");
    }
    

    
}
