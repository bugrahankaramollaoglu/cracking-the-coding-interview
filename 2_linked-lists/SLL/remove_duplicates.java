import java.util.HashSet;

public class remove_duplicates {

	/*
	 * Write code to remove duplicates from an unsorted linked list.
	 * How would you solve this problem if a temporary buffer is not allowed
	 */

	// O(N) BETTER
	public static void removeDupsWithBuffer(Node head) {

		if (head == null || head.next == null)
			return;

		HashSet<Integer> hset = new HashSet<>();

		Node prev = null;
		Node curr = head;

		while (curr != null) {
			if (hset.contains(curr.data)) {
				// If the current node's data is already in the set, it's a duplicate
				// Remove the duplicate node by adjusting the previous node's next pointer
				prev.next = curr.next;
			} else {
				// If the current node's data is not in the set, add it to the set
				hset.add(curr.data);
				prev = curr; // Update the previous node
			}
			curr = curr.next;
		}
	}

	// O(N^2)
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
		myList.append_back(30);
		myList.append_back(2000);
		myList.append_back(50);
		System.out.println("önce:\n");
		myList.print_list();

		// removeDupsWithBuffer(myList.head);
		removeDupsWithBuffer(myList.head);

		System.out.println("sonra:\n");
		myList.print_list();

	}
}
