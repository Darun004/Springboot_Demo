package myspringbootproject.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Iteration1 {
	@Autowired
	@Qualifier("pacman")
	game obj;
	void runGame() {
		obj.left();
		obj.right();
		obj.up();
		obj.down();
	}
}
interface game{
	void left();
	void right();
	void up();
	void down();
}
@Component 
@Primary
class superMario implements game{
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
@Component("pacman")
class pacMan implements game{
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
@Component
class superContra implements game{
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