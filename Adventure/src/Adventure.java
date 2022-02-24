
/*
* Adventure.java
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
import java.util.Scanner; // import java scanner

public class Adventure {

	public static void main(String[] args) {
		// declare scanner
		Scanner stdin = new Scanner(System.in);
		// declare variables
		Chest chest = new Chest();
		Lamp lamp = new Lamp();
		Map map = new Map();
		Player player = new Player();
		String userMove;

		// assign variables
		Room room = map.getRoom(0, 0); // start at room 0,0
		boolean quit = false;
		boolean win = false;

		String welcomeMsg = "Welcome to UGA Adventures: Episode I \n"
				+ "The Adventure of the Cave of Redundancy Adventure \n" + "By: Zhizheng Wang";
		String userDieMsg = "You have stumbled into a passing grue, and have been eaten";
		System.out.println(welcomeMsg); // print welcome message
		System.out.println(room.getDescription()); // print room description

		while (quit == false && win == false) { // if user is alive and did not open the chest - program continue runs
			userMove = stdin.nextLine(); // take user input
			if (userMove.equalsIgnoreCase("get lamp")) { // get lamp command
				if (room.getLamp() == null) { // no lamp in room
					System.out.println("No lamp present");
				} else { // lamp in room
					player.setLamp(lamp);
					room.clearLamp();
					System.out.println("OK");
				}
			} else if (userMove.equalsIgnoreCase("light lamp")) { // light lamp command
				if (player.getLamp() == null) { // not lamp for user
					System.out.println("You don't have the lamp to light");
				} else { // user has lamp
					lamp.setlightIsOn(true);
					System.out.println("OK");
				}
			} else if (userMove.equalsIgnoreCase("north")) { // north command
				if (room.isDark() == true
						&& (player.getLamp() == null || player.getLamp() != null && lamp.getlightIsOn() == false)) {
					System.out.println(userDieMsg);
					quit = true; // user die
				} else {
					if (room.canGoNorth() == true) { // user can go north
						player.setX(player.getX() - 1); // update player location
						room = map.getRoom(player.getX(), player.getY());
						if (room.isDark() == true && (player.getLamp() == null
								|| (player.getLamp() != null && lamp.getlightIsOn() == false))) {
							System.out
									.println("It is pitch black, you can't see anything. You may be eaten by a grue!");
						} else {
							room = map.getRoom(player.getX(), player.getY()); // update room location
							System.out.println(room.getDescription()); // print room description
						}
					} else { // user cannot go north
						System.out.println("Can't go that way");
					}

				}
			} else if (userMove.equalsIgnoreCase("south")) { // south command
				if (room.isDark() == true
						&& (player.getLamp() == null || player.getLamp() != null && lamp.getlightIsOn() == false)) {
					System.out.println(userDieMsg);
					quit = true; // user die
				} else {
					if (room.canGoSouth() == true) { // user can go south
						player.setX(player.getX() + 1); // update player location
						room = map.getRoom(player.getX(), player.getY());
						if (room.isDark() == true && (player.getLamp() == null
								|| (player.getLamp() != null && lamp.getlightIsOn() == false))) {
							System.out
									.println("It is pitch black, you can't see anything. You may be eaten by a grue!");
						} else {
							room = map.getRoom(player.getX(), player.getY()); // update room location
							System.out.println(room.getDescription()); // print room description
						}
					} else { // user cannot go south
						System.out.println("Can't go that way");
					}

				}
			} else if (userMove.equalsIgnoreCase("west")) { // west command
				if (room.isDark() == true
						&& (player.getLamp() == null || player.getLamp() != null && lamp.getlightIsOn() == false)) {
					System.out.println(userDieMsg);
					quit = true; // user die
				} else {
					if (room.canGoWest() == true) {
						player.setY(player.getY() - 1); // update player location
						room = map.getRoom(player.getX(), player.getY());
						if (room.isDark() == true && (player.getLamp() == null
								|| (player.getLamp() != null && lamp.getlightIsOn() == false))) {
							System.out
									.println("It is pitch black, you can't see anything. You may be eaten by a grue!");
						} else {
							room = map.getRoom(player.getX(), player.getY()); // update room location
							System.out.println(room.getDescription());// print room description
						}
					} else {// user cannot go west
						System.out.println("Can't go that way");
					}

				}
			} else if (userMove.equalsIgnoreCase("east")) { // east command
				if (room.isDark() == true
						&& (player.getLamp() == null || player.getLamp() != null && lamp.getlightIsOn() == false)) {
					System.out.println(userDieMsg);
					quit = true; // user die
				} else {
					if (room.canGoEast() == true) {
						player.setY(player.getY() + 1); // update player location
						room = map.getRoom(player.getX(), player.getY());
						if (room.isDark() == true && (player.getLamp() == null
								|| (player.getLamp() != null && lamp.getlightIsOn() == false))) {
							System.out
									.println("It is pitch black, you can't see anything. You may be eaten by a grue!");
						} else {
							room = map.getRoom(player.getX(), player.getY()); // update room location
							System.out.println(room.getDescription());// print room description
						}
					} else { // user cannot go east
						System.out.println("Can't go that way");
					}

				}

			} else if (userMove.equalsIgnoreCase("look")) { // look command
				if (room.isDark() == true
						&& (player.getLamp() == null || (player.getLamp() != null && lamp.getlightIsOn() == false))) {
					System.out.println("It is pitch black, you can't see anything. You may be eaten by a grue!");
				} else {
					System.out.println(room.getDescription()); // print room description
					if (room.getLamp() != null) {
						System.out.println("There is an old oil lamp here that was made long ago");
					}
					if (room.getKey() != null) {
						System.out.println("You see the outline of a key on a dusty shelf that's covered in dust.");
					}
					if (room.getChest() != null) {
						System.out.println(
								"There is a large, wooden, massive, oaken chest here with the word “CHEST” carved into it");
					}
					System.out.print("Exits are: "); // printing out all the exits available
					if (room.canGoNorth() == true) {
						System.out.println("north"); // north exit
					}
					if (room.canGoSouth() == true) {
						System.out.println("south"); // south exit
					}
					if (room.canGoWest() == true) {
						System.out.println("west"); // west exit
					}
					if (room.canGoEast() == true) {
						System.out.println("east"); // east exit
					}
				}
			} else if (userMove.equalsIgnoreCase("get key")) { // get key command
				if (room.getKey() == null) { // no key in room
					System.out.println("No key present");
				} else { // key in room
					player.setKey(map.getRoom(player.getX(), player.getY()).getKey());
					room.clearKey(); // user has key; therefore, key no longer exists
					System.out.println("OK");
				}
			} else if (userMove.equalsIgnoreCase("open chest")) { // open chest command
				if (room.getChest() != null && !(map.getRoom(player.getX(), player.getX()).getChest().isLocked())) {
					System.out.println(room.getChest().getContents());
					win = true; // chest open user wins
				} else if (room.getChest() == null) {
					System.out.println("No chest present");
				} else if (chest.isLocked() == true) {
					System.out.println("The chest is locked");
				}
			} else if (userMove.equalsIgnoreCase("unlock chest")) { // unlock chest command
				if (player.getKey() != null && room.getChest() != null) {
					player.getKey().use(map.getRoom(player.getX(), player.getY()).getChest());
					System.out.println("OK"); // user has key to unlock chest
				} else if (player.getKey() == null) { // user does not have key
					System.out.println("Need a key to do any unlocking");
				} else if (room.getChest() == null) { // no chest available
					System.out.println("No chest to unlock");
				}
			} else { // other user command
				System.out.println("I'm sorry, I don't know how to do that");
			}
		} // end of while loop for over != true
		stdin.close();
	} // end of class main

} // end of class Adventure
