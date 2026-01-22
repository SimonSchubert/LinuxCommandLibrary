# TLDR

**List** available applets

```busybox --list```

**Run** specific command

```busybox ls [-la]```

**Create** symlinks

```busybox --install -s```

**Show** version

```busybox --help```

# SYNOPSIS

**busybox** [_applet_] [_arguments_]

# DESCRIPTION

**busybox** combines many common Unix utilities into a single small executable. It implements lightweight versions of over 300 commands, making it ideal for embedded systems, containers, and minimal installations.

The tool is ubiquitous in embedded Linux, Android, and container images like Alpine Linux.

# PARAMETERS

**--list**
> List available applets

**--install** [**-s**]
> Create applet symlinks

**--help** [_applet_]
> Show help for applet

# COMMON APPLETS

Core utilities:
- **ls, cp, mv, rm** - File operations
- **cat, grep, sed, awk** - Text processing
- **sh** - Shell
- **tar, gzip** - Archives
- **wget** - Download
- **ping, ifconfig** - Network

# USAGE MODES

**Direct invocation**
```bash
busybox ls -la
busybox grep pattern file
```

**Symlinks** (most common)
```bash
# After busybox --install -s
ls -la  # Actually runs busybox ls
grep pattern file  # Actually runs busybox grep
```

**Applet mode**
```bash
# When busybox is symlinked as command name
/bin/ls -> busybox
```

# FEATURES

- Single binary (~1-2MB)
- 300+ Unix utilities
- POSIX compatible
- Configurable at compile time
- Minimal dependencies
- Embedded-friendly

# CAVEATS

Simplified versions (fewer features than GNU tools). Some advanced options missing. Behavior may differ slightly from full versions. Configuration frozen at compile time. Not all applets available in all builds.

# HISTORY

**BusyBox** was created by Bruce Perens in **1996** for Debian installer, becoming the standard multi-call binary for embedded Linux systems.

# SEE ALSO

[alpine](/man/alpine)(1), [toybox](/man/toybox)(1), [coreutils](/man/coreutils)(7)
