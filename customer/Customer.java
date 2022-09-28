package video_rental.customer;

import video_rental.material.*;

/**
 * This class provides multiple Methods to building a customer.
 * This class creats a customer and checks his inventory for borrowd items.
 * 
 * @author Altin Nimanaj
 * @version 2022 Mai 02
 */
public class Customer {
    /**
     * Is the  firsr name of a customer.
     * @author Altin Nimanaj.
    */
    String vorname = "";
    /**
     * Is the  surename of a customer.
     * @author Altin Nimanaj.
    */
    String nachname = "";
    /**
     * Is the age of the customer.
     * @author Altin Nimanaj.
     */
    int alter = 0;
    /**
     * Is the ID of the customer.
     * @auther Altin Nimanaj.
     */
    int kundennummer = 0;
    /**
     * Is the DVD inventory of the customer.
     * @author Altin Nimanaj.
     */
    DVD kundenDvd[] = new DVD[10];
    /**
     * Is the CD inventory of the customer.
     * @author Altin Nimanaj.
     */
    CD kundenCD[] = new CD[10];
    /**
     * Is the capacity of the inventory from the customer.
     * @author Altin Nimanaj.
     */
    private final static int l = 10;
    /**
     * Is the start point for the ID's (Kundennummern).
     * @author Altin Nimanaj.
     */
    public static int generieren = 0;
    /**
     * Is the old where one is of legal age.
     * @author Altin Nimanaj.
     */
    private final static int volljeahrig = 18; 
    /**
     * Is the cunstructor.
     * Taks the params and stors them to there variables.
     * 
     * @author Altin Nimanaj.
     * @param vorname first name.
     * @param nachname surename.
     * @param alter age.
     */
    public Customer(String vorname, String nachname, int alter){
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        generieren();
    }
    /**
     * Generates the ID.
     * Uses the variable geenerieren and sets for the customer.
     *  Then generate increases by 1.
     * 
     * @author Altin Nimanaj.
     */
    private void generieren(){
        this.kundennummer = generieren;
        generieren ++;
    }
    /**
     * Getter for the name.
     * 
     * @author Altin Nimanaj.
     * @return first and surename
     */
    public String getName(){
        return vorname + " " + nachname;
    }
    /**
     * Getter for the age.
     * 
     * @author Altin Nimanaj.
     * @return age;
     */
    public int getAlter(){
        return alter;
    }
    /**
     * Getter for ID.
     * 
     * @author Altin Nimanaj.
     * @return kundennummer.
     */
    public int getKundennummer(){
        return kundennummer;
    }
    /**
     * Setter for surename.
     * givs the surename the new surename.
     * 
     * @author Altin Nimanaj.
     * @param neuerNachname the new surename.
     */
    public void setNachname(String neuerNachname){
        this.nachname = neuerNachname;
    }
    /**
     * Setter for the age.
     * Set the age to the new age.
     * 
     * @author Altin Nimanaj.
     * @param neuesAlter the new age.
     */
    public void setAlter(int neuesAlter){
        this.alter = neuesAlter;
    }
    /**
     * Controls the borrowing of a DVD.
     * First it is checked whether the age and the item can be borrowed. 
     *  The status of this DVD is set to borrowd and stored in the customer's inventory.
     * 
     * @author Altin Nimanaj.
     * @param item is a DVD.
     */
    public void ausleihenDVD(DVD item){
        if((!item.ausgeliehen) && item.alter(alter)){
            item.ausgeliehen = true;
            System.out.println("Sie haben das ausgeliehen.");
            for(int i = 0; i < l; i++){
                if(kundenDvd[i] == null){
                    kundenDvd[i] = item;
                    break;
                }
            }
        }
    }
    /**
     * A DVD is returned to inventory.
     * It is checked whether the customer owns the DVD. 
     * If the customer has the DVD then the status of the DVD is set 
     * to borrowable and the customer loses the DVD.
     * 
     * @author Altin Nimanaj
     * @param item
     */
    public void zurueckGebenDVD(DVD item){
        for(int i = 0; i < l; i++){
            if(kundenDvd[i] == item) {
                item.ausgeliehen = false;
                kundenDvd[i] = null;
                break;
            }
        }
    }
    /**
     * Controls the borrowing of a CD.
     * First it is checked whether the age and the item can be borrowed. 
     *  The status of this CD is set to borrowd and stored in the customer's inventory.
     * 
     * @author Altin Nimanaj
     * @param item is a CD.
     */
    public void ausleihenCD(CD item){
        if(!item.ausgeliehen){
            if(item.istExplicitLabel() && volljeahrig > alter){
               System.out.println("Du bist zu jung.");             
            } else {
                item.ausgeliehen = true;
                System.out.println("Sie haben es jetzt ausgeliehen, da Sie alt genug sind!");
                for(int i = 0; i < l; i++){
                    if(kundenCD[i] == null){
                        kundenCD[i] = item;
                        break;
                    }
                }
            } 
        }
    }
    /**
     * A Cd is returned to inventory.
     * It is checked whether the customer owns the CD. 
     * If the customer has the CD then the status of the CD is set 
     * to borrowable and the customer loses the CD.
     * 
     * @author Altin Nimanaj
     * @param item is a CD
     */
    public void zurueckGebenCD(CD item){
        for(int i = 0; i < l; i++){
            if(kundenCD[i] == item) {
                item.ausgeliehen = false;
                kundenCD[i] = null;
                break;
            }
        }
    }


}
