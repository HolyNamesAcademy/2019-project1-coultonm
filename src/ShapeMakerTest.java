import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hagotur on 8/23/2017.
 */
public class ShapeMakerTest {
    @Test
    public void printSquare() throws Exception {
        assertEquals(
                "* * *\n" +
                "* * *\n" +
                "* * *\n",
                ShapeMaker.PrintSquare(3));
    }

    @Test
    public void printRectangle() throws Exception {
        assertEquals(
                "* * * *\n" +
                        "* * * *\n" +
                        "* * * *\n",
                ShapeMaker.PrintRectangle(4, 3));
    }

    @Test
    public void printRightTriangle() throws Exception {
        assertEquals(
                "*\n" +
                        "* *\n" +
                        "* * *\n",
                ShapeMaker.PrintRightTriangle(3));
    }

    @Test
    public void printInvertedRightTriangle() throws Exception {
        assertEquals(
                "* * *\n" +
                        "* *\n" +
                        "*\n",
                ShapeMaker.PrintInvertedRightTriangle(3));
    }

    @Test
    public void printBackwardsRightTriangle() throws Exception {
        assertEquals(
                "    *\n" +
                        "  * *\n" +
                        "* * *\n",
                ShapeMaker.PrintBackwardsRightTriangle(3));
    }

    @Test
    public void printEquilateralTriangle() throws Exception {
        assertEquals(
                "  *  \n" +
                        " * * \n" +
                        "* * *\n",
                ShapeMaker.PrintEquilateralTriangle(3));
    }

}