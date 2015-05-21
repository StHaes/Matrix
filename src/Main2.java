import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

/**
 * Created by jeansmits on 21/05/15.
 */
public class Main2 {
    public static void main(String[] args) {
        RealMatrix rm = MatrixUtils.createRealMatrix(new double[][]{{1,2},{3,4},{5,6}});

        RealMatrix rmr = MatrixUtils.createRealMatrix(new double[][]{{2,4,6},{1,2,3}});

        System.out.println(rm.multiply(rmr));

    }
}
