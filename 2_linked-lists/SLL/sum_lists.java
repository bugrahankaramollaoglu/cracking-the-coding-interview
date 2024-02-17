public class sum_lists {

	public static SLL sumList(Node list1, Node list2) {

		SLL result = new SLL();

		int nb1 = convertList(list1);
		int nb2 = convertList(list2);

		System.out.println(nb1);
		System.out.println(nb2);
		int res = nb1 + nb2;

		while (res > 0) {
			result.append_back(res % 10);
			res /= 10;
		}


		return result;

	}

	private static int convertList(Node list1) {
		Node curr = list1;
		int nb = 0;
		int i = 1;

		while (curr != null) {

			nb += curr.data * i;
			i = i * 10;
			curr = curr.next;

		}

		return nb;

	}

	public static void main(String[] args) {
		SLL list1 = new SLL();
		SLL list2 = new SLL();
		SLL result = new SLL();

		list1.append_back(7);
		list1.append_back(1);
		list1.append_back(6);

		list2.append_back(5);
		list2.append_back(9);
		list2.append_back(2);

		list1.print_list();
		list2.print_list();

		result = sumList(list1.head, list2.head);
		result.print_list();
	}
}
