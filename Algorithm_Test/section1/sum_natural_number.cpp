#include <iostream>
using namespace std;

int main() {
	int a, b, sum = 0;

	cin >> a >> b;

	for (int i = a; i <= b; i++) {
		if (i == b) {
			sum += i;
			cout << i << " = " << sum;
		}
		else {
			cout << i << " + ";
			sum += i;
		}
	}
	return 0;
}