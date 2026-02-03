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

**git check-ref-format** validates reference names. Ensures ref names follow Git's naming rules and conventions.

# SEE ALSO

[git-branch](/man/git-branch)(1), [git-tag](/man/git-tag)(1)

