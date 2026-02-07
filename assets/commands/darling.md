# TAGLINE

translation layer for running macOS software on Linux

# TLDR

Run a **builtin command**

```darling shell [uname]```

Run a **specific program** with arguments

```darling shell [path/to/program] [argument1] [argument2]```

Open a **macOS shell**

```darling shell```

**Shutdown** the Darling service

```darling shutdown```

# SYNOPSIS

**darling** _command_ [_arguments_]

# DESCRIPTION

**darling** is a translation layer that allows running macOS software on Linux, similar to how Wine runs Windows software on Linux or Wine64 runs 64-bit Windows applications. It translates macOS system calls into Linux equivalents and provides compatible implementations of macOS frameworks and libraries.

The tool creates a macOS-compatible environment within Linux, including implementations of Foundation, CoreFoundation, and other essential Apple frameworks. Applications run in a prefix (similar to Wine), isolating them from the host system while providing access to necessary resources.

The **shell** command provides access to run macOS binaries and commands within the Darling environment. You can run individual macOS programs, use built-in macOS utilities like uname, or open an interactive shell that behaves like a macOS terminal.

Darling is particularly useful for developers who need to test macOS applications on Linux, or for users who want to run specific macOS tools without access to Apple hardware.

# PARAMETERS

**shell** [_command_]
> Run a command or open interactive shell

**shutdown**
> Stop the Darling service

# CAVEATS

Not all macOS software is compatible. Requires the Darling kernel module. Performance may vary compared to native macOS. Some system features may not be fully implemented.

# HISTORY

**Darling** is an open-source project that aims to run macOS applications on Linux by translating system calls and providing compatible frameworks, similar to Wine for Windows.

# SEE ALSO

[wine](/man/wine)(1)
