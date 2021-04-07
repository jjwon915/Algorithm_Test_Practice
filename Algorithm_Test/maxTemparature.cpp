// 온도의 최대값
#include <stdio.h>
using namespace std;
#pragma warning(disable: 4996)
#include <vector>

int main() {
	//freopen("input.txt", "rt", stdin);

	int n, k, sum = 0, max;
	int large = -217000000;
	scanf("%d %d", &n, &k);

	vector<int> a(n);

	for (int i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}

	// 첫번째 구간의 합.
	for (int i = 0; i < k; i++) {
		sum += a[i];
	}

	max = sum;

	for (int i = k; i < n; i++) {
		sum = sum + (a[i] - a[i - k]);
		if (sum > max)
			max = sum;
	}

	printf("%d\n", max);

	return 0;
}