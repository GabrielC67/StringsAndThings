package io.zipcoder;


import java.util.ArrayList;
import java.util.Arrays;

import static org.apache.maven.shared.utils.StringUtils.split;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        int y = 0;

        String[] inputSplt = input.split(" ");
        char targetY = 'y', targetZ = 'z';
        int counter = 0;
        for(String i : inputSplt){
            if(i.length() > 0) {
                char lstChr = i.charAt(i.length() - 1);
                if (lstChr == targetY || lstChr == targetZ){
                    counter++;
                }
            }
        }
        return counter; //Return Integer 2

    }



    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {

        String newWrd = base.replace(remove, ""); /*This method takes base parameter, replaces anything that gets plugged into"
        "remove" parameter with "". */
        return newWrd;
        //expecting String as result. Make sure to convert the result back to string.
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {

       int is = 0, not = 0;
        int i = 0, n = 0, o = 0;
        for(int counter = 0; counter < input.length() - 1; counter++){
            if (input.charAt(counter) == 'i'){
                i = counter;
                i++;
                if(input.charAt(i) == 's'){
                    is++;
                }
            }
            if(input.charAt(counter) == 'n'){
                n = counter;
                n++;
                if(input.charAt(n) == 'o'){
                    o = n;
                    o++;
                    if(input.charAt(o) == 't'){
                        not++;
                    }
                }
            }
        }
        return not == is; //Must return a boolean
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
    /* I'm thinking the best thing to do is use a counter to find out if the g is next to another g. If not, then I'll say fales.*/
        int count = 0;



        return null; //counter > 0;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     * countTriple("xxxabyyyycd") // Should return 3
     * countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        return null;
    }
}


