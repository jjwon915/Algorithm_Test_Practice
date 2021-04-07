// 석차구하기
#include <stdio.h>
#include <stdlib.h>
using namespace std;
#pragma warning(disable: 4996)
#include <vector>

int main() {
	//freopen("input.txt", "rt", stdin);

	int n;
	scanf("%d", &n);

	vector<int> a(n);
	vector<int> b(n, 1);
	
	for (int i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (a[i] < a[j]) {
				b[i]++;
			}
		}
	}

	for (int i = 0; i < n; i++) {
		printf("%d ", b[i]);
	}


	return 0;
}