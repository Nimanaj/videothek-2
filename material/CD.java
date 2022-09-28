package video_rental.material;

/**
 * This class provides multiple Methods to borrow a CD.
 * This class creats Cd's and reviws them by Explicit Label and by genre.
 * 
 * @author Altin Nimanaj
 * @version 2022 Mai 02
 */

public class CD {
    /** The title of a DVD is  given over. 
     * @autor Altin Nimanaj.
    */
    String titel = "";
    /** The rental price is given over. 
     * @autor Altin Nimanaj.
    */
    double verleihpreis = 0.00;
    /** Whether the DVD is on offer. false for is not and true is yes is in sale 
     * @autor Altin Nimanaj.
    */
    boolean angebot = false;
    /** The sale price is given over. 
     * @autor Altin Nimanaj.
    */
    double rabattpreis = 0.00;

    /** Is for the Class Customer.Says whether borrowed or not false for not and true for yes is borrowed 
     * @autor Altin Nimanaj.
    */
    public boolean ausgeliehen = false;
    /**
     * Says whether the CD has a label or not.
     * @autor Altin Nimanaj.
     */
    public boolean bool = false;

    MusicGenre genre;

    public enum MusicGenre{
        RAP,
        POP,
        CLASSIK,
        TECHNO;
        /**
         * This method searches for the genre
         * This method goes beyond the cases and decides which one is chosen.
         * 
         * @author  Altin Nimanaj.
         * @return  a format String
         */
        public String strGenre(){
            switch(this){
                case RAP:
                    return String.format("Das Genre ist Rap");
                case POP:
                    return String.format("Das Genre ist Pop");
                case CLASSIK:
                    return String.format("Das Genre ist Classik");
                case TECHNO:
                    return String.format("Das Genre ist Techno");
                default:
                    return String.format("Das muss eine CD sein, bei dem wir das Genre nicht kennen");
            }
        }

    };
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
    public CD(String t, double v, boolean a, double r, boolean bool, MusicGenre genre){
        titel = t;
        verleihpreis = v;
        angebot = a;
        rabattpreis = r;
        this.bool = bool;
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
            return String.format("[DVD: " + titel + ", %.2f EUR]",verleihpreis);
        }
    }
    /**
     * Checks by bool.
     * Checks the bool for true or false.
     * 
     * @autor Altin Nimanaj.
     * @return true if bool is true otherwise false.
     */
    public boolean istExplicitLabel(){
        if(this.bool){
            return true;
        } else {
            return false;
        }
    }
    /**
     * Checks by bool for a string.
     * Checks the bool for true or false and givs the associated string.
     * 
     * @autor Altin Nimanaj.
     * @return the associated string.
     */
    public String strEL(){
        if(this.bool){
            return String.format("Du kannst es ausleihen");
        } else {
            return String.format("Du bist zu jung");
        }
    }
    /**
     * Getter for genre.
     * 
     * @author Altin Nimanaj.
     * @return genre.
     */
    public MusicGenre getGenre(){
        return genre;
    }
}
