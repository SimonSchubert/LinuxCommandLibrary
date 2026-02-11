# TAGLINE

Search xz files for fixed strings

# TLDR

**Search fixed string in xz files**

```xzfgrep "[string]" [file.xz]```

**Search multiple strings**

```xzfgrep -e "[str1]" -e "[str2]" [file.xz]```

# SYNOPSIS

**xzfgrep** [_options_] _pattern_ [_files_...]

# DESCRIPTION

**xzfgrep** searches xz compressed files for fixed strings. Does not interpret pattern as regex. Faster than xzgrep for literal string searches. Equivalent to xzgrep -F.

# SEE ALSO

[xzgrep](/man/xzgrep)(1), [xz](/man/xz)(1), [fgrep](/man/fgrep)(1)

