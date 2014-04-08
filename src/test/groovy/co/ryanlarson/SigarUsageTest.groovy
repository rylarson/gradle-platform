package co.ryanlarson

import org.hyperic.sigar.Sigar
import org.junit.Test

/**
 * Created by rlarson on 4/8/14.
 */
class SigarUsageTest {

    @Test
    void testSigar() {
        Sigar sigar = new Sigar()
        sigar.cpuInfoList
    }

}
