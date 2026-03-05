# TAGLINE

Multi-format transcoder and query tool powered by jq syntax

# TLDR

**Convert YAML to JSON**

```qq '.' [config.yaml] -o json```

**Query a TOML file**

```qq '.database.host' [config.toml]```

**Convert CSV to Parquet**

```qq '.' [data.csv] -o parquet```

**Interactive query mode**

```qq . [file.json] --interactive```

# SYNOPSIS

**qq** [_filter_] [_file_] [_options_]

# PARAMETERS

**-i**, **--input** _FORMAT_
> Specify input format.

**-o**, **--output** _FORMAT_
> Specify output format.

**--interactive**
> Interactive query builder with autocomplete and real-time preview.

**--stream**
> Streaming mode for memory-efficient processing of large files.

**-s**
> Slurp mode: read multiple inputs into an array.

# DESCRIPTION

**qq** is a multi-format transcoder and query tool powered by jq syntax via the gojq engine. It supports reading and writing JSON, YAML, TOML, XML, HCL/Terraform, CSV, TSV, INI, Parquet, MessagePack, CBOR, Avro, and more. Format is auto-detected from file extensions.

# HISTORY

**qq** was created by **JFryy** and is written in **Go**.

# SEE ALSO

[jq](/man/jq)(1), [yq](/man/yq)(1), [oq](/man/oq)(1), [gron](/man/gron)(1)
