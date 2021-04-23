
package october;
import java.lang.Math;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Font;
import java.awt.*;

import javax.swing.JFrame;
public class October extends Canvas{
    double p(double m){
return m*m;
}
    double a(double x,double a,double b,double c,double d,double e,double f,double g,double h){
return ((b/((a-c)*(a-e)*(a-g)))*((x-c)*(x-e)*(x-g)))
        +((d/((c-a)*(c-e)*(c-g)))*(((x-a)*(x-e)*(x-g))))
        +((f/((e-c)*(e-a)*(e-g)))*(((x-c)*(x-a)*(x-g))))
        +((h/((g-c)*(g-e)*(g-a)))*((x-c)*(x-e)*(x-a)));
}
    double abs(double n){
    if(n<0)
        return -n;
    else 
        return n;
    }
    
    public void paint(Graphics g){

for(int i=0;i<1000;i++){
for(int j=0;j<1000;j++){
 int x=(i);
 int y=(-j);
 int n=320;
 int m=333;

 if((a(x,104,-969,170,-935,237,-926,329,-931)>y&&a(x,104,-969,170,-966,237,-950,329,-931)<y&&x>104&&x<=329)
   ||(a(x,170,-935,260,-902,430,-821,580,-755)>y&&a(x,170,-950,260,-923,430,-845,580,-770)<y&&x>170&&x<=580)
   ||(a(x,580,-755,720,-705,840,-676,996,-676)>y&&a(x,580,-770,720,-720,840,-691,996,-676)<y&&x>580&&x<=996)
   ||(a(y,-530,102,-700,83,-827,90,-916,134)<x&&a(y,-530,125,-700,107,-827,107,-916,134)>x&&y>-916&&y<=-530)
   ||(a(y,-530,102,-390,108,-250,105,-118,92)<x&&a(y,-530,125,-390,134,-250,132,-118,92)>x&&y>-530&&y<=-118)
   ||(a(y,-62,54,-118,92,-258,194,-290,209)<x&&a(y,-62,54,-118,107,-258,209,-290,209)>x&&y>-290&&y<=-62)
   ||(p(x-60)/p(495)+p(y+310)/p(248)<=1&&p(x-60)/p(470)+p(y+310)/p(223)>=1&&x>=60&&y>=-310&&(y+62)>-1*(x-60))
   ||(a(y,-310,530,-420,536,-540,500,-671,409)<x&&a(y,-310,555,-420,554,-540,511,-671,409)>x&&y>-671&&y<=-310)
   ||(a(y,-593,411,-630,405,-700,429,-748,587)<x&&a(y,-593,411,-630,430,-700,453,-748,587)>x&&y>-748&&y<=-593)
        
         )
        
      { 
     if((i+j)%(2*n)<n){
  Color E=new Color((int) (184+(((i+j)%n)*0.19)), (int) (134+(((i+j)%n)*0.33)), (int) (11+(((i+j)%n)*0.57)));
   g.setColor(E);      
g.drawLine(i, j, i, j);}
  if((i+j)%(2*n)>=n){
  Color E=new Color((int) (245-(((i+j)%n)*0.19)), (int) (241-(((i+j)%n)*0.33)), (int) (195-(((i+j)%n)*0.57)));
   g.setColor(E);      
g.drawLine(i, j, i, j);}}
 else {
   Color E=new Color(0,0,100);  
  g.setColor(E);      
g.drawLine(i, j, i, j);
 
 }
}}}
public static void main(String[] args) {
October m=new October();
JFrame f=new JFrame();
f.add(m);
f.setSize(10000,10000);
f.setVisible(true);
}
}
