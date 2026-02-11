# TAGLINE

Search xz files with extended regex

# TLDR

**Search pattern in xz files (extended regex)**

```xzegrep "[pattern]" [file.xz]```

**Case insensitive search**

```xzegrep -i "[pattern]" [file.xz]```

# SYNOPSIS

**xzegrep** [_options_] _pattern_ [_files_...]

# DESCRIPTION

**xzegrep** searches xz compressed files using extended regular expressions. Decompresses and greps in one step. Equivalent to xzgrep -E. Supports all grep options.

# SEE ALSO

[xzgrep](/man/xzgrep)(1), [xz](/man/xz)(1), [egrep](/man/egrep)(1)

