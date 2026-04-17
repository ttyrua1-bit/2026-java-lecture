package notion417.converterNotion;

public class Km2Mile extends Converter{

    public Km2Mile(double i) {
        super();
        ratio = i;
    }


    @Override
    protected double convert(double srs) {
        return srs/ratio;
    }

    @Override
    protected String getSrcString() {
        return "Km";
    }

    @Override
    protected String getDestString() {
        return "mile";
    }
}
