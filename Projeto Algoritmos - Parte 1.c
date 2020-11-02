/*Projeto de Algoritmos-Programa com Algumas Funcoes de uma Calculadora Cientifica- Versao 1.4.0 em C
PARTE 1-OPERACOES BASICAS E FUNCOES DO CODIGO
PARTE 2-ARMAZENAMENTO EM ARQUIVO

Atualizacoes:

-Função outra_raiz retornava 0, agora está retornando o resultado correto;
-Alguns \n e solucao de problemas para salvar no arquivo;
-Diminuicao de 8 para 3 casas de algumas variavel apos a virgula para facilitar visulizacao em arquivo, apenas os resultados mantem as 8 casas que sao o padrao em calculadoras normais.


*/

#include<stdio.h>
#include<math.h>
#include<stdlib.h>
#define PI 3.14159265



/*Prototipos das funcoes*/

float func1(float n1,float n2,char operador);//Operacao Basica(+,-,*,/)
float sine(float ang);//Seno, Cosseno e Tangente
float cossine(float ang);
float tangent(float ang);
float sineh(float ang);//Seno Cosseno e Tangente hiperbolicos
float cossineh(float ang);
float tangenth(float ang);
float logdez(float num);//Logaritmo na base 10
float raiz(float num);//Raiz Quadrada
float expoente(float num);//Exp
float base(float x,float y);//Expoente entre dois numeros dados pelo usuario
float raizcub(float num);//Raiz Cubica
int fatorial(int num);//Fatorial
float percent(float num);//Porcentagem
float outra_raiz(float num,float indice);//Raiz de indice qualquer(alem da quadrada e cubica)



int main(void)
{
    int k=0;
    do{
    float n1=0.0,n2=0.0,num=0.0,result=0.0,ang=0.0,seno=0.0,cosseno=0.0,tangente=0.0,senh=0.0,cosh=0.0,tangh=0.0,x=0.0,y=0.0,indice=0.0;
    char operador=0;
    int z=0,fat=0;
    char op2=0;
    enum operacao {OperacaoSimples=1,Seno, Cosseno, Tangente, SenoHiperbolico, CossenoHiperbolico, TangenteHiperbolica, Log10, RaizQuadrada, Exp, Exponencial, RaizCubica, Fatorial, Porcentagem,RaizQualquer,Sair};
    //Uso da variavel enum para facilitar a identificacao de cada escolha

        //Armazenamento em arquivo

        FILE *file;
        file = fopen("historico.txt","a");//Abrindo o arquivo usando "a" para acrescentar sem apagar o que foi escrito antes, fazendo um registro de operacoes
        if(file==NULL)//Confirmando a criacao do arquivo
        {
            printf("Arquivo nao pode ser criado\n");
            system("pause");
            return 1;//Retorno com a variavel 1 ou -1 indica que houve problema
        }
        else
            printf("\nArquivo texto criado com sucesso\n");
        system("cls");

        //Menu da Calculadora
        printf("==============================================\n");
        printf("\tQual operacao deseja fazer?\n");
        printf("==============================================\n");
        printf("\n1-Operacao Simples         * \t");
        printf("2-Seno");
        printf("\n3-Cosseno\t           *\t");
        printf("4-Tangente");
        printf("\n5-Seno Hiperbolico         * \t");
        printf("6-Cosseno Hiperbolico");
        printf("\n7-Tangente Hiperbolica     * \t");
        printf("8-Log Base 10");
        printf("\n9-Raiz Quadrada            * \t");
        printf("10-Exp");
        printf("\n11-Exponencial             * \t");
        printf("12-Raiz Cubica");
        printf("\n13-Fatorial                * \t");
        printf("14-Porcentagem");
        printf("\n15-Raiz de Indice Qualquer * \t");
        printf("16- Sair\n");
        printf("=============================================\n");



        printf("\n\n");
        fflush(stdin);
        scanf("%i",&op2);



        switch(op2)
        {

        case OperacaoSimples:

            printf("Digite a operacao a ser feita: +,-,*,/\n");
            fflush(stdin);//Comando para limpar o buffer
            scanf("%c",&operador);
            printf("Digite o primeiro numero\n");
            fflush(stdin);
            scanf("%f",&n1);
            printf("Digite o segundo numero\n");
            fflush(stdin);
            scanf("%f",&n2);
            result= func1(n1,n2,operador);//Chamada a func1
            printf("%.3f %c %.3f = %.3f\n",n1,operador,n2,result);
            fprintf(file,"%.3f %c %.3f = %.3f\n",n1,operador,n2,result);//Escrita no arquivo
            break;

        case Seno:
            printf("Digite o grau do angulo a ser usado\n");
            scanf("%f",&ang);
            fflush(stdin);
            seno=sine(ang);
            printf("%.8f\n",seno);
            fprintf(file,"sin(%.3f) = %.8f\n",ang,seno);
            break;

        case Cosseno:
            printf("Digite o grau do angulo a ser usado\n");
            scanf("%f",&ang);
            fflush(stdin);
            cosseno=cossine(ang);
            printf("%.8f\n",cosseno);
            fprintf(file,"cos(%.3f) = %.8f\n",ang,cosseno);
            break;

        case Tangente:
            printf("Digite o grau do angulo a ser usado\n");
            scanf("%f",&ang);
            fflush(stdin);
            tangente=tangent(ang);
            printf("%.8f\n",tangente);
            fprintf(file,"tan(%.3f) = %.8f\n",ang,tangente);
            break;

        case SenoHiperbolico:
            printf("Digite o grau do angulo a ser usado\n");
            scanf("%f",&ang);
            fflush(stdin);
            senh=sineh(ang);
            printf("%.8f\n",senh);
            fprintf(file,"senoh(%.3f) = %.8f\n",ang,senh);
            break;

        case CossenoHiperbolico:
            printf("Digite o grau do angulo a ser usado\n");
            scanf("%f",&ang);
            fflush(stdin);
            cosh=cossineh(ang);
            printf("%.8f\n",cosh);
            fprintf(file,"cosh(%.3f) = %.8f\n",ang,cosh);
            break;

        case TangenteHiperbolica:
            printf("Digite o grau do angulo a ser usado\n");
            scanf("%f",&ang);
            fflush(stdin);
            tangh=tangenth(ang);
            printf("%.8f\n",tangh);
            fprintf(file,"tangh(%.3f) = %.8f\n",ang,tangh);
            break;

        case Log10:
            printf("Digite um numero\n");
            scanf("%f",&num);
            fflush(stdin);
            result=logdez(num);
            printf("%.8f\n",result);
            fprintf(file,"log10(%.3f) = %.8f\n",num,result);
            break;

        case RaizQuadrada:
            printf("Digite um numero\n");
            scanf("%f",&num);
            fflush(stdin);
            result=raiz(num);
            printf("%.8f\n",result);
            fprintf(file,"raiz(%.3f) = %.8f\n",num,result);
            break;

        case Exp:
            printf("Digite um numero\n");
            scanf("%f",&num);
            fflush(stdin);
            result=expoente(num);
            printf("%.8f\n",result);
            fprintf(file,"exp(%.3f) = %.8f\n",num,result);
            break;

        case Exponencial:
            printf("Digite a base\n");
            scanf("%f",&x);
            fflush(stdin);
            printf("Digite o expoente\n");
            scanf("%f",&y);
            fflush(stdin);
            result=base(x,y);
            printf("%.8f\n",result);
            fprintf(file,"%.3f^%.3f = %.8f\n",x,y,result);
            break;

        case RaizCubica:
            printf("Digite um numero\n");
            scanf("%f",&num);
            fflush(stdin);
            result=raizcub(num);
            printf("%.8f\n",result);
            fprintf(file,"raizcub(%.3f) = %.8f\n",num,result);
            break;

        case Fatorial:
            printf("Digite um numero\n");
            scanf("%d",&z);
            fflush(stdin);
            fat=fatorial(z);
            printf("%d!= %d\n",z,fat);
            fprintf(file,"%d! = %d\n",z,fat);
            break;

        case Porcentagem:
            printf("Digite um numero");
            scanf("%f",&num);
            fflush(stdin);
            result=percent(num);
            printf("%.2f\n",result);
            fprintf(file,"%.2f porcento\n",result);
            break;

        case RaizQualquer:
            printf("Digite a base\n");
            scanf("%f",&num);
            fflush(stdin);
            printf("Digite o indice\n");
            scanf("%f",&indice);
            fflush(stdin);
            result=outra_raiz(num,indice);
            printf("%.8f\n",&result);
            fprintf(file,"raiz do numero %.3f com indice %.3f= %.8lf\n",num,indice,result);
            break;

        case Sair:
            break;

        default:
            printf("Funcao 404\n");
            break;
        }

        fclose(file);//Fechamento do arquivo
        printf("Deseja 0-Sair ou 1- Continuar?");//Pergunta ao usuario a opcao de sair ou voltar ao programa novamente
        scanf("%d",&k);
    }

    while(k==1);
    return 0;
}




float func1(float n1, float n2,char operador)
{
    float result;
    switch(operador)

    {
    case '+':
        result=n1+n2;
        break;

    case'-':
        result=n1-n2;
        break;

    case '*':
        result=n1*n2;
        break;

    case'/':
        if(n2==0)
        {
            system("pause");
        }
        result=n1/n2;
        break;

    }
    return(result);

}
float sine(float ang)
{
    return(sin(ang*PI/180));

}

float cossine(float ang)
{

    return(cos(ang*PI/180));

}

float tangent(float ang)
{
    return (tan(ang*PI/180));
}

float sineh(float ang)
{
    return(sinh(ang));

}
float cossineh(float ang)
{
    return (cosh(ang));
}

float tangenth(float ang)
{
    return(tanh(ang));
}

float logdez(float num)
{
    return (log10(num));
}

float raiz(float num)
{
    return(sqrt(num));
}

float expoente(float num)
{
    return(exp(num));
}

float base(float x,float y)
{
    return (pow(x,y));
}

float raizcub(float num)
{
    return (cbrt(num));
}

int fatorial(int z)
{
    if(z==0)
    {
        return 1;
    }
    else
        return(z*fatorial(z-1));//Funcao que usa recursividade para multiplicar o numero dado pelo seu anterior
}

float percent(float num)
{
    return num/100;
}

float outra_raiz(float num,float indice)
{

    float x=1,xzero=0;
    do
    {
        xzero=x;
        x=(1/indice)*((indice-1)*xzero+(num/pow(xzero,indice-1)));//Formula para o calculo da raiz de um numero de qualquer indice
    }
    while(x!=xzero);
    printf("%.8lf",x);
    return x;

}

