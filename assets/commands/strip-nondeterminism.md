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

**-t**, **--type** _TYPE_
> Force the input to be treated as a particular file format (e.g., _zip_, _jar_, _png_, _gzip_, _ar_, _javadoc_) instead of letting the filename suffix decide.

**-T**, **--timestamp** _TS_
> Replace embedded timestamps with the given Unix epoch value. If unset, **strip-nondeterminism** falls back to the **SOURCE_DATE_EPOCH** environment variable.

**-v**, **--verbose**
> Print each modification.

**-n**, **--dry-run**
> Show what would change without writing to disk.

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

# INSTALL

```pacman: sudo pacman -S strip-nondeterminism```

```apk: sudo apk add strip-nondeterminism```

```zypper: sudo zypper install strip-nondeterminism```

```brew: brew install strip-nondeterminism```

```nix: nix profile install nixpkgs#strip-nondeterminism```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[touch](/man/touch)(1), [zip](/man/zip)(1), [ar](/man/ar)(1), [diffoscope](/man/diffoscope)(1)
