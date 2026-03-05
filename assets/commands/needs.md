# TAGLINE

Check if required executables are installed on the system

# TLDR

**Check if tools are installed**

```needs [tool1] [tool2] [tool3]```

**Check without version lookups**

```needs --no-version [tool1] [tool2]```

**Check from a requirements file**

```needs -f [needsfile]```

# SYNOPSIS

**needs** [_options_] [_executables_...]

# PARAMETERS

**--no-version**
> Skip version checks for faster execution.

**-f**, **--file** _FILE_
> Read requirements from a needsfile.

**-v**, **--verbose**
> Show detailed timing and log information.

# DESCRIPTION

**needs** is a CLI tool that verifies whether specified executables are installed on a system and can retrieve their version information. It runs checks with multi-threaded execution, provides colored output, supports pipe-friendly output, and logs timing per command.

Exit codes indicate whether all required tools are present, making it suitable for use in scripts and CI pipelines.

# CAVEATS

Version detection relies on each tool supporting a standard version flag (--version or -v). Some tools may not be detected correctly.

# HISTORY

**needs** was created by **NQMVD** and is written in **Rust**.

# SEE ALSO

[which](/man/which)(1), [command](/man/command)(1), [has](/man/has)(1)
