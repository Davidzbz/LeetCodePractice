import java.util.ArrayList;

/**
 * Created by baizhongzhang on 2016-09-25.
 */
public class OeHomework{
    public static void main(String[] args){
        double p0 = 0.37182;
        double q0 = 0.311008;
        double r0 = 0.19284;
        double s0 = 0.124326;
        int i = 1;
        calculate(p0, q0, r0, s0, i);

    }

    public static void calculate( double p,  double q,  double r,  double s, int i){
        int NA = 276;
        int NAB = 220;
        int NAC = 194;
        int N = 1299;
        int NB = 294;
        int NC = 78;
        int NCD = 151;
        int ND = 86;
        double lastP = p;
        double lastQ = q;
        double lastR = r;
        double lastS = s;
        double Naa0 = NA*(Math.pow(p,2) / (Math.pow(p,2) + 2*p*s));
        double Nad0 = NA*(2*p*s/ (Math.pow(p,2) + 2*p*s));
        double Nbb0 = NB*(Math.pow(q,2) / (Math.pow(q,2) + 2*q*s));
        double Nbd0 = NB*(2*q*s / (Math.pow(q,2) + 2*q*s));
        double Nbc0 = NB*(2*q*r / (Math.pow(q,2) + 2*q*r));
        p = (2*Naa0 + Nad0 + NAB + NAC)/(2*N);
        q = (2*Nbb0 + Nbd0 + NAB + Nbc0)/(2*N);
        r = (2*NC + Nbc0 + NAC + NCD)/(2*N);
        s = (2*ND + NCD + Nad0 + Nbd0)/(2*N);
        System.out.println("iteration " + i);
        i++;
        double pPercent = (Math.abs(lastP - p)/p)*100;
        double qPercent = (Math.abs(lastQ - q)/q)*100;
        double rPercent = (Math.abs(lastR - r)/r)*100;
        double sPercent = (Math.abs(lastS - s)/s)*100;
        System.out.print("p "+p + " p % " + pPercent+"%");
        System.out.print("   q "+ p + " p % " + qPercent+"%");
        System.out.print("   r "+r+ " r % " + rPercent+"%");
        System.out.print("   s "+s + " s % " + sPercent+"%");
        System.out.println("      ");
        if(i <= 6) {
            calculate(p, q, r, s, i);
        }
    }
}
