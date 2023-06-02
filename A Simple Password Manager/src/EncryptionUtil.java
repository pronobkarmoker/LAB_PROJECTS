public class EncryptionUtil {
    String encrypt(String password){
        String ans= password.substring(2) + password.substring(0,2);
        return ans;
    }

    String decrypt(String password){
        String ans = password.substring(password.length()-2) + password.substring(0,password.length()-2);
        return ans;
    }
}
