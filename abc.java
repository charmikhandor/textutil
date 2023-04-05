class abc{
    public static void main(String args[]){
    int arr[][]= new int[3][];
    arr[0]=new int[1];
    arr[1]=new int[2];
    arr[2]=new int[3];
    int count=1;
    for (int i=0; i<arr.length; i++){
        for (int j=0; j<arr[i].length; j++){
            arr[i][j]=count;
            count++;
        }
    }
    for (int k=0; k<arr.length; k++){
        for (int l=0; l<arr[k].length; l++){
            System.out.print(arr[k][l]+" ");
        }
    System.out.println();
    }
}
}