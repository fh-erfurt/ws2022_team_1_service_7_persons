import java.util.regex.Pattern;

public class Utils {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public static final Pattern VALID_PHONE_NUMBER = Pattern.compile("(\\(?([\\d \\-)–+/(]+){6,}\\)?([ .\\-–/]?)([\\d]+))", Pattern.CASE_INSENSITIVE);
    public static final Pattern VALID_FAX = Pattern.compile("^\\+?[0-9]+$", Pattern.CASE_INSENSITIVE);

    /**
     * Checks the provided string if it is a valid phone number.
     *
     * @param phone {String} - The phone number which should get checked
     *
     * @return {boolean} - True if the phone number is valid, false instead.
     */
    public static boolean checkPhone(String phone) { return VALID_PHONE_NUMBER.matcher(phone).find(); }

    /**
     * Checks the provided string if it is a valid fax number.
     *
     * @param fax {String} - The fax number which should get checked
     *
     * @return {boolean} - True if the fax number is valid, false instead.
     */
    public static boolean checkFax(String fax) { return VALID_FAX.matcher(fax).find();}

    /**
     * Checks the provided string if it is a valid email address.
     *
     * @param email {String} - The email which should get checked
     *
     * @return {boolean} - True if the email is valid, false instead.
     */
    public static boolean checkEmail(String email) { return VALID_EMAIL_ADDRESS_REGEX.matcher(email).find(); }

}
