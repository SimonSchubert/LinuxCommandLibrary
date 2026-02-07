# TAGLINE

Display gitattributes information for files

# TLDR

**Check attribute for file**

```git check-attr [attribute] [file]```

**Check all attributes**

```git check-attr -a [file]```

**Check for multiple files**

```git check-attr [attribute] [file1] [file2]```

**Check from stdin**

```echo "[file]" | git check-attr --stdin [attribute]```

# SYNOPSIS

**git** **check-attr** [_options_] _attribute_... _pathname_...

# PARAMETERS

**-a**, **--all**
> Check all attributes.

**--stdin**
> Read pathnames from stdin.

**-z**
> NUL-terminated output.

# DESCRIPTION

**git check-attr** displays gitattributes information for specified paths, revealing how Git will handle files according to .gitattributes configuration. This debugging tool shows the effective attribute values after all gitattributes rules are applied.

Gitattributes control various behaviors including line ending conversion (text/eol), diff drivers, merge strategies, export handling, and language detection. The command resolves attribute values from .gitattributes files in the working tree, index, and repository.

Output shows each path with its attribute values, using "set", "unset", or "unspecified" status. This helps debug unexpected Git behavior related to file handling, such as incorrect line ending conversions or merge conflicts in generated files.

# CONFIGURATION

**.gitattributes**
> File attribute patterns controlling line endings, diff behavior, merge strategies, and other file-specific Git operations.

# SEE ALSO

[gitattributes](/man/gitattributes)(5), [git-check-ignore](/man/git-check-ignore)(1)
