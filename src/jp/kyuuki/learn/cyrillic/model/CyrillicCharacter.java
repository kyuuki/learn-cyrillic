package jp.kyuuki.learn.cyrillic.model;

public class CyrillicCharacter {
    private String character;
    private int level;   // 難易度 1: 英語とほぼ同じ, 2: 英語と違うので注意, 3: やや難しい, 4: かなり難しい
    private int lesson;  // アンコール まいにちロシア語 カタツムリの初級編の課
    private String comment;

    public CyrillicCharacter(String character, int level, int lesson) {
        this.character = character;
        this.level = level;
        this.lesson = lesson;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCharacter() {
        return character;
    }

    public int getLevel() {
        return level;
    }

    public int getLesson() {
        return lesson;
    }
}
