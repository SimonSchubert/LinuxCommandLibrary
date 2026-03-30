# TAGLINE

VCDIFF binary delta encoding

# TLDR

**Create delta**

```xdelta3 -e -s [old_file] [new_file] [patch.xd3]```

**Apply patch**

```xdelta3 -d -s [old_file] [patch.xd3] [new_file]```

**High compression**

```xdelta3 -9 -e -s [old_file] [new_file] [patch.xd3]```

**Encode to stdout (for piping)**

```xdelta3 -e -c -s [old_file] [new_file] > [patch.xd3]```

**Show delta information**

```xdelta3 printdelta [patch.xd3]```

**Decode without source**

```xdelta3 -d [patch.xd3] [output_file]```

# SYNOPSIS

**xdelta3** [_command_] [_options_] [_input_ [_output_]]

# COMMANDS

**encode**
> Compress the input (default). Also set by **-e**.

**decode**
> Decompress the input. Also set by **-d**.

**printdelta**
> Print information about the entire delta.

**printhdr**
> Print information about the first window.

**printhdrs**
> Print information about all windows.

**config**
> Print xdelta3 configuration.

**recode**
> Re-encode with new application/secondary settings.

# PARAMETERS

**-e**
> Encode (compress/create delta).

**-d**
> Decode (decompress/apply delta).

**-s** _FILE_
> Source file to copy from.

**-0** to **-9**
> Compression level.

**-f**
> Force overwrite of existing files.

**-c**
> Output to stdout.

**-v**
> Verbose output (may be specified up to 2 times).

**-q**
> Quiet, suppress output messages.

**-B** _bytes_
> Source window size.

**-W** _bytes_
> Input window size.

**-S** [**djw**|**fgk**]
> Enable/disable secondary compression.

**-n**
> Disable checksum.

**-V**
> Show version.

# DESCRIPTION

**xdelta3** creates and applies binary delta patches using the VCDIFF format defined in RFC 3284. Encoding compares a source file with a target file and produces a compact delta that captures only the differences, while decoding reconstructs the target by applying the delta to the original source.

Compression levels from 0 to 9 trade processing speed for smaller delta sizes. A streaming mode processes data in chunks, enabling memory-efficient handling of very large files. Self-contained patches can be created without requiring the original source file for decoding, embedding the necessary data within the delta itself.

# CAVEATS

The source file must be available for decoding unless the delta was created without a source. Memory options (**-B**, **-W**) may need tuning for very large files. The command-line syntax is similar to gzip.

# HISTORY

**xdelta3** is the third version of xdelta, implementing RFC 3284 VCDIFF. It provides efficient binary delta compression.

# SEE ALSO

[xdelta](/man/xdelta)(1), [bsdiff](/man/bsdiff)(1), [diff](/man/diff)(1), [patch](/man/patch)(1), [gzip](/man/gzip)(1)
