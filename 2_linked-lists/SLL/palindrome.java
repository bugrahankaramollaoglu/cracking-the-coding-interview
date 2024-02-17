import java.util.Stack;

public class palindrome {
	/*
	 * bu soruyu çözmek için fast/slow vs. çözümler olsa da
	 * ben stack kullanıcam. hızı O(n)
	 */
	public static Boolean isPalindrome(Node head) {

		Node slow = head; // bi bastan bi sondan nodeları karsılastırıcaz
		boolean isPal = false;
		Stack<Integer> stack = new Stack<Integer>();
		while (slow != null) {
			stack.push(slow.data);
			slow = slow.next; // tüm listeyi stacke ekledik
		}

		while (head != null) {
			int i = stack.pop(); // pop() ayrıca sildigi elemanı döndürür. sondan beri alıyoruz elemanları
			if (head.data == i) {
				isPal = true;
			} else {
				isPal = false;
				break;
			}
			head = head.next;
		}

		return isPal;
	}

	public static void main(String[] args) {
		SLL myList = new SLL();
		myList.append_back(10);
		myList.append_back(20);
		myList.append_back(30);
		myList.append_back(30);
		myList.append_back(20);
		// myList.append_back(15);
		myList.append_back(10);

		System.out.println(isPalindrome(myList.head));

		myList.print_list();
	}
}
