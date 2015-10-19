package test;

/**
 * Created by klieart on 9/25/15.
 */
public class Palindrome {

    // Validate if given string is a palindrome
    public boolean validate( String string ){

        int i = 0, j=string.length()-1;

        // Iterate as long as the indices don't intersect
        while( i < j ) {
            System.out.println("s["+i+"]="+string.charAt(i)+"; s["+j+"]="+string.charAt(j));

            // If for whatever reason the values at i and j are not symmetric, then return false
            if (string.charAt(i) != string.charAt(j)) { return false; }

            // Shift indices: i to right, j to left
            i++; j--;
        }
        // If the string survives the validation above, then it must be a palindrome
        return true;
    }

    // Build palindrome from given string; default is even
    public String build( String string ){
        return build( string, true );
    }

    // Build palindrome from given string; specify if even or odd
    public String build( String string, boolean isEven ){

        // If even, use all elements; otherwise, exclude last element
        int l = string.length();
        if(!isEven){ l--; }

        // Build inverted string
        String gnirts = new StringBuilder(string.substring(0,l)).reverse().toString();

        // Return combined strings
        return  string + gnirts;
    }
}
