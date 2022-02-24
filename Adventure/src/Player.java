/*
* Player.java
* Author: Zhizheng Wang
* Statement of Academic Honesty: *
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from anywhere other than the authorized
* sources. I recognize that any unauthorized sharing, assistance,
* or plagiarism will be handled in accordance with both the
* University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based on
* an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing or posting
* of source code at any time for this project is prohibited.
*/
public class Player {
	// declare variables
	private int x, y;
	private Lamp lamp;
	private Key keyForChest;

	// method to set player position at X
	public void setX(int x) {
		this.x = x;
	}

	// method to set player position at Y
	public void setY(int y) {
		this.y = y;
	}

	// method to get player position at X
	public int getX() {
		return x;
	}

	// method to get player position at Y
	public int getY() {
		return y;
	}

	// method to set lamp
	public void setLamp(Lamp lamp) {
		this.lamp = lamp;
	}

	// method to get lamp
	public Lamp getLamp() {
		return lamp;
	}

	// method to set key
	public void setKey(Key key) {
		keyForChest = key;
	}

	// method to get key
	public Key getKey() {
		return keyForChest;
	}
}
