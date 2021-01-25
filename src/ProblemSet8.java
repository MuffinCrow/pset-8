import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;

public class ProblemSet8 {

    public boolean common(int[] a, int[] b) {
        if (a != null && a.length > 0 && b != null && b.length > 0) {
            if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
                return true;
            }
        }
        return false;
    }

    public int[] middleman(int[] a, int[] b) {
        if (a != null && b != null &&
            a.length > 0 && b.length > 0 &&
            a.length % 2 == 1 && b.length % 2 == 1) {
            int al = a.length - 1;
            int bl = b.length - 1;

            int[] output = {a[al / 2], b[bl / 2]};
            return output;
        }
        return null;
    }

    public int[] bigger(int[] a, int[] b) {
        if (a != null && b != null) {
            int asum = 0;
            int bsum = 0;

            if (a.length > 0) {
                for (int i = 0; i < a.length; i++) {
                    asum += a[i];
                }
            }

            if (b.length > 0) {
                for (int i = 0; i < b.length; i++) {
                    bsum += b[i];
                }
            }

            if (asum == bsum) {
                return a;
            }

            if (asum > bsum) {
                return a;
            } else {
                return b;
            }
        }
        return null;
    }

    public int[] doubleMiddle(int[] a, int[] b) {
        if (a != null && b != null &&
                a.length > 0 && b.length > 0 &&
                a.length % 2 == 0 && b.length % 2 == 0) {
            int[] output = {a[a.length / 2 - 1], a[a.length / 2], b[b.length / 2 - 1], b[b.length / 2]};
            return output;
        }
        return null;
    }

    public int[] swapMe(int[] a) {
        if (a != null) {
            if (a.length > 0) {
                if (a.length > 1) {
                    int temp = a[0];
                    a[0] = a[a.length - 1];
                    a[a.length - 1] = temp;
                    return a;
                }
                return a;
            }
            return a;
        }
        return null;
    }

    public int[] threePoint(int[] a) {
        if (a != null && a.length > 0 && a.length % 2 == 1) {
            int[] output = {a[0], a[(a.length - 1) / 2], a[a.length - 1]};
            return output;
        }
        return null;
    }

    public int headHoncho(int[] a) {
        if (a != null && a.length > 0) {
            int output = -1;
            for (int i : a) {
                if (i < 0) {
                    return -1;
                } else if (i > output) {
                    output = i;
                }
            }
            return output;
        }
        return -1;
    }

    public boolean tippingPoint(int[] a, int threshold) {
        if (a != null) {
            int sum = 0;
            for (int i : a) {
                sum += i;
            }
            if (sum > threshold) {
                return true;
            }
        }
        return false;
    }

    public String halfway(int[] a) {
        if (a != null && a.length > 0 && a.length % 2 == 0) {
            ArrayList<Integer> left = new ArrayList<Integer>();
            ArrayList<Integer> right = new ArrayList<Integer>();
            int lsum = 0;
            int rsum = 0;
            for (int i = 0; i < a.length / 2; i++) {
                left.add(a[i]);
                lsum += a[i];
            }
            for (int i = a.length / 2; i < a.length; i++) {
                right.add(a[i]);
                rsum += a[i];
            }

            if (rsum >= lsum) {
                return "RIGHT";
            } else {
                return "LEFT";
            }
        }
        return null;
    }

    public int[] sequential(int[] a, int[] b) {
        if (a != null && b != null && a.length + b.length >= 3) {
            ArrayList<Integer> o = new ArrayList<Integer>();
            int s = 0;
            for (int i = 0; i < 3; i++) {
                if (i >= a.length) {
                    o.add(b[s]);
                    s++;
                } else {
                    o.add(a[i]);
                }
            }
            int[] output = {o.get(0), o.get(1), o.get(2)};
            return output;
        }
        return null;
    }
}
