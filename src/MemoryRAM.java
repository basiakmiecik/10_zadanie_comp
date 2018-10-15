public class MemoryRAM extends Computer implements Power{
    private double clockingBase;
    private int memory;
    private int workTempBase;
    private int workTemp;
    private int maxTemp;
    private double clocking;


    public MemoryRAM(String name, String producent, String serialNumber, int memory, int workTemp, int maxTemp, double clocking) {
        super(name, producent, serialNumber);
        this.memory = memory;
        this.workTemp = workTemp;
        this.maxTemp = maxTemp;
        this.clocking = clocking;
        workTempBase=workTemp;
        clockingBase=clocking;
    }


    public double getClocking() {
        return clocking;
    }

    public void setClocking(double clocking) {
        this.clocking = clocking;
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

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getWorkTempBase() {
        return workTempBase;
    }

    public double getClockingBase() {
        return clockingBase;
    }

    public void setClockingBase(double clockingBase) {
        this.clockingBase = clockingBase;
    }

    public void setWorkTempBase(int workTempBase)

    {
        this.workTempBase = workTempBase;
    }

    @Override
    public double increasingClocking(int addClocking) {
        workTemp=workTemp+(addClocking/100)*15;
        if(workTemp>=maxTemp)
            throw new TemperatureOverEcxeption();
            else{
            clocking=clockingBase+addClocking;}
            return clocking;
    }

    @Override
    public double decreasingClocking(int diffClocking) {
        workTemp -= (diffClocking / 100) * 15;
        if (workTemp < workTempBase)
    workTemp = workTempBase;
        if (clocking > clockingBase)
        return clocking -= diffClocking;
    return clocking=clockingBase;}
}

