// 자릿수의 합
#include <stdio.h>
using namespace std;
#pragma warning(disable: 4996)


int main() {
	//freopen("input.txt", "rt", stdin);

	int a[100];
	int n, num, cnt = 0;
	int max = -217000000;
	int large;

	scanf("%d", &n);

	for (int i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}

	for (int i = 0; i < n; i++) {
		large = 0;
		num = a[i];
		while (a[i] > 0) {
			large += a[i] % 10;
			a[i] = a[i] / 10;
		}
		
		if (large > max) {
			max = large;
			cnt = num;
		}

		if (large == max && num > cnt) {
			cnt = num;
		}
	}

	printf("%d", cnt);


	return 0;
}