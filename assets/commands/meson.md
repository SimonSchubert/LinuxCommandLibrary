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
> Meson subcommand (see list below).

**init**
> Create a minimal meson.build for a new project in the current directory.

**setup** _DIR_
> Configure a build directory (the canonical first step).

**compile** **-C** _DIR_
> Build the project.

**test** **-C** _DIR_
> Run the project's test suite.

**install** **-C** _DIR_
> Install the built project into the configured prefix.

**configure** _DIR_
> Change build options on an existing build directory without wiping it.

**dist**
> Create a signed source distribution tarball.

**introspect**
> Print a JSON-formatted description of targets, tests, options, etc.

**subprojects**, **wrap**
> Manage meson subprojects and **.wrap** dependency files.

**devenv**
> Spawn a shell with the build environment (e.g. **PATH**, **PKG_CONFIG_PATH**) pre-set.

**rewrite**
> Programmatically modify **meson.build** files.

**env2mfile**
> Generate a cross- or native-file from current environment variables.

**format**
> Auto-format **meson.build** files (alias **fmt**).

**-D** _OPT=VAL_
> Set a build option (e.g. **-Dbuildtype=release**, **-Dprefix=/usr**).

**--buildtype** _TYPE_
> Build type: **plain**, **debug**, **debugoptimized**, **release**, **minsize**, **custom**.

**--prefix** _PATH_
> Installation prefix (default **/usr/local**).

**--backend** _BACKEND_
> Backend to generate: **ninja** (default), **vs**, **vs2017**, **xcode**, etc.

**--default-library** _TYPE_
> Default library type: **static**, **shared**, or **both**.

**--cross-file** _FILE_
> Use a cross-compilation definition file.

**--native-file** _FILE_
> Override native compiler/tool selection on the host.

**--reconfigure**
> Re-run configuration using the stored options without wiping the build directory.

**--wipe**
> Wipe and reconfigure an existing build directory.

**--werror**, **--warnlevel** _N_
> Treat warnings as errors, or set compiler warning level (0-3/everything).

**--optimization** _LEVEL_
> Optimization level (**0**, **g**, **1**, **2**, **3**, **s**).

**--vsenv**
> Activate a Visual Studio environment before building on Windows.

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

