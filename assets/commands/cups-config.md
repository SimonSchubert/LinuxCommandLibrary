# TAGLINE

CUPS build configuration helper

# TLDR

**Get CUPS include directory**

```cups-config --cflags```

**Get CUPS library flags**

```cups-config --libs```

**Get CUPS version**

```cups-config --version```

**Get all configuration**

```cups-config --all```

# SYNOPSIS

**cups-config** [_options_]

# PARAMETERS

**--cflags**
> Print compiler flags for CUPS headers.

**--libs**
> Print linker flags for CUPS libraries.

**--version**
> Print CUPS version.

**--ldflags**
> Print linker directory flags.

**--serverbin**
> Print server binary directory.

**--serverroot**
> Print server root directory.

**--datadir**
> Print data directory.

# DESCRIPTION

**cups-config** provides configuration information for CUPS (Common Unix Printing System). It's primarily used by build systems to determine compiler and linker flags when building software that uses CUPS libraries.

# SEE ALSO

[cupsd](/man/cupsd)(8), [lp](/man/lp)(1), [lpr](/man/lpr)(1)
