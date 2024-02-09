
public class remove_duplicates {

	/*
	 * Write code to remove duplicates from an unsorted linked list.
	 * How would you solve this problem if a temporary buffer is not allowed
	 */

	public static void removeDupsWithBuffer(Node head) {

	}

	public static void removeDupsWithoutBuffer(Node head) {

		Node curr = head;

		while (curr != null) {
			Node runner = curr;
			while (runner.next != null) {
				if (runner.next.data == curr.data) {
					runner.next = runner.next.next; // Remove duplicate node
				} else {
					runner = runner.next;
				}
			}
			curr = curr.next;
		}

	}

	public static void main(String[] args) {

		SLL myList = new SLL();
		myList.append_back(10);
		myList.append_back(2000);
		myList.append_back(30);
		myList.append_back(2000);
		myList.append_back(2000);
		myList.append_back(50);
		myList.append_back(60);
		myList.append_back(2000);
		System.out.println("önce:\n");
		myList.print_list();
		System.out.println("\nsonra:\n");

	}
}
