# TLDR

**Rename with regex substitution**

```perl-rename 's/old/new/' [*.txt]```

**Lowercase filenames**

```perl-rename 'y/A-Z/a-z/' [*]```

**Uppercase filenames**

```perl-rename 'y/a-z/A-Z/' [*]```

**Add prefix**

```perl-rename 's/^/prefix_/' [*]```

**Add suffix before extension**

```perl-rename 's/(\.\w+)$/_suffix$1/' [*]```

**Preview changes** (dry run)

```perl-rename -n 's/old/new/' [*.txt]```

**Replace spaces with underscores**

```perl-rename 's/ /_/g' [*]```

**Remove numbers from names**

```perl-rename 's/\d//g' [*]```

# SYNOPSIS

**perl-rename** [_-n_] [_-v_] [_-f_] _expression_ [_files_]

# PARAMETERS

**-n**, **--no-act**
> Dry run, show what would happen.

**-v**, **--verbose**
> Show renames as they occur.

**-f**, **--force**
> Overwrite existing files.

**-0**, **--null**
> Read null-terminated filenames from stdin.

**-d**, **--filename**
> Rename filename only, not directory.

**-e** _EXPR_
> Expression (can use multiple).

**--version**
> Show version.

**--help**
> Show help.

# DESCRIPTION

**perl-rename** renames files using Perl regular expressions. It's more powerful than basic mv for batch renaming.

The expression modifies the $_ variable containing the filename. Common operations use s/// for substitution and y/// for transliteration.

Perl's full regex syntax is available: character classes, backreferences, lookahead, and more. Multiple -e expressions chain together.

Dry run mode (-n) shows changes without performing them. Always use this first to verify complex expressions.

The tool handles special characters, spaces, and Unicode in filenames. Quoting expressions prevents shell interpretation.

Different systems may call this command rename, prename, or file-rename. The underlying functionality is the same.

# CAVEATS

Expression errors can rename files incorrectly. Use -n first. May conflict with util-linux rename on some systems. Requires Perl.

# HISTORY

**perl-rename** was written by **Larry Wall**, creator of Perl, and is distributed as an example script. Various packaged versions exist including prename (Debian) and file-rename. It demonstrates Perl's text processing for practical file management.

# SEE ALSO

[rename](/man/rename)(1), [mmv](/man/mmv)(1), [mv](/man/mv)(1), [perl](/man/perl)(1)
