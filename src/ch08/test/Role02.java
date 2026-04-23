package ch08.test;

public enum Role02 {

    ADMIN("관리자",10),MANAGER("매니저",2),GUEST("게스트",1);
    private final String title;
    private final int level;

    Role02(String title, int level) {
        this.title = title;
        this.level = level;
    }
    public String getTitle() {
        return title;
    }

    public int getLevel() {
        return level;
    }

}
