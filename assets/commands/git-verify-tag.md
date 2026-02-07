# TAGLINE

Verify GPG signatures of tags

# TLDR

**Verify signed tag**

```git verify-tag [tag]```

**Verify multiple tags**

```git verify-tag [tag1] [tag2]```

**Show raw signature**

```git verify-tag --raw [tag]```

**Verbose output**

```git verify-tag -v [tag]```

# SYNOPSIS

**git** **verify-tag** [_options_] _tag_...

# PARAMETERS

**-v**, **--verbose**
> Print tag contents.

**--raw**
> Print raw signature.

**--format** _format_
> Format output.

# DESCRIPTION

**git verify-tag** checks GPG signatures of tags. It verifies that tags were signed with valid GPG keys, confirming the authenticity of tagged releases.

This is commonly used to verify the integrity of release tags in security-sensitive workflows.

# SEE ALSO

[git-tag](/man/git-tag)(1), [git-verify-commit](/man/git-verify-commit)(1)
