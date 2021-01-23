#include <iostream>
using namespace std;
#pragma warning(disable: 4996)

int main() {
	char numbers[15];
	int age = 0;
	int a, b;

	cin >> numbers;

	a = numbers[0] - '0';
	b = numbers[1] - '0';

	if (numbers[7] == '2' || numbers[7] == '1') {
		age = 2019 - (1900 + a * 10 + b) + 1;
		cout << age;
		if (numbers[7] == '1') cout << " M";
		if (numbers[7] == '2') cout << " W";
	}
	else if (numbers[7] == '3' || numbers[7] == '4') {
		age = 2019 - (2000 + a * 10 + b) + 1;
		cout << age;
		if (numbers[7] == '3') cout << " M";
		if (numbers[7] == '4') cout << " W";
	}
	
	return 0;
}