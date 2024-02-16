public class delete_a_middle {

	public static void deleteMiddle(Node head, Node mid) {
		if (head == null || head.next == null || mid == null || mid.next == null)
			return;

		// since we are given node, we don't need any sort of traversing
		mid.data = mid.next.data;
		mid.next = mid.next.next;

	}

	/* the problem with this function is that it doesn't work if last node is given
	because somehow it must shift one node to delete the given node but you can't
	shift beyond last node (which is null) */

	public static void main(String[] args) {

		SLL myList = new SLL();
		myList.append_back(10);
		myList.append_back(20);
		myList.append_back(30);
		myList.append_back(40);

		deleteMiddle(myList.head, myList.head.next.next);

		myList.print_list();

	}
}
