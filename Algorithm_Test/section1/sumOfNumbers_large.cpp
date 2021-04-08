// 숫자의 총 개수(large)
#include <stdio.h>
using namespace std;
#pragma warning(disable: 4996)


int main() {
	//freopen("input.txt", "rt", stdin);
	int n, sum = 0, cnt = 1, d = 9, res = 0;

	scanf("%d", &n);

	while (sum + d < n) {
		res = res + (cnt * d);
		sum = sum + d;
		cnt++;
		d = d * 10;
	}

	res = res + ((n - sum) * cnt);
	printf("%d", res);

	return 0;
}