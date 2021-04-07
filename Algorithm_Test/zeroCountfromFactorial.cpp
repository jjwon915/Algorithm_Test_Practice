// N!에서 0의 개수
#include <stdio.h>
#include <algorithm>
#include <vector>
using namespace std;
#pragma warning(disable: 4996)

int main() {
	//freopen("input.txt", "rt", stdin);

	int n, cnt, tmp, j, cnt1 = 0, cnt2 = 0;
	scanf("%d", &n);

	
	for (int i = 2; i <= n; i++) {
		tmp = i; 
		int j = 2;
		while (1) {
			if (tmp % j == 0) {
				if (j == 2) cnt1++;
				else if (j == 5) cnt2++;
				tmp = tmp / j;
			}
			else j++;
			if (tmp == 1) break;
		}
	}

	if (cnt1 < cnt2) printf("%d\n", cnt1);
	else printf("%d\n", cnt2);

	return 0;
}