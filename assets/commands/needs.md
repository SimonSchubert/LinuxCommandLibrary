# TAGLINE

Check if required executables are installed on the system

# TLDR

**Check if tools are installed and show their versions**

```needs [tool1] [tool2] [tool3]```

**Check without retrieving version information**

```needs --no-versions [tool1] [tool2]```

**Show full version strings instead of short versions**

```needs --full-versions [tool1] [tool2]```

**Run quietly, only reporting via exit code**

```needs -q [tool1] [tool2]```

**Check with verbose logging**

```needs -vvv [tool1] [tool2]```

# SYNOPSIS

**needs** [_options_] [_executables_...]

# PARAMETERS

**-n**, **--no-versions**
> Skip version checks, only verify that binaries exist.

**-f**, **--full-versions**
> Show the full version string for each binary instead of a shortened version.

**-q**, **--quiet**
> Stay quiet, only communicate results via exit code (0 if all found, 1 if any missing).

**-v**, **--verbosity**
> Increase verbosity level. Can be repeated for more detail (e.g., -vvv for logs, -vvvv for timing info).

**--help**
> Display help information.

**--version**
> Show the version of needs itself.

# DESCRIPTION

**needs** is a CLI tool that verifies whether specified executables are installed on a system and optionally retrieves their version information. It runs checks using multi-threaded execution for speed, provides colored output, and supports pipe-friendly output.

Binary names can be provided as command-line arguments or listed in a `needsfile` (one or more binaries per line).

Exit codes indicate whether all required tools are present (0 for success, 1 for missing), making it suitable for use in scripts and CI pipelines.

# CAVEATS

Version detection relies on each tool supporting a standard version flag (`--version` or `-v`). Some tools may not have their version detected correctly. The `--no-versions` and `--full-versions` flags are only available when compiled with the `version-retrieval` feature (enabled by default).

# HISTORY

**needs** was created by **NQMVD** and is written in **Rust**.

# SEE ALSO

[which](/man/which)(1), [command](/man/command)(1), [has](/man/has)(1), [type](/man/type)(1), [whereis](/man/whereis)(1)
