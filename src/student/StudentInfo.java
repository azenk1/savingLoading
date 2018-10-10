/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author azenk
 */
public class StudentInfo {
    
    private String name;
    private double  gpa;
    
    public StudentInfo(String name, double gpa)
    {
        this.name = name;
        this.gpa = gpa;
    }
    
    public StudentInfo()
    {
        name = "John";
        gpa = 3.20;
    }
    
    public void save(String fileName) throws IOException
    {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(this);
        oos.flush();
        oos.close();
    }
    
    public static StudentInfo load(String fileName)
    throws IOException, ClassNotFoundException
    {
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        StudentInfo sif = (StudentInfo) ois.readObject();
        ois.close();
        
        return sif;
    }
}
