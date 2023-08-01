package myspringbootproject.springbootdemo;


public class gameRunner {
	superMario1 obj;
	gameRunner(superMario1 obj){
		this.obj=obj;
	}
	void runGame1() {
		obj.left();
		obj.right();
		obj.up();
		obj.down();
	}
}

 
class superMario1{
	public void left() {
		System.out.println("mario-left");
	}
	public void right() {
		System.out.println("mario-right");
	}
	public void up() {
		System.out.println("mario-up");
	}
	public void down() {
		System.out.println("mario-down");
	}
}
class pacMan1{
	public void left() {
		System.out.println("pacman-left");
	}
	public void right() {
		System.out.println("pacman-right");
	}
	public void up() {
		System.out.println("pacman-up");
	}
	public void down() {
		System.out.println("pacman-down");
	}
}
class superContra1{
	public void left() {
		System.out.println("contra-left");
	}
	public void right() {
		System.out.println("contra-right");
	}
	public void up() {
		System.out.println("contra-up");
	}
	public void down() {
		System.out.println("contra-down");
	}
}