package video_rental.inventory;

import video_rental.material.*;

/**
 * This class provides multiple Methods to building an inventory.
 * This class creats a inventoty and reviws them by Explicit Label and by genre.
 * 
 * @author Altin Nimanaj.
 * @version 2022 Mai 02
 */
public class Inventory {
    /**
     * Is an array representing the inventory.
     * @author Altin Nimanaj.
     */
    DVD inventarDVD[] = new DVD[10];
    /**
     * Is an array representing the inventory.
     * @author Altin Nimanaj.
     */
    CD inventarCD[] = new CD[10];
    /**
     * Is the length of the inventory.
     * @author Altin Nimanaj.
     */
    private final static int l = 10;
    /**
     * This method add's a DVD's to the inventory.
     * Iterates over the customer's inventory and searches for 
     *  null in the index of the inventory. If found, the DVD will be 
     *  saved there.
     * 
     * @author Altin Nimanaj.
     * @param item is a DVD.
     */
    public void addDVD(DVD item){
        for(int i = 0; i < l; i++){
            if(inventarDVD[i] == null){
                inventarDVD[i] = item;
                break;
            }
        }
    }
    /**
     * Getter for inventDVD.
     * 
     * @author Altin Nimanaj.
     * @return inventarDVD.
     */
    public DVD[] getDVDs(){
        return inventarDVD;
    }
    /**
     * This method add's a CD's to the inventory.
     * Iterates over the customer's inventory and searches for 
     *  null in the index of the inventory. If found, the CD will be 
     *  saved there.
     * @author Altin Nimanaj.
     * @return
     */
    public void addCD(CD item){
        for(int i = 0; i < l; i++){
            if(inventarCD[i] == null){
                inventarCD[i] = item;
                break;
            }
        }
    }
    /**
     * Getter for inventCDs.
     * 
     * @author Altin Nimanaj.
     * @return inventarCD.
     */
    public CD[] getCDs(){
        return inventarCD;
    }
    /**
     * Prints the invntory.
     * Iterates over the DVD and CD arrays and stores everything in a string.
     * 
     * @author Altin Nimanaj.
     * @return a string that is build from the DVD's and CD's from the 
     *  customer's inventory 
     */
    public String str(){   

        String str = "Inventar:\nDVDs\n";
        
        for(int i = 0; i < l; i++){
            if(inventarDVD[i] == null){
                break;
            }
            String result = inventarDVD[i].str();
            str += " " + result + "\n";
        }

        str += "\nCDs\n";
        for(int i  = 0; i < l; i++){
            if(inventarCD[i] == null){
                break;
            }
            String result = inventarCD[i].str();
            str += " " + result + "\n";
        }
        return str;
    }
}