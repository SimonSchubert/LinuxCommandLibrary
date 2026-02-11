# TAGLINE

Rename files and replace text with patterns

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

**repren** is a versatile batch tool for renaming files and performing search-and-replace operations across multiple files using regular expressions or literal patterns. It can apply several replacement rules simultaneously from a patterns file, making it efficient for large-scale refactoring tasks like renaming variables, updating imports, or reorganizing file structures.

A key feature is case-preserving replacement, which automatically maintains the capitalization style of the original text. For example, replacing "foo" with "bar" will also convert "Foo" to "Bar" and "FOO" to "BAR". The **--dry-run** flag shows all planned changes without modifying any files, allowing safe verification before committing to batch operations.

The tool supports both file content replacement and file/directory renaming with the **--rename** flag. Patterns can use full Python regular expressions with capture groups, or literal strings with **--literal** for straightforward substitutions.

# CAVEATS

Python required. Complex patterns need care. Backup important files.

# HISTORY

**repren** was created as a versatile renaming and replacement tool supporting complex batch operations with pattern files.

# SEE ALSO

[rename](/man/rename)(1), [sed](/man/sed)(1), [perl](/man/perl)(1)
