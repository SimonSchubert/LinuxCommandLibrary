# TAGLINE

VCDIFF binary delta encoding

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

**xdelta3** creates and applies binary delta patches using the VCDIFF format defined in RFC 3284. Encoding compares a source file with a target file and produces a compact delta that captures only the differences, while decoding reconstructs the target by applying the delta to the original source.

Compression levels from 0 to 9 trade processing speed for smaller delta sizes. A streaming mode processes data in chunks, enabling memory-efficient handling of very large files. Self-contained patches can be created without requiring the original source file for decoding, embedding the necessary data within the delta itself.

# CAVEATS

Source file required for decode. Memory usage for large files. Format version matters.

# HISTORY

**xdelta3** is the third version of xdelta, implementing RFC 3284 VCDIFF. It provides efficient binary delta compression.

# SEE ALSO

[xdelta](/man/xdelta)(1), [bsdiff](/man/bsdiff)(1), [diff](/man/diff)(1)
