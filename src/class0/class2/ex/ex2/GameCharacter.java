package class0.class2.ex.ex2;

public class GameCharacter {
    // 필드
    String name;
    int level;
    int health;

    // 생성자
    public GameCharacter(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }

    // 메서드
    void attack() {
        System.out.println(name + "의 공격!");
    }

    void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + "이 공격을 받았습니다."
                + damage + "를 입었습니다. 체력이"
                + health + "남았습니다."
        );
    }
}
