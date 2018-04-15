
import junit.framework.TestCase;

//The javadoc and comments are not written with the right format as the shortcuts used in standard IDE are not available and needs to be done manually. 
public class NumToRomanConvertorTest extends TestCase {
    //
    // /!\ Unit Tests are optional but highly recommended /!\
    //
    // First Example
    //

    public void testExampleOne() {
        NumToRomanConvertor s = new NumToRomanConvertor();
        assertEquals("MCMLIV", s.run(1954));
    }
    //
    // Second Example
    //

    public void testExampleTwo() {
        NumToRomanConvertor s = new NumToRomanConvertor();
        assertEquals("MCMXC", s.run(1990));
    }
    //
    // Third Example
    //

    public void testExampleThree() {
        NumToRomanConvertor s = new NumToRomanConvertor();
        assertEquals("MMXIV", s.run(2014));
    }

    /*
	* This test is to verify the results same as Test case provided in template.
	* using the given values only considering the time constraint. 
     */
    public void testRunWithMultipleValidScenarios() {
        NumToRomanConvertor s = new NumToRomanConvertor();
        assertEquals("CC", s.run(200));
        assertEquals("MCMXCIII", s.run(1993));
        assertEquals("MMXVI", s.run(2016));
        assertEquals("MMMMMMMMMCMXCIX", s.run(9999));
    }

    public void testMapData() {
        NumToRomanConvertor s = new NumToRomanConvertor();
        int mapSize = s.getMap().size();
        assertEquals(13, mapSize);
    }

    /*
	* This test is to verify the results same as Test case provided in template.
	* using the given values only considering the time constraint. 
     */
    public void testRunWithInvalidScenarios() {
        NumToRomanConvertor s = new NumToRomanConvertor();
        assertEquals("CC", s.run(200));
        assertEquals("MCMXCIII", s.run(1993));
        assertEquals("MMXVI", s.run(2016));
        assertEquals("MMMMMMMMMCMXCIX", s.run(9999));
        assertEquals("MCMIV", s.run(1904));
    }

    public void testRun_ValidateMaxAndMinValues() {
        NumToRomanConvertor s = new NumToRomanConvertor();
        assertEquals("MMMMMMMMMM", s.run(10000));
        assertEquals("I", s.run(1));
    }

    public void testRun_ValidateBoundaryValues() {
        NumToRomanConvertor s = new NumToRomanConvertor();
        assertEquals("Invalid input", s.run(10001));
        assertEquals("Invalid input", s.run(0));
    }

}
