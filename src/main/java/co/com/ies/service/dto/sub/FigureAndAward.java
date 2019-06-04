package co.com.ies.service.dto.sub;

public class FigureAndAward {

  private String figure;
  private String award;
  
  public FigureAndAward() {
    super();
  }

  public String getFigure() {
    return figure;
  }

  public void setFigure(String figure) {
    this.figure = figure;
  }

  public String getAward() {
    return award;
  }

  public void setAward(String award) {
    this.award = award;
  }

  @Override
  public String toString() {
    return "FigureAndAward [figure=" + figure + ", award=" + award + "]";
  }
  
  
}
