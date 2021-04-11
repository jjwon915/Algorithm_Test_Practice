// 교집합(투포인터 알고리즘)
#include <stdio.h>
#include <algorithm>
#include <vector>
using namespace std;
#pragma warning(disable: 4996)

int main() {
	//freopen("input.txt", "rt", stdin);

	int n, m, p1 = 0, p2 = 0, p3 =0;
	
	scanf("%d", &n);
	vector<int> a(n);
	for (int i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}
	// sort 함수는 algorithm header파일에서 제공하고 오름차순 정렬된다.
	sort(a.begin(), a.end());

	scanf("%d", &m);
	vector<int> b(m), c(m);
	for (int i = 0; i < m; i++) {
		scanf("%d", &b[i]);
	}
	sort(b.begin(), b.end());

	while (p1 < n && p2 < m) {
		if (a[p1] == b[p2]) {
			c[p3++] = a[p1++];
			p2++;
		}
		else if (a[p1] < b[p2]) {
			p1++;
		}
		else p2++;
	}
	
	for (int i = 0; i < p3; i++) {
		printf("%d ", c[i]);
	}

	
	return 0;
}