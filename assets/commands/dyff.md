# TAGLINE

YAML/JSON diff tool for configuration files

# TLDR

**Compare** two YAML/JSON files

```dyff between [file1.yaml] [file2.yaml]```

**Compare** Kubernetes manifests

```dyff between -k [manifest1.yaml] [manifest2.yaml]```

**Show** differences with specific output format

```dyff between -o json [file1] [file2]```

**Compare** directories recursively

```dyff between -r [dir1] [dir2]```

# SYNOPSIS

**dyff** [_command_] [_options_] [_files_]

# PARAMETERS

**between** _FILE1_ _FILE2_
> Compare two files

**-k, --kubernetes**
> Compare Kubernetes manifests (ignore metadata timestamps)

**-r, --recursive**
> Compare directories recursively

**-o, --output** _FORMAT_
> Output format: human, json, yaml, tap (default: human)

**--chroot** _PATH_
> Chroot both inputs to a specific path

**--ignore-order-changes**
> Ignore changes in list order

**--ignore-value-changes** _PATH_
> Ignore value changes at specific path

**--no-table-style**
> Disable table output styling

**-v, --version**
> Display version and exit

**-h, --help**
> Display help and exit

# DESCRIPTION

**dyff** is a diff tool specifically designed for YAML and JSON configuration files. Unlike traditional line-based diff tools, it understands the structure of YAML/JSON documents and shows meaningful differences at the semantic level.

The tool is particularly useful for comparing Kubernetes manifests, configuration files, and structured data where the order of keys doesn't matter but their values do. It can ignore certain types of changes (like metadata timestamps) and provides various output formats.

# COMMANDS

**between** _FILE1_ _FILE2_
> Compare two files and show differences

**json** _FILE_
> Parse and validate JSON file

**yaml** _FILE_
> Parse and validate YAML file

**version**
> Display version information

# CAVEATS

Complex nested structures may produce verbose output. Large files can be slow to compare. Order-sensitive comparisons may miss reorderings unless specifically enabled. Some special YAML features may not be fully supported.

# HISTORY

**dyff** was created by the Homeport team to address the need for semantic diffing of Kubernetes and configuration files. It provides more meaningful output than traditional diff tools when working with structured configuration data.

# SEE ALSO

[diff](/man/diff)(1), [kubectl](/man/kubectl)(1), [yq](/man/yq)(1), [dyff](/man/dyff)(1)