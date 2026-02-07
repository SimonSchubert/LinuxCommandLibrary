# TAGLINE

Create version release tags

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

**git release** creates a release by tagging the current commit with the specified version number and optionally pushing it to the remote. This git-extras command streamlines the release workflow by combining tag creation, optional signing, and publishing in one operation.

Common usage follows semantic versioning (e.g., `git release 1.2.3`). The command creates an annotated tag, which can include release notes via the `-m` option and cryptographic signing via `-s` for verification.

# SEE ALSO

[git-tag](/man/git-tag)(1), [git-extras](/man/git-extras)(1)
