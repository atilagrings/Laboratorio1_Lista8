public class ManipulaArray {
    private int[] a;  // letra a
    
    public ManipulaArray(){ // letra c
        a = new int [7];
    }
    
    public ManipulaArray(int tamanhoDoArray){ // letra e 
        if (tamanhoDoArray <0) tamanhoDoArray =7;
        a = new int [tamanhoDoArray];
    }
    
    //preenche o array com inteiros lidos do teclado
    public void setValoresDoTeclado(){ 
        int limite = a.length;
        Teclado t = new Teclado();
        System.out.println("\f");
        for (int i =0; i<limite ;i++){
            a[i]= t.leInt("Digite o número para o array " +i);
        }
    }
    
    //devolve o array
    public int[] getArray(){ 
        return a;
    }
    
    //exibe os valores armazenados no array,na tela
    public void exibeArray(){ 
        int limite = a.length;
        System.out.println("\f");
        for (int i=0; i<limite; i++){
            System.out.println("O array "+i+" vale: "+a[i]);
        }
    }

    // exibe o array na tela somente dos elementos de índice x 
    // até y. Se x ou y são índices inválidos, não exibe nada 
    public  void exibeArray(int x, int y){
        int menor,maior;
        if (x>y) {
            maior = x;
            menor = y;}
        else {
            menor = x;
            maior = y;}
        int limiteArray = a.length;
        System.out.println("\f");
        if (maior<(limiteArray) && menor>0){
            for(int i=menor; i<=maior;i++){
                System.out.println("Array "+i+" vale: "+a[i]);
            }} 
    }
    
    //preenche o array com valores inteiros aleatórios no intervalo [-50 , 100)
    public  void setValoresAleatorios ( ){
        int limite = a.length;
        for (int i=0; i<limite; i++){
            a[i] = -50 + (int) (Math.random() *150);
        }
    }

    // calcula e devolve a média aritméticados valores do array
    public  double calculaMedAritmetica ( ){
        int limite = a.length;
        int contador = 0;
        int soma = 0;
        for (int i=0; i<limite; i++){
            contador++;
            soma+=a[i];
        }
        return (double)soma/contador;
    }
    
    // calcula e devolve a soma dos valores armazenados no array
    public  double calculaSoma( ) {
        int limite = a.length;
        int soma = 0;
        for (int i=0; i<limite; i++){
            soma+=a[i];
        }
        return soma;        
    }
    
    //devolve o maior valor armazenado no array
    public  int oMaiorValor ( ){
        int limite = a.length;
        int maior = 0;
        for (int i=0; i<limite; i++){
            if (a[i]>maior) maior = a[i];
        }
        return maior;        
    }
    
    //devolve o menorvalor armazenado no array    
    public  int oMenorValor ( ) {
        int limite = a.length;
        int menor = a[0];
        for (int i=0; i<limite; i++){
            if (a[i]<menor) menor = a[i];
        }
        return menor;
    }
    
    // procura o valor e devolve true ou false indicando o resultado da pesquisa
    public boolean pesquisa( int valor) {
        int i=0;
        int limite = a.length;
        boolean encontrou = false;
        while(i<limite && (encontrou == false)){
            if (a[i] == valor) encontrou = true;
            i++;
        }
        return encontrou;
    }
    
    // procura o valor e devolve o índice onde foi encontrado ou -1 se não encontrou
    public int ondeEsta( int valor) {
        int i=0;
        int posicao =-1;
        int limite = a.length;
        boolean encontrou = false;
        while(i<limite && (encontrou == false)){
            if (a[i] == valor) {
                encontrou = true;
                posicao = i;}
            i++;
        }
        return posicao;    
    }
    
    // retorna quantas vezes o valor foi encontrado 
    public  int quantos( int valor) {
        int i=0;
        int nVezes =0;
        int limite = a.length;
        while(i<limite){
            if (a[i] == valor) {
                nVezes++;}
            i++;
        }
        return nVezes;        
    }
    
    // cria e retorna um novo array contendo3 números: o menor, o maior e a 
    // soma dos números armazenados no array atributo. Chame os métodos adequados.
    public int[] criaArray ( ){
        int[] b = new int[3];
        b[0] = oMenorValor();
        b[1] = oMaiorValor();
        b[2] = (int) calculaSoma();
        return b;
    }

    //exibe o array na tela com o título (cabeçalho)
    public  void exibeArray(String titulo){
        System.out.println ("\f"+titulo);
        exibeArray();
    }
    
    
    // preenche o array com os fatoriais dos índices    
    public void setFatoriais ( ){
        int limite = a.length;
        for (int i = 0; i<limite; i++){
            int fator = 1;
            for (int x=1; x<=i;x++){
                fator*=x;}
            a[i] = fator;
        }
    }
    
    // devolve a média aritmética somente dos elementos de índice x até y. Se x 
    // ou y são índices inválidos, retorna zero.
    public  double calculaMedAritmetica (int x, int y) {
        double media = 0;
        int menor,maior;
        int contador = 0;
        int soma= 0;
        if (x>y) {
            maior = x;
            menor = y;}
        else {
            menor = x;
            maior = y;}
        int limiteArray = a.length;
        if (maior<(limiteArray) && menor>0){
            for(int i=menor; i<=maior;i++){
                contador++;
                soma+=a[i];
            }}         
        if (contador !=0) media = (double) soma/contador;
        return media;
    }

    //devolve o índice do menorvalor armazenado no array
    public  int indiceMenorValor (){
        int menor = oMenorValor();
        int posicao = ondeEsta(menor);
        return posicao;
    }
    
    // classifica o array em ordem crescente
    public void classificaOrdemCrescente( ){
        int limite = a.length;
        int temporario = 0;
     // BUBBLE SORT o nome desse algoritmo:
     
     for(int x=0;x<limite;x++){
          for (int i=0; i<limite-1; i++){
               if (a[i]>a[i+1]){
                   temporario = a[i];
                   a[i]=a[i+1];
                   a[i+1]=temporario;
               }
          }
     }
    }

    // classifica o array em ordem decrescente
    public void classificaOrdemDecrescente( ){
        int limite = a.length;
        int temporario = 0;
     // BUBBLE SORT o nome desse algoritmo:
     
     for(int x=0;x<limite;x++){
          for (int i=0; i<limite-1; i++){
               if (a[i]<a[i+1]){
                   temporario = a[i];
                   a[i]=a[i+1];
                   a[i+1]=temporario;
               }
          }
     }
    }
    
    //cria e retorna um novo array contendo somente os números pares encontrados no
    //atributo. Se não há nenhum par, retorna null.
    public int [] obtemPares ( ){
        int limite = a.length;
        int total = 0;
        int[] novo;
        for (int i=0;i<limite;i++){
            if(a[i]%2==0)total++;}
        
        if (total>0){
            novo = new int[total];
            total = 0;
            for(int i=0; i<limite;i++){
                if (a[i]%2==0){
                    novo[total]=a[i];
                    total++;}
            }
            return novo;
        } 
        return null;    
    }

    // preenche o array com a série: 1, 1, 2, 3, 5, 8, 13,......
    public void setSerieFibonacci ( ){
        int limite = a.length;
        for (int i =0;i<limite;i++){
            if (i>=2){a[i]=a[i-1]+a[i-2];}
                else {a[i]=1;}
        }
    }
    
}