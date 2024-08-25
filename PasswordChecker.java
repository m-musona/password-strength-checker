import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PasswordChecker {
    PasswordChecker() {
        errorList = new ArrayList<>();
    }
    boolean hasCapital(String enteredPassword)
    {
        List<Character> capitalList = new ArrayList<>();
        // Loop through the capital letters A to Z and add them to the list
        for (char ch = 'A'; ch <= 'Z'; ch++) 
        {
            capitalList.add(ch);
        }
        for (int i = 0; i < enteredPassword.length(); i++)
        {
            if (capitalList.contains(enteredPassword.toCharArray()[i]))
                return true;
        }
        return false;
    }
    boolean hasNumericalValue(String enteredPassword)
    {
        List<Character> numericalValueList = new ArrayList<>();
        // Loop through the capital numbers 0 to 9 and add them to the list
        for (char ch = '0'; ch <= '9'; ch++) 
        {
            numericalValueList.add(ch);
        }
        for (int i = 0; i < enteredPassword.length(); i++)
        {
            if (numericalValueList.contains(enteredPassword.toCharArray()[i]))
                return true;
        }
        return false;
    }
    boolean hasSpecialCharacter(String enteredPassword)
    {
        List<Character> specialCharacters = Arrays.asList(
        '+', '-', '*', '/', '%',
            '=', '!',
            '<', '>',
            '!', '&', '|', '^',
            '~',
            '*', '/', '%',
            '?',
            '{', '}', '[', ']', '(', ')',
            ';', ',', '.', ':',
            '@', '$',
            '#'
        );
        for (int i = 0; i < enteredPassword.length(); i++)
        {
            if (specialCharacters.contains(enteredPassword.toCharArray()[i]))
                return true;
        }
        return false;
    }
    boolean hasWhiteSpaces(String enteredPassword)
    {
        List<Character> whiteSpaces = new ArrayList<>(Arrays.asList(
            ' ', '\t', '\n', '\r', '\f'    // Whitespace characters
        ));
        for (int i = 0; i < enteredPassword.length(); i++)
        {
            if (whiteSpaces.contains(enteredPassword.toCharArray()[i]))
                return true;
        }
        return false;
    }
    void CheckForErrors(String enteredPassword)
    {
        errorList.clear();
        if (enteredPassword.length() < 8)
            errorList.add("Password Should Be At Least 8 Characters Long");
        if (!hasCapital(enteredPassword))
            errorList.add("Password Must Have At Least 1 Capital Letter");
        if (!hasNumericalValue(enteredPassword))
            errorList.add("Password Must Have At Least 1 Numeric Value");
        if (!hasSpecialCharacter(enteredPassword))
            errorList.add("Password Must Have At Least 1 Special Character");
        if (hasWhiteSpaces(enteredPassword))
            errorList.add("Password Must Have No White Spaces");
    }
    List<String> GetErrors(){ return errorList; }

    private List<String> errorList;
}
