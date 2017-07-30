class Game {
    private String mItem;
    private int mMaxItems;
    private int mGuesses = 0;

    public Game () {
        
    }

    public String getItem() {
        return mItem;
    }

    public String setItem(String item) {
        mItem = item;
        return mItem;
    }

    public int getMax() {
        return mMaxItems;
    }

    public int setMax(int max) {
        mMaxItems = max;
        return mMaxItems;
    }

    public int getGuesses() {
        return mGuesses;
    }

    public int setGuesses(int guesses) {
        mGuesses += guesses;
        return mGuesses;
    }

}