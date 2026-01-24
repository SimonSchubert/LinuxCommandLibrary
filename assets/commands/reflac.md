# TLDR

**Re-encode FLAC files**

```reflac [path/to/music]```

**Maximum compression**

```reflac -8 [path/to/music]```

**Verify after encoding**

```reflac --verify [path/to/music]```

**Preserve file times**

```reflac --preserve-modtime [path/to/music]```

**Dry run**

```reflac --dry-run [path/to/music]```

**Recursive processing**

```reflac -r [path/to/directory]```

# SYNOPSIS

**reflac** [_-0..-8_] [_--verify_] [_options_] _path_

# PARAMETERS

**-0** to **-8**
> Compression level.

**--verify**
> Verify after encode.

**--preserve-modtime**
> Keep file times.

**--dry-run**
> Show what would happen.

**-r**, **--recursive**
> Process subdirectories.

**-j** _N_
> Parallel jobs.

# DESCRIPTION

**reflac** re-encodes FLAC files. It optimizes compression.

Parallel processing supported. Fast batch operations.

Preserves metadata tags. No data loss.

Useful for upgrading compression. Old FLACs to new format.

Verification ensures integrity. Decodes and compares.

# CAVEATS

Requires FLAC encoder. CPU intensive at high levels. No quality improvement possible.

# HISTORY

**reflac** was created to batch re-encode FLAC files with modern compression settings while preserving all metadata.

# SEE ALSO

[flac](/man/flac)(1), [metaflac](/man/metaflac)(1), [sox](/man/sox)(1)
