// 층간 소음
#include <stdio.h>
using namespace std;
#pragma warning(disable: 4996)

int main() {
	//freopen("input.txt", "rt", stdin);

	int n, m, noise;
	scanf("%d %d", &n, &m);
	
	int large = -1, count = 0;

	for (int i = 0; i < n; i++) {
		scanf("%d", &noise);
		if (noise > m) {
			count++;
		}
		else {
			if (large < count)
				large = count;
			count = 0;
		}
		if (i == n - 1 && large < count) {
			large = count;
		}
	}

	printf("%d\n", large);

	return 0;
}