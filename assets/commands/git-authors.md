# TAGLINE

List all contributors to a repository

# TLDR

**List all authors**

```git authors```

**List with email**

```git authors --list```

**Show author stats**

```git authors --stats```

**Generate AUTHORS file**

```git authors > AUTHORS```

# SYNOPSIS

**git authors** [_options_]

# PARAMETERS

**--list**, **-l**
> List format with emails.

**--stats**, **-s**
> Show contribution statistics.

**--no-email**
> Omit email addresses.

**--help**
> Display help information.

# DESCRIPTION

**git authors** lists all contributors to a git repository. It extracts unique author information from the commit history, useful for generating contributor lists and AUTHORS files.

The command is part of git-extras, a collection of useful git utilities. It can output in various formats suitable for documentation or acknowledgment files.

The output can be redirected to create an AUTHORS file, which is a common convention in open source projects for crediting all contributors. The **--no-email** option produces a cleaner list suitable for public display.

# CAVEATS

Part of git-extras package. Author names depend on git config. May include duplicates from inconsistent naming.

# HISTORY

git authors is part of **git-extras**, created by **TJ Holowaychuk** to provide additional git utilities not included in core git.

# SEE ALSO

[git-shortlog](/man/git-shortlog)(1), [git-log](/man/git-log)(1)
