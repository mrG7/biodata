/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.opencb.biodata.models.variant.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class VariantAnnotation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"VariantAnnotation\",\"namespace\":\"org.opencb.biodata.models.variant.avro\",\"fields\":[{\"name\":\"chromosome\",\"type\":[\"null\",\"string\"]},{\"name\":\"start\",\"type\":[\"null\",\"int\"]},{\"name\":\"end\",\"type\":[\"null\",\"int\"]},{\"name\":\"referenceAllele\",\"type\":[\"null\",\"string\"]},{\"name\":\"alternateAllele\",\"type\":[\"null\",\"string\"]},{\"name\":\"id\",\"type\":[\"null\",\"string\"]},{\"name\":\"xrefs\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Xref\",\"doc\":\"* VariantAnnotation Start\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"]},{\"name\":\"src\",\"type\":[\"null\",\"string\"]}]}}]},{\"name\":\"hgvs\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}]},{\"name\":\"consequenceTypes\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ConsequenceType\",\"fields\":[{\"name\":\"geneName\",\"type\":[\"null\",\"string\"]},{\"name\":\"ensemblGeneId\",\"type\":[\"null\",\"string\"]},{\"name\":\"ensemblTranscriptId\",\"type\":[\"null\",\"string\"]},{\"name\":\"strand\",\"type\":[\"null\",\"string\"]},{\"name\":\"biotype\",\"type\":[\"null\",\"string\"]},{\"name\":\"cDnaPosition\",\"type\":[\"null\",\"int\"]},{\"name\":\"cdsPosition\",\"type\":[\"null\",\"int\"]},{\"name\":\"aaPosition\",\"type\":[\"null\",\"int\"]},{\"name\":\"aaChange\",\"type\":[\"null\",\"string\"]},{\"name\":\"codon\",\"type\":[\"null\",\"string\"]},{\"name\":\"functionalDescription\",\"type\":[\"null\",\"string\"]},{\"name\":\"proteinSubstitutionScores\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Score\",\"fields\":[{\"name\":\"score\",\"type\":[\"null\",\"double\"]},{\"name\":\"source\",\"type\":[\"null\",\"string\"]},{\"name\":\"description\",\"type\":[\"null\",\"string\"]}]}}]},{\"name\":\"soTerms\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ConsequenceTypeEntry\",\"fields\":[{\"name\":\"soName\",\"type\":[\"null\",\"string\"]},{\"name\":\"soAccession\",\"type\":[\"null\",\"string\"]}]}}]},{\"name\":\"expressionValues\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ExpressionValue\",\"fields\":[{\"name\":\"experimentalFactor\",\"type\":[\"null\",\"string\"]},{\"name\":\"factorValue\",\"type\":[\"null\",\"string\"]},{\"name\":\"experimentId\",\"type\":[\"null\",\"string\"]},{\"name\":\"technologyPlatform\",\"type\":[\"null\",\"string\"]},{\"name\":\"expression\",\"type\":{\"type\":\"enum\",\"name\":\"Expression\",\"symbols\":[\"UP\",\"DOWN\"]}},{\"name\":\"pvalue\",\"type\":[\"null\",\"float\"]}]}}]}]}}]},{\"name\":\"conservationScores\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Score\"}]},{\"name\":\"populationFrequencies\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"PopulationFrequency\",\"fields\":[{\"name\":\"study\",\"type\":[\"null\",\"string\"]},{\"name\":\"pop\",\"type\":[\"null\",\"string\"]},{\"name\":\"superPop\",\"type\":[\"null\",\"string\"]},{\"name\":\"refAllele\",\"type\":[\"null\",\"string\"]},{\"name\":\"altAllele\",\"type\":[\"null\",\"string\"]},{\"name\":\"refAlleleFreq\",\"type\":[\"null\",\"float\"]},{\"name\":\"altAlleleFreq\",\"type\":[\"null\",\"float\"]},{\"name\":\"refHomGenotypeFreq\",\"type\":[\"null\",\"float\"]},{\"name\":\"hetGenotypeFreq\",\"type\":[\"null\",\"float\"]},{\"name\":\"altHomGenotypeFreq\",\"type\":[\"null\",\"float\"]}]}}]},{\"name\":\"caddScore\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"CaddScore\",\"fields\":[{\"name\":\"transcriptId\",\"type\":[\"null\",\"string\"]},{\"name\":\"cScore\",\"type\":[\"null\",\"float\"]},{\"name\":\"rawScore\",\"type\":[\"null\",\"float\"]}]}}]},{\"name\":\"geneDrugInteraction\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"string\"}}]},{\"name\":\"clinical\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}]},{\"name\":\"additionalAttributes\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public CharSequence chromosome;
  @Deprecated public Integer start;
  @Deprecated public Integer end;
  @Deprecated public CharSequence referenceAllele;
  @Deprecated public CharSequence alternateAllele;
  @Deprecated public CharSequence id;
  @Deprecated public java.util.List<Xref> xrefs;
  @Deprecated public java.util.List<CharSequence> hgvs;
  @Deprecated public java.util.List<ConsequenceType> consequenceTypes;
  @Deprecated public java.util.List<Score> conservationScores;
  @Deprecated public java.util.List<PopulationFrequency> populationFrequencies;
  @Deprecated public java.util.List<CaddScore> caddScore;
  @Deprecated public java.util.Map<CharSequence,java.util.List<CharSequence>> geneDrugInteraction;
  @Deprecated public java.util.Map<CharSequence,CharSequence> clinical;
  @Deprecated public java.util.Map<CharSequence,CharSequence> additionalAttributes;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public VariantAnnotation() {}

  /**
   * All-args constructor.
   */
  public VariantAnnotation(CharSequence chromosome, Integer start, Integer end, CharSequence referenceAllele, CharSequence alternateAllele, CharSequence id, java.util.List<Xref> xrefs, java.util.List<CharSequence> hgvs, java.util.List<ConsequenceType> consequenceTypes, java.util.List<Score> conservationScores, java.util.List<PopulationFrequency> populationFrequencies, java.util.List<CaddScore> caddScore, java.util.Map<CharSequence,java.util.List<CharSequence>> geneDrugInteraction, java.util.Map<CharSequence,CharSequence> clinical, java.util.Map<CharSequence,CharSequence> additionalAttributes) {
    this.chromosome = chromosome;
    this.start = start;
    this.end = end;
    this.referenceAllele = referenceAllele;
    this.alternateAllele = alternateAllele;
    this.id = id;
    this.xrefs = xrefs;
    this.hgvs = hgvs;
    this.consequenceTypes = consequenceTypes;
    this.conservationScores = conservationScores;
    this.populationFrequencies = populationFrequencies;
    this.caddScore = caddScore;
    this.geneDrugInteraction = geneDrugInteraction;
    this.clinical = clinical;
    this.additionalAttributes = additionalAttributes;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public Object get(int field$) {
    switch (field$) {
    case 0: return chromosome;
    case 1: return start;
    case 2: return end;
    case 3: return referenceAllele;
    case 4: return alternateAllele;
    case 5: return id;
    case 6: return xrefs;
    case 7: return hgvs;
    case 8: return consequenceTypes;
    case 9: return conservationScores;
    case 10: return populationFrequencies;
    case 11: return caddScore;
    case 12: return geneDrugInteraction;
    case 13: return clinical;
    case 14: return additionalAttributes;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: chromosome = (CharSequence)value$; break;
    case 1: start = (Integer)value$; break;
    case 2: end = (Integer)value$; break;
    case 3: referenceAllele = (CharSequence)value$; break;
    case 4: alternateAllele = (CharSequence)value$; break;
    case 5: id = (CharSequence)value$; break;
    case 6: xrefs = (java.util.List<Xref>)value$; break;
    case 7: hgvs = (java.util.List<CharSequence>)value$; break;
    case 8: consequenceTypes = (java.util.List<ConsequenceType>)value$; break;
    case 9: conservationScores = (java.util.List<Score>)value$; break;
    case 10: populationFrequencies = (java.util.List<PopulationFrequency>)value$; break;
    case 11: caddScore = (java.util.List<CaddScore>)value$; break;
    case 12: geneDrugInteraction = (java.util.Map<CharSequence,java.util.List<CharSequence>>)value$; break;
    case 13: clinical = (java.util.Map<CharSequence,CharSequence>)value$; break;
    case 14: additionalAttributes = (java.util.Map<CharSequence,CharSequence>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'chromosome' field.
   */
  public CharSequence getChromosome() {
    return chromosome;
  }

  /**
   * Sets the value of the 'chromosome' field.
   * @param value the value to set.
   */
  public void setChromosome(CharSequence value) {
    this.chromosome = value;
  }

  /**
   * Gets the value of the 'start' field.
   */
  public Integer getStart() {
    return start;
  }

  /**
   * Sets the value of the 'start' field.
   * @param value the value to set.
   */
  public void setStart(Integer value) {
    this.start = value;
  }

  /**
   * Gets the value of the 'end' field.
   */
  public Integer getEnd() {
    return end;
  }

  /**
   * Sets the value of the 'end' field.
   * @param value the value to set.
   */
  public void setEnd(Integer value) {
    this.end = value;
  }

  /**
   * Gets the value of the 'referenceAllele' field.
   */
  public CharSequence getReferenceAllele() {
    return referenceAllele;
  }

  /**
   * Sets the value of the 'referenceAllele' field.
   * @param value the value to set.
   */
  public void setReferenceAllele(CharSequence value) {
    this.referenceAllele = value;
  }

  /**
   * Gets the value of the 'alternateAllele' field.
   */
  public CharSequence getAlternateAllele() {
    return alternateAllele;
  }

  /**
   * Sets the value of the 'alternateAllele' field.
   * @param value the value to set.
   */
  public void setAlternateAllele(CharSequence value) {
    this.alternateAllele = value;
  }

  /**
   * Gets the value of the 'id' field.
   */
  public CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'xrefs' field.
   */
  public java.util.List<Xref> getXrefs() {
    return xrefs;
  }

  /**
   * Sets the value of the 'xrefs' field.
   * @param value the value to set.
   */
  public void setXrefs(java.util.List<Xref> value) {
    this.xrefs = value;
  }

  /**
   * Gets the value of the 'hgvs' field.
   */
  public java.util.List<CharSequence> getHgvs() {
    return hgvs;
  }

  /**
   * Sets the value of the 'hgvs' field.
   * @param value the value to set.
   */
  public void setHgvs(java.util.List<CharSequence> value) {
    this.hgvs = value;
  }

  /**
   * Gets the value of the 'consequenceTypes' field.
   */
  public java.util.List<ConsequenceType> getConsequenceTypes() {
    return consequenceTypes;
  }

  /**
   * Sets the value of the 'consequenceTypes' field.
   * @param value the value to set.
   */
  public void setConsequenceTypes(java.util.List<ConsequenceType> value) {
    this.consequenceTypes = value;
  }

  /**
   * Gets the value of the 'conservationScores' field.
   */
  public java.util.List<Score> getConservationScores() {
    return conservationScores;
  }

  /**
   * Sets the value of the 'conservationScores' field.
   * @param value the value to set.
   */
  public void setConservationScores(java.util.List<Score> value) {
    this.conservationScores = value;
  }

  /**
   * Gets the value of the 'populationFrequencies' field.
   */
  public java.util.List<PopulationFrequency> getPopulationFrequencies() {
    return populationFrequencies;
  }

  /**
   * Sets the value of the 'populationFrequencies' field.
   * @param value the value to set.
   */
  public void setPopulationFrequencies(java.util.List<PopulationFrequency> value) {
    this.populationFrequencies = value;
  }

  /**
   * Gets the value of the 'caddScore' field.
   */
  public java.util.List<CaddScore> getCaddScore() {
    return caddScore;
  }

  /**
   * Sets the value of the 'caddScore' field.
   * @param value the value to set.
   */
  public void setCaddScore(java.util.List<CaddScore> value) {
    this.caddScore = value;
  }

  /**
   * Gets the value of the 'geneDrugInteraction' field.
   */
  public java.util.Map<CharSequence,java.util.List<CharSequence>> getGeneDrugInteraction() {
    return geneDrugInteraction;
  }

  /**
   * Sets the value of the 'geneDrugInteraction' field.
   * @param value the value to set.
   */
  public void setGeneDrugInteraction(java.util.Map<CharSequence,java.util.List<CharSequence>> value) {
    this.geneDrugInteraction = value;
  }

  /**
   * Gets the value of the 'clinical' field.
   */
  public java.util.Map<CharSequence,CharSequence> getClinical() {
    return clinical;
  }

  /**
   * Sets the value of the 'clinical' field.
   * @param value the value to set.
   */
  public void setClinical(java.util.Map<CharSequence,CharSequence> value) {
    this.clinical = value;
  }

  /**
   * Gets the value of the 'additionalAttributes' field.
   */
  public java.util.Map<CharSequence,CharSequence> getAdditionalAttributes() {
    return additionalAttributes;
  }

  /**
   * Sets the value of the 'additionalAttributes' field.
   * @param value the value to set.
   */
  public void setAdditionalAttributes(java.util.Map<CharSequence,CharSequence> value) {
    this.additionalAttributes = value;
  }

  /** Creates a new VariantAnnotation RecordBuilder */
  public static Builder newBuilder() {
    return new Builder();
  }
  
  /** Creates a new VariantAnnotation RecordBuilder by copying an existing Builder */
  public static Builder newBuilder(Builder other) {
    return new Builder(other);
  }
  
  /** Creates a new VariantAnnotation RecordBuilder by copying an existing VariantAnnotation instance */
  public static Builder newBuilder(VariantAnnotation other) {
    return new Builder(other);
  }
  
  /**
   * RecordBuilder for VariantAnnotation instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<VariantAnnotation>
    implements org.apache.avro.data.RecordBuilder<VariantAnnotation> {

    private CharSequence chromosome;
    private Integer start;
    private Integer end;
    private CharSequence referenceAllele;
    private CharSequence alternateAllele;
    private CharSequence id;
    private java.util.List<Xref> xrefs;
    private java.util.List<CharSequence> hgvs;
    private java.util.List<ConsequenceType> consequenceTypes;
    private java.util.List<Score> conservationScores;
    private java.util.List<PopulationFrequency> populationFrequencies;
    private java.util.List<CaddScore> caddScore;
    private java.util.Map<CharSequence,java.util.List<CharSequence>> geneDrugInteraction;
    private java.util.Map<CharSequence,CharSequence> clinical;
    private java.util.Map<CharSequence,CharSequence> additionalAttributes;

    /** Creates a new Builder */
    private Builder() {
      super(VariantAnnotation.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.chromosome)) {
        this.chromosome = data().deepCopy(fields()[0].schema(), other.chromosome);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.start)) {
        this.start = data().deepCopy(fields()[1].schema(), other.start);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.end)) {
        this.end = data().deepCopy(fields()[2].schema(), other.end);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.referenceAllele)) {
        this.referenceAllele = data().deepCopy(fields()[3].schema(), other.referenceAllele);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.alternateAllele)) {
        this.alternateAllele = data().deepCopy(fields()[4].schema(), other.alternateAllele);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.id)) {
        this.id = data().deepCopy(fields()[5].schema(), other.id);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.xrefs)) {
        this.xrefs = data().deepCopy(fields()[6].schema(), other.xrefs);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.hgvs)) {
        this.hgvs = data().deepCopy(fields()[7].schema(), other.hgvs);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.consequenceTypes)) {
        this.consequenceTypes = data().deepCopy(fields()[8].schema(), other.consequenceTypes);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.conservationScores)) {
        this.conservationScores = data().deepCopy(fields()[9].schema(), other.conservationScores);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.populationFrequencies)) {
        this.populationFrequencies = data().deepCopy(fields()[10].schema(), other.populationFrequencies);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.caddScore)) {
        this.caddScore = data().deepCopy(fields()[11].schema(), other.caddScore);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.geneDrugInteraction)) {
        this.geneDrugInteraction = data().deepCopy(fields()[12].schema(), other.geneDrugInteraction);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.clinical)) {
        this.clinical = data().deepCopy(fields()[13].schema(), other.clinical);
        fieldSetFlags()[13] = true;
      }
      if (isValidValue(fields()[14], other.additionalAttributes)) {
        this.additionalAttributes = data().deepCopy(fields()[14].schema(), other.additionalAttributes);
        fieldSetFlags()[14] = true;
      }
    }
    
    /** Creates a Builder by copying an existing VariantAnnotation instance */
    private Builder(VariantAnnotation other) {
            super(VariantAnnotation.SCHEMA$);
      if (isValidValue(fields()[0], other.chromosome)) {
        this.chromosome = data().deepCopy(fields()[0].schema(), other.chromosome);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.start)) {
        this.start = data().deepCopy(fields()[1].schema(), other.start);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.end)) {
        this.end = data().deepCopy(fields()[2].schema(), other.end);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.referenceAllele)) {
        this.referenceAllele = data().deepCopy(fields()[3].schema(), other.referenceAllele);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.alternateAllele)) {
        this.alternateAllele = data().deepCopy(fields()[4].schema(), other.alternateAllele);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.id)) {
        this.id = data().deepCopy(fields()[5].schema(), other.id);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.xrefs)) {
        this.xrefs = data().deepCopy(fields()[6].schema(), other.xrefs);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.hgvs)) {
        this.hgvs = data().deepCopy(fields()[7].schema(), other.hgvs);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.consequenceTypes)) {
        this.consequenceTypes = data().deepCopy(fields()[8].schema(), other.consequenceTypes);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.conservationScores)) {
        this.conservationScores = data().deepCopy(fields()[9].schema(), other.conservationScores);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.populationFrequencies)) {
        this.populationFrequencies = data().deepCopy(fields()[10].schema(), other.populationFrequencies);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.caddScore)) {
        this.caddScore = data().deepCopy(fields()[11].schema(), other.caddScore);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.geneDrugInteraction)) {
        this.geneDrugInteraction = data().deepCopy(fields()[12].schema(), other.geneDrugInteraction);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.clinical)) {
        this.clinical = data().deepCopy(fields()[13].schema(), other.clinical);
        fieldSetFlags()[13] = true;
      }
      if (isValidValue(fields()[14], other.additionalAttributes)) {
        this.additionalAttributes = data().deepCopy(fields()[14].schema(), other.additionalAttributes);
        fieldSetFlags()[14] = true;
      }
    }

    /** Gets the value of the 'chromosome' field */
    public CharSequence getChromosome() {
      return chromosome;
    }
    
    /** Sets the value of the 'chromosome' field */
    public Builder setChromosome(CharSequence value) {
      validate(fields()[0], value);
      this.chromosome = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'chromosome' field has been set */
    public boolean hasChromosome() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'chromosome' field */
    public Builder clearChromosome() {
      chromosome = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'start' field */
    public Integer getStart() {
      return start;
    }
    
    /** Sets the value of the 'start' field */
    public Builder setStart(Integer value) {
      validate(fields()[1], value);
      this.start = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'start' field has been set */
    public boolean hasStart() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'start' field */
    public Builder clearStart() {
      start = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'end' field */
    public Integer getEnd() {
      return end;
    }
    
    /** Sets the value of the 'end' field */
    public Builder setEnd(Integer value) {
      validate(fields()[2], value);
      this.end = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'end' field has been set */
    public boolean hasEnd() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'end' field */
    public Builder clearEnd() {
      end = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'referenceAllele' field */
    public CharSequence getReferenceAllele() {
      return referenceAllele;
    }
    
    /** Sets the value of the 'referenceAllele' field */
    public Builder setReferenceAllele(CharSequence value) {
      validate(fields()[3], value);
      this.referenceAllele = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'referenceAllele' field has been set */
    public boolean hasReferenceAllele() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'referenceAllele' field */
    public Builder clearReferenceAllele() {
      referenceAllele = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'alternateAllele' field */
    public CharSequence getAlternateAllele() {
      return alternateAllele;
    }
    
    /** Sets the value of the 'alternateAllele' field */
    public Builder setAlternateAllele(CharSequence value) {
      validate(fields()[4], value);
      this.alternateAllele = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'alternateAllele' field has been set */
    public boolean hasAlternateAllele() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'alternateAllele' field */
    public Builder clearAlternateAllele() {
      alternateAllele = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'id' field */
    public CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public Builder setId(CharSequence value) {
      validate(fields()[5], value);
      this.id = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'id' field */
    public Builder clearId() {
      id = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'xrefs' field */
    public java.util.List<Xref> getXrefs() {
      return xrefs;
    }
    
    /** Sets the value of the 'xrefs' field */
    public Builder setXrefs(java.util.List<Xref> value) {
      validate(fields()[6], value);
      this.xrefs = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'xrefs' field has been set */
    public boolean hasXrefs() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'xrefs' field */
    public Builder clearXrefs() {
      xrefs = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'hgvs' field */
    public java.util.List<CharSequence> getHgvs() {
      return hgvs;
    }
    
    /** Sets the value of the 'hgvs' field */
    public Builder setHgvs(java.util.List<CharSequence> value) {
      validate(fields()[7], value);
      this.hgvs = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'hgvs' field has been set */
    public boolean hasHgvs() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'hgvs' field */
    public Builder clearHgvs() {
      hgvs = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'consequenceTypes' field */
    public java.util.List<ConsequenceType> getConsequenceTypes() {
      return consequenceTypes;
    }
    
    /** Sets the value of the 'consequenceTypes' field */
    public Builder setConsequenceTypes(java.util.List<ConsequenceType> value) {
      validate(fields()[8], value);
      this.consequenceTypes = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'consequenceTypes' field has been set */
    public boolean hasConsequenceTypes() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'consequenceTypes' field */
    public Builder clearConsequenceTypes() {
      consequenceTypes = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'conservationScores' field */
    public java.util.List<Score> getConservationScores() {
      return conservationScores;
    }
    
    /** Sets the value of the 'conservationScores' field */
    public Builder setConservationScores(java.util.List<Score> value) {
      validate(fields()[9], value);
      this.conservationScores = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'conservationScores' field has been set */
    public boolean hasConservationScores() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'conservationScores' field */
    public Builder clearConservationScores() {
      conservationScores = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'populationFrequencies' field */
    public java.util.List<PopulationFrequency> getPopulationFrequencies() {
      return populationFrequencies;
    }
    
    /** Sets the value of the 'populationFrequencies' field */
    public Builder setPopulationFrequencies(java.util.List<PopulationFrequency> value) {
      validate(fields()[10], value);
      this.populationFrequencies = value;
      fieldSetFlags()[10] = true;
      return this; 
    }
    
    /** Checks whether the 'populationFrequencies' field has been set */
    public boolean hasPopulationFrequencies() {
      return fieldSetFlags()[10];
    }
    
    /** Clears the value of the 'populationFrequencies' field */
    public Builder clearPopulationFrequencies() {
      populationFrequencies = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /** Gets the value of the 'caddScore' field */
    public java.util.List<CaddScore> getCaddScore() {
      return caddScore;
    }
    
    /** Sets the value of the 'caddScore' field */
    public Builder setCaddScore(java.util.List<CaddScore> value) {
      validate(fields()[11], value);
      this.caddScore = value;
      fieldSetFlags()[11] = true;
      return this; 
    }
    
    /** Checks whether the 'caddScore' field has been set */
    public boolean hasCaddScore() {
      return fieldSetFlags()[11];
    }
    
    /** Clears the value of the 'caddScore' field */
    public Builder clearCaddScore() {
      caddScore = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /** Gets the value of the 'geneDrugInteraction' field */
    public java.util.Map<CharSequence,java.util.List<CharSequence>> getGeneDrugInteraction() {
      return geneDrugInteraction;
    }
    
    /** Sets the value of the 'geneDrugInteraction' field */
    public Builder setGeneDrugInteraction(java.util.Map<CharSequence,java.util.List<CharSequence>> value) {
      validate(fields()[12], value);
      this.geneDrugInteraction = value;
      fieldSetFlags()[12] = true;
      return this; 
    }
    
    /** Checks whether the 'geneDrugInteraction' field has been set */
    public boolean hasGeneDrugInteraction() {
      return fieldSetFlags()[12];
    }
    
    /** Clears the value of the 'geneDrugInteraction' field */
    public Builder clearGeneDrugInteraction() {
      geneDrugInteraction = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    /** Gets the value of the 'clinical' field */
    public java.util.Map<CharSequence,CharSequence> getClinical() {
      return clinical;
    }
    
    /** Sets the value of the 'clinical' field */
    public Builder setClinical(java.util.Map<CharSequence,CharSequence> value) {
      validate(fields()[13], value);
      this.clinical = value;
      fieldSetFlags()[13] = true;
      return this; 
    }
    
    /** Checks whether the 'clinical' field has been set */
    public boolean hasClinical() {
      return fieldSetFlags()[13];
    }
    
    /** Clears the value of the 'clinical' field */
    public Builder clearClinical() {
      clinical = null;
      fieldSetFlags()[13] = false;
      return this;
    }

    /** Gets the value of the 'additionalAttributes' field */
    public java.util.Map<CharSequence,CharSequence> getAdditionalAttributes() {
      return additionalAttributes;
    }
    
    /** Sets the value of the 'additionalAttributes' field */
    public Builder setAdditionalAttributes(java.util.Map<CharSequence,CharSequence> value) {
      validate(fields()[14], value);
      this.additionalAttributes = value;
      fieldSetFlags()[14] = true;
      return this; 
    }
    
    /** Checks whether the 'additionalAttributes' field has been set */
    public boolean hasAdditionalAttributes() {
      return fieldSetFlags()[14];
    }
    
    /** Clears the value of the 'additionalAttributes' field */
    public Builder clearAdditionalAttributes() {
      additionalAttributes = null;
      fieldSetFlags()[14] = false;
      return this;
    }

    @Override
    public VariantAnnotation build() {
      try {
        VariantAnnotation record = new VariantAnnotation();
        record.chromosome = fieldSetFlags()[0] ? this.chromosome : (CharSequence) defaultValue(fields()[0]);
        record.start = fieldSetFlags()[1] ? this.start : (Integer) defaultValue(fields()[1]);
        record.end = fieldSetFlags()[2] ? this.end : (Integer) defaultValue(fields()[2]);
        record.referenceAllele = fieldSetFlags()[3] ? this.referenceAllele : (CharSequence) defaultValue(fields()[3]);
        record.alternateAllele = fieldSetFlags()[4] ? this.alternateAllele : (CharSequence) defaultValue(fields()[4]);
        record.id = fieldSetFlags()[5] ? this.id : (CharSequence) defaultValue(fields()[5]);
        record.xrefs = fieldSetFlags()[6] ? this.xrefs : (java.util.List<Xref>) defaultValue(fields()[6]);
        record.hgvs = fieldSetFlags()[7] ? this.hgvs : (java.util.List<CharSequence>) defaultValue(fields()[7]);
        record.consequenceTypes = fieldSetFlags()[8] ? this.consequenceTypes : (java.util.List<ConsequenceType>) defaultValue(fields()[8]);
        record.conservationScores = fieldSetFlags()[9] ? this.conservationScores : (java.util.List<Score>) defaultValue(fields()[9]);
        record.populationFrequencies = fieldSetFlags()[10] ? this.populationFrequencies : (java.util.List<PopulationFrequency>) defaultValue(fields()[10]);
        record.caddScore = fieldSetFlags()[11] ? this.caddScore : (java.util.List<CaddScore>) defaultValue(fields()[11]);
        record.geneDrugInteraction = fieldSetFlags()[12] ? this.geneDrugInteraction : (java.util.Map<CharSequence,java.util.List<CharSequence>>) defaultValue(fields()[12]);
        record.clinical = fieldSetFlags()[13] ? this.clinical : (java.util.Map<CharSequence,CharSequence>) defaultValue(fields()[13]);
        record.additionalAttributes = fieldSetFlags()[14] ? this.additionalAttributes : (java.util.Map<CharSequence,CharSequence>) defaultValue(fields()[14]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}