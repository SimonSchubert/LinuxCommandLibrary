# TAGLINE

Check if required executables are installed on the system

# TLDR

**Check if tools are installed and show their versions**

```needs [tool1] [tool2] [tool3]```

**Check the binaries listed in a needsfile** in the current directory

```needs```

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
> Increase verbosity level. Can be repeated (-vvv for logs, -vvvv for per-binary timings).

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Show the version of needs itself.

# DESCRIPTION

**needs** verifies whether specified executables are available in the PATH and optionally retrieves their versions. Version checks run in parallel to reduce the time spent waiting on slow programs.

If no binaries are given, it looks for a file named `needsfile` or `.needsfile` in the current directory.

Exit codes indicate whether all required tools are present (0 for success, 1 for missing), making it suitable for scripts and CI pipelines.

# CAVEATS

Version retrieval actually runs each binary with `--version`, which can be slow and, for programs that ignore the flag, may trigger their normal behavior. Use **--no-versions** when checking unfamiliar programs. The **--no-versions** and **--full-versions** flags only exist when built with the default `version-retrieval` feature. Windows is not a supported target.

# HISTORY

**needs** was created by **NQMVD**, is written in **Rust**, and was inspired by the **has** shell script.

# SEE ALSO

[which](/man/which)(1), [command](/man/command)(1), [has](/man/has)(1), [type](/man/type)(1), [whereis](/man/whereis)(1)

# RESOURCES

```[Source code](https://github.com/nmb4/needs)```

<!-- verified: 2026-11-09 -->
