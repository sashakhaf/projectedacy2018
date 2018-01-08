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
public class TalentForeign extends Talent{
    private String country_of_origin;
    public TalentForeign(String nam, String fstnme, int ag, String levl, String spcourse,String origin) {
        super(nam, fstnme, ag, levl, spcourse);
        country_of_origin=origin;
    }
    String getCountryOfOrigin(){
        return country_of_origin;
    }
    
    void printTalent(){
        super.printTalent();
        System.out.println("Country of origin: "+getCountryOfOrigin());
    }
    
    
    
}
