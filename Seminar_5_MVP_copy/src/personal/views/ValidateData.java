package personal.views;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateData {
    String patternName = "^\\S+$";
    Pattern patternN = Pattern.compile(patternName, Pattern.MULTILINE);
    public boolean checkFirstName(String firstName){
        Matcher matcher = patternN.matcher(firstName);
        return !matcher.find();
    }
    public boolean checkLastName(String lastName){
        Matcher matcher = patternN.matcher(lastName);
        return !matcher.find();
    }
    String patternPhone = "^\\+34\\d{3}$";
    Pattern patternP = Pattern.compile(patternPhone);
    public boolean checkPhone(String phoneNumber) {
        Matcher matcher = patternP.matcher(phoneNumber);
        return !matcher.find();

    }
}
