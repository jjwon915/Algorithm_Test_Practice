#include <stdio.h>
using namespace std;
#pragma warning(disable: 4996)

int main() {
	//freopen("input.txt", "rt", stdin);
	char a[101], b[101];
	int i, p = 0;

	//개행이 나오기 전까지 scanf를 이용해 입력받는다.
	scanf("%[^\n]s", &a);

	for (i = 0; a[i] != '\0'; i++) {
		if (a[i] != ' ') {
			// 대문자 파악(아스키 넘버 이용)
			if (a[i] >= 65 && a[i] <= 90) {
				// 소문자 변환 ( +32)
				b[p++] = a[i] + 32;
			}
			else b[p++] = a[i];
		}
	}

	// b배열의 마지막에 끝을 알리는 '\0'을 넣는다.
	b[p] = '\0';
	
	printf("%s\n", b);
	
	return 0;
}