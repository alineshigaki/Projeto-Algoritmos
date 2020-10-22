/*Projeto de Algoritmos-Calculadora em C
PARTE 1-OPERAÇÕES BÁSICAS
*/

#include<stdio.h>
#include<math.h>
#include<stdlib.h>
#define PI 3.14159265
#define STRTAM 60



float func1(float n1,float n2,char operador);
float sine(float ang);
float cossine(float ang);
float tangent(float ang);
float sineh(float ang);
float cossineh(float ang);
float tangenth(float ang);
float logdez(float num);
float raiz(float num);
float expoente(float num);
float base(float x,float y);
float raizcub(float num);
int fatorial(int num);
float percent(float num);
float outra_raiz(float num,float indice);








int main(void)
{
    float n1=0.0,n2=0.0,num=0.0,result=0.0,ang=0.0,seno=0.0,cosseno=0.0,tangente=0.0,secante=0.0,cossecante=0.0,cotangente=0.0,x=0.0,y=0.0,indice=0.0;
    char operador=0;
    int z=0,fat=0,arq=0,i,j,k,l,m,n,matriz[3][3],matriz2[3][3],matriz3[3][3];
    char op2=0;
    FILE *file;
    file = fopen("historico.txt","a");
    if(file==NULL){
        printf("Arquivo nao pode ser criado");
        system("pause");
        return 1;
        }
    else
    printf("");

    printf("Qual operacao deseja fazer?\n");
    printf("\n1-Operacao Simples");
    printf("\n2-Seno");
    printf("\n3-Cosseno");
    printf("\n4-Tangente");
s

    printf("\n\n");
    fflush(stdin);
    scanf("%i",&op2);


    switch(op2){

    case 1:

    printf("Digite a operacao a ser feita: +,-,*,/\n");
    scanf("%c",&operador);
    fflush(stdin);
    printf("Digite o primeiro numero\n");
    scanf("%f",&n1);
    fflush(stdin);
    printf("Digite o segundo numero\n");
    scanf("%f",&n2);
    fflush(stdin);
    result= func1(n1,n2,operador);
    printf("%f",result);
    fprintf(file,"%f %c %f = %f\n",n1,operador,n2,result);
    break;

    case 2:
        printf("Digite o grau do angulo a ser usado\n");
        scanf("%f",&ang);
        fflush(stdin);
        seno=sine(ang);
        printf("%.8f",seno);
        fprintf(file,"sin(%.8f) = %.8f\n",ang,seno);
        break;

    case 3:
        printf("Digite o grau do angulo a ser usado\n");
        scanf("%f",&ang);
        fflush(stdin);
        cosseno=cossine(ang);
        printf("%.8f",cosseno);
        fprintf(file,"cos(%.8f) = %.8f\n",ang,cosseno);
        break;

    case 4:
        printf("Digite o grau do angulo a ser usado\n");
        scanf("%f",&ang);
        fflush(stdin);
        tangente=tangent(ang);
        printf("%.8f",tangente);
        fprintf(file,"tan(%.8f) = %.8f\n",ang,tangente);
        break;

    case 5:
        printf("Digite o grau do angulo a ser usado\n");
        scanf("%f",&ang);
        fflush(stdin);
        secante=sineh(ang);
        printf("%.8f",secante);
        break;
    case 6:
        printf("Digite o grau do angulo a ser usado\n");
        scanf("%f",&ang);
        fflush(stdin);
        cossecante=cossineh(ang);
        printf("%.8f",cossecante);
        break;
    case 7:
        printf("Digite o grau do angulo a ser usado\n");
        scanf("%f",&ang);
        fflush(stdin);
        cotangente=tangenth(ang);
        printf("%.8f",cotangente);
        break;
    case 8:
        printf("Digite um numero\n");
        scanf("%f",&num);
        fflush(stdin);
        result=logdez(num);
        printf("%.8f",result);
        break;
    case 9:
        printf("Digite um numero\n");
        scanf("%f",&num);
        fflush(stdin);
        result=raiz(num);
        printf("%.8f",result);
        break;
    case 10:
        printf("Digite um numero\n");
        scanf("%f",&num);
        fflush(stdin);
        result=expoente(num);
        printf("%.8f",result);
        break;
    case 11:
        printf("Digite a base\n");
        scanf("%f",&x);
        fflush(stdin);
        printf("Digite o expoente\n");
        scanf("%f",&y);
        fflush(stdin);
        result=base(x,y);
        printf("%.8f",result);
    case 12:
        printf("Digite um numero\n");
        scanf("%f",&num);
        fflush(stdin);
        result=raizcub(num);
        printf("%.8f",result);
        break;

        case 13:
        printf("Digite um numero\n");
        scanf("%d",&z);
        fflush(stdin);
        fat=fatorial(z);
        printf("%d!= %d",z,fat);
        break;
        case 14:
            printf("Digite um numero");
            scanf("%f",&num);
            fflush(stdin);
            result=percent(num);
            printf("%.2f",result);
            break;
        case 15:
            printf("Digite a base");
            scanf("%f",&num);
            fflush(stdin);
            printf("Digite o indice");
            scanf("%f",&indice);
            fflush(stdin);
            result=outra_raiz(num,indice);
            printf("%f",&result);
            break;
        case 16:
            printf("Preenchimento da matriz A\n");

        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                scanf("%d",&matriz[i][j]);
                fflush(stdin);

            }
        }

        printf("Preenchimento da matriz B\n");

        for(k=0; k<3; k++)
        {
            for(l=0; l<3; l++)
            {
                scanf("%d",&matriz2[k][l]);
                fflush(stdin);

            }
        }
        printf("Conteudo da Matriz A\n");
        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {

                if(j==0)
                    printf("|%d\t",matriz[i][j]);
                else if(j==2)
                    printf("%d",matriz[i][j]);
                else
                    printf("%d\t",matriz[i][j]);
            }
            if(j==3)
                printf("|\n");
        }

        printf("Conteudo da Matriz B\n");
        for(k=0; k<3; k++)
        {
            for(l=0; l<3; l++)
            {

                if(l==0)
                    printf("|%d\t",matriz2[k][l]);
                else if(l==2)
                    printf("%d",matriz2[k][l]);
                else
                    printf("%d\t",matriz2[k][l]);
            }
            if(l==3)
                printf("|\n");
        }

        printf("Soma das Matrizes\n");
        for(m=0; m<3; m++)
        {
            for(n=0; n<3; n++)
            {
                matriz3[m][n]=matriz[m][n]+matriz2[m][n];
                if(n==0)
                    printf("|%d\t",matriz3[m][n]);
                else if(n==2)
                    printf("%d",matriz3[m][n]);
                else
                    printf("%d\t",matriz3[m][n]);
            }
            if(l==3)
                printf("|\n");
        }
       break;

        case 17:




            break;



    }

    return 0;

}




float func1(float n1, float n2,char operador)
{
    float result;
    switch(operador)

    {
    case '+':

        //printf("%.2f + %.2f= %.2lf",n1,n2,n1+n2);
        result=n1+n2;
        break;

    case'-':
        //printf("%.2f - %.2f= %.2lf",n1,n2,n1-n2);
        result=n1-n2;
        break;

    case '*':
        //printf("%.2f * %.2f= %.2lf",n1,n2,n1*n2);
        result=n1*n2;
        break;

    case'/':
        if(n2==0){
            system("pause");
        }
        result=n1/n2;



        //printf("%.2f / %.2f= %.2lf",n1,n2,n1/n2);

        break;

    }
    return(result);

}
float sine(float ang){
 return(sin(ang*PI/180));

}

float cossine(float ang){

   return(cos(ang*PI/180));

}

float tangent(float ang)
{
return (tan(ang*PI/180));
}

float sineh(float ang){
return(sinh(ang));

}
float cossineh(float ang){
 return (cosh(ang));
}

 float tangenth(float ang){
 return(tanh(ang));
}

float logdez(float num){
return (log10(num));}

float raiz(float num){
return(sqrt(num));}

float expoente(float num){
return(exp(num));}

float base(float x,float y){
return (pow(x,y));}

float raizcub(float num){
return (cbrt(num));}

int fatorial(int z){
if(z==0){
    return 1;}
else
    return(z*fatorial(z-1));}

float percent(float num){
 return num/100;}

float outra_raiz(float num,float indice){

   float x=1,xzero=0;
   do{
    xzero=x;
    x=(1/indice)*((indice-1)*xzero+(num/pow(xzero,indice-1)));
    }while(x!=xzero);
    printf("%.8lf",x);
    return 0;
    }




























































