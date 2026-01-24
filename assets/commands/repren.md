# TLDR

**Rename with pattern**

```repren --rename --from "[old]" --to "[new]" [files]```

**Replace in files**

```repren --from "[search]" --to "[replace]" [files]```

**Using patterns file**

```repren --patterns [patterns.txt] [files]```

**Preview changes**

```repren --dry-run --from "[old]" --to "[new]" [files]```

**Case preserving**

```repren --preserve-case --from "[foo]" --to "[bar]" [files]```

**Literal strings**

```repren --literal --from "[text]" --to "[replacement]" [files]```

# SYNOPSIS

**repren** [_--rename_] [_--from pattern_] [_--to pattern_] [_options_] _files_

# PARAMETERS

**--rename**
> Rename files/directories.

**--from** _PATTERN_
> Search pattern.

**--to** _PATTERN_
> Replacement pattern.

**--patterns** _FILE_
> Patterns from file.

**--dry-run**
> Preview only.

**--preserve-case**
> Match case style.

**--literal**
> Literal strings.

**-r**, **--recursive**
> Recursive operation.

# DESCRIPTION

**repren** renames files and replaces text. It handles complex patterns.

Multi-pattern support. Apply many changes at once.

Case-preserving replacements. Maintains capitalization style.

Regex or literal matching. Flexible pattern syntax.

Safe with dry-run. Preview before applying.

# CAVEATS

Python required. Complex patterns need care. Backup important files.

# HISTORY

**repren** was created as a versatile renaming and replacement tool supporting complex batch operations with pattern files.

# SEE ALSO

[rename](/man/rename)(1), [sed](/man/sed)(1), [perl](/man/perl)(1)
