//DMOPC '16 Contest 4 P1 - Fast Exponents

#include<bits/stdc++.h>

using namespace std;

int main() {
    cin.sync_with_stdio(0);
    cin.tie(0);
 long long lines, input;
	cin>>lines;

	for (unsigned int i = 0; i < lines; i ++) // repeat this program for the amount of lines
	{
	    cin>>input;
        while ((input % 2 == 0) && (input > 1))
        {   
		    input /= 2 ;
		 
		}
		if (input == 1)
		{
		    cout<<"T\n";
		}
		else 
		{
		    cout<<"F\n";
		}
	input = 0;
	
	}
return 0;
}
