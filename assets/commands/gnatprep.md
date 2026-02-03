# TLDR

**Preprocess an Ada source file**

```gnatprep [input.adb] [output.adb]```

**Preprocess with symbol definitions file**

```gnatprep [input.adb] [output.adb] [defs.txt]```

**Define a symbol on command line**

```gnatprep -DDEBUG=True [input.adb] [output.adb]```

**Replace preprocessor lines with blanks**

```gnatprep -b [input.adb] [output.adb]```

**Retain preprocessor lines as comments**

```gnatprep -c [input.adb] [output.adb]```

**List defined symbols**

```gnatprep -s [input.adb] [output.adb] [defs.txt]```

# SYNOPSIS

**gnatprep** _inputfile_ _outputfile_ [_definitions_file_] [_switches_]

# PARAMETERS

**-b**
> Replace preprocessor and deleted lines with blank lines.

**-c**
> Retain preprocessor and deleted lines as comments.

**-D**_symbol_=_value_
> Define symbol on command line.

**-s**
> List symbol names and values to stdout.

**-u**
> Treat undefined symbols as FALSE.

**-r**
> Generate source reference pragmas.

# DESCRIPTION

**gnatprep** is a preprocessor for Ada programs. It processes conditional compilation directives (#if, #elsif, #else, #end if) and symbol substitutions ($symbol) in Ada source files. While designed for GNAT, it is not dependent on GNAT-specific features and can be used independently.

# CAVEATS

Neither -b nor -c preserves original line numbers. If both are absent, preprocessor and deleted lines are removed entirely unless -r is specified.

# SEE ALSO

[gnatmake](/man/gnatmake)(1), [gcc](/man/gcc)(1)

