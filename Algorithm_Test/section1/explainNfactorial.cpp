// N!의 표현법
#include <stdio.h>
#include <algorithm>
#include <vector>
using namespace std;
#pragma warning(disable: 4996)

int main() {
	//freopen("input.txt", "rt", stdin);

	int n, cnt, tmp, j;
	scanf("%d", &n);

	vector<int> ch(n + 1);

	for (int i = 2; i <= n; i++) {
		tmp = i; 
		j = 2; 
		while (1) {
			if (tmp % j == 0) {
				tmp = tmp / j;
				ch[j]++;
			}
			else
				j++;
			if (tmp == 1)
				break;
		}
	}

	printf("%d! = ", n);
	for (int i = 2; i <= n; i++) {
		if (ch[i] != 0)
			printf("%d ", ch[i]);
	}

	return 0;
}