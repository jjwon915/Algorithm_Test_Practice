#include <stdio.h>
#include <string.h>
#pragma warning(disable:4996)

int main() {
	char word[100];
	scanf("%s", &word);

	int eng[26];
	for (int i = 0; i < 26; i++) {
		eng[i] = -1;
	}

	for (int i = 0; i < strlen(word); i++) {
		int num = word[i] - 'a';
		if (eng[num] != -1) {
			continue;
		}
		eng[num] = i;
	}

	for (int i = 0; i < 26; i++) {
		printf("%d ", eng[i]);
	}

	return 0;
}