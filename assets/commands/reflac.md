# TAGLINE

Re-encode FLAC audio files

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

**reflac** is a batch tool for re-encoding FLAC audio files with updated compression settings. It recursively processes directories of FLAC files, applying the specified compression level while preserving all metadata tags, ensuring no audio data is lost during the process.

The tool supports parallel processing via the **-j** option, significantly speeding up operations on large music libraries. Compression levels range from **-0** (fastest) to **-8** (smallest file size), matching the standard FLAC encoder options. The **--verify** flag enables integrity checking by decoding each re-encoded file and comparing it against the original audio data.

This is particularly useful when upgrading a FLAC collection encoded with older or suboptimal compression settings to take advantage of improved encoding in newer FLAC versions, reducing storage requirements without any quality loss.

# CAVEATS

Requires FLAC encoder. CPU intensive at high levels. No quality improvement possible.

# HISTORY

**reflac** was created to batch re-encode FLAC files with modern compression settings while preserving all metadata.

# SEE ALSO

[flac](/man/flac)(1), [metaflac](/man/metaflac)(1), [sox](/man/sox)(1)
