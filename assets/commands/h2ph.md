# TLDR

**Convert C header to Perl**

```h2ph [header.h]```

**Process system headers**

```cd /usr/include && h2ph -r -l *.h```

**Output to specific directory**

```h2ph -d [/usr/lib/perl5] [header.h]```

**Recursive processing**

```h2ph -r [sys/types.h]```

# SYNOPSIS

**h2ph** [_options_] [_files_]

# PARAMETERS

_FILES_
> C header files to convert.

**-d** _DIR_
> Output directory.

**-r**
> Recursive processing.

**-l**
> Symbolic links for duplicates.

**-a**
> Generate autoload code.

**-D** _DIR_
> Search directory.

**--help**
> Display help information.

# DESCRIPTION

**h2ph** converts C header files to Perl headers. It translates #define macros and constant definitions for use in Perl programs.

The tool creates .ph files that Perl can require. It's used to access system constants defined in C headers from Perl code.

h2ph converts C headers for Perl use.

# CAVEATS

Only handles simple #defines. Complex macros not translated. Output may need manual fixes.

# HISTORY

h2ph has been part of **Perl** since early versions, enabling access to system constants from Perl programs.

# SEE ALSO

[h2xs](/man/h2xs)(1), [perl](/man/perl)(1), [perlapi](/man/perlapi)(1)
