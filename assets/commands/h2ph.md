# TAGLINE

Convert C header files to Perl header files

# TLDR

**Convert a C header file to Perl**

```h2ph [header.h]```

**Process all system headers recursively**

```cd /usr/include && h2ph -r -l *.h```

**Output to a specific directory**

```h2ph -d [/usr/lib/perl5] [header.h]```

**Convert a header and all headers it includes**

```h2ph -a [sys/types.h]```

# SYNOPSIS

**h2ph** [_options_] [_headerfiles_...]

# PARAMETERS

_HEADERFILES_
> C header files (.h) to convert to Perl header files (.ph).

**-d** _DIR_
> Put resulting .ph files beneath the specified directory instead of the default Perl library location.

**-r**
> Run recursively, converting all .h files in specified directories and their subdirectories.

**-a**
> Run automagically; convert specified headers as well as any .h files they include.

**-l**
> Create symbolic links for duplicate output files instead of separate copies.

**-D** _DIR_
> Search the specified directory for included header files.

**-e**
> If an error is encountered during conversion, output file names and continue parsing.

**-Q**
> Quiet mode. Do not print the names of converted files.

# DESCRIPTION

**h2ph** converts C header files (.h) to Perl header files (.ph). It translates **#define** macros and constant definitions into Perl equivalents that can be loaded with **require**.

The tool is best run from **/usr/include** to convert system headers. It wraps definitions inside **eval** blocks so that you can access the definitions it can translate even if some fail. Output .ph files are placed in Perl's architecture-dependent library directory by default.

# CAVEATS

Only handles simple **#define** constants and macros. Complex C macros, function-like macros, and typedefs are not translated. Output may need manual corrections. The **h2xs** tool is generally preferred for creating Perl extensions from C headers.

# HISTORY

h2ph has been part of the **Perl** distribution since early versions, providing a quick way to access system constants from Perl programs before XS and h2xs became the preferred approach.

# SEE ALSO

[h2xs](/man/h2xs)(1), [perl](/man/perl)(1)
