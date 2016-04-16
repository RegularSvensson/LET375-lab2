/**
 * 
 * @author Mona Khoshoi, Elias Svensson
 * @since 14-04-16 
 * Email: khoshoimona@gmail.com, elias.svensson.1992@gmail.com
 *
 * 
 */
public class Sign implements Function<Double,Integer> {
    public Integer apply(Double x) {
        return x.compareTo(0.0d);
    }
}