
public class sukkiri5852 {
	public static void main(String [] args) {
	email("明日の件","aaaa@aaaa.com","スケジュール調整をお願いします。");
	}
		public static void email(String title, String adress, String text) {
			System.out.println(adress+"に以下のメールを送信しました");
			System.out.println("件名:"+title);
			System.out.println("本文:"+text);
		}

}
