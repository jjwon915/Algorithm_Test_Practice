#include <iostream>
using namespace std;
#pragma warning(disable: 4996)

int main() {
	//freopen("input.txt", "rt", stdin);
	char words[100];
	int res = 0, cnt = 0;
	int i;

	scanf("%s", &words);

	//문자열의 끝을 알리는 것이 \0문자이기 때문에 이렇게 작성해준다.
	for (i = 0; words[i] != '\0'; i++) {
		//아스키 코드 이용.
		if (words[i] >= 48 && words[i] <= 57) {
			res = res * 10 + (words[i] - 48);
		}
	}

	printf("%d\n", res);

	for (i = 1; i <= res; i++) {
		if (res % i == 0) cnt++;
	}

	printf("%d\n", cnt);

	
	return 0;
}