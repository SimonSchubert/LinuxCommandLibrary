# TAGLINE

Convert byte values to human-readable strings

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

**pretty-bytes** converts raw byte values into human-readable strings with appropriate unit suffixes (kB, MB, GB, TB, etc.). It automatically selects the best unit for readability, making large numbers easier to understand at a glance.

This Node.js CLI utility is useful in scripts and pipelines where file sizes or data amounts need to be displayed in a user-friendly format rather than as raw numbers.

# CAVEATS

Uses binary prefixes. Node.js package.

# HISTORY

pretty-bytes was created as a **Node.js utility** for byte formatting.

# SEE ALSO

[numfmt](/man/numfmt)(1)

