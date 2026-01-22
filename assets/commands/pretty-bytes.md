# TLDR

**Convert bytes to human readable**

```pretty-bytes [1024]```

**Convert from stdin**

```echo [1048576] | pretty-bytes```

**Convert large values**

```pretty-bytes [1099511627776]```

# SYNOPSIS

**pretty-bytes** _bytes_

# PARAMETERS

_BYTES_
> Byte value to convert.

# DESCRIPTION

**pretty-bytes** converts bytes to human-readable strings. Size formatter.

The tool outputs KB, MB, GB notation. Node.js CLI utility.

pretty-bytes formats sizes.

# CAVEATS

Uses binary prefixes. Node.js package.

# HISTORY

pretty-bytes was created as a **Node.js utility** for byte formatting.

# SEE ALSO

[numfmt](/man/numfmt)(1)

