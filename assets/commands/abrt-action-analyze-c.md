# TLDR

Calculate and save the UUID for the **current working directory**

```abrt-action-analyze-c```

Calculate and save the UUID for a **specific directory**

```abrt-action-analyze-c -d [path/to/directory]```

Calculate and save the UUID **verbosely**

```abrt-action-analyze-c -v```

# SYNOPSIS

**abrt-action-analyze-c** [_-v_] [_-d DIR_]

# DESCRIPTION

**abrt-action-analyze-c** processes a coredump file from a problem data directory and generates a universally unique identifier (UUID). The UUID is saved as a new element in the directory structure.

This tool integrates with ABRT events, particularly for generating UUIDs when new coredumps are saved.

# PARAMETERS

**-d DIR**
> Specifies the path to the problem directory where the coredump is located; defaults to current working directory

**-v**
> Enables verbose output; can be specified multiple times to increase verbosity levels

# CAVEATS

Requires a coredump file to exist in the problem directory. Typically used as part of the ABRT event pipeline rather than directly by users.

# HISTORY

Part of **ABRT** (Automatic Bug Reporting Tool), developed by Red Hat for Fedora-based systems to detect, analyze, and report application crashes.

# SEE ALSO

[abrt-cli](/man/abrt-cli)(1), [abrt-action-analyze-backtrace](/man/abrt-action-analyze-backtrace)(1)
