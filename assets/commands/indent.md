# TAGLINE

reformats C source code according to specified style guidelines

# TLDR

**Format C source file**

```indent [source.c]```

**Format to specific style**

```indent -kr [source.c]```

**GNU style formatting**

```indent -gnu [source.c]```

**BSD style formatting**

```indent -orig [source.c]```

**Output to different file**

```indent [input.c] -o [output.c]```

**Set tab width to 4 spaces**

```indent -ts4 [source.c]```

**Set indentation to 4 spaces per level**

```indent -i4 [source.c]```

# SYNOPSIS

**indent** [_options_] _file_ [_output_]

# PARAMETERS

**-kr**
> Kernighan & Ritchie style.

**-gnu**
> GNU coding style.

**-orig**
> Original BSD style.

**-linux**
> Linux kernel style.

**-ts** _N_
> Set tab size.

**-i** _N_
> Set indentation level.

**-l** _N_
> Maximum line length.

**-o** _FILE_
> Output file.

**-npro**
> Do not read .indent.pro profile files.

**-bad**
> Force blank line after declarations.

**-bap**
> Force blank line after procedure bodies.

**-nbc**
> Do not force newlines after commas in declarations.

**--help**
> Display help information.

# DESCRIPTION

**indent** reformats C source code according to specified style guidelines. It handles indentation, brace placement, spacing, and line breaking.

The tool supports predefined styles (K&R, GNU, BSD) and extensive customization. It can modify files in place or write to new files.

# CAVEATS

C-specific; does not handle C++ or other languages well. May alter semantics when processing complex macros or preprocessor directives. Modifies files in-place by default; use **-o** to write to a separate file. Configuration can be stored in **.indent.pro** files loaded automatically from the current directory or home directory.

# HISTORY

indent originated in **BSD Unix**. The GNU version was developed as part of the GNU project with extended options.

# SEE ALSO

[clang-format](/man/clang-format)(1), [astyle](/man/astyle)(1), [cb](/man/cb)(1)
