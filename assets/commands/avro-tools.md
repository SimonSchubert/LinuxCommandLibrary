# TAGLINE

Utilities for working with Apache Avro data files

# TLDR

**Convert JSON to Avro**

```avro-tools fromjson --schema-file [schema.avsc] [input.json] > [output.avro]```

**Convert Avro to JSON**

```avro-tools tojson [input.avro] > [output.json]```

**Display Avro file schema**

```avro-tools getschema [file.avro]```

**Display file metadata**

```avro-tools getmeta [file.avro]```

**Concatenate Avro files**

```avro-tools concat [file1.avro] [file2.avro] [output.avro]```

**Compile Avro schema to Java**

```avro-tools compile schema [schema.avsc] [output_directory]```

**Generate random data from schema**

```avro-tools random --schema-file [schema.avsc] --count [100] [output.avro]```

# SYNOPSIS

**avro-tools** _command_ [_options_] [_arguments_]

# PARAMETERS

**fromjson**
> Convert JSON to Avro format.

**tojson**
> Convert Avro to JSON format.

**getschema**
> Extract and print the schema from an Avro file.

**getmeta**
> Print metadata from an Avro file.

**concat**
> Concatenate multiple Avro files with compatible schemas.

**compile**
> Compile schema to Java source files.

**idl**
> Compile Avro IDL to schema.

**random**
> Generate random data based on a schema.

**recodec**
> Change the codec of an Avro file.

**--schema-file** _file_
> Path to Avro schema file (.avsc).

**--count** _n_
> Number of records to generate (for random).

**--codec** _name_
> Compression codec (null, deflate, snappy, bzip2, zstd, xz).

# DESCRIPTION

**avro-tools** is a collection of utilities for working with Apache Avro data files. Avro is a data serialization system that provides rich data structures, a compact binary format, and schema evolution capabilities.

The tools enable conversion between Avro's binary format and human-readable JSON, schema extraction and validation, file manipulation, and code generation. Avro files are self-describing, containing their schema alongside the data, which avro-tools can extract and display.

Common workflows include inspecting Avro files produced by data pipelines, converting data between formats for debugging, generating test data, and compiling schemas to language-specific classes for application development.

# CAVEATS

JSON to Avro conversion requires a schema file; the JSON structure must match the schema. Large files may require increased JVM heap space (**-Xmx** option). Schema compatibility is enforced when concatenating files. The tool is distributed as a Java JAR file and requires a JRE.

# HISTORY

Apache Avro was created by **Doug Cutting** (also creator of Hadoop and Lucene) and first released in **2009**. It was developed to address limitations of existing serialization frameworks when working with big data systems like Hadoop. Avro became a top-level Apache project in **2010** and is widely used in data engineering, particularly with Kafka, Spark, and Hadoop ecosystems.

# SEE ALSO

[parquet-tools](/man/parquet-tools)(1), [kafka-avro-console-consumer](/man/kafka-avro-console-consumer)(1)
