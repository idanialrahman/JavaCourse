public enum Fruit {
    Apple(4),
    Mango(80),
    PineApple(90),
    Peach(70),
    Apricot(30),
    Grapes(40),
    Banana(60);

    int Rating;

    Fruit(int rating){
        this.Rating=rating;
    }

    public int getRating() {
        return Rating;
    }
}
