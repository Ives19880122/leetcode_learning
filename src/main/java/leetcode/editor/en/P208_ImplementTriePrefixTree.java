//A trie (pronounced as "try") or prefix tree is a tree data structure used to 
//efficiently store and retrieve keys in a dataset of strings. There are various 
//applications of this data structure, such as autocomplete and spellchecker. 
//
// Implement the Trie class: 
//
// 
// Trie() Initializes the trie object. 
// void insert(String word) Inserts the string word into the trie. 
// boolean search(String word) Returns true if the string word is in the trie (
//i.e., was inserted before), and false otherwise. 
// boolean startsWith(String prefix) Returns true if there is a previously 
//inserted string word that has the prefix prefix, and false otherwise. 
// 
//
// 
// Example 1: 
//
// 
//Input
//["Trie", "insert", "search", "search", "startsWith", "insert", "search"]
//[[], ["apple"], ["apple"], ["app"], ["app"], ["app"], ["app"]]
//Output
//[null, null, true, false, true, null, true]
//
//Explanation
//Trie trie = new Trie();
//trie.insert("apple");
//trie.search("apple");   // return True
//trie.search("app");     // return False
//trie.startsWith("app"); // return True
//trie.insert("app");
//trie.search("app");     // return True
// 
//
// 
// Constraints: 
//
// 
// 1 <= word.length, prefix.length <= 2000 
// word and prefix consist only of lowercase English letters. 
// At most 3 * 10⁴ calls in total will be made to insert, search, and 
//startsWith. 
// 
//
// Related Topics Hash Table String Design Trie 👍 10170 👎 115
    
package leetcode.editor.en;
/** 
 * id: 208
 * title: Implement Trie (Prefix Tree)
 * author: Ives.He 
 * date: 2023-05-28 19:54:31
 * for TEST copy:
 * import leetcode.editor.en.P208_ImplementTriePrefixTree .Solution;
 * P208_ImplementTriePrefixTree_Test
 */
public class P208_ImplementTriePrefixTree{
    //leetcode submit region begin(Prohibit modification and deletion)
class Trie {

    private final Node root;

    public Trie() {
        this.root = new Node();
    }
    
    public void insert(String word) {
        Node cur = this.root;
        for(int i =0; i<word.length(); i++){
            int ci = word.charAt(i) - 'a';
            if(cur.children[ci] == null)
                cur.children[ci] = new Node();
            cur = cur.children[ci];
        }
        cur.isEnd = true;
    }
    
    public boolean search(String word) {
        Node cur = root;
        for(int i =0; i<word.length(); i++){
            int ci = word.charAt(i) - 'a';
            if(cur.children[ci] == null) return false;
            cur = cur.children[ci];
        }
        return cur.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        Node cur = root;
        for(int i =0; i< prefix.length(); i++){
            int ci = prefix.charAt(i) - 'a';
            if(cur.children[ci] == null) return false;
            cur = cur.children[ci];
        }
        return true;
    }
}
class Node{
    public boolean isEnd = false;
    public Node[] children = new Node[26];
}


/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
//leetcode submit region end(Prohibit modification and deletion)

}