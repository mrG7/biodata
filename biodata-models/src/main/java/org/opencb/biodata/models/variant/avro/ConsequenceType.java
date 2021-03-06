/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.opencb.biodata.models.variant.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ConsequenceType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ConsequenceType\",\"namespace\":\"org.opencb.biodata.models.variant.avro\",\"fields\":[{\"name\":\"geneName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"ensemblGeneId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"ensemblTranscriptId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"strand\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"biotype\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"cDnaPosition\",\"type\":[\"null\",\"int\"]},{\"name\":\"cdsPosition\",\"type\":[\"null\",\"int\"]},{\"name\":\"aaPosition\",\"type\":[\"null\",\"int\"]},{\"name\":\"aaChange\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"codon\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"functionalDescription\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"proteinSubstitutionScores\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Score\",\"fields\":[{\"name\":\"score\",\"type\":[\"null\",\"double\"]},{\"name\":\"source\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]}}]},{\"name\":\"soTerms\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ConsequenceTypeEntry\",\"fields\":[{\"name\":\"soName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"soAccession\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]}}]},{\"name\":\"expressionValues\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ExpressionValue\",\"fields\":[{\"name\":\"experimentalFactor\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"factorValue\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"experimentId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"technologyPlatform\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"expression\",\"type\":{\"type\":\"enum\",\"name\":\"Expression\",\"symbols\":[\"UP\",\"DOWN\"]}},{\"name\":\"pvalue\",\"type\":[\"null\",\"float\"]}]}}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String geneName;
   private java.lang.String ensemblGeneId;
   private java.lang.String ensemblTranscriptId;
   private java.lang.String strand;
   private java.lang.String biotype;
   private java.lang.Integer cDnaPosition;
   private java.lang.Integer cdsPosition;
   private java.lang.Integer aaPosition;
   private java.lang.String aaChange;
   private java.lang.String codon;
   private java.lang.String functionalDescription;
   private java.util.List<org.opencb.biodata.models.variant.avro.Score> proteinSubstitutionScores;
   private java.util.List<org.opencb.biodata.models.variant.avro.ConsequenceTypeEntry> soTerms;
   private java.util.List<org.opencb.biodata.models.variant.avro.ExpressionValue> expressionValues;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public ConsequenceType() {}

  /**
   * All-args constructor.
   */
  public ConsequenceType(java.lang.String geneName, java.lang.String ensemblGeneId, java.lang.String ensemblTranscriptId, java.lang.String strand, java.lang.String biotype, java.lang.Integer cDnaPosition, java.lang.Integer cdsPosition, java.lang.Integer aaPosition, java.lang.String aaChange, java.lang.String codon, java.lang.String functionalDescription, java.util.List<org.opencb.biodata.models.variant.avro.Score> proteinSubstitutionScores, java.util.List<org.opencb.biodata.models.variant.avro.ConsequenceTypeEntry> soTerms, java.util.List<org.opencb.biodata.models.variant.avro.ExpressionValue> expressionValues) {
    this.geneName = geneName;
    this.ensemblGeneId = ensemblGeneId;
    this.ensemblTranscriptId = ensemblTranscriptId;
    this.strand = strand;
    this.biotype = biotype;
    this.cDnaPosition = cDnaPosition;
    this.cdsPosition = cdsPosition;
    this.aaPosition = aaPosition;
    this.aaChange = aaChange;
    this.codon = codon;
    this.functionalDescription = functionalDescription;
    this.proteinSubstitutionScores = proteinSubstitutionScores;
    this.soTerms = soTerms;
    this.expressionValues = expressionValues;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return geneName;
    case 1: return ensemblGeneId;
    case 2: return ensemblTranscriptId;
    case 3: return strand;
    case 4: return biotype;
    case 5: return cDnaPosition;
    case 6: return cdsPosition;
    case 7: return aaPosition;
    case 8: return aaChange;
    case 9: return codon;
    case 10: return functionalDescription;
    case 11: return proteinSubstitutionScores;
    case 12: return soTerms;
    case 13: return expressionValues;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: geneName = (java.lang.String)value$; break;
    case 1: ensemblGeneId = (java.lang.String)value$; break;
    case 2: ensemblTranscriptId = (java.lang.String)value$; break;
    case 3: strand = (java.lang.String)value$; break;
    case 4: biotype = (java.lang.String)value$; break;
    case 5: cDnaPosition = (java.lang.Integer)value$; break;
    case 6: cdsPosition = (java.lang.Integer)value$; break;
    case 7: aaPosition = (java.lang.Integer)value$; break;
    case 8: aaChange = (java.lang.String)value$; break;
    case 9: codon = (java.lang.String)value$; break;
    case 10: functionalDescription = (java.lang.String)value$; break;
    case 11: proteinSubstitutionScores = (java.util.List<org.opencb.biodata.models.variant.avro.Score>)value$; break;
    case 12: soTerms = (java.util.List<org.opencb.biodata.models.variant.avro.ConsequenceTypeEntry>)value$; break;
    case 13: expressionValues = (java.util.List<org.opencb.biodata.models.variant.avro.ExpressionValue>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'geneName' field.
   */
  public java.lang.String getGeneName() {
    return geneName;
  }

  /**
   * Sets the value of the 'geneName' field.
   * @param value the value to set.
   */
  public void setGeneName(java.lang.String value) {
    this.geneName = value;
  }

  /**
   * Gets the value of the 'ensemblGeneId' field.
   */
  public java.lang.String getEnsemblGeneId() {
    return ensemblGeneId;
  }

  /**
   * Sets the value of the 'ensemblGeneId' field.
   * @param value the value to set.
   */
  public void setEnsemblGeneId(java.lang.String value) {
    this.ensemblGeneId = value;
  }

  /**
   * Gets the value of the 'ensemblTranscriptId' field.
   */
  public java.lang.String getEnsemblTranscriptId() {
    return ensemblTranscriptId;
  }

  /**
   * Sets the value of the 'ensemblTranscriptId' field.
   * @param value the value to set.
   */
  public void setEnsemblTranscriptId(java.lang.String value) {
    this.ensemblTranscriptId = value;
  }

  /**
   * Gets the value of the 'strand' field.
   */
  public java.lang.String getStrand() {
    return strand;
  }

  /**
   * Sets the value of the 'strand' field.
   * @param value the value to set.
   */
  public void setStrand(java.lang.String value) {
    this.strand = value;
  }

  /**
   * Gets the value of the 'biotype' field.
   */
  public java.lang.String getBiotype() {
    return biotype;
  }

  /**
   * Sets the value of the 'biotype' field.
   * @param value the value to set.
   */
  public void setBiotype(java.lang.String value) {
    this.biotype = value;
  }

  /**
   * Gets the value of the 'cDnaPosition' field.
   */
  public java.lang.Integer getCDnaPosition() {
    return cDnaPosition;
  }

  /**
   * Sets the value of the 'cDnaPosition' field.
   * @param value the value to set.
   */
  public void setCDnaPosition(java.lang.Integer value) {
    this.cDnaPosition = value;
  }

  /**
   * Gets the value of the 'cdsPosition' field.
   */
  public java.lang.Integer getCdsPosition() {
    return cdsPosition;
  }

  /**
   * Sets the value of the 'cdsPosition' field.
   * @param value the value to set.
   */
  public void setCdsPosition(java.lang.Integer value) {
    this.cdsPosition = value;
  }

  /**
   * Gets the value of the 'aaPosition' field.
   */
  public java.lang.Integer getAaPosition() {
    return aaPosition;
  }

  /**
   * Sets the value of the 'aaPosition' field.
   * @param value the value to set.
   */
  public void setAaPosition(java.lang.Integer value) {
    this.aaPosition = value;
  }

  /**
   * Gets the value of the 'aaChange' field.
   */
  public java.lang.String getAaChange() {
    return aaChange;
  }

  /**
   * Sets the value of the 'aaChange' field.
   * @param value the value to set.
   */
  public void setAaChange(java.lang.String value) {
    this.aaChange = value;
  }

  /**
   * Gets the value of the 'codon' field.
   */
  public java.lang.String getCodon() {
    return codon;
  }

  /**
   * Sets the value of the 'codon' field.
   * @param value the value to set.
   */
  public void setCodon(java.lang.String value) {
    this.codon = value;
  }

  /**
   * Gets the value of the 'functionalDescription' field.
   */
  public java.lang.String getFunctionalDescription() {
    return functionalDescription;
  }

  /**
   * Sets the value of the 'functionalDescription' field.
   * @param value the value to set.
   */
  public void setFunctionalDescription(java.lang.String value) {
    this.functionalDescription = value;
  }

  /**
   * Gets the value of the 'proteinSubstitutionScores' field.
   */
  public java.util.List<org.opencb.biodata.models.variant.avro.Score> getProteinSubstitutionScores() {
    return proteinSubstitutionScores;
  }

  /**
   * Sets the value of the 'proteinSubstitutionScores' field.
   * @param value the value to set.
   */
  public void setProteinSubstitutionScores(java.util.List<org.opencb.biodata.models.variant.avro.Score> value) {
    this.proteinSubstitutionScores = value;
  }

  /**
   * Gets the value of the 'soTerms' field.
   */
  public java.util.List<org.opencb.biodata.models.variant.avro.ConsequenceTypeEntry> getSoTerms() {
    return soTerms;
  }

  /**
   * Sets the value of the 'soTerms' field.
   * @param value the value to set.
   */
  public void setSoTerms(java.util.List<org.opencb.biodata.models.variant.avro.ConsequenceTypeEntry> value) {
    this.soTerms = value;
  }

  /**
   * Gets the value of the 'expressionValues' field.
   */
  public java.util.List<org.opencb.biodata.models.variant.avro.ExpressionValue> getExpressionValues() {
    return expressionValues;
  }

  /**
   * Sets the value of the 'expressionValues' field.
   * @param value the value to set.
   */
  public void setExpressionValues(java.util.List<org.opencb.biodata.models.variant.avro.ExpressionValue> value) {
    this.expressionValues = value;
  }

  /** Creates a new ConsequenceType RecordBuilder */
  public static org.opencb.biodata.models.variant.avro.ConsequenceType.Builder newBuilder() {
    return new org.opencb.biodata.models.variant.avro.ConsequenceType.Builder();
  }
  
  /** Creates a new ConsequenceType RecordBuilder by copying an existing Builder */
  public static org.opencb.biodata.models.variant.avro.ConsequenceType.Builder newBuilder(org.opencb.biodata.models.variant.avro.ConsequenceType.Builder other) {
    return new org.opencb.biodata.models.variant.avro.ConsequenceType.Builder(other);
  }
  
  /** Creates a new ConsequenceType RecordBuilder by copying an existing ConsequenceType instance */
  public static org.opencb.biodata.models.variant.avro.ConsequenceType.Builder newBuilder(org.opencb.biodata.models.variant.avro.ConsequenceType other) {
    return new org.opencb.biodata.models.variant.avro.ConsequenceType.Builder(other);
  }
  
  /**
   * RecordBuilder for ConsequenceType instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ConsequenceType>
    implements org.apache.avro.data.RecordBuilder<ConsequenceType> {

    private java.lang.String geneName;
    private java.lang.String ensemblGeneId;
    private java.lang.String ensemblTranscriptId;
    private java.lang.String strand;
    private java.lang.String biotype;
    private java.lang.Integer cDnaPosition;
    private java.lang.Integer cdsPosition;
    private java.lang.Integer aaPosition;
    private java.lang.String aaChange;
    private java.lang.String codon;
    private java.lang.String functionalDescription;
    private java.util.List<org.opencb.biodata.models.variant.avro.Score> proteinSubstitutionScores;
    private java.util.List<org.opencb.biodata.models.variant.avro.ConsequenceTypeEntry> soTerms;
    private java.util.List<org.opencb.biodata.models.variant.avro.ExpressionValue> expressionValues;

    /** Creates a new Builder */
    private Builder() {
      super(org.opencb.biodata.models.variant.avro.ConsequenceType.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.opencb.biodata.models.variant.avro.ConsequenceType.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.geneName)) {
        this.geneName = data().deepCopy(fields()[0].schema(), other.geneName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ensemblGeneId)) {
        this.ensemblGeneId = data().deepCopy(fields()[1].schema(), other.ensemblGeneId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ensemblTranscriptId)) {
        this.ensemblTranscriptId = data().deepCopy(fields()[2].schema(), other.ensemblTranscriptId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.strand)) {
        this.strand = data().deepCopy(fields()[3].schema(), other.strand);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.biotype)) {
        this.biotype = data().deepCopy(fields()[4].schema(), other.biotype);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.cDnaPosition)) {
        this.cDnaPosition = data().deepCopy(fields()[5].schema(), other.cDnaPosition);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.cdsPosition)) {
        this.cdsPosition = data().deepCopy(fields()[6].schema(), other.cdsPosition);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.aaPosition)) {
        this.aaPosition = data().deepCopy(fields()[7].schema(), other.aaPosition);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.aaChange)) {
        this.aaChange = data().deepCopy(fields()[8].schema(), other.aaChange);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.codon)) {
        this.codon = data().deepCopy(fields()[9].schema(), other.codon);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.functionalDescription)) {
        this.functionalDescription = data().deepCopy(fields()[10].schema(), other.functionalDescription);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.proteinSubstitutionScores)) {
        this.proteinSubstitutionScores = data().deepCopy(fields()[11].schema(), other.proteinSubstitutionScores);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.soTerms)) {
        this.soTerms = data().deepCopy(fields()[12].schema(), other.soTerms);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.expressionValues)) {
        this.expressionValues = data().deepCopy(fields()[13].schema(), other.expressionValues);
        fieldSetFlags()[13] = true;
      }
    }
    
    /** Creates a Builder by copying an existing ConsequenceType instance */
    private Builder(org.opencb.biodata.models.variant.avro.ConsequenceType other) {
            super(org.opencb.biodata.models.variant.avro.ConsequenceType.SCHEMA$);
      if (isValidValue(fields()[0], other.geneName)) {
        this.geneName = data().deepCopy(fields()[0].schema(), other.geneName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ensemblGeneId)) {
        this.ensemblGeneId = data().deepCopy(fields()[1].schema(), other.ensemblGeneId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ensemblTranscriptId)) {
        this.ensemblTranscriptId = data().deepCopy(fields()[2].schema(), other.ensemblTranscriptId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.strand)) {
        this.strand = data().deepCopy(fields()[3].schema(), other.strand);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.biotype)) {
        this.biotype = data().deepCopy(fields()[4].schema(), other.biotype);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.cDnaPosition)) {
        this.cDnaPosition = data().deepCopy(fields()[5].schema(), other.cDnaPosition);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.cdsPosition)) {
        this.cdsPosition = data().deepCopy(fields()[6].schema(), other.cdsPosition);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.aaPosition)) {
        this.aaPosition = data().deepCopy(fields()[7].schema(), other.aaPosition);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.aaChange)) {
        this.aaChange = data().deepCopy(fields()[8].schema(), other.aaChange);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.codon)) {
        this.codon = data().deepCopy(fields()[9].schema(), other.codon);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.functionalDescription)) {
        this.functionalDescription = data().deepCopy(fields()[10].schema(), other.functionalDescription);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.proteinSubstitutionScores)) {
        this.proteinSubstitutionScores = data().deepCopy(fields()[11].schema(), other.proteinSubstitutionScores);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.soTerms)) {
        this.soTerms = data().deepCopy(fields()[12].schema(), other.soTerms);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.expressionValues)) {
        this.expressionValues = data().deepCopy(fields()[13].schema(), other.expressionValues);
        fieldSetFlags()[13] = true;
      }
    }

    /** Gets the value of the 'geneName' field */
    public java.lang.String getGeneName() {
      return geneName;
    }
    
    /** Sets the value of the 'geneName' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder setGeneName(java.lang.String value) {
      validate(fields()[0], value);
      this.geneName = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'geneName' field has been set */
    public boolean hasGeneName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'geneName' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder clearGeneName() {
      geneName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'ensemblGeneId' field */
    public java.lang.String getEnsemblGeneId() {
      return ensemblGeneId;
    }
    
    /** Sets the value of the 'ensemblGeneId' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder setEnsemblGeneId(java.lang.String value) {
      validate(fields()[1], value);
      this.ensemblGeneId = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'ensemblGeneId' field has been set */
    public boolean hasEnsemblGeneId() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'ensemblGeneId' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder clearEnsemblGeneId() {
      ensemblGeneId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'ensemblTranscriptId' field */
    public java.lang.String getEnsemblTranscriptId() {
      return ensemblTranscriptId;
    }
    
    /** Sets the value of the 'ensemblTranscriptId' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder setEnsemblTranscriptId(java.lang.String value) {
      validate(fields()[2], value);
      this.ensemblTranscriptId = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'ensemblTranscriptId' field has been set */
    public boolean hasEnsemblTranscriptId() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'ensemblTranscriptId' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder clearEnsemblTranscriptId() {
      ensemblTranscriptId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'strand' field */
    public java.lang.String getStrand() {
      return strand;
    }
    
    /** Sets the value of the 'strand' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder setStrand(java.lang.String value) {
      validate(fields()[3], value);
      this.strand = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'strand' field has been set */
    public boolean hasStrand() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'strand' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder clearStrand() {
      strand = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'biotype' field */
    public java.lang.String getBiotype() {
      return biotype;
    }
    
    /** Sets the value of the 'biotype' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder setBiotype(java.lang.String value) {
      validate(fields()[4], value);
      this.biotype = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'biotype' field has been set */
    public boolean hasBiotype() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'biotype' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder clearBiotype() {
      biotype = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'cDnaPosition' field */
    public java.lang.Integer getCDnaPosition() {
      return cDnaPosition;
    }
    
    /** Sets the value of the 'cDnaPosition' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder setCDnaPosition(java.lang.Integer value) {
      validate(fields()[5], value);
      this.cDnaPosition = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'cDnaPosition' field has been set */
    public boolean hasCDnaPosition() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'cDnaPosition' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder clearCDnaPosition() {
      cDnaPosition = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'cdsPosition' field */
    public java.lang.Integer getCdsPosition() {
      return cdsPosition;
    }
    
    /** Sets the value of the 'cdsPosition' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder setCdsPosition(java.lang.Integer value) {
      validate(fields()[6], value);
      this.cdsPosition = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'cdsPosition' field has been set */
    public boolean hasCdsPosition() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'cdsPosition' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder clearCdsPosition() {
      cdsPosition = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'aaPosition' field */
    public java.lang.Integer getAaPosition() {
      return aaPosition;
    }
    
    /** Sets the value of the 'aaPosition' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder setAaPosition(java.lang.Integer value) {
      validate(fields()[7], value);
      this.aaPosition = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'aaPosition' field has been set */
    public boolean hasAaPosition() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'aaPosition' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder clearAaPosition() {
      aaPosition = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'aaChange' field */
    public java.lang.String getAaChange() {
      return aaChange;
    }
    
    /** Sets the value of the 'aaChange' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder setAaChange(java.lang.String value) {
      validate(fields()[8], value);
      this.aaChange = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'aaChange' field has been set */
    public boolean hasAaChange() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'aaChange' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder clearAaChange() {
      aaChange = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'codon' field */
    public java.lang.String getCodon() {
      return codon;
    }
    
    /** Sets the value of the 'codon' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder setCodon(java.lang.String value) {
      validate(fields()[9], value);
      this.codon = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'codon' field has been set */
    public boolean hasCodon() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'codon' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder clearCodon() {
      codon = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'functionalDescription' field */
    public java.lang.String getFunctionalDescription() {
      return functionalDescription;
    }
    
    /** Sets the value of the 'functionalDescription' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder setFunctionalDescription(java.lang.String value) {
      validate(fields()[10], value);
      this.functionalDescription = value;
      fieldSetFlags()[10] = true;
      return this; 
    }
    
    /** Checks whether the 'functionalDescription' field has been set */
    public boolean hasFunctionalDescription() {
      return fieldSetFlags()[10];
    }
    
    /** Clears the value of the 'functionalDescription' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder clearFunctionalDescription() {
      functionalDescription = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /** Gets the value of the 'proteinSubstitutionScores' field */
    public java.util.List<org.opencb.biodata.models.variant.avro.Score> getProteinSubstitutionScores() {
      return proteinSubstitutionScores;
    }
    
    /** Sets the value of the 'proteinSubstitutionScores' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder setProteinSubstitutionScores(java.util.List<org.opencb.biodata.models.variant.avro.Score> value) {
      validate(fields()[11], value);
      this.proteinSubstitutionScores = value;
      fieldSetFlags()[11] = true;
      return this; 
    }
    
    /** Checks whether the 'proteinSubstitutionScores' field has been set */
    public boolean hasProteinSubstitutionScores() {
      return fieldSetFlags()[11];
    }
    
    /** Clears the value of the 'proteinSubstitutionScores' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder clearProteinSubstitutionScores() {
      proteinSubstitutionScores = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /** Gets the value of the 'soTerms' field */
    public java.util.List<org.opencb.biodata.models.variant.avro.ConsequenceTypeEntry> getSoTerms() {
      return soTerms;
    }
    
    /** Sets the value of the 'soTerms' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder setSoTerms(java.util.List<org.opencb.biodata.models.variant.avro.ConsequenceTypeEntry> value) {
      validate(fields()[12], value);
      this.soTerms = value;
      fieldSetFlags()[12] = true;
      return this; 
    }
    
    /** Checks whether the 'soTerms' field has been set */
    public boolean hasSoTerms() {
      return fieldSetFlags()[12];
    }
    
    /** Clears the value of the 'soTerms' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder clearSoTerms() {
      soTerms = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    /** Gets the value of the 'expressionValues' field */
    public java.util.List<org.opencb.biodata.models.variant.avro.ExpressionValue> getExpressionValues() {
      return expressionValues;
    }
    
    /** Sets the value of the 'expressionValues' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder setExpressionValues(java.util.List<org.opencb.biodata.models.variant.avro.ExpressionValue> value) {
      validate(fields()[13], value);
      this.expressionValues = value;
      fieldSetFlags()[13] = true;
      return this; 
    }
    
    /** Checks whether the 'expressionValues' field has been set */
    public boolean hasExpressionValues() {
      return fieldSetFlags()[13];
    }
    
    /** Clears the value of the 'expressionValues' field */
    public org.opencb.biodata.models.variant.avro.ConsequenceType.Builder clearExpressionValues() {
      expressionValues = null;
      fieldSetFlags()[13] = false;
      return this;
    }

    @Override
    public ConsequenceType build() {
      try {
        ConsequenceType record = new ConsequenceType();
        record.geneName = fieldSetFlags()[0] ? this.geneName : (java.lang.String) defaultValue(fields()[0]);
        record.ensemblGeneId = fieldSetFlags()[1] ? this.ensemblGeneId : (java.lang.String) defaultValue(fields()[1]);
        record.ensemblTranscriptId = fieldSetFlags()[2] ? this.ensemblTranscriptId : (java.lang.String) defaultValue(fields()[2]);
        record.strand = fieldSetFlags()[3] ? this.strand : (java.lang.String) defaultValue(fields()[3]);
        record.biotype = fieldSetFlags()[4] ? this.biotype : (java.lang.String) defaultValue(fields()[4]);
        record.cDnaPosition = fieldSetFlags()[5] ? this.cDnaPosition : (java.lang.Integer) defaultValue(fields()[5]);
        record.cdsPosition = fieldSetFlags()[6] ? this.cdsPosition : (java.lang.Integer) defaultValue(fields()[6]);
        record.aaPosition = fieldSetFlags()[7] ? this.aaPosition : (java.lang.Integer) defaultValue(fields()[7]);
        record.aaChange = fieldSetFlags()[8] ? this.aaChange : (java.lang.String) defaultValue(fields()[8]);
        record.codon = fieldSetFlags()[9] ? this.codon : (java.lang.String) defaultValue(fields()[9]);
        record.functionalDescription = fieldSetFlags()[10] ? this.functionalDescription : (java.lang.String) defaultValue(fields()[10]);
        record.proteinSubstitutionScores = fieldSetFlags()[11] ? this.proteinSubstitutionScores : (java.util.List<org.opencb.biodata.models.variant.avro.Score>) defaultValue(fields()[11]);
        record.soTerms = fieldSetFlags()[12] ? this.soTerms : (java.util.List<org.opencb.biodata.models.variant.avro.ConsequenceTypeEntry>) defaultValue(fields()[12]);
        record.expressionValues = fieldSetFlags()[13] ? this.expressionValues : (java.util.List<org.opencb.biodata.models.variant.avro.ExpressionValue>) defaultValue(fields()[13]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
