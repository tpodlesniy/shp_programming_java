public class Spin {

    private int min = 1;
    private int max = 4;

    private int random1;
    private int random2;
    private int random3;

    public Spin(){
        random1 = GetNextRandom();
        random2 = GetNextRandom();
        random3 = GetNextRandom();
    }

    public Boolean IsVictory()
    {
        return random1 == random2 && random2 == random3;
    }

    private int GetNextRandom()
    {
        return (int) ( Math.random() * (max - min) + min);
    }

    public int getRandom1() {
        return random1;
    }

    public int getRandom2() {
        return random2;
    }

    public int getRandom3() {
        return random3;
    }
}
