import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
    private final String name;
    private final double orbitialPeriod;
    private final Set<HeavenlyBody> satellites;
    private final BodyTypes bodyType;

    public enum BodyTypes{
        STAR,PLANET,DWARF_PLANET,MOON,COMET,ASTEROID
    }


    public HeavenlyBody(String name, double orbitialPeriod,BodyTypes bodyType) {
        this.name = name;
        this.orbitialPeriod = orbitialPeriod;
        this.satellites =new HashSet<HeavenlyBody>();
        this.bodyType=bodyType;
    }

    public boolean addSatellite(HeavenlyBody moon){
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

    public boolean getBodyType() {
        return bodyType;
    }

    @Override
    public final boolean equals(Object obj){
        if(this==obj){
            return true;
        }

        if(obj instanceof HeavenlyBody){
            HeavenlyBody theObject =(HeavenlyBody) obj;
            if(this.name.equals(theObject.getName())){
                return this.bodyType==theObject.getBodyType();
            }
        }
        return false;

        String objName =((HeavenlyBody)obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public final int hashCode() {
        System.out.println("hashcode called");
        return this.name.hashCode()+57;
    }
}
