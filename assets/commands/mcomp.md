# TAGLINE

compares audio files byte by byte or acoustically

# TLDR

**Compare audio files**

```mcomp [file1.mp3] [file2.mp3]```

**Compare with tolerance**

```mcomp -t [0.001] [file1.mp3] [file2.mp3]```

**Verbose comparison**

```mcomp -v [file1.mp3] [file2.mp3]```

**Compare directories**

```mcomp -r [dir1/] [dir2/]```

# SYNOPSIS

**mcomp** [_options_] _file1_ _file2_

# PARAMETERS

_FILE1_ _FILE2_
> Audio files to compare.

**-t** _VALUE_
> Tolerance threshold.

**-v**
> Verbose output.

**-r**
> Recursive comparison.

**--help**
> Display help information.

# DESCRIPTION

**mcomp** compares audio files byte by byte or acoustically. It identifies differences between audio.

The tool can detect re-encodings, modifications, or verify audio integrity.

# CAVEATS

Audio format support varies. Tolerance for lossy formats. May need specific codec support.

# HISTORY

mcomp provides audio file comparison for verifying **audio integrity** and detecting modifications.

# SEE ALSO

[cmp](/man/cmp)(1), [diff](/man/diff)(1), [sox](/man/sox)(1)

