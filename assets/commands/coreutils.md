# TAGLINE

GNU core Unix utilities collection

# TLDR

**List all commands** in GNU coreutils

```coreutils --help```

**Run a coreutils command** via the multicall binary

```coreutils [ls] -la```

**Check coreutils version**

```coreutils --version```

**Run cat through coreutils**

```coreutils cat [file.txt]```

**Run basename via coreutils**

```coreutils basename [/path/to/file.txt]```

# SYNOPSIS

**coreutils** [_command_] [_arguments_]

# PARAMETERS

**--help**
> List all available commands in the coreutils package.

**--version**
> Display the coreutils version information.

_COMMAND_
> Any coreutils command to execute (ls, cat, cp, mv, etc.).

# DESCRIPTION

**GNU Coreutils** is the collection of basic file, shell, and text manipulation utilities that are expected to exist on every Unix-like operating system. The **coreutils** command itself is a multicall binary that can invoke any of the included utilities.

The package includes essential commands for file operations (cp, mv, rm, ls, mkdir), text processing (cat, head, tail, sort, uniq, wc), shell utilities (echo, printf, test, expr), and system information (uname, hostname, uptime, who).

On most Linux systems, these utilities are installed as individual binaries in /usr/bin or /bin. The multicall binary is useful in minimal environments like containers or embedded systems where a single binary provides all functionality, similar to BusyBox.

# INCLUDED COMMANDS

**File operations**: cp, mv, rm, ln, mkdir, rmdir, touch, chmod, chown, ls, dir, vdir

**Text processing**: cat, head, tail, sort, uniq, wc, cut, paste, join, tr, fold

**Shell utilities**: echo, printf, test, expr, true, false, yes, seq, sleep

**System info**: uname, hostname, uptime, who, whoami, id, groups, date

# CAVEATS

Behavior may differ between GNU coreutils and BSD/macOS implementations. Some options are GNU extensions not available on other Unix systems. The multicall binary may not be installed by default on all distributions.

# HISTORY

GNU Coreutils was formed in **2002** by merging three GNU packages: fileutils, shellutils, and textutils. These utilities were created as part of the GNU Project, started by Richard Stallman in **1983**, to provide free replacements for proprietary Unix tools.

# SEE ALSO

[ls](/man/ls)(1), [cp](/man/cp)(1), [mv](/man/mv)(1), [cat](/man/cat)(1), [busybox](/man/busybox)(1)
