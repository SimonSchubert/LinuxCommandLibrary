# TLDR

**Create release tag**

```git release [version]```

**Create with message**

```git release [version] -m "[message]"```

**Create and push**

```git release [version] --push```

# SYNOPSIS

**git** **release** [_options_] _version_

# PARAMETERS

**-m**, **--message** _text_
> Tag message.

**--push**
> Push after tagging.

**-s**, **--sign**
> Sign tag.

# DESCRIPTION

**git release** creates a release by tagging and optionally pushing. Part of git-extras. Provides a simple workflow for creating version releases.

# SEE ALSO

[git-tag](/man/git-tag)(1), [git-extras](/man/git-extras)(1)

