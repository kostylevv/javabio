package numbers1;

public class Numbers {

    public static void main(String[] args) {

        System.out.println(getBSEConcentration());

    }

    public static double getBSEConcentration(){
        final double slope = 0.0474;
        final double intercept = -0.0649;
        final int volume = 15;
        final double opticalDensity = .775;

        final double mass = (opticalDensity-intercept)/slope;

        return mass/volume;
    }

}
