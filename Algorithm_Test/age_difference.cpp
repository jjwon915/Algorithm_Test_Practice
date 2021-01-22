#include <iostream>
using namespace std;

int main() {
	int n, temp;
	cin >> n;

	int people[100];
	for (int i = 0; i < n; i++) {
		cin >> people[i];
	}

	for (int i = 0; i < n; i++) {
		for (int j = i + 1; j < n; j++) {
			if (people[i] > people[j]) {
				temp = people[i];
				people[i] = people[j];
				people[j] = temp;
			}
		}
	}

	cout << people[n - 1] - people[0];


	return 0;
}