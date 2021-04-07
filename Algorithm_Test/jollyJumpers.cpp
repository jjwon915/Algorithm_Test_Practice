// Jolly Jumpers
#include <stdio.h>
#include <stdlib.h>
using namespace std;
#pragma warning(disable: 4996)

int a[100];
int minus[100];
int main() {
	//freopen("input.txt", "rt", stdin);

	int n;
	scanf("%d", &n);

	int res, sum = 0;

	for (int i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}


	for (int i = 0; i < n; i++) {
		res = abs(a[i] - a[i + 1]);
		if(res < n)
			minus[res]++;
	}

	for (int i = 1; i < n; i++) {
		if (minus[i] != 0)
			sum++;
	}
	
	if (sum == n - 1)
		printf("YES");
	else
		printf("NO");

	return 0;
}