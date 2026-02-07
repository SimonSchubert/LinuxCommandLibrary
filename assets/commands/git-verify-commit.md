# TAGLINE

Verify GPG signatures of commits

# TLDR

**Verify signed commit**

```git verify-commit [commit]```

**Verify multiple commits**

```git verify-commit [commit1] [commit2]```

**Show raw signature**

```git verify-commit --raw [commit]```

**Verbose output**

```git verify-commit -v [commit]```

# SYNOPSIS

**git** **verify-commit** [_options_] _commit_...

# PARAMETERS

**-v**, **--verbose**
> Print commit contents.

**--raw**
> Print raw signature.

# DESCRIPTION

**git verify-commit** checks GPG signatures of commits. It verifies that commits were signed with valid GPG keys, confirming the authenticity and integrity of the commit author.

This command is useful in workflows that require signed commits for security or compliance purposes.

# SEE ALSO

[git-commit](/man/git-commit)(1), [git-verify-tag](/man/git-verify-tag)(1)
