# TAGLINE

Validate and normalize Git reference names

# TLDR

**Check if ref name is valid**

```git check-ref-format [refs/heads/branch]```

**Check branch name**

```git check-ref-format --branch [name]```

**Normalize refname**

```git check-ref-format --normalize [refs/heads/branch]```

# SYNOPSIS

**git** **check-ref-format** [_options_] _refname_

# PARAMETERS

**--branch**
> Check as branch name.

**--normalize**
> Normalize refname.

**--allow-onelevel**
> Allow single-level refs.

**--no-allow-onelevel**
> Require hierarchical refs.

# DESCRIPTION

**git check-ref-format** validates and normalizes Git reference names according to strict naming rules. This ensures branch and tag names are portable across filesystems and don't conflict with Git internals.

Reference names must not contain spaces, tildes, carets, colons, question marks, asterisks, or brackets. They cannot begin or end with slashes, contain consecutive slashes, or end with .lock. Components between slashes cannot begin with dots. These rules prevent filesystem conflicts and shell interpretation issues.

The command is used programmatically by scripts creating branches or tags to validate user input before attempting operations. Normalization removes redundant slashes and ensures consistent formatting. The --branch option interprets the name as a branch shorthand, expanding it to refs/heads/ format.

# SEE ALSO

[git-branch](/man/git-branch)(1), [git-tag](/man/git-tag)(1)

