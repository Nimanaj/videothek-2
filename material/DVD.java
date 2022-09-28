package video_rental.material;

/**
 * This class provides multiple Methods to borrow a DVD.
 * This class creats DVD's and reviws them by FSK rating and by genre.
 * 
 * @author Altin Nimanaj.
 * @version 2022 Mai 02.
 */

public class DVD {
    /** The title of a DVD is  given over. 
     * @autor Altin Nimanaj.
    */
    String titel = "";
    /** The rental price is given over. 
     * @autor Altin Nimanaj.
    */
    double verleihpreis = 0.0;
    /** Whether the DVD is on offer. false for is not and true is yes is in sale 
     * @autor Altin Nimanaj.
    */
    boolean angebot = false;
    /** The sale price is given over. 
     * @autor Altin Nimanaj.
    */
    double rabattpreis = 0.0;

    /** Is for the Class Customer.Says whether borrowed or not false for not and true for yes is borrowed 
     * @autor Altin Nimanaj.
    */
    public boolean ausgeliehen = false;

    public enum FSKRating {
        FSKZERO, 
        FSKSIX,
        FSKTWELVE, 
        FSKSIXTEEN, 
        FSKEIGHTEEN
    };

    public enum MoviGenre{
        AKTION,
        ROMANTIK,
        ANIMATION,
        Fantasy;

    /**
     * This method searches for the genre
     * This method goes beyond the cases and decides which one is chosen.
     * 
     * @author  Altin Nimanaj.
     * @return  a format String
     */
    public String strGenre(){
        switch(this){
            case AKTION:
                return String.format("Das ist ein Aktionfilm");
            case ROMANTIK:
                return String.format("Das ist ein Romantikfilm");
            case ANIMATION:
                return String.format("Das ist ein Animationsfilm");
            case Fantasy:
                return String.format("Das ist ein Fantasyfilm");
            default:
                return String.format("Das muss ein Film sein, bei dem wir das Genre nicht kennen");
        }
    }


    };

    /** Stors an element of FSKRating for the Method strFSK(). 
     * @autor Altin Nimanaj.
    */
    FSKRating fsk;
    /** Stors an element of MovieGenre for the Method strGenreDVD(). 
     * @autor Altin Nimanaj.
    */
    MoviGenre genre;


    /**
     * Setter for title.
     * Set the title to a new title.
     * 
     * @autor Altin Nimanaj.
     * @param t is a new title.
     */
    public void setTitel(String t){
        titel = t;
    }
    /**
     * Setter for rental price.
     * Set the rental price to a new price. 
     * 
     * @autor Altin Nimanaj.
     * @param v is the new rental price.
     */
    public void setVerleihpreis(double v){
        verleihpreis = v;
    }
    /**
     * Setter for sale.
     * Set the offer on sale or not.
     * 
     * @autor Altin Nimanaj.
     * @param a is the new offer.
     */
    public void setAngebot(boolean a){
        angebot = a;
    }
    /**
     * Setter for sale price.
     * set a new price for sale price.
     * 
     * @autor Altin Nimanaj.
     * @param r is the new sale price.
     */
    public void setRabattpreis(double r){
        rabattpreis = r;
    }
    /**
     * Is the constructor.
     * Creats a DVD.
     * 
     * @autor Altin Nimanaj.
     * @param t is the title.
     * @param v is the price.
     * @param a is the offer.
     * @param r is the sale price.
     * @param fsk   is the FSK rating.
     * @param genre is the movi genre.
     */
    public DVD(String t, double v, boolean a, double r, FSKRating fsk, MoviGenre genre){
        titel = t;
        verleihpreis = v;
        angebot = a;
        rabattpreis = r;
        this.fsk = fsk;
        this.genre = genre;

    }
    /**
     * Getter for title.
     * 
     * @autor Altin Nimanaj.
     * @return  title.
     */
    public String getTitle(){
        return titel;
    }
    /**
     * Getter for price.
     * This method asks for the offer and decides back on the price.
     * 
     * @autor Altin Nimanaj.
     * @return  the price.
     */
    public double getPrice(){
        if(angebot){
            return rabattpreis;
        }else{
            return verleihpreis;
        }
    }    
    /**
     * This method printing the DVD's.
     * This mathod asks for the offer and decids back on the given Strings.
     * 
     * @autor Altin Nimanaj.
     * @return  format String.
     */
    public String str(){
        
        if(angebot){
            return String.format("[DVD: " + titel + ", %.2f EUR]",rabattpreis);
        } else {
            return  String.format("[DVD: " + titel + ", %.2f EUR]",verleihpreis);
        }
    }
    /**
     * This method printing the FSK age.
     * This method goes beyond the cases and decides which one is chosen.
     * 
     * @autor Altin Nimanaj.
     * @return  format String.
     */
    public String strFSK(){
        switch(fsk){
            case FSKEIGHTEEN:
                return String.format("18");
            case FSKSIXTEEN:
                return String.format("16");
            case FSKTWELVE:
                return String.format("12");
            case FSKSIX:
                return String.format("6");
            case FSKZERO:
                return String.format("0");
            default:
                return String.format("Bruder du lebst nicht");
        }

    }
    /**
     * This method looks for the age.
     * This method goes beyond the cases and decides which one is chosen.
     * 
     * @autor Altin Nimanaj.
     * @param fsk is used to check the cases.
     * @return  the age that matches the fsk.
     */
    public int toInt(FSKRating fsk){
        switch (fsk){
            case FSKEIGHTEEN:
                return 18;
            case FSKSIXTEEN:
                return 16; 
            case FSKTWELVE:
                return 12;
            case FSKSIX:
                return 6;
            case FSKZERO:
                return 0;
            default:
                return -1;
        }
    }
    /**
     * This method checks whether the age corresponds to the FSK-age.
     * This method gets a parameter passed and gets the FSk from the 
     *  DVD calling this function.Then this method compares those based on age.
     * 
     * @autor   Altin Nimanaj.
     * @param old Is the age of a customer.
     * @return  True if age is greater than or equal to newFSK otherwise not.
     */
    public boolean alter(int old){
        int newFSK = toInt(fsk);

        if(newFSK <= old){
            return true;
        }
        return false;
        
    }
    /**
     * Setter for the borrowing.
     * Set the boolean to a new boolean.
     * 
     * @autor Altin Nimanaj.
     * @param ausgeliehen   is a boolean that modifies the variable ausgeliehen.
     */
    public void setAusgeliehen(boolean ausgeliehen){
        this.ausgeliehen = ausgeliehen;
    }
    /**
     * Getter for ausgeliehen.
     * 
     * @author Altin Nimanaj.
     * @return ausgeliehen.
     */
    public boolean getAusgeliehen(){
        return this.ausgeliehen;
    }
    /**
     * Getter for fsk.
     * 
     * @author Altin Nimanaj.
     * @return fsk.
     */
    public FSKRating getFSk(){
        return fsk;
    }
    /**
     * Getter for genre.
     * 
     * @author Altin Nimanaj.
     * @return genre.
     */
    public MoviGenre getGenre(){
        return genre;
    }
}
