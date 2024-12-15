public class lab4Task10 {
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }
    public static void main(String[] args) {
        System.out.println("Random letter: " + getRandomCharacter('A', 'z'));
        System.out.println("Random lowercase letter: " + getRandomLowerCaseLetter());
        System.out.println("Random uppercase letter: " + getRandomUpperCaseLetter());
    }
}