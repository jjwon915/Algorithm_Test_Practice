// 이분검색
#include <stdio.h>
#include <algorithm>
#include <vector>
using namespace std;
#pragma warning(disable: 4996)

int main() {
	//freopen("input.txt", "rt", stdin);
	
	int n, m;
	scanf("%d %d", &n, &m);

	vector<int> a(n);
	for (int i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}
	
	sort(a.begin(), a.end());
	int lt = 0;
	int rt = n - 1;
	int p;

	while(1) {
		int p = (lt + rt) / 2;
		if (a[p] == m) {
			printf("%d", p + 1);
			break;
		}
		else if (a[p] > m) {
			rt = p - 1;
		}
		else {
			lt = p + 1;
		}
	}

	return 0;
}