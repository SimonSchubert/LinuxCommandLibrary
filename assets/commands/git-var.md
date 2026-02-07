# TAGLINE

Display Git logical variables

# TLDR

**Show Git variables**

```git var -l```

**Show editor**

```git var GIT_EDITOR```

**Show author identity**

```git var GIT_AUTHOR_IDENT```

**Show committer identity**

```git var GIT_COMMITTER_IDENT```

# SYNOPSIS

**git** **var** [_variable_]

# PARAMETERS

**-l**
> List all variables.

# DESCRIPTION

**git var** shows Git logical variables such as the configured editor, author identity, and committer identity. These values are determined from environment variables and Git configuration.

The command is useful in scripts that need to query Git's resolved settings without parsing config files directly.

# SEE ALSO

[git-config](/man/git-config)(1)
