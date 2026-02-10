# TAGLINE

dynamic linker/loader

# TLDR

**Run with library path**

```LD_LIBRARY_PATH=[/path/to/libs] [program]```

**Preload library**

```LD_PRELOAD=[/path/to/lib.so] [program]```

**Debug loading**

```LD_DEBUG=libs [program]```

**Show search paths**

```ldconfig -p```

**Update library cache**

```sudo ldconfig```

# SYNOPSIS

**ld.so** / **ld-linux.so** is the dynamic linker

# PARAMETERS

**LD_LIBRARY_PATH**
> Additional library directories.

**LD_PRELOAD**
> Libraries to load first.

**LD_DEBUG**
> Debug options (libs, reloc, files).

**LD_TRACE_LOADED_OBJECTS**
> List dependencies (like ldd).

# DESCRIPTION

**ld.so** is the dynamic linker/loader. It loads shared libraries needed by programs at runtime.

The loader resolves symbols and handles library dependencies. Environment variables control its behavior.

# CAVEATS

Not directly invoked usually. Security implications of LD_PRELOAD. Ignored for setuid binaries.

# HISTORY

ld.so is part of the **glibc** package, implementing dynamic linking for Linux executables.

# SEE ALSO

[ldd](/man/ldd)(1), [ldconfig](/man/ldconfig)(8), [ld](/man/ld)(1)
