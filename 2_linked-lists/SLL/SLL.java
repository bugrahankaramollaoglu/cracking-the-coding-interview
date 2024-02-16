public class SLL {
	Node head;

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
		if (head == null || head.next == null) {
			return;
		} else {
			head = head.next;
			// thankfully java has garbage collector
		}
	}

	public void remove_back() {
		if (head == null || head.next == null) {
			// If the list is empty or has only one node, there's nothing to remove
			return;
		}
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
	}

	public void remove_node(int data) {
		Node curr = head;
		Node prev = null;
		while (curr.next != null) {
			if (curr.data == data) {
				if (prev == null) {
					head = curr.next;
					break;
				} else {
					prev.next = curr.next;
				}
				return;
			}
			prev = curr;
			curr = curr.next;
		}
	}

	public void print_list() {
		Node curr = head;
		if (curr == null) {
			System.out.println("[] ");
			return;
		}
		while (curr != null) {
			System.out.print("[" + curr.data + "] ");
			curr = curr.next;
		}
		System.out.println();
		System.out.println();
	}

	public static void main(String[] args) {
		SLL sll = new SLL();
		// sll.print_list();
		sll.append_front(10);
		sll.append_front(20);
		sll.append_back(30);
		sll.append_back(40);
		sll.remove_back();
		sll.remove_front();
		sll.remove_node(10);
		sll.print_list();
	}

}
