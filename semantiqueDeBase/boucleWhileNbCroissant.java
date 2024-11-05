class boucleWhileNbCroissant {
    public static void main(String[] args) {
        int totalCumulatif = 0;
        int nbActuel = 1;
        while (totalCumulatif <= 100) {
            System.out.println(totalCumulatif);
            totalCumulatif +=  nbActuel;
            nbActuel++;
        }
        System.out.println(totalCumulatif);
    }
}