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

**git release** creates a release by tagging the current commit with the specified version number and pushing the tag (and any pending commits) to the remote. It is part of the **git-extras** suite of utilities and streamlines the release workflow by combining tag creation, optional signing, and publishing in one operation.

Common usage follows semantic versioning (e.g., `git release 1.2.3`). The command creates an annotated tag, which can include release notes via the `-m` option and cryptographic signing via `-s` for verification.

# CAVEATS

Requires **git-extras** to be installed; this command is not part of core Git. Tags are pushed to the configured remote, which may trigger CI/CD release pipelines.

# INSTALL

```apt: sudo apt install git```

```dnf: sudo dnf install git```

```pacman: sudo pacman -S git```

```apk: sudo apk add git```

```zypper: sudo zypper install git```

```brew: brew install git```

```nix: nix profile install nixpkgs#git```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git](/man/git)(1), [git-tag](/man/git-tag)(1), [git-extras](/man/git-extras)(1)
