/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talent;

/**
 *
 * @author aicha
 */
public class Talent {
    private String name;
    private String first_name; 
    private int age;
    private String level;
    private String specialization_course;
    
    public Talent(String nam,String fstnme,int ag,String levl,String spcourse)
    {
        name=nam;
        first_name=fstnme;
        age=ag;
        level=levl;
        specialization_course=spcourse;
    }
    String getName(){
        return name;
    }
    String getFirstName(){
        return first_name;
    }
    int getAge(){
        return age;
    }
    String getLevel(){
            return level;
    }
    String getSpecializationCourse(){
        return specialization_course;
    }
    void  printTalent(){
        System.out.print("Name: "+getName()+"\n First Name: "+getFirstName()+"\n Age: "+getAge()+"\n Level: "+getLevel()+"\n Specialization course: "+getSpecializationCourse()+"\n");
    }
    
    /**
     * @param args the command line arguments
     */
   
    
}
