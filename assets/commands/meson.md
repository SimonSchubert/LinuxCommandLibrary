# TAGLINE

Fast and user-friendly build system

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

**Wipe and reconfigure build directory**

```meson setup --wipe [builddir]```

**Create a release build**

```meson setup [builddir] --buildtype=release```

# SYNOPSIS

**meson** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Meson subcommand (setup, compile, test, install, configure, dist, subprojects, wrap).

**setup** _DIR_
> Configure build directory.

**compile** **-C** _DIR_
> Build project.

**test** **-C** _DIR_
> Run tests.

**install** **-C** _DIR_
> Install project.

**configure** _DIR_
> Change build options without reconfiguring.

**dist**
> Create source distribution tarball.

**-D** _OPT=VAL_
> Set build option (e.g., -Dbuildtype=release, -Dprefix=/usr).

**--buildtype** _TYPE_
> Build type: plain, debug, debugoptimized, release, minsize, custom.

**--prefix** _PATH_
> Installation prefix (default: /usr/local).

**--wipe**
> Wipe and reconfigure existing build directory.

**--help**
> Display help information.

# DESCRIPTION

**meson** is a build system designed to be fast and user-friendly. It reads **meson.build** project definitions and generates backend build files (ninja by default) for actual compilation.

Meson supports C, C++, Rust, Java, Fortran, and other languages. It features automatic dependency detection, cross-compilation support, and built-in unit test and coverage infrastructure. Used by projects like GNOME, systemd, X.Org, and Mesa.

# CAVEATS

Requires Python 3 and ninja backend by default. Build directories cannot be reused across different source directories. Out-of-source builds only (cannot build in the source tree). The --wipe flag destroys and recreates the build directory.

# HISTORY

Meson was created by **Jussi Pakkanen** in 2013 as a fast, user-friendly build system.

# SEE ALSO

[ninja](/man/ninja)(1), [cmake](/man/cmake)(1), [make](/man/make)(1)

