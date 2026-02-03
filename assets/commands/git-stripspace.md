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

**git stripspace** filters stdin for use with Git. Strips trailing whitespace and collapses multiple blank lines. Used internally for commit message cleanup.

# SEE ALSO

[git-commit](/man/git-commit)(1)

