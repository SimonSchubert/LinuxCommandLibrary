# TLDR

**Transform JSON data**

```emuto '[.data.items | map(.name)]' [input.json]```

**Transform from stdin**

```cat [data.json] | emuto '[.items]'```

**Output formatted**

```emuto --pretty '[.]' [input.json]```

# SYNOPSIS

**emuto** [_options_] _expression_ [_file_]

# PARAMETERS

_EXPRESSION_
> Emuto transformation expression.

_FILE_
> Input JSON file.

**--pretty**
> Pretty-print output.

**--help**
> Display help information.

# DESCRIPTION

**emuto** is a JSON transformation tool using a jq-like query language. It processes JSON data through expressions that select, filter, and transform data structures.

The expression language supports object access, array operations, mapping, and filtering. It provides a functional approach to JSON manipulation.

emuto is useful for data extraction, format conversion, and JSON processing in scripts and pipelines.

# CAVEATS

Expression syntax differs from jq. May not handle all JSON edge cases. Performance varies with data size.

# HISTORY

emuto was developed as a JSON transformation tool, providing jq-like functionality with its own expression syntax for data manipulation.

# SEE ALSO

[jq](/man/jq)(1), [gron](/man/gron)(1), [fx](/man/fx)(1)
