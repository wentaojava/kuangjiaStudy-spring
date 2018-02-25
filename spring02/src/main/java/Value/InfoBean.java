package Value;

/**spring表达式
 * @time: 2018年02月25日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
public class InfoBean {
    private String name;
    private String interest;
    private double score;
    private int pageSize;

    @Override
    public String toString() {
        return "InfoBean{" +
                "name='" + name + '\'' +
                ", interest='" + interest + '\'' +
                ", score=" + score +
                ", pageSize=" + pageSize +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
