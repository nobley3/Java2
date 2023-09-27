package java2prj1.interfaceEx.cook;

public class ChineseCook extends Cook implements 중식가능한 {

    @Override
    public String 마라탕만들기() {
        return "마라탕을 만듭니다.";
    }

    @Override
    public String 탕수육만들기() {
        return "탕수육을 만듭니다.";
    }

    @Override
    public String 짜장면만들기() {
        return "짜장면을 만듭니다.";
    }
}
