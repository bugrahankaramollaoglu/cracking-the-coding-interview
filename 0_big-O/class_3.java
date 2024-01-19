class class_3 {
	public static int fun(int n) {
		if (n <= 1) {
			return 1;
		}
		return fun(n - 1) + fun(n - 1);
	}
}

/* bunun karmaşıklık seviyesi O(2^n). çünkü n>1 her çağrı
 * 2 çağrı daha yaratiyor, bunlar da 2 tane daha totalde 4.
 * 1'den büyük oldugu müddetçe 4 çağrının her biri 2 daha yaratiyor
 * o da 8 eder. yani 2, 4, 8, 16 ... diye gidiyor
 */
