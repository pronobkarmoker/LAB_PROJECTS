#include<iostream>
#include<cmath>

int  main()
{
    int month;
    
    std :: cout << " enter (1 - 12) ";
    std :: cin >> month;

    switch (month)
    {
    case 1:
        std:: cout << "jan";
        break;
     case 2:
        std:: cout << "feb";
        break;
    case 3:
        std:: cout << "march";
        break;
    case 4:
        std:: cout << "april";
        break;
    case 5:
        std:: cout << "may";
        break;
    case 6:
        std:: cout << "june";
        break;
    case 7:
        std:: cout << "july";
        break;
    case 8:
        std:: cout << "aug";
        break;
    case 9:
       std:: cout << "sep";
        break;
    case 10:
        std:: cout << "oct";
        break;
    case 11:
        std:: cout << "nov";
        break;
    case 12:
        std:: cout << "december";
        break;

    default:
        std::  cout  << "SORRY!!!!!";
    }

    return 0;
}