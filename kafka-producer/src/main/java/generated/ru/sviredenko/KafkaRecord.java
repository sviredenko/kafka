/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package ru.sviredenko;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class KafkaRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2004415309460429847L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"KafkaRecord\",\"namespace\":\"ru.sviredenko\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"username\",\"type\":[\"string\",\"null\"]},{\"name\":\"useraddress\",\"type\":[\"string\",\"null\"]},{\"name\":\"language\",\"type\":[\"string\",\"null\"],\"default\":\"None\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<KafkaRecord> ENCODER =
      new BinaryMessageEncoder<KafkaRecord>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<KafkaRecord> DECODER =
      new BinaryMessageDecoder<KafkaRecord>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<KafkaRecord> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<KafkaRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<KafkaRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<KafkaRecord>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this KafkaRecord to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a KafkaRecord from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a KafkaRecord instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static KafkaRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence id;
   private java.lang.CharSequence username;
   private java.lang.CharSequence useraddress;
   private java.lang.CharSequence language;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public KafkaRecord() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param username The new value for username
   * @param useraddress The new value for useraddress
   * @param language The new value for language
   */
  public KafkaRecord(java.lang.CharSequence id, java.lang.CharSequence username, java.lang.CharSequence useraddress, java.lang.CharSequence language) {
    this.id = id;
    this.username = username;
    this.useraddress = useraddress;
    this.language = language;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return username;
    case 2: return useraddress;
    case 3: return language;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: username = (java.lang.CharSequence)value$; break;
    case 2: useraddress = (java.lang.CharSequence)value$; break;
    case 3: language = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'username' field.
   * @return The value of the 'username' field.
   */
  public java.lang.CharSequence getUsername() {
    return username;
  }


  /**
   * Sets the value of the 'username' field.
   * @param value the value to set.
   */
  public void setUsername(java.lang.CharSequence value) {
    this.username = value;
  }

  /**
   * Gets the value of the 'useraddress' field.
   * @return The value of the 'useraddress' field.
   */
  public java.lang.CharSequence getUseraddress() {
    return useraddress;
  }


  /**
   * Sets the value of the 'useraddress' field.
   * @param value the value to set.
   */
  public void setUseraddress(java.lang.CharSequence value) {
    this.useraddress = value;
  }

  /**
   * Gets the value of the 'language' field.
   * @return The value of the 'language' field.
   */
  public java.lang.CharSequence getLanguage() {
    return language;
  }


  /**
   * Sets the value of the 'language' field.
   * @param value the value to set.
   */
  public void setLanguage(java.lang.CharSequence value) {
    this.language = value;
  }

  /**
   * Creates a new KafkaRecord RecordBuilder.
   * @return A new KafkaRecord RecordBuilder
   */
  public static ru.sviredenko.KafkaRecord.Builder newBuilder() {
    return new ru.sviredenko.KafkaRecord.Builder();
  }

  /**
   * Creates a new KafkaRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new KafkaRecord RecordBuilder
   */
  public static ru.sviredenko.KafkaRecord.Builder newBuilder(ru.sviredenko.KafkaRecord.Builder other) {
    if (other == null) {
      return new ru.sviredenko.KafkaRecord.Builder();
    } else {
      return new ru.sviredenko.KafkaRecord.Builder(other);
    }
  }

  /**
   * Creates a new KafkaRecord RecordBuilder by copying an existing KafkaRecord instance.
   * @param other The existing instance to copy.
   * @return A new KafkaRecord RecordBuilder
   */
  public static ru.sviredenko.KafkaRecord.Builder newBuilder(ru.sviredenko.KafkaRecord other) {
    if (other == null) {
      return new ru.sviredenko.KafkaRecord.Builder();
    } else {
      return new ru.sviredenko.KafkaRecord.Builder(other);
    }
  }

  /**
   * RecordBuilder for KafkaRecord instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<KafkaRecord>
    implements org.apache.avro.data.RecordBuilder<KafkaRecord> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence username;
    private java.lang.CharSequence useraddress;
    private java.lang.CharSequence language;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ru.sviredenko.KafkaRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.username)) {
        this.username = data().deepCopy(fields()[1].schema(), other.username);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.useraddress)) {
        this.useraddress = data().deepCopy(fields()[2].schema(), other.useraddress);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.language)) {
        this.language = data().deepCopy(fields()[3].schema(), other.language);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing KafkaRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(ru.sviredenko.KafkaRecord other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.username)) {
        this.username = data().deepCopy(fields()[1].schema(), other.username);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.useraddress)) {
        this.useraddress = data().deepCopy(fields()[2].schema(), other.useraddress);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.language)) {
        this.language = data().deepCopy(fields()[3].schema(), other.language);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public ru.sviredenko.KafkaRecord.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public ru.sviredenko.KafkaRecord.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'username' field.
      * @return The value.
      */
    public java.lang.CharSequence getUsername() {
      return username;
    }


    /**
      * Sets the value of the 'username' field.
      * @param value The value of 'username'.
      * @return This builder.
      */
    public ru.sviredenko.KafkaRecord.Builder setUsername(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.username = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'username' field has been set.
      * @return True if the 'username' field has been set, false otherwise.
      */
    public boolean hasUsername() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'username' field.
      * @return This builder.
      */
    public ru.sviredenko.KafkaRecord.Builder clearUsername() {
      username = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'useraddress' field.
      * @return The value.
      */
    public java.lang.CharSequence getUseraddress() {
      return useraddress;
    }


    /**
      * Sets the value of the 'useraddress' field.
      * @param value The value of 'useraddress'.
      * @return This builder.
      */
    public ru.sviredenko.KafkaRecord.Builder setUseraddress(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.useraddress = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'useraddress' field has been set.
      * @return True if the 'useraddress' field has been set, false otherwise.
      */
    public boolean hasUseraddress() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'useraddress' field.
      * @return This builder.
      */
    public ru.sviredenko.KafkaRecord.Builder clearUseraddress() {
      useraddress = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'language' field.
      * @return The value.
      */
    public java.lang.CharSequence getLanguage() {
      return language;
    }


    /**
      * Sets the value of the 'language' field.
      * @param value The value of 'language'.
      * @return This builder.
      */
    public ru.sviredenko.KafkaRecord.Builder setLanguage(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.language = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'language' field has been set.
      * @return True if the 'language' field has been set, false otherwise.
      */
    public boolean hasLanguage() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'language' field.
      * @return This builder.
      */
    public ru.sviredenko.KafkaRecord.Builder clearLanguage() {
      language = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public KafkaRecord build() {
      try {
        KafkaRecord record = new KafkaRecord();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.username = fieldSetFlags()[1] ? this.username : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.useraddress = fieldSetFlags()[2] ? this.useraddress : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.language = fieldSetFlags()[3] ? this.language : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<KafkaRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<KafkaRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<KafkaRecord>
    READER$ = (org.apache.avro.io.DatumReader<KafkaRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.id);

    if (this.username == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeString(this.username);
    }

    if (this.useraddress == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeString(this.useraddress);
    }

    if (this.language == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeString(this.language);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);

      if (in.readIndex() != 0) {
        in.readNull();
        this.username = null;
      } else {
        this.username = in.readString(this.username instanceof Utf8 ? (Utf8)this.username : null);
      }

      if (in.readIndex() != 0) {
        in.readNull();
        this.useraddress = null;
      } else {
        this.useraddress = in.readString(this.useraddress instanceof Utf8 ? (Utf8)this.useraddress : null);
      }

      if (in.readIndex() != 0) {
        in.readNull();
        this.language = null;
      } else {
        this.language = in.readString(this.language instanceof Utf8 ? (Utf8)this.language : null);
      }

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);
          break;

        case 1:
          if (in.readIndex() != 0) {
            in.readNull();
            this.username = null;
          } else {
            this.username = in.readString(this.username instanceof Utf8 ? (Utf8)this.username : null);
          }
          break;

        case 2:
          if (in.readIndex() != 0) {
            in.readNull();
            this.useraddress = null;
          } else {
            this.useraddress = in.readString(this.useraddress instanceof Utf8 ? (Utf8)this.useraddress : null);
          }
          break;

        case 3:
          if (in.readIndex() != 0) {
            in.readNull();
            this.language = null;
          } else {
            this.language = in.readString(this.language instanceof Utf8 ? (Utf8)this.language : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










