import java.util.Arrays;

public class FiniteStateAutomata {

    static private final State[][] lookupTable = {{State.A, State.B}, {State.C, State.A}, {State.B, State.C}};

    static void binaryIsDivisbileByThree(String str) {
        String[] charArr = str.split("");
        State currentState = State.A;
        String printMsg;
        for (String s: charArr) {
            if (s.equals("0") || s.equals("1")){
                currentState = returnNextState(currentState, Integer.parseInt(s));
            } else {
                printMsg = "Not an accepted digit";
                break;
            }
        }
        printMsg = currentState.equals(State.A) ? "Yes" : "No";
        System.out.println(printMsg);
    }

    static State returnNextState(State st, int digit) {
        return lookupTable[st.arrPos][digit];
    }
}
