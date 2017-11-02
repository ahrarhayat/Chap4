public class Puzzle4b {

    int iver;

    public int doStuff(int factor) {
        if (iver > 100) {
            return iver * factor;
        } else {
            return iver *(5-factor);
        }
    }
}