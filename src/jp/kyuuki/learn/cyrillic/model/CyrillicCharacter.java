package jp.kyuuki.learn.cyrillic.model;

public class CyrillicCharacter {
    private String character;
    private int level;  // ��Փx 1: �p��Ƃقړ���, 2: �p��ƈႤ�̂Œ���, 3: �����, 4: ���Ȃ���
    private int lesson;  // �A���R�[�� �܂��ɂ����V�A�� �J�^�c�����̏����҂̉�
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
