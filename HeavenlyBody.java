import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HeavenlyBody {
    private final String name;
    private final double orbitialPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitialPeriod) {
        this.name = name;
        this.orbitialPeriod = orbitialPeriod;
        this.satellites =new HashSet<HeavenlyBody>();
    }

    public boolean addMoon(HeavenlyBody moon){
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites(){
        return new HashSet<>(this.satellites);
    }

    public String getName() {
        return name;
    }

    public double getOrbitialPeriod() {
        return orbitialPeriod;
    }


    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        System.out.println("Obj.getclass() is :"+obj.getClass());
        System.out.println("Obj.getclass() is :"+this.getClass());

        if((obj==null)||(obj.getClass())!=this.getClass()){
    return false;
        }

        String objName =((HeavenlyBody)obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode called");
        return this.name.hashCode()+57;
    }
}
