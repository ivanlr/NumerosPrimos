#include <iostream>
#include <stdlib.h>
#include <time.h>
using namespace std;

int
main()
{
  long long numero;
  time_t sec1,sec2;

  system("clear");
  cout << "Introduce el numero hasta donde se calcula: ";
  cin >> numero;

  cout << "2, 3, ";
  time(&sec1);
  for (long long  i = 5; i <= numero; i+=2)
  {
    for (long long j = 2; j <= ((i/2)+1) ; j++)
    {
      if (i%j == 0)
      {
        goto stop;
      }
    }
    cout << i << ", ";
    stop:{}
  }
   time(&sec2);
  cout << "\n\nTiempo de ejecucion: " << sec2 - sec1 << " segundos.\n\n";
  return 0;
}
