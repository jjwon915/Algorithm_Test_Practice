// Anagram(아나그램 : 구글 인터뷰 문제)
#include <stdio.h>
using namespace std;
#pragma warning(disable: 4996)
#include <algorithm>

int a[60], b[60];
int main() {
	//freopen("input.txt", "rt", stdin);

	// 대문자는 아스키 코드 65-90 ==> 64 빼기. a[1]은 대문자 A의미. (1-26번은 대문자)
	// 소문자는 97부터 122 ==> 70빼기.(27-52는 소문자)
	char str[100];
	scanf("%s", &str);
	for (int i = 0; str[i] != '\0'; i++) {
		if (str[i] >= 65 && str[i] <= 90) {
			a[str[i] - 64]++;
		}
		else {
			a[str[i] - 70]++;
		}
	}

	scanf("%s", &str);
	for (int i = 0; str[i] != '\0'; i++) {
		if (str[i] >= 65 && str[i] <= 90) {
			b[str[i] - 64]++;
		}
		else {
			b[str[i] - 70]++;
		}
	}

	for (int i = 1; i <= 52; i++) {
		if (a[i] != b[i]) {
			printf("NO\n");
			exit(0);
		}
	}
	printf("YES\n");



	return 0;
}