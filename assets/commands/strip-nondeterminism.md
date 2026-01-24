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

**strip-nondeterminism** removes non-determinism. It enables reproducible builds.

Removes timestamps. From archives.

Normalizes metadata. Consistent output.

Multiple formats. ZIP, JAR, PNG, etc.

Reproducible builds. Same input, same output.

# CAVEATS

Format-specific. May need type hint. Part of Debian reproducible builds.

# HISTORY

**strip-nondeterminism** was created for the **Reproducible Builds** project to make build outputs deterministic.

# SEE ALSO

[touch](/man/touch)(1), [zip](/man/zip)(1), [ar](/man/ar)(1)
