/*
* Key.java
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
/*You do not need to modify this class
 * 
 */
public class Key {
	//This method is called when you are ready to unlock a chest with the key obtained from the map
	public void use(Chest onChest){
		onChest.unLock(this);
	}
}
