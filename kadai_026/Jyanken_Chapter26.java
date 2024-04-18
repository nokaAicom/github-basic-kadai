package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	
//	自分のじゃんけんの手を入力する
	public String getMyChoice(){
		System.out.println("自分のじゃんけんの手を入力しましょう\n"
				+ "グーはrockのrを入力しましょう\n"
				+ "チョキはscissorsのsを入力しましょう\n"
				+ "パーはpaperのpを入力しましょう");
//		自分の手の標準入力
		Scanner scanner = new Scanner(System.in);
//		自分の手を代入する変数の宣言
		String myChoice;
		
//	入力が正しく行われているかのチェック
		while(true) {
			myChoice = scanner.nextLine();
			if("r".equals(myChoice) || "s".equals(myChoice) || "p".equals(myChoice)) {
					return myChoice;
			} else {
				System.out.println("不正な入力です。'r', 's', 'p'のいずれかを入力してください");
				continue;
			}
			
//			自分が出した手を戻り値にする

			}
	}
	
		
		
	
	
//	対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		int opp;
		String opponent = "";
		
		opp = (int) Math.floor(Math.random() * 3);
		switch(opp) {
			case 0 -> opponent = "r";
			case 1 -> opponent = "s";
			case 2 -> opponent = "p";
		}
		return opponent;
		}
	
//	じゃんけんを行う
	public void playGame() {
		HashMap<String, String> rsp = new HashMap<String, String>();
		
		rsp.put("r","グー");
		rsp.put("s","チョキ");
		rsp.put("p", "パー");
		
		String choice = getMyChoice();
		String opChoice = getRandom();
		
		System.out.println(choice);
		System.out.println("自分の手は" + rsp.get(choice) + "," + "対戦相手の手は" + rsp.get(opChoice));
		
		if(choice.equals(opChoice)) {
			System.out.println("あいこです");
		} else if(choice.equals("r") && opChoice.equals("s") || choice.equals("s") && opChoice.equals("p") || choice.equals("p") && opChoice.equals("r")){
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
		
		
	}

}
