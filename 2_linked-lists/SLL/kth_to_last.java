public class kth_to_last {

	/*
	 * Implement an algorithm to find the kth to last element of a sll
	 */

	public static int kthToLast(Node head, int k) {

		if (head == null) {
			return 0;
		}

		int index = kthToLast(head.next, k) + 1;
		if (index == k) {
			System.out.println(k + ". to the last node is " + head.data);
		}

		return index;
	}

	public static void main(String[] args) {

		SLL myList = new SLL();
		myList.append_back(10);
		myList.append_back(2000);
		myList.append_back(30);
		myList.append_back(2000);
		myList.append_back(2500);
		myList.append_back(354);
		myList.append_back(30);
		myList.append_back(2000);
		myList.append_back(50);

		myList.print_list();

		kthToLast(myList.head, 1);
		kthToLast(myList.head, 2);
		kthToLast(myList.head, 3);
		kthToLast(myList.head, 4);

	}
}
