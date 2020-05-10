public class BmiService {
    public long calculate (float x, float y) {
        long z = (long) (y / ((x /100) *(x / 100)));

        return z;

    }
}
