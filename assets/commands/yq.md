# TLDR

**Read a value** from a YAML file

```yq '.[key]' [file.yaml]```

**Read a nested value**

```yq '.[parent].[child]' [file.yaml]```

**Convert YAML to JSON**

```yq -o=json [file.yaml]```

**Convert JSON to YAML**

```yq -p=json [file.json]```

**Edit a file in place**

```yq -i '.[key] = "value"' [file.yaml]```

**Merge multiple YAML files**

```yq eval-all 'select(fileIndex == 0) * select(fileIndex == 1)' [file1.yaml] [file2.yaml]```

**Select items from an array**

```yq '.items[] | select(.name == "foo")' [file.yaml]```

**Count array elements**

```yq '.items | length' [file.yaml]```

# SYNOPSIS

**yq** [_options_] _expression_ [_file ..._]

# PARAMETERS

**-i**, **--inplace**
> Edit files in place.

**-p**, **--input-format** _format_
> Input format: yaml, json, xml, props, csv, tsv, toml.

**-o**, **--output-format** _format_
> Output format: yaml, json, xml, props, csv, tsv.

**-I**, **--indent** _n_
> Set indentation level (default 2).

**-C**, **--colors**
> Force colored output.

**-M**, **--no-colors**
> Disable colored output.

**-N**, **--no-doc**
> Don't print document separators.

**-e**, **--exit-status**
> Set exit status based on expression result.

**--from-file** _file_
> Load expression from a file.

**-n**, **--null-input**
> Don't read input; useful for creating new documents.

**-s**, **--split-exp** _expression_
> Split output into multiple files.

**-v**, **--verbose**
> Enable verbose output.

**-h**, **--help**
> Display help message.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**yq** is a lightweight command-line YAML, JSON, XML, CSV, TOML, and properties processor. It uses jq-like syntax for querying and manipulating structured data, making it easy to extract values, modify documents, and convert between formats.

The tool supports reading from files or stdin, and can output to stdout or edit files in place. Expressions follow a path-based syntax similar to jq, allowing complex queries and transformations.

Two implementations exist: **mikefarah/yq** (Go-based, standalone binary) and **kislyuk/yq** (Python wrapper around jq). The Go version is more commonly installed via package managers.

# CAVEATS

The two yq implementations have different syntax and capabilities. The Go version (mikefarah/yq) uses its own expression language, while the Python version (kislyuk/yq) uses jq syntax directly. Check which version is installed with **yq --version**.

# HISTORY

The Python yq wrapper was created by **Andrey Kislyuk** and released in **2017** as a thin jq wrapper for YAML. The Go-based yq was created by **Mike Farah** around the same time as a standalone tool. The Go version has become more popular due to being a single binary with no dependencies and supporting multiple formats beyond YAML.

# SEE ALSO

[jq](/man/jq)(1), [xmlstarlet](/man/xmlstarlet)(1), [dasel](/man/dasel)(1), [fx](/man/fx)(1)
