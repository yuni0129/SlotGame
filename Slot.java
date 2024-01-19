package to.slot;

import java.util.Random;
import java.util.Scanner;

public class Slot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 3回繰り返す
        for (int i = 0; i < 3; i++) {
            System.out.println("数字を揃えましょう！enterを押してください");
            scanner.nextLine(); // Enterキーをクリア
            int playerChoice = new Random().nextInt(3) + 1;
            System.out.println("あなたの数字：" + playerChoice);
            scanner.nextLine(); // Enterキーをクリア

            // プレイヤーがボタンを押すことで数字が決まる
            int computerChoice = new Random().nextInt(3) + 1; // 1から3のランダムな数字
            System.out.println("コンピューターの数字：" + computerChoice);

            // すべて揃ったら勝ち、それ以外は負け（勝敗の決定）
            if (playerChoice == computerChoice) {
                System.out.println("勝ち！");
            } else {
                System.out.println("負け！");
            }
        }

        // スキャナー閉じる
        scanner.close();
    }
}
	