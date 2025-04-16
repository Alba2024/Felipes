interface A{
    int getX();
    int getZ();
  
        void incrementaXZ(); 
    
        default void incrementaZ(){
            System.out.println("Incrementa Z en A");    
        }
    }
interface B{
    int getY();
    int getZ();
    void incrementaYZ();

        default void incrementaZ(){
            System.out.println("Incrementando Z en B "); 
        }
    }
public class D implements A, B{
    private int X;
    private int Y;
    private int Z;
    public D(int X, int Y, int Z){
        this.X = X;
        this.Y = Y;
        this.Z = Z;
    }
         
       @Override
    public int getX(){
        return X;
    }
       @Override
    public int getY(){
        return Y;
    }
     @Override
    public int getZ() {
       return Z;
    }
   
     public void incrementaXZ() {
       X++;
       Z++;
       System.out.println("incrementaXZ: x=" + X + ", z=" + Z);
   }
      @Override
   public void incrementaYZ() {
       Y++;
       Z++;
       System.out.println("incrementaYZ: y=" + Y + ", z=" + Z);
   }
    @Override
   public void incrementaZ() {
       System.out.println("Resolviendo ambigüedad: usando A.super.incrementaZ()");
       B.super.incrementaZ();
       System.out.println(Z);
       
   }
    public void incrementaXYZ() {
       X++;
       Y++;
       Z++;
       System.out.println("incrementaXYZ: x=" + X + ", y=" + Y + ", z=" + Z);
   }
}
