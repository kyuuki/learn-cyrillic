package jp.kyuuki.learn.cyrillic.model;

import java.io.Serializable;
import java.util.Comparator;

public class CyrillicCharacter implements Serializable {
    private static final long serialVersionUID = -7033295995285933399L;

    private String character;
    private int level;   // 難易度 1: 英語とほぼ同じ, 2: 英語と違うので注意, 3: やや難しい, 4: かなり難しい
    private int lesson;  // アンコール まいにちロシア語 カタツムリの初級編の課
    private String comment;
    private boolean needsAttentionForSmall;  // 小文字注意！

    public CyrillicCharacter(String character, int level, int lesson) {
        this.character = character;
        this.level = level;
        this.lesson = lesson;
        this.needsAttentionForSmall = false;
    }

    public CyrillicCharacter(String character, int level, int lesson, boolean needsAttentionForSmall) {
        this.character = character;
        this.level = level;
        this.lesson = lesson;
        this.needsAttentionForSmall = needsAttentionForSmall;
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
    public boolean isNeedsAttentionForSmall() {
        return needsAttentionForSmall;
    }

    // 課で比較。
    public static class LessonComparator implements Comparator<CyrillicCharacter> {
        @Override
        public int compare(CyrillicCharacter lhs, CyrillicCharacter rhs) {
            return lhs.getLesson() - rhs.getLesson();
        }
    }
}
