package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	public String[] words;
	
	public void dictionary(String[] words) {

		HashMap<String,String> dictionary = new HashMap<String,String>();
		
		dictionary.put("apple","りんご");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウィ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");
//	}
			
	//英単語が辞書についかされているか確認
//	public int check(String[] words) {
		for(int i = 0; i<words.length; i++) {
			if(dictionary.containsKey(words[i])) {
				System.out.println(words[i] + "の意味は" + dictionary.get(words[i]));
			} else {
				System.out.println(words[i] + "は辞書に存在しません");
			}
		
		}
	}
}
