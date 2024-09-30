#include <stdio.h>

int kashelkar = 18;

void displayGlobal(){
    printf("This is Global Variable : %d\n", kashelkar);
}

void displayLocaltoFunction(){
    char kashelkar = 'R';
    printf("This is Local to Function Variable : %c\n", kashelkar);
}

int main(){

    displayGlobal();
    displayLocaltoFunction();

    {
        double kashelkar = 40;
        printf("This is Local to Block Variable : %.2lf\n", kashelkar);
    }

    return 0;
}

