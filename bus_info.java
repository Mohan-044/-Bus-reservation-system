public class bus_info{
    private int businfo;
    private int capacity;
    private boolean ac;
    bus_info(int businfo,int capacity,boolean ac){
        this.businfo=businfo;
        this.capacity=capacity;
        this.ac=ac;
    }
    public int getcapacity(){  //accessor method
        return capacity;
    }
    public void setcapacity(int capacity){//mutators
        this.capacity=capacity;
    }
    public boolean getac(){
        return ac;
    }
    public void setac(boolean ac){
        this.ac=ac;
    }
    public int getbus(){
        return businfo;
    }
    public void setbus(int businfo){
        this.businfo=businfo;
    }
    public void displaybusinfo(){
        System.out.println("Bus info\n"+"Bus No: "+businfo+"Total Capacity: "+capacity+"Ac: "+ac);
    }
}
