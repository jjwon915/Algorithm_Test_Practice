// 가위 바위 보
#include <stdio.h>
using namespace std;
#pragma warning(disable: 4996)

int A[100];
int B[100];
int main() {
	//freopen("input.txt", "rt", stdin);

	int n;
	scanf("%d", &n);

	for (int i = 0; i < n; i++) {
		scanf("%d", &A[i]);
	}

	for (int i = 0; i < n; i++) {
		scanf("%d", &B[i]);
	}

	for (int i = 0; i < n; i++) {
		if (A[i] == B[i]) {
			printf("D\n");
		}
		else if (A[i] == 1 && B[i] == 3){
			printf("A\n");
		}
		else if (A[i] == 2 && B[i] == 1){
			printf("A\n");
		}
		else if(A[i] == 3 && B[i] == 2){
			printf("A\n");
		}
		else {
			printf("B\n");
		}

	}

	return 0;
}