﻿// 숫자의 총 개수(small)
#include <stdio.h>
using namespace std;
#pragma warning(disable: 4996)


int main() {
	//freopen("input.txt", "rt", stdin);

	int n, i, cnt = 0, tmp;
	scanf("%d", &n);

	for (i = 1; i <= n; i++) {
		tmp = i;
		while (tmp > 0) {
			tmp = tmp / 10;
			cnt++;
		}
	}

	printf("%d", cnt);

	return 0;
}