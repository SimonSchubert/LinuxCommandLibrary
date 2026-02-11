# TAGLINE

Remove non-deterministic data for reproducible builds

# TLDR

**Strip file**

```strip-nondeterminism [file]```

**Strip with type**

```strip-nondeterminism --type [zip] [file.zip]```

**Set timestamp**

```strip-nondeterminism --timestamp [1234567890] [file]```

**Verbose output**

```strip-nondeterminism -v [file]```

**Dry run**

```strip-nondeterminism -n [file]```

# SYNOPSIS

**strip-nondeterminism** [_--type type_] [_--timestamp ts_] [_options_] _files_

# PARAMETERS

**--type** _TYPE_
> File type.

**--timestamp** _TS_
> Set timestamp.

**-v**
> Verbose output.

**-n**
> Dry run.

**--help**
> Show help.

# DESCRIPTION

**strip-nondeterminism** removes sources of non-determinism from files to enable reproducible builds. Build artifacts often contain embedded timestamps, user IDs, file ordering variations, and other metadata that differ between builds even when the source code is identical. This tool normalizes those elements so that building the same source always produces bit-identical output.

The tool supports multiple file formats including ZIP archives, JAR files, PNG images, gzip files, and ar archives. For each format, it identifies and strips or normalizes the specific metadata fields that introduce non-determinism, such as modification timestamps in archive entries or creation dates in PNG headers.

It is part of the Debian Reproducible Builds infrastructure and is commonly integrated into build systems as a post-processing step. A fixed timestamp can be provided to replace variable ones, typically sourced from the SOURCE_DATE_EPOCH environment variable.

# CAVEATS

Format-specific. May need type hint. Part of Debian reproducible builds.

# HISTORY

**strip-nondeterminism** was created for the **Reproducible Builds** project to make build outputs deterministic.

# SEE ALSO

[touch](/man/touch)(1), [zip](/man/zip)(1), [ar](/man/ar)(1)
