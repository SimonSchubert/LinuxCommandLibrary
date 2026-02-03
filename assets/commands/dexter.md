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

**dexter** is an Android DEX file analyzer that provides detailed information about classes, methods, and bytecode. It can generate call graphs and analyze app structure.

# SEE ALSO

[dexdump](/man/dexdump)(1), [apktool](/man/apktool)(1)
