# TAGLINE

Android DEX file analyzer with call graph generation

# TLDR

**Analyze a DEX file**

```dexter -i [classes.dex]```

**Generate call graph**

```dexter -i [classes.dex] --callgraph```

**Filter by package**

```dexter -i [classes.dex] --package [com.example]```

# SYNOPSIS

**dexter** [_options_]

# PARAMETERS

**-i**, **--input** _file_
> Input DEX or APK file.

**--callgraph**
> Generate method call graph.

**--package** _name_
> Filter by package name.

**-o**, **--output** _file_
> Output file.

# DESCRIPTION

**dexter** is an Android DEX file analyzer that provides detailed information about classes, methods, and bytecode. It can generate call graphs to visualize method dependencies and analyze application structure at a deeper level than basic disassemblers.

The tool is particularly useful for understanding complex app architectures, identifying code paths, and analyzing relationships between components. Package filtering allows focusing analysis on specific parts of an application.

Call graph generation helps security researchers identify potential attack vectors and developers understand code flow in unfamiliar codebases.

# SEE ALSO

[dexdump](/man/dexdump)(1), [apktool](/man/apktool)(1)
