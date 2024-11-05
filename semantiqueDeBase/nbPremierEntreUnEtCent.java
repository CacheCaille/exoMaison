import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class nbPremierEntreUnEtCent {
    
    public static void main(String[] args) {
        // Surement possible d'améliorer les perfs
        List<Integer> nbPremiers = new ArrayList<>();
        nbPremiers.add(1);
        nbPremiers.add(2);
        for (int i = 3; i <= 100; i++) {
            if (checkNbPremierWithPreviousOnes(nbPremiers,i)){
                nbPremiers.add(i);
            }
        }
        System.out.println(Arrays.toString(nbPremiers.toArray()));
    }

    private static boolean checkNbPremierWithPreviousOnes(List<Integer> nbPremiers, int aTester) {
        for (int nbPremier:nbPremiers) {
            if (nbPremier != 1 && aTester % nbPremier == 0)  {
                return false;
            }
        }
        return true;
    }
}
