// 3의 개수는?(large) : 입력 1000000000까지 가능.
#include <stdio.h>
#include <algorithm>
#include <vector>
using namespace std;
#pragma warning(disable: 4996)

int main() {
	//freopen("input.txt", "rt", stdin);

	int n;
	int lt = 1, cur, rt, k = 1, res = 0;
	scanf("%d", &n);

	while (lt != 0) {
		lt = n / (k * 10);
		rt = n % k;
		cur = (n / k) % 10;
		if (3 < cur) {
			res = res + ((lt + 1) * k);
		}
		else if (3 == cur) {
			res = res + ((lt * k) + (rt + 1));
		}
		else res = res + (lt * k);
		k = k * 10;
	}

	printf("%d", res);

	return 0;
}