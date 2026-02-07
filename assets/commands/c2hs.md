# TAGLINE

Generate Haskell FFI bindings from C headers

# TLDR

**Generate Haskell bindings from C header**

```c2hs [header.h] [bindings.chs]```

**Specify include path**

```c2hs -C -I[/path/to/includes] [bindings.chs]```

**Pass preprocessor defines**

```c2hs -C -D[MACRO=value] [bindings.chs]```

**Specify output directory**

```c2hs -o [output_dir] [bindings.chs]```

**Show help**

```c2hs --help```

# SYNOPSIS

**c2hs** [_options_] _header.h_ _binding.chs_

# DESCRIPTION

**c2hs** is a C to Haskell interface generator that simplifies creating FFI bindings to C libraries. It extracts interface information from C header files and generates Haskell code with foreign imports and correct type marshaling.

The tool processes .chs files containing Haskell code with embedded hooks that reference C structures and functions.

# PARAMETERS

**-C** _options_
> Pass options to C preprocessor (-I, -D, etc.)

**-o** _directory_
> Output directory for generated files

**-c** _compiler_
> Use specific C compiler

**--cppopts**=_options_
> C preprocessor options

**-d** _type_
> Dump internal information (trace, genbind, ctrav, chs)

**-k**
> Keep intermediate files

**--help**
> Show help

**--version**
> Show version

# WORKFLOW

1. Write .chs file with Haskell code and C hooks
2. Run c2hs to generate .hs file
3. Compile generated Haskell module

# CABAL INTEGRATION

Cabal automatically processes .chs files and runs c2hs with appropriate flags.

# CAVEATS

Generated code is BSD licensed. Requires C header files to be accessible. Complex C constructs may need manual binding.

# SEE ALSO

[hsc2hs](/man/hsc2hs)(1), [ghc](/man/ghc)(1), [cabal](/man/cabal)(1)
