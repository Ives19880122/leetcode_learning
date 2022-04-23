package other.test;

import org.junit.Test;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Random;

public class DigestTest {
    private String getSHA256(String source){
        String result = null;
        try {
            byte[] input = source.getBytes(StandardCharsets.UTF_8);
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            digest.update(input);
            result = String.format("%064x", new BigInteger(digest.digest()));
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    private String getKey(String source){
        int salt = new Random().nextInt(10);
        String afterSalt = String.format("%s%d",source,salt);
        try {
            byte[] textByte = afterSalt.getBytes(StandardCharsets.UTF_8);
            return String.format("%064x", new BigInteger(textByte)).substring(20,25);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Test
    public void main(){
        Long salt = Instant.now().toEpochMilli() + new Random().nextInt(10);
        String saltUrl = String.format("%s%d","www.ggg.com.tw",salt);
        System.out.println(saltUrl);
        DigestTest d = new DigestTest();
        String result = d.getSHA256("www.ggg.com.tw");
        System.out.println(result.substring(10,15));
        String result2 = d.getSHA256(saltUrl);
        System.out.println(result2.substring(10,15));
    }
}
