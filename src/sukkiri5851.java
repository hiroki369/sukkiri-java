
public class sukkiri5851 {
	public static void main(String [] args) {
		System.out.println("自己紹介メソッドを呼び出します");
		introduceOneself("もっち",25,173,'戌');
		System.out.println("呼び出し完了");
	}
	public static void introduceOneself(String name, int age, double height, char eto) {
		System.out.println("私の名前は"+name+"です");
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("干支は"+eto+"どしです");
	}
}
