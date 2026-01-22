# TLDR

**Compile** source to libtool object

```libtool compile gcc -c [source.c] -o [source.lo]```

**Link** to create library

```libtool link gcc -o [library.lo] [source.lo]```

**Execute** program with library path

```libtool execute gdb [path/to/program]```

**Install** shared library

```libtool install cp [library.la] [install_dir]```

**Finish** library installation

```libtool finish [install_dir]```

**Uninstall** library

```libtool uninstall [library.la]```

**Clean** uninstalled files

```libtool clean rm [source.lo] [library.la]```

# SYNOPSIS

**libtool** [_mode_] [_mode-args_]

# DESCRIPTION

**libtool** is a generic library support script that hides the complexity of using shared libraries behind a consistent, portable interface. It handles platform-specific compilation, linking, and installation of shared libraries.

# PARAMETERS

**compile, c**
> Compile source files into libtool objects (.lo)

**link, l**
> Create libraries or executables

**execute, e**
> Execute program with correct library path

**install, i**
> Install libraries or executables

**finish, f**
> Complete installation of libtool libraries

**uninstall, u**
> Delete installed libraries

**clean, cl**
> Delete uninstalled libraries

# CAVEATS

Libtool objects (.lo) and archives (.la) are wrappers containing metadata. Actual compiled files are in `.libs/` subdirectory.

# HISTORY

Created by Gordon Matzigkeit in **1996** as part of the GNU project to simplify portable library creation across Unix-like systems.

# SEE ALSO

[libtoolize](/man/libtoolize)(1), [automake](/man/automake)(1), [autoconf](/man/autoconf)(1)
