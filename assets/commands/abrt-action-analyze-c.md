# TAGLINE

generate UUID from coredump for crash deduplication

# TLDR

Compute and store a UUID for C/C++ crashes in the **current dump dir**

```abrt-action-analyze-c```

Do the same for a **specified dump directory**

```abrt-action-analyze-c -d [path/to/directory]```

Run with **verbose** output

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

[abrt-cli](/man/abrt-cli)(1), [abrt-action-analyze-backtrace](/man/abrt-action-analyze-backtrace)(1), [abrt-action-generate-backtrace](/man/abrt-action-generate-backtrace)(1)

# RESOURCES

```[Source code](https://github.com/abrt/abrt)```

```[Documentation](https://abrt.readthedocs.io/)```

<!-- verified: 2026-06-10 -->
