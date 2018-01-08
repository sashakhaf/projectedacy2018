/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talent;
import talent.Talent;
import talent.TalentForeign;


/**
 *
 * @author aicha
 */
public class School {
      private static int maxsize_of_talent=200;
      private  Talent tab[];
      private int sizes;
      private String nameOfSchool;
      School(String names){
          nameOfSchool=names;
          sizes=0;
          tab = new Talent[maxsize_of_talent];          
      }
      String getNameOfSchool(){
          return nameOfSchool;
      }
      void addTalent(Talent a ){ 
          if(sizes<maxsize_of_talent)
          tab[sizes++]=a;
          else
              System.out.println("Can't add talent:you have reatched the max size of the array");
      }
      void printSchool(){
          System.out.println("Talent of School "+getNameOfSchool()+"\n***************************************");
          for(int i=0;i<sizes;i++)
             tab[i].printTalent();
      }
     public static void main(String[] args) {
        // TODO code application logic here
    Talent t1=new Talent("Ndoye","Aissatou",23,"Master 2","Computer Science");
    Talent t2=new TalentForeign("Thior","Fadel",22,"Master 2","Computer Science","USA");
    Talent t3=new Talent("Gomis","Joseph",25,"Master 1","Sociology");
    Talent t4=new TalentForeign("Young","Patric",21,"Licence 1","Computer Science","China");
    Talent t5=new Talent("Ndiaye","Antoine",22,"Licence 3","mathmatics");
    Talent t6=new TalentForeign("Fall","Fatou",20,"Licence 2","Computer Science","SENEGAL");
    School s=new School("EDACY");
    s.addTalent(t1);
    s.addTalent(t2);
    s.addTalent(t3);
    s.addTalent(t4);
    s.addTalent(t5);
    s.addTalent(t6);
    s.printSchool();
 
    }
}
