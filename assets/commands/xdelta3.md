# TLDR

**Create delta**

```xdelta3 -e -s [old_file] [new_file] [patch.xd3]```

**Apply patch**

```xdelta3 -d -s [old_file] [patch.xd3] [new_file]```

**High compression**

```xdelta3 -9 -e -s [old_file] [new_file] [patch.xd3]```

**Show info**

```xdelta3 printdelta [patch.xd3]```

**Decode without source**

```xdelta3 -d [patch.xd3] [output_file]```

# SYNOPSIS

**xdelta3** [_-e_|_-d_] [_-s source_] [_options_] [_input_ [_output_]]

# PARAMETERS

**-e**, **--encode**
> Create delta.

**-d**, **--decode**
> Apply delta.

**-s** _FILE_
> Source file.

**-0** to **-9**
> Compression level.

**-f**, **--force**
> Force overwrite.

**-c**, **--stdout**
> Output to stdout.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**xdelta3** creates and applies binary deltas. It uses VCDIFF format.

Encoding computes differences. Delta file captures changes.

Decoding reconstructs target. Applies delta to source.

Compression levels trade speed for size. Higher = smaller but slower.

Streaming mode handles large files. Memory efficient.

Self-contained patches possible. Source embedded in delta.

# CAVEATS

Source file required for decode. Memory usage for large files. Format version matters.

# HISTORY

**xdelta3** is the third version of xdelta, implementing RFC 3284 VCDIFF. It provides efficient binary delta compression.

# SEE ALSO

[xdelta](/man/xdelta)(1), [bsdiff](/man/bsdiff)(1), [diff](/man/diff)(1)
