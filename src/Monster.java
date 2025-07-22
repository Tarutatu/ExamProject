public abstract class Monster implements Creature{
    String name;
    private int hp;
    private char suffix = 'A';
    public Monster(String name, int hp, char suffix) {
        if (hp < 0) {
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
        this.name = name;
        this.setHp(hp);
        this.suffix = suffix;
    }
    public char getSuffix() {
        return this.suffix;
    }
    @Override
    public int getHp() {
        return this.hp;
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }
    @Override
    public final boolean isAlive(){
        return this.hp > 0;

    }
    @Override
    public void showStatus(){
        System.out.println(this.name + this.suffix + "：HP" + this.hp);
    }
}