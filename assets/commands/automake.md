# TAGLINE

Generate Makefile.in templates from Makefile.am

# TLDR

**Generate** Makefile.in

```automake --add-missing```

Generate with **copy** instead of symlink

```automake --add-missing --copy```

Generate for **specific version**

```automake-1.16```

# SYNOPSIS

**automake** [_--add-missing_] [_--copy_] [_options_] [_Makefile_...]

# DESCRIPTION

**automake** generates Makefile.in templates from Makefile.am files. It works with autoconf to create the complete GNU Build System, handling compilation, installation, and distribution tasks.

Automake provides portable makefiles that work across Unix-like systems.

# PARAMETERS

**--add-missing**
> Add missing standard files (install-sh, missing, etc.)

**--copy**
> Copy files instead of symlinking

**--force-missing**
> Replace existing standard files

**-W** _category_
> Warning level

**--foreign**
> Relax GNU standards

**--gnits**
> Stricter GNU standards

**-a**, **--add-missing**
> Add missing auxiliary files

**-c**, **--copy**
> Copy auxiliary files

# WORKFLOW

1. Write Makefile.am
2. Run **automake** to generate Makefile.in
3. Run **autoconf** to generate configure
4. Users run ./configure to generate Makefile

# CAVEATS

Steep learning curve. Generated Makefiles are complex. Requires understanding of autotools conventions. Many projects now use CMake or Meson instead.

# HISTORY

**Automake** was created by David MacKenzie and Tom Tromey, first released in **1994** to complement autoconf with makefile generation.

# SEE ALSO

[autoconf](/man/autoconf)(1), [autoreconf](/man/autoreconf)(1), [make](/man/make)(1)
