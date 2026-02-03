# TLDR

**Run the C preprocessor** on a source file

```clang-cpp [source.c]```

**Preprocess with defines**

```clang-cpp -D[MACRO]=[value] [source.c]```

**Preprocess with include path**

```clang-cpp -I[/path/to/includes] [source.c]```

**Output to file**

```clang-cpp [source.c] -o [output.i]```

# SYNOPSIS

**clang-cpp** [_options_] _file_

# PARAMETERS

**-D** _macro[=value]_
> Define a preprocessor macro.

**-U** _macro_
> Undefine a preprocessor macro.

**-I** _path_
> Add include search path.

**-o** _file_
> Write output to file.

**-E**
> Preprocess only (implied).

# DESCRIPTION

**clang-cpp** is the Clang C preprocessor. It handles #include directives, macro expansion, and conditional compilation, outputting the preprocessed source.

This is the LLVM/Clang equivalent of **cpp** from GCC.

# SEE ALSO

[clang](/man/clang)(1), [cpp](/man/cpp)(1), [clang++](/man/clang++)(1)
