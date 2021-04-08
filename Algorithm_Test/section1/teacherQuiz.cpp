// 선생님 퀴즈
#include <stdio.h>
using namespace std;
#pragma warning(disable: 4996)

int main() {
	//freopen("input.txt", "rt", stdin);

	int n, a, b, sum = 0;
	scanf("%d", &n);

	for (int i = 0; i < n; i++) {
		scanf("%d %d", &a, &b);
		sum = ((a + 1) * a) / 2;
		if (sum == b) {
			printf("YES\n");
		}
		else {
			printf("NO\n");
		}
	}

	return 0;
}