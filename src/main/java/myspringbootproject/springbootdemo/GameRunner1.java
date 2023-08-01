package myspringbootproject.springbootdemo;

public class GameRunner1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superMario1 mario=new superMario1();
		@SuppressWarnings("unused")
		pacMan pacman=new pacMan();
		superContra contra=new superContra();
		gameRunner gr=new gameRunner(mario);
		gr.runGame1();
	}

}