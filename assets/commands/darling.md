# TAGLINE

translation layer for running macOS software on Linux

# TLDR

Run a **builtin command**

```darling shell [uname]```

Run a **specific program** with arguments

```darling shell [path/to/program] [argument1] [argument2]```

Open a **macOS shell**

```darling shell```

**Execute a binary** directly, without going through the shell

```darling exec [path/to/program] [argument1]```

Use a **custom prefix** instead of ~/.darling

```DPREFIX=[path/to/prefix] darling shell```

**Shut down** the Darling container (needed after updating Darling)

```darling shutdown```

# SYNOPSIS

**darling** _program_ [_arguments_]

**darling shell** [_arguments_]

**darling exec** _program_ [_arguments_]

**darling shutdown**

# DESCRIPTION

**darling** is a translation layer that allows running macOS software on Linux, similar to how Wine runs Windows software on Linux. It consists of a Mach-O binary loader and a userspace kernel server (**darlingserver**) that implements the Mach IPC, POSIX and Darwin syscall interfaces on top of Linux, plus reimplementations of Apple frameworks.

The tool creates a macOS-compatible environment within Linux, including implementations of Foundation, CoreFoundation, and other essential Apple frameworks. Applications run in a prefix (default **~/.darling**, similar to Wine), a container with its own macOS-like filesystem layout. The host filesystem is visible inside it under **/Volumes/SystemRoot**.

The **shell** command provides access to run macOS binaries and commands within the Darling environment. You can run individual macOS programs, use built-in macOS utilities like uname, or open an interactive shell that behaves like a macOS terminal.

Darling is particularly useful for developers who need to test macOS applications on Linux, or for users who want to run specific macOS tools without access to Apple hardware.

# PARAMETERS

**shell** [_command_]
> Run a command, or open an interactive macOS shell when no argument is given.

_program_ [_arguments_]
> Run a program inside the container (via the shell).

**exec** _program_ [_arguments_]
> Execute a program directly without spawning a shell.

**shutdown**
> Stop the container and all processes running in the prefix.

**--version**
> Print the Darling branch and commit.

**--help**
> Show usage information.

# ENVIRONMENT

**DPREFIX**
> Absolute path of the Darling prefix. Defaults to **~/.darling**.

**DARLING_PROFILE**
> Select an isolated named prefix at **~/.darling.**_name_.

# CAVEATS

Mostly command-line software works; GUI application support is still in development. Older releases required a Linux kernel module (darling-mach); current versions use the userspace **darlingserver** instead. Many system features are not fully implemented.

# HISTORY

**Darling** was started by **Luboš Doležal** in **2012**. Its low-level components (XNU, libSystem, Security) are based on Apple's open-source releases. The kernel module was replaced by the userspace darlingserver, developed from late **2021**.

# SEE ALSO

[wine](/man/wine)(1), [proton](/man/proton)(1)

# RESOURCES

```[Source code](https://github.com/darlinghq/darling)```

```[Homepage](https://www.darlinghq.org/)```

```[Documentation](https://docs.darlinghq.org/)```

<!-- verified: 2026-11-23 -->
