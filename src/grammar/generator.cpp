#include<iostream>
using namespace std;
int main()
{
	cout<<"(* This contains whitespace characters and string with NULL character *)"<<endl;
	cout<<"\n \f \t \r \v"<<endl;
	char c = 0x00;
	printf("\"This is a string containing NULL : %c Done\"",c);
	return 0;
}
