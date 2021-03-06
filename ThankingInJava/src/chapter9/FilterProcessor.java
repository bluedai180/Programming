package chapter9;

/**
 * Created by Blue on 2017/8/24.
 * 9.3 适配器模式
 */
interface Processor1 {
    String name();

    Object process(Object input);
}

class Waveform {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Waveform " + id;
    }
}

class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) {
        return input;
    }
}

class LowPass extends Filter{
    double cutoff;
    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input) {
        return input;
    }
}
class HighPass extends Filter{
    double cutoff;
    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input) {
        return input;
    }
}
class BandPass extends Filter{
    double lowCutoff, highCutoff;
    public BandPass(double lowCut, double highCut) {
        this.lowCutoff = lowCut;
        this.highCutoff = highCut;
    }
    public Waveform process(Waveform input) {
        return input;
    }
}

class Apply1{
    public static void process(Processor1 p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}

class FilterAdapter implements Processor1 {

    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    public String name() {
        return filter.name();
    }

    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}

public class FilterProcessor {
    public static void main(String[] args) {
        Waveform w = new Waveform();
        Apply1.process(new FilterAdapter(new LowPass(1.0)), w);
        Apply1.process(new FilterAdapter(new HighPass(2.0)), w);
        Apply1.process(new FilterAdapter(new BandPass(3.0, 4.0)),w);
    }
}
