public class BmiService {
    public long calculate(float stature, float body) {
        long index = (long) (body / ((stature / 100) * (stature / 100)));

        return index;

    }
}
