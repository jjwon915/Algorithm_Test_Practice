// Inversion Sequence
#include <stdio.h>
#include <algorithm>
#include <vector>
using namespace std;
#pragma warning(disable: 4996)

int a[101];
int b[101];
int c[202];
int main() {
	//freopen("input.txt", "rt", stdin);

	int n, m, pos1 = 1, pos2 = 1, pos3 = 1;
	
	scanf("%d", &n);
	for (int i = 1; i <= n; i++) {
		scanf("%d", &a[i]);
	}

	scanf("%d", &m);
	for (int i = 1; i <= m; i++) {
		scanf("%d", &b[i]);
	}

	while (pos1 <= n && pos2 <= m) {
		if (a[pos1] < b[pos2]) {
			c[pos3++] = a[pos1++];
		}
		else {
			c[pos3++] = b[pos2++];
		}
	}

	while (pos1 <= n) c[pos3++] = a[pos1++];
	while (pos2 <= m) c[pos3++] = b[pos2++];

	for (int i = 1; i < pos3; i++) {
		printf("%d ", c[i]);
	}
	return 0;
}