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

**darling** is a translation layer that allows running macOS software on Linux, similar to how Wine runs Windows software. It provides a macOS-like environment including system frameworks and libraries.

The shell command provides access to run macOS binaries within the Darling environment.

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
