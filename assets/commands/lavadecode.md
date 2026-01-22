# TLDR

**Decode lava format**

```lavadecode [input.lava]```

**Decode to output file**

```lavadecode [input.lava] -o [output.txt]```

**Verbose output**

```lavadecode -v [input.lava]```

# SYNOPSIS

**lavadecode** [_options_] _file_

# PARAMETERS

_FILE_
> Input file to decode.

**-o** _FILE_
> Output file.

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**lavadecode** decodes Lava encoded files. Lava is a simple obfuscation format.

The tool reverses basic encoding schemes. It's useful for analyzing obfuscated content.

lavadecode decodes Lava format.

# CAVEATS

Specific format only. Simple decoder. May be part of security tools.

# HISTORY

lavadecode is a decoder utility for Lava obfuscation format, used in various security contexts.

# SEE ALSO

[base64](/man/base64)(1), [xxd](/man/xxd)(1)
