class Node {

	Node next = null;
	int data;

	public Node(int d) {
		this.data = d;
		this.next = null;
	}
}

public class SLL {
	private Node head;

	public SLL() {
		this.head = null;
	}

	public void append_front(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}

	public void append_back(int data) {
		Node new_node = new Node(data);

		if (head == null) {
			head = new_node;
			return;
		}

		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = new_node;
		new_node.next = null;
	}

	public void remove_front() {
		if (head != null || head.next != null) {
			head = head.next;
		}
	}

	public void remove_back() {
		if (head == null || head.next == null) {
			System.out.println("girdi");
			// If the list is empty or has only one node, there's nothing to remove
			return;
		}
	}

	public void print_list() {
		Node curr = head;
		if (curr == null) {
			System.out.println("[]");
			return;
		}
		while (curr != null) {
			System.out.print("[" + curr.data + "]");
			curr = curr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		SLL sll = new SLL();
		// sll.print_list();
		sll.append_front(10);
		// sll.append_front(20);
		// sll.append_back(30);
		// sll.append_back(40);
		sll.remove_back();
		// sll.remove_front();
		// sll.print_list();
	}

}
