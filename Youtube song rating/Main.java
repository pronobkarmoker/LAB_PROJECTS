public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("E hawa", "X", 1975, 4.8);
        song1.play();
        song1.rate(5);
        song1.rate(4);

        Song song2 = new Song("Despacito", "Y", 1971, 4.4);
        song2.play();
        song2.rate(3);
        song2.rate(5);
    }
}
