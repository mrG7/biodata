/*
 * Copyright 2015 OpenCB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opencb.biodata.tools.variant.stats;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.opencb.biodata.models.variant.Variant;
import org.opencb.biodata.models.variant.VariantSource;
import org.opencb.biodata.models.variant.VariantSourceEntry;
import org.opencb.biodata.models.variant.VariantVcfFactory;
import org.opencb.biodata.models.variant.stats.VariantStats;

/**
 *
 * @author Cristina Yenyxe Gonzalez Garcia &lt;cyenyxe@ebi.ac.uk&gt;
 */
public class VariantStatsCalculatorTest {
    
    private VariantSource source = new VariantSource("filename.vcf", "fileId", "studyId", "studyName");

    @Test
    public void testCalculateBiallelicStats() {
        List<String> sampleNames = Arrays.asList("NA001", "NA002", "NA003", "NA004", "NA005", "NA006");
        source.setSamples(sampleNames);
        String line = "1\t10040\trs123\tT\tC\t10.05\tHELLO\t.\tGT:GL\t"
                + "0/0:1,2,3,4,5,6,7,8,9,10\t0/1:1,2,3,4,5,6,7,8,9,10\t0/1:1,2,3,4,5,6,7,8,9,10\t"
                + "1/1:1,2,3,4,5,6,7,8,9,10\t./.:1,2,3,4,5,6,7,8,9,10\t1/1:1,2,3,4,5,6,7,8,9,10"; // 6 samples

        // Initialize expected variants
        List<Variant> result = new VariantVcfFactory().create(source, line);
        assertEquals(1, result.size());
        
        Variant variant = result.get(0);
        VariantSourceEntry sourceEntry = variant.getSourceEntry(source.getFileId(), source.getStudyId());
        
        VariantStats biallelicStats = new VariantStats(result.get(0));
        VariantStatsCalculator.calculate(sourceEntry.getSamplesData(), sourceEntry.getAttributes(), null, biallelicStats);
        
        assertEquals("T", biallelicStats.getRefAllele());
        assertEquals("C", biallelicStats.getAltAllele());
        assertEquals(Variant.VariantType.SNV, biallelicStats.getVariantType());
        
        assertEquals(4, biallelicStats.getRefAlleleCount());
        assertEquals(6, biallelicStats.getAltAlleleCount());
        
//    private Map<Genotype, Integer> genotypesCount;
    
        assertEquals(2, biallelicStats.getMissingAlleles());
        assertEquals(1, biallelicStats.getMissingGenotypes());
    
        assertEquals(0.4, biallelicStats.getRefAlleleFreq(), 1e-6);
        assertEquals(0.6, biallelicStats.getAltAlleleFreq(), 1e-6);
        
//    private Map<Genotype, Float> genotypesFreq;
//    private float maf;
//    private float mgf;
//    private String mafAllele;
//    private String mgfGenotype;
        
        assertFalse(biallelicStats.hasPassedFilters());
    
        assertEquals(-1, biallelicStats.getMendelianErrors());
        assertEquals(-1, biallelicStats.getCasesPercentDominant(), 1e-6);
        assertEquals(-1, biallelicStats.getControlsPercentDominant(), 1e-6);
        assertEquals(-1, biallelicStats.getCasesPercentRecessive(), 1e-6);
        assertEquals(-1, biallelicStats.getCasesPercentRecessive(), 1e-6);
    
        assertTrue(biallelicStats.isTransition());
        assertFalse(biallelicStats.isTransversion());
        
        assertEquals(10.05, biallelicStats.getQuality(), 1e-6);
        assertEquals(6, biallelicStats.getNumSamples());
    
//    private VariantHardyWeinbergStats hw;
    }
    
    @Test
    public void testCalculateMultiallelicStats() {
        List<String> sampleNames = Arrays.asList("NA001", "NA002", "NA003", "NA004", "NA005", "NA006");
        source.setSamples(sampleNames);
        String line = "1\t10040\trs123\tT\tA,GC\t.\tPASS\t.\tGT:GL\t"
                + "0/0:1,2,3,4,5,6,7,8,9,10\t0/1:1,2,3,4,5,6,7,8,9,10\t0/2:1,2,3,4,5,6,7,8,9,10\t"
                + "1/1:1,2,3,4,5,6,7,8,9,10\t1/2:1,2,3,4,5,6,7,8,9,10\t2/2:1,2,3,4,5,6,7,8,9,10"; // 6 samples

        // Initialize expected variants
        List<Variant> result = new VariantVcfFactory().create(source, line);
        assertEquals(2, result.size());
        
        // Test first variant (alt allele C)
        Variant variant_C = result.get(0);
        VariantSourceEntry sourceEntry_C = variant_C.getSourceEntry(source.getFileId(), source.getStudyId());
        VariantStats multiallelicStats_C = new VariantStats(result.get(0));
        VariantStatsCalculator.calculate(sourceEntry_C.getSamplesData(), sourceEntry_C.getAttributes(), null, multiallelicStats_C);
        
        assertEquals("T", multiallelicStats_C.getRefAllele());
        assertEquals("A", multiallelicStats_C.getAltAllele());
        assertEquals(Variant.VariantType.SNV, multiallelicStats_C.getVariantType());
        
//        assertEquals(3, multiallelicStats_C.getRefAlleleCount());
//        assertEquals(4, multiallelicStats_C.getAltAlleleCount());
//        
////    private Map<Genotype, Integer> genotypesCount;
//    
//        assertEquals(0, multiallelicStats_C.getMissingAlleles());
//        assertEquals(0, multiallelicStats_C.getMissingGenotypes());
//    
//        assertEquals(0.375, multiallelicStats_C.getRefAlleleFreq(), 1e-6);
//        assertEquals(0.5, multiallelicStats_C.getAltAlleleFreq(), 1e-6);
        
//    private Map<Genotype, Float> genotypesFreq;
//    private float maf;
//    private float mgf;
//    private String mafAllele;
//    private String mgfGenotype;
        
        assertTrue(multiallelicStats_C.hasPassedFilters());
    
        assertEquals(-1, multiallelicStats_C.getMendelianErrors());
        assertEquals(-1, multiallelicStats_C.getCasesPercentDominant(), 1e-6);
        assertEquals(-1, multiallelicStats_C.getControlsPercentDominant(), 1e-6);
        assertEquals(-1, multiallelicStats_C.getCasesPercentRecessive(), 1e-6);
        assertEquals(-1, multiallelicStats_C.getCasesPercentRecessive(), 1e-6);
    
        assertFalse(multiallelicStats_C.isTransition());
        assertTrue(multiallelicStats_C.isTransversion());
        
        assertEquals(-1, multiallelicStats_C.getQuality(), 1e-6);
//        assertEquals(6, multiallelicStats_C.getNumSamples());
    
        
        // Test second variant (alt allele GC)
        Variant variant_GC = result.get(1);
        VariantSourceEntry sourceEntry_GC = variant_GC.getSourceEntry(source.getFileId(), source.getStudyId());
        VariantStats multiallelicStats_GC = new VariantStats(result.get(1));
        VariantStatsCalculator.calculate(sourceEntry_GC.getSamplesData(), sourceEntry_GC.getAttributes(), null, multiallelicStats_GC);
        
    }
    
}
