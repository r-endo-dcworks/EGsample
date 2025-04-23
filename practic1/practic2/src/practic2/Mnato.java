package practic2;

public class Mnato {
	public static void main(String[] args) {
		Hero h = new Hero("ミナト");
		System.out.println(h.hp);
		System.out.println(h.name);
	}
}


class Hero{
	String name;
	int hp;
	public Hero(String nickname) {
		this.hp = 100;
		this.name = nickname;
	}
}