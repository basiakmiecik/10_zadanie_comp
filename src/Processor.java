public class Processor extends Computer implements Power{
    private double clocking;
    private double clockingBase;
    private int workTempBase;
    private int workTemp;
    private int maxTemp;

    public Processor(String name, String producent, String serialNumber, double clocking, int workTemp, int maxTemp) {
        super(name, producent, serialNumber);
        this.clocking = clocking;
        this.workTemp = workTemp;
        this.maxTemp = maxTemp;
        workTempBase=workTemp;
        clockingBase=clocking;
    }


    public double getClocking() {
        return clocking;
    }

    public void setClocking(double clocking) {
        this.clocking = clocking;
    }

    public int getWorkTempBasel() {
        return workTempBase;
    }

    public void setWorkTempBase(int workTempBasel) {
        this.workTempBase = workTempBasel;
    }

    public int getWorkTemp() {
        return workTemp;
    }

    public void setWorkTemp(int workTemp) {
        this.workTemp = workTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    @Override
    public double increasingClocking(int addClocking) {
        workTemp=workTemp+(addClocking/100)*10;
        clocking=clockingBase;
        if(workTemp>=maxTemp) {
            throw new TemperatureOverEcxeption();
        } else
            return clocking=clockingBase+addClocking;
    }

    @Override
    public double decreasingClocking(int diffClocking) {
        workTemp -= (diffClocking / 100) * 10;
        if (workTemp < workTempBase)
            workTemp = workTempBase;
        if (clocking > clockingBase)
            return clocking -= diffClocking;;
    return clocking=clockingBase;}
}
