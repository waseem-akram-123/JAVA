public class Solid_Rectangle {
    public static void main (String args[]){
        
        // solid rectangle
        int n = 4;  // rows
        int m = 5;  // columns

        for (int i=1; i<=n; i++){
            for (int j=1; j<=m; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
