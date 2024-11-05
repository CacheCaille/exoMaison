public class switchDetectVoyelleConsonne {
    public static void main(String[] args) {
        char lettre = 'E';
        // Possible de demander l'input d'un au lieu de changer l'affectation de la variable lettre
        switch(lettre) {
            case 'A','E','I','O','U','Y':
                System.out.println(lettre + " est une voyelle");
                break;
            default:
                System.out.println(lettre + " est une consonne");
                break;
        }
    }
}
