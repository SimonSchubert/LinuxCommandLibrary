# TAGLINE

Demangle C++ and Java symbol names

# TLDR

**Demangle a C++ symbol**

```c++filt [_Z1fv]```

**Demangle from stdin**

```echo "[_Z3fooi]" | c++filt```

**Demangle without function parameters**

```c++filt -p [symbol]```

**Demangle with types**

```c++filt -t [symbol]```

**Strip leading underscore**

```c++filt -_ [symbol]```

**Demangle dynamic symbols from ELF**

```readelf -W --dyn-syms [binary] | c++filt```

# SYNOPSIS

**c++filt** [_options_] [_symbol_...]

# DESCRIPTION

**c++filt** decodes (demangles) C++ and Java low-level symbol names into their original user-readable form. C++ compilers encode function names to handle overloading, and this tool reverses that process.

Without arguments, reads symbols from stdin. Can process entire assembler source files containing mangled names.

# PARAMETERS

**-_**, **--strip-underscore**
> Remove initial underscore from symbols

**-n**, **--no-strip-underscore**
> Do not remove initial underscore

**-p**, **--no-params**
> Don't display function parameter types

**-t**, **--types**
> Demangle types as well as function names

**-s** _format_, **--format**=_format_
> Specify mangling format (gnu, lucid, arm, hp, edg, gnu-v3, java, gnat, dlang, rust)

**-r**, **--no-recurse-limit**
> Disable recursion limit (default: 2048 levels)

**--help**
> Display help

**--version**
> Display version

# EXAMPLES

```
$ c++filt _Z3fooi
foo(int)

$ c++filt _ZN3Bar3bazEv
Bar::baz()
```

# CAVEATS

Mangled names must be complete tokens - trailing punctuation prevents demangling. Different compilers use different mangling schemes; use -s to specify format.

# SEE ALSO

[nm](/man/nm)(1), [objdump](/man/objdump)(1), [readelf](/man/readelf)(1)
