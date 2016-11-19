public class Array{
    
    public static void setValoresAleatorios(int v[]){
        int a = 1 + (int)(Math.random() * 100);
        int b = 1 + (int)(Math.random() * 100);
        
        for (int i=0;i<v.length;i++){
            int c=b-a;
            v[i]= a + (int)(Math.random() * (c));}
    }
    
    public static void setValoresDoTeclado (int v[]){
        Teclado t = new Teclado();
        for (int i=0;i<v.length;i++){
            v[i]=t.leInt("Digite o valor:");}
    }
        
    public static double calculaMediaAritmetica (int v[]){
        double variavel = 0;
        for(int i=0;i<v.length;i++){
            variavel+=v[i];}
        return variavel;
    }
    
    public static double calculaMediaAritmetica (int v[], int x, int y){ //somente dos elementos de índice x até y
        double variavel = 0;
        for(int i = x-1;i<=y;i++){
            variavel+=v[i];}
        return variavel;
    }
    
    public static int contaMultiplosDe3 (int v[]){
        int conta=0;
        for(int i=0;i<v.length;i++){
            if(v[i]%3==0) conta++;}
        return conta;    
    }

    public static int oMaiorValor (int v[]){
        int maior=0;
        for (int i=0;i<v.length;i++){
            if(v[i]>maior) maior = v[i];}
        return maior;
    }

    public static int indiceMenorValor (int v[]){
        int menor=0;
        for (int i=0;i<v.length;i++){
            if(v[i]<menor) menor = v[i];}
        return menor;
    }
    
    public static void exibeArray(int v[]){ //exibe o array na tela
        for (int i=0;i<v.length;i++){
            System.out.println(v[i]);}    
    }
    
    public static void exibeArray(int v[], String titulo){ //exibe o array na tela com o título (cabeçalho)
        System.out.println(titulo+"\n");
        for (int i=0;i<v.length;i++){
            System.out.println(v[i]);}
    }
    
    public static boolean pesquisa(int v[], int valor){
        boolean encontrou = false;
        for (int i=0;i<v.length;i++){
            if(v[i] == valor) return true;}
        return encontrou;
    }
    
    public static int[] getArraySoma (int a[], int b[]){ //retorna o array soma
        // AINDA EM DESENVOLVIMENTO
        int maxA = a.lenght;
        int maxB = b.lenght;
        int maior=0;
        int menor=0;
        if(maxA>maxB) maior = maxA;
        else maior = maxB;
        int array[] = new int[maior];
        for (int i=0;i<maior;i++){
            
        
    }
}
