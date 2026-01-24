public class InvestmentPlanner {

    static double sip(double monthly,int years, double rate){
        int months = years *12;
        double r = rate/(12*100);

        return monthly*((Math.pow(1+r,months)-1)/r)*(1+r);

    }

    static double lumpsum(double principal ,int years, double rate){
        return principal * Math.pow(1+rate/100,years);
    }

}
