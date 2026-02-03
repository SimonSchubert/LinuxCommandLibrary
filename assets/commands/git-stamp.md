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

**git stamp** adds a stamp (like "Reviewed-by") to the most recent commit message. Part of git-extras. Useful for adding metadata to commits without amending the entire message.

# SEE ALSO

[git-commit](/man/git-commit)(1), [git-extras](/man/git-extras)(1)

