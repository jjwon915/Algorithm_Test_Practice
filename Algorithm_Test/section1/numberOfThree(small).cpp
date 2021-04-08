// 3의 개수는?(small)
#include <stdio.h>
#include <algorithm>
#include <vector>
using namespace std;
#pragma warning(disable: 4996)

int main() {
	//freopen("input.txt", "rt", stdin);

	int n, cnt = 0, digit, tmp;
	scanf("%d", &n);

	for (int i = 1; i <= n; i++) {
		tmp = i;
		while (tmp > 0) {
			digit = tmp % 10;
			if (digit == 3) {
				cnt++;
			}
			tmp = tmp / 10;
		}
	}

	printf("%d\n", cnt);

	return 0;
}