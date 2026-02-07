# TAGLINE

analyze crash backtrace for duplication and quality

# TLDR

Analyze backtrace for the **current working directory**

```abrt-action-analyze-backtrace```

Analyze backtrace for a **specific directory**

```abrt-action-analyze-backtrace -d [path/to/directory]```

Analyze backtrace **verbosely**

```abrt-action-analyze-backtrace -v```

# SYNOPSIS

**abrt-action-analyze-backtrace** [_-v_] [_-d DIR_]

# DESCRIPTION

**abrt-action-analyze-backtrace** analyzes C/C++ backtraces and generates a duplication hash, backtrace rating, and identifies the crash function. The data is saved as new elements **duphash**, **rating**, and **crash_function** in the problem directory.

This tool works as a secondary analyzer after backtrace generation. The rating prevents low-quality backtraces from being reported, while the duplication hash helps identify previously filed similar crash reports.

# PARAMETERS

**-d DIR**
> Specifies the path to the problem directory; defaults to current working directory

**-v**
> Enables verbose output; can be used multiple times for increased verbosity

# CAVEATS

Requires a backtrace file to already exist in the problem directory. Typically used as part of the ABRT event pipeline rather than directly by users.

# HISTORY

Part of **ABRT** (Automatic Bug Reporting Tool), developed by Red Hat for Fedora-based systems to detect, analyze, and report application crashes.

# SEE ALSO

[abrt-cli](/man/abrt-cli)(1), [abrt-action-generate-backtrace](/man/abrt-action-generate-backtrace)(1), [abrt-action-analyze-c](/man/abrt-action-analyze-c)(1)
