﻿// 소수의 개수
#include <stdio.h>
using namespace std;
#pragma warning(disable: 4996)

int main() {
	//freopen("input.txt", "rt", stdin);

	int n, i, j, flag, cnt = 0;
	scanf("%d", &n);

	for (int i = 2; i <= n; i++) {
		flag = 1;
		for (j = 2; j*j <= i; j++) {
			if (i % j == 0) {
				flag = 0;
				break;
			}
		}
		if (flag == 1) {
			cnt++;
		}
	}

	printf("%d", cnt);

	return 0;
}