# TAGLINE

Batch rename files and directories from the command line

# TLDR

**Dry-run** rename with a regex

```rnr '[pattern]' '[replacement]' [files...]```

**Apply** renames (write)

```rnr -f '[pattern]' '[replacement]' [files...]```

**Recursive** directory rename

```rnr -r '[pattern]' '[replacement]' [dir]```

**Interactive** confirmation

```rnr -i '[pattern]' '[replacement]' [files...]```

# SYNOPSIS

**rnr** [*options*] *from* *to* [*paths*...]

# DESCRIPTION

**rnr** is a Rust batch renamer supporting regex replacements, dry-run by default (or explicit apply flags depending on version), recursion, and undo dumps. It focuses on safe bulk renames for media libraries and code trees.

Always run a dry-run first and review the planned operations. Exact flags for force/apply vary slightly by release—confirm with **rnr --help**.

# PARAMETERS

*from* *to*

> Regex pattern and replacement string.

*paths*

> Files/directories to consider.

**-r**, **--recursive**

> Recurse into directories.

**-f**, **--force** / apply flags

> Perform renames (if dry-run is default).

**-i**, **--interactive**

> Confirm each rename.

**--dry-run**

> Print operations without changing the filesystem.

# CAVEATS

Regex renames can destroy names if the pattern is too broad. Cross-filesystem moves and colliding targets need care. Keep backups or use version control.

# SEE ALSO

[rename](/man/rename)(1), [mmv](/man/mmv)(1), [mv](/man/mv)(1)

# RESOURCES

```[Source code](https://github.com/ismaelgv/rnr)```

<!-- verified: 2026-07-19 -->
