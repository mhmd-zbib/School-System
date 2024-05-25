package utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;


/**
 * General encryption services to use from for hashing
 */
public class EncryptionUtils {

    //password hash
    public static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256"); // MessageDigest is a class for encryption we pick the encryption we want
            byte[] hashByte = md.digest(password.getBytes()); // Turning the password to byte code and saving it as an arrya in bytes
            return Base64.getEncoder().encodeToString(hashByte); // Turning the bytes to Base64 and returning them as a string;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error hashing password", e); // checks if password is not there
        }
    }
}
