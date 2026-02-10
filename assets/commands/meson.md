# TAGLINE

fast build system

# TLDR

**Setup build directory**

```meson setup [builddir]```

**Configure with options**

```meson setup [builddir] -D[option=value]```

**Compile project**

```meson compile -C [builddir]```

**Run tests**

```meson test -C [builddir]```

**Install project**

```meson install -C [builddir]```

**Reconfigure**

```meson configure [builddir] -D[option=value]```

# SYNOPSIS

**meson** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Meson command (setup, compile, test).

**setup** _DIR_
> Configure build directory.

**compile** **-C** _DIR_
> Build project.

**test** **-C** _DIR_
> Run tests.

**install** **-C** _DIR_
> Install project.

**-D** _OPT=VAL_
> Set option.

**--help**
> Display help information.

# DESCRIPTION

**meson** is a fast build system. It generates ninja build files from meson.build definitions.

The tool provides simple syntax and fast configuration. Used by many open source projects.

# CAVEATS

Requires ninja backend. Python-based. Different from make/cmake.

# HISTORY

Meson was created by **Jussi Pakkanen** in 2013 as a fast, user-friendly build system.

# SEE ALSO

[ninja](/man/ninja)(1), [cmake](/man/cmake)(1), [make](/man/make)(1)

