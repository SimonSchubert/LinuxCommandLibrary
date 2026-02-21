# TAGLINE

universal data selector for querying and modifying structured data

# TLDR

**Query a value** from a JSON file

```dasel -f [file.json] '[selector]'```

**Query a nested value** from YAML

```dasel -f [config.yaml] '.database.host'```

**Convert JSON to YAML**

```dasel -f [input.json] -p json -w yaml```

**Modify a value** in a JSON file

```dasel put -f [file.json] -v '[new_value]' '[selector]'```

**Delete a key** from a YAML file

```dasel delete -f [file.yaml] '[selector]'```

**Read from stdin** and output as JSON

```cat [file.yaml] | dasel -p yaml -w json```

**Query a value from XML**

```dasel -f [file.xml] '.root.element'```

# SYNOPSIS

**dasel** [_command_] [_flags_] [_selector_]

**dasel** select [_-f file_] [_-p parser_] [_-w writer_] _selector_

**dasel** put [_-f file_] [_-t type_] [_-v value_] _selector_

**dasel** delete [_-f file_] _selector_

# PARAMETERS

**-f**, **--file** _PATH_
> Input file path; reads from stdin if omitted

**-p**, **--parser** _FORMAT_
> Parser for input data (json, yaml, toml, xml, csv, ini, hcl); auto-detected from file extension

**-w**, **--write** _FORMAT_
> Output format; defaults to input parser type

**-t**, **--type** _TYPE_
> Value type for put command (string, int, bool, json)

**-v**, **--value** _VALUE_
> Value to set with put command

**-o**, **--out** _FILE_
> Output file path; writes to stdout if omitted

**-r**, **--read** _FORMAT_
> Alias for --parser

**--pretty**
> Pretty-print output for readability

**-n**, **--null**
> Output null values explicitly

**--colour**, **--color**
> Enable colored output

**--escape-html**
> Escape HTML entities in output

**-h**, **--help**
> Display help information

**-v**, **--version**
> Display version information

# DESCRIPTION

**dasel** (Data Selector) is a command-line tool for querying and modifying structured data files. It provides a unified interface for working with JSON, YAML, TOML, XML, CSV, INI, and HCL formats using a consistent selector syntax.

The tool supports three main operations: **select** for querying data, **put** for modifying or adding values, and **delete** for removing keys. Selectors use dot notation for nested access (e.g., `.database.host`) and bracket notation for array indices (e.g., `.users.[0].name`).

Dasel can convert between formats by specifying different input and output parsers, making it useful for configuration file transformations. It reads from files or stdin and writes to files or stdout, integrating well with shell pipelines.

# CAVEATS

Comments in YAML and TOML files are discarded when writing due to parser limitations. The entire document is loaded into memory, so very large files may cause high memory usage. Array indices are zero-based. When modifying files, the original formatting may not be preserved exactly.

# HISTORY

Dasel was created by **Tom Wright** and first released in **2020**. Written in **Go**, it was designed as a universal alternative to format-specific tools like **jq** (JSON), **yq** (YAML), and **xmlstarlet** (XML). The name is a portmanteau of "data" and "select". It gained popularity for its ability to use identical selector syntax across multiple data formats and its single-binary distribution with no dependencies.

# SEE ALSO

[jq](/man/jq)(1), [yq](/man/yq)(1), [xmlstarlet](/man/xmlstarlet)(1), [mlr](/man/mlr)(1)
