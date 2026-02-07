# TAGLINE

Clean up whitespace in Git messages

# TLDR

**Strip trailing whitespace**

```git stripspace < [file]```

**Strip comments**

```git stripspace -s < [file]```

**Comment out lines**

```git stripspace -c < [file]```

# SYNOPSIS

**git** **stripspace** [_options_]

# PARAMETERS

**-s**, **--strip-comments**
> Strip comment lines.

**-c**, **--comment-lines**
> Comment out lines.

# DESCRIPTION

**git stripspace** filters text from stdin, stripping trailing whitespace and collapsing multiple consecutive blank lines. It is used internally by Git for commit message cleanup.

The command can also strip or add comment lines, making it useful for processing Git-formatted messages and templates.

# SEE ALSO

[git-commit](/man/git-commit)(1)
