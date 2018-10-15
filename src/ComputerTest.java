public class ComputerTest {
    public static void main(String[] args) {
        Computer memory= new MemoryRAM("Burn", "Asus","678-4556",4096,45,80,1066);
        Computer processor= new Processor("CoffeeLake", "Intel","123-4556",3000,40,70);
        Computer disc=new Disc("venom","Asus","123-456",256);

        try {
            System.out.println("Pamięć: "+((MemoryRAM) memory).increasingClocking(100)+ " "+
                    ((MemoryRAM) memory).getWorkTemp());
            System.out.println("Procesor: "+((Processor) processor).increasingClocking(100)+" "+
                    ((Processor) processor).getWorkTemp());
            }catch (TemperatureOverEcxeption e){
                String element="";
                    if(((Processor) processor).getWorkTemp()>=((Processor) processor).getMaxTemp()){
                        element=" - procesor";}
                    else if(((MemoryRAM) memory).getWorkTemp()>=((MemoryRAM) memory).getMaxTemp()){
                        element=" - pamięć";
                    }
                    System.err.println("Temperatura max została przekroczona!"+element);
            }

        System.out.println("Pamięć obniżanie o 200 MGH "+ ((MemoryRAM) memory).decreasingClocking(200)
                +" "+((MemoryRAM) memory).getWorkTemp());
        System.out.println("Pamięć obniżanie o 200 MGH "+ ((Processor) processor).decreasingClocking(200)
                +" "+((Processor) processor).getWorkTemp());





    }
}
