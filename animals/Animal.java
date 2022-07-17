package animals;


public abstract class Animal implements Actions {
    String breed;
    String nickname;

    public Animal(String breed, String nick) {
        this.breed = breed;
        this.nickname = nick;
    }

    public Animal(String breed) {
        this(breed, "");
    }

    public Animal() {
        this("", "");
    }

    public void setInfo(String breed, String nick) {
        this.breed = breed;
        this.nickname = nick;
    }

    public String getNick() {
        return String.format("%s", this.nickname);
    }

    public String getInfo() {
        return String.format("%s, breed - %s, nickname - %s", this.getClass().getSimpleName(),
                this.breed, this.nickname);
    }

}