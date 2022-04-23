//Note: This is a companion problem to the System Design problem: Design 
//TinyURL. 
//
// TinyURL is a URL shortening service where you enter a URL such as https://
//leetcode.com/problems/design-tinyurl and it returns a short URL such as http://
//tinyurl.com/4e9iAk. Design a class to encode a URL and decode a tiny URL. 
//
// There is no restriction on how your encode/decode algorithm should work. You 
//just need to ensure that a URL can be encoded to a tiny URL and the tiny URL 
//can be decoded to the original URL. 
//
// Implement the Solution class: 
//
// 
// Solution() Initializes the object of the system. 
// String encode(String longUrl) Returns a tiny URL for the given longUrl. 
// String decode(String shortUrl) Returns the original long URL for the given 
//shortUrl. It is guaranteed that the given shortUrl was encoded by the same object.
// 
// 
//
// 
// Example 1: 
//
// 
//Input: url = "https://leetcode.com/problems/design-tinyurl"
//Output: "https://leetcode.com/problems/design-tinyurl"
//
//Explanation:
//Solution obj = new Solution();
//string tiny = obj.encode(url); // returns the encoded tiny url.
//string ans = obj.decode(tiny); // returns the original url after deconding it.
//
// 
//
// 
// Constraints: 
//
// 
// 1 <= url.length <= 10⁴ 
// url is guranteed to be a valid URL. 
// 
// Related Topics Hash Table String Design Hash Function 👍 1175 👎 2257
    
package leetcode.editor.en;

import java.util.HashMap;
import java.util.Map;

/**
 * id: 535
 * title: Encode and Decode TinyURL
 * author: Ives.He 
 * date: 2022-04-23 09:24:49
 * for TEST copy:
 * import leetcode.editor.en.P535_EncodeAndDecodeTinyurl .Solution;
 * P535_EncodeAndDecodeTinyurl_Test
 */
public class P535_EncodeAndDecodeTinyurl{
    //leetcode submit region begin(Prohibit modification and deletion)
public class Codec {
    private final Map<String,String> map = new HashMap<>();
    private static final String TINYURL = "https://ives.com/";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        java.util.UUID uuid = java.util.UUID.nameUUIDFromBytes(longUrl.getBytes());
        String key = uuid.toString().split("-")[1];
        if(!map.containsKey(key)){
            map.put(key,longUrl);
        }
        return TINYURL+key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String key = shortUrl.replace(TINYURL,"");
        return map.get(key);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
//leetcode submit region end(Prohibit modification and deletion)

}