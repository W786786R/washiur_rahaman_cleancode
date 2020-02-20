package grp1.new1;



public class App 
{
	double sim=0;
	double com=0;
  public double compoundint(double x,double y,double z)
  {
	  double pr=0;
	  pr=x;
	  double t=0;
	  t=y;
	  double rate=0;
	  rate=z;
	  com=pr * Math.pow(1.0+rate/100.0,t) - pr;
	  return com;
  }
  public double simpleint(double x,double y,double z)
  {
      sim=(x * y * z)/100;
      return sim;
    }
}