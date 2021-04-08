// Special Sort(버블정렬 응용:구글 인터뷰)
#include <stdio.h>
#include <algorithm>
#include <vector>
using namespace std;
#pragma warning(disable: 4996)

int main() {
	//freopen("input.txt", "rt", stdin);

	int a[100], ch = 0, tmp;
	int n;
	scanf("%d", &n);

	for (int i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}

	for (int i = 0; i < n-1; i++) {
		for (int j = 0; j < n - i - 1; j++) {
			if (a[j] > 0 && a[j + 1] < 0) {
				tmp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = tmp;
			}
		}
	}


	for (int i = 0; i < n; i++) {
		printf("%d ", a[i]);
	}

	return 0;
}