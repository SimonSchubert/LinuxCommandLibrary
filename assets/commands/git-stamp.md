# TAGLINE

Add metadata stamps to commit messages

# TLDR

**Add stamp to commit message**

```git stamp "[stamp text]"```

**Stamp with replacement**

```git stamp --replace "[text]"```

# SYNOPSIS

**git** **stamp** [_options_] _text_

# PARAMETERS

**--replace**
> Replace existing stamp.

# DESCRIPTION

**git stamp** appends a stamp (such as "Reviewed-by" or "Tested-by") to the most recent commit message. Part of git-extras, it is useful for adding metadata to commits without manually amending the entire message.

# SEE ALSO

[git-commit](/man/git-commit)(1), [git-extras](/man/git-extras)(1)
