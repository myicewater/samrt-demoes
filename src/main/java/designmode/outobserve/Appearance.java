package designmode.outobserve;

public class Appearance
{

    private Cpu cpu;
    private Memory mem;
    private Disk disk;
    public Appearance(Cpu cpu, Memory mem, Disk disk)
    {
        super();
        this.cpu = cpu;
        this.mem = mem;
        this.disk = disk;
    }
    
    void start(){
        cpu.startCup();
        mem.startMem();
        disk.startDisk();
    }
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Appearance a = new Appearance(new Cpu(), new Memory(), new Disk());
        a.start();
    }
    
    private void mian()
    {
       
    }
    
    
}

class Cpu{
    void startCup(){
        System.out.println("cpu start.");
    }
}


class Memory{
    void startMem(){
        System.out.println("mem start");
    }
    
}

class Disk{
    void startDisk(){
        System.out.println("disk start.");
    }
}