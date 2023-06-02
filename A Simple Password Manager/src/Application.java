import java.util.ArrayList;
import java.util.Scanner;

public class Application extends EncryptionUtil {
    ArrayList<AuthenticationInfo> a = new ArrayList<>();

    public void start(){
        System.out.println("Enter 1 or 2");
        Scanner s = new Scanner(System.in);
        System.out.println("**** MENU ****");
        System.out.println("1.New log in info");
        System.out.println("2. view log in info");

        int val = s.nextInt();

        switch (val){
            case 1 :
                String URL = s.next();
                String username =s.next();
                String password = s.next();

                AuthenticationInfo authenticationInfo =  new AuthenticationInfo(URL, username, password);
                a.add(createLoginRecord(authenticationInfo));
                break;
            case 2 :
                String newURL =  s.next();
                ArrayList<AuthenticationInfo> ans = viewLoginRecord(newURL);
               for (AuthenticationInfo an : ans) {
                    System.out.println(an.getUsername());
                    System.out.println(an.getPassword());
                    System.out.println();
                }
               break;
            default:
                System.out.println("WRONG INPUT");
                break;

        }

    }

    private AuthenticationInfo createLoginRecord (AuthenticationInfo authenticationInfo){
        authenticationInfo.setPassword(encrypt(authenticationInfo.getPassword()));
        return authenticationInfo;
    }

    private ArrayList<AuthenticationInfo> viewLoginRecord(String URL){
        ArrayList<AuthenticationInfo> authenticationInfos = new ArrayList<>();
        for (AuthenticationInfo a : a){
            if(a.getURL().equals(URL)){
                a.setPassword(decrypt(a.getPassword()));
                authenticationInfos.add(a);
            }
        }
        return authenticationInfos;
    }

}
