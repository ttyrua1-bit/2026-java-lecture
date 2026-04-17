package notion417.converterNotion;

public class Won2Dollar extends Converter{
    public Won2Dollar(int i) {
        super();
        ratio = i;

    }




    @Override
    protected double convert(double srs) {

        return srs/ratio;
    }

    @Override
    protected String getSrcString() {
        return "원";
    }

    @Override
    protected String getDestString() {
        return "달러";
    }





}
