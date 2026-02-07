# TAGLINE

Perl utility for creating custom Encode modules

# TLDR

**Create Encode module** from UCM file

```enc2xs -M [ModuleName] [encoding.ucm]```

**Build and install**

```enc2xs -C [encoding.ucm]```

**Generate for specific** Perl version

```enc2xs --perl [/usr/bin/perl] [encoding.ucm]```

# SYNOPSIS

**enc2xs** [_options_] _ucm-files_

# PARAMETERS

_UCM-FILES_
> UCM (Unicode Character Map) file(s).

**-M** _NAME_
> Module name.

**-C**
> Compile and install.

**-o** _FILE_
> Output file.

**--perl** _PATH_
> Perl interpreter path.

**--help**
> Display help information.

# DESCRIPTION

**enc2xs** is a Perl utility for creating custom Encode modules from UCM (Unicode Character Map) files. It compiles character encoding definitions into Perl modules.

The tool is used to add support for non-standard or proprietary character encodings to Perl's Encode system. UCM files define the mapping between byte sequences and Unicode code points.

enc2xs generates XS code that can be compiled into a loadable Perl module.

# CAVEATS

Requires Perl development environment. UCM format must be correct. XS compilation needs C compiler. Primarily for encoding developers.

# HISTORY

enc2xs is part of the **Encode** module in Perl core, supporting the creation of custom character encoding support. It enables Perl to handle encodings not built into the standard distribution.

# SEE ALSO

[perl](/man/perl)(1), [piconv](/man/piconv)(1)
