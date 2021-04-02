// 뒤집은 소수
#include <stdio.h>
using namespace std;
#pragma warning(disable: 4996)

int reverse(int x) {
	int res = 0, tmp;
	while (x > 0) {
		res = res * 10 + x % 10;
		x = x / 10;
	}
	return res;
}

bool isPrime(int x) {
	int cnt = 0;
	for (int i = 2; i < x; i++) {
		if (x % i == 0) {
		cnt++;
		return false;
		}
	}
	return true;

}

int main() {
	//freopen("input.txt", "rt", stdin);

	int n, a, cnt;
	bool result;
	scanf("%d", &n);
	
	for (int i = 0; i < n; i++) {
		cnt = 0;
		scanf("%d", &a);
		a = reverse(a);
		result = isPrime(a);
		if (result == true && a != 1)
			printf("%d ", a);
	}

	return 0;
}