import java.util.regex.*;

public class RegEx {
    public static void main(String[] args) {

        // ----- Java Regular Expressions
        // A regular expression is a sequende of characters that forms a search pattern. 
        // When you search for data in a text, you can use this search pattern to describe what you are searching for
        // A regular expression can be used to perform all types of text search and text replace operations.

        Pattern pattern = Pattern.compile("CH[^aeiou]NDAN", Pattern.CASE_INSENSITIVE);
        Pattern pattern2 = Pattern.compile("chondan{2}", Pattern.LITERAL);
        // First, the pattern is created using the Pattern.compile() method. The first parameter indicates which pattern is being searched for 
        // and the second parameter has a flag to indicates that the search should be case-insensitive. The second parameter is optional
        // - pattern.LITERAL -> Special characters in the pattern will not have any special meaning and will be treated as ordinary characters when performing a search.
        // - pattern.UNICODE_CASE -> Use it together with the CASE_INSENSITIVE flag to also ignore the case of letters outside of the English alphabet
        Matcher matcher = pattern.matcher("chondan susuwan");
        Matcher matcher2 = pattern2.matcher("chondan{2} susuwan");
        boolean matchFound = matcher.find();
        boolean matchFound2 = matcher2.find();
        if (matchFound) {
            System.out.println("Match Found");
        } else {
            System.out.println("Match not found");
        }
        if (matchFound2) {
            System.out.println("Match Found");
        } else {
            System.out.println("Match not found");
        }   
    }
    
}