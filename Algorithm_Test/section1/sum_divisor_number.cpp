#include <iostream>
using namespace std;

int main() {
	int n, sum = 0, j = 0;
	int array[100] = { 0, };

	cin >> n;

	for (int i = 1; i < n; i++) {
		if (n % i == 0) {
			sum += i;
			array[j] = i;
			j++;
		}
	}

	for (int i = 0; i < j - 1; i++) {
		cout << array[i] << " + ";
	}

	cout << array[j-1] << " = "<< sum;

	return 0;
}