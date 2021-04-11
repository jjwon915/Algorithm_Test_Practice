﻿// Inversion Sequence
#include <stdio.h>
#include <algorithm>
#include <vector>
using namespace std;
#pragma warning(disable: 4996)

int main() {
	//freopen("input.txt", "rt", stdin);

	int n, i, j, pos;
	scanf("%d", &n);

	vector<int> is(n + 1);
	vector<int> os(n + 1);

	for (i = 1; i <= n; i++) {
		scanf("%d", &is[i]);
	}

	for (i = n; i >= 1; i--) {
		pos = i;
		for (j = 1; j <= is[i]; j++) {
			os[pos] = os[pos + 1];
			pos++;
		}
		os[pos] = i;
	}

	for (i = 1; i <= n; i++) {
		printf("%d ", os[i]);
	}

	return 0;
}