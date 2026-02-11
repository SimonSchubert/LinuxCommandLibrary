# TAGLINE

Rename files using Perl expressions

# TLDR

**Rename with Perl expression**

```prename 's/old/new/' [*.txt]```

**Dry run**

```prename -n 's/pattern/replacement/' [files]```

**Lowercase filenames**

```prename 'y/A-Z/a-z/' [*]```

**Remove spaces**

```prename 's/ /_/g' [*]```

**Add prefix**

```prename 's/^/prefix_/' [*]```

**Add suffix before extension**

```prename 's/(\.[^.]+)$/_suffix$1/' [*]```

**Verbose output**

```prename -v 's/old/new/' [files]```

# SYNOPSIS

**prename** [_-n_] [_-v_] [_-f_] _expression_ _files_

# PARAMETERS

**-n**, **--no-act**
> Dry run, show changes.

**-v**, **--verbose**
> Show renames.

**-f**, **--force**
> Overwrite existing files.

**-0**, **--null**
> Null-separated input.

**-e** _EXPR_
> Expression to apply.

**-E** _EXPR_
> Like -e but without warnings.

# DESCRIPTION

**prename** (Perl rename) renames files using Perl expressions. It provides powerful pattern-based renaming.

The s/// substitution operator replaces text. Global flag g replaces all occurrences.

Transliteration y/// transforms character sets. Useful for case changes.

Perl code can use $_ for filename. Complex transformations are possible.

Dry run shows what would happen. Always test patterns before applying.

Multiple expressions chain transformations. Each -e adds another operation.

# CAVEATS

Perl syntax required. May conflict with util-linux rename. Use full path if needed.

# HISTORY

**prename** was written by **Larry Wall** (creator of Perl) and is often distributed as **rename** with Perl. It's distinct from the simpler util-linux rename command.

# SEE ALSO

[rename](/man/rename)(1), [mv](/man/mv)(1), [mmv](/man/mmv)(1), [perl](/man/perl)(1)
