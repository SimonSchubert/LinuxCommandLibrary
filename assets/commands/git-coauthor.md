# TAGLINE

Add co-author attribution to the last commit

# TLDR

**Add a coauthor to the last commit**

```git coauthor "[Name]" "[email@example.com]"```

**Add a second coauthor** (run again against the same commit)

```git coauthor "[Name2]" "[email2@example.com]"```

# SYNOPSIS

**git coauthor** _name_ _email_

# PARAMETERS

_NAME_
> Coauthor's name. Required.

_EMAIL_
> Coauthor's email. Required.

# DESCRIPTION

**git coauthor** is a **git-extras** command that amends the last commit message to add a **Co-authored-by:** trailer, the format GitHub and GitLab recognize to credit multiple contributors on one commit.

It takes exactly one name and one email per invocation. To credit several people, run the command once per coauthor: since it appends to any **Co-authored-by:** trailers already present rather than replacing them, running it repeatedly against the same commit stacks up multiple coauthors.

This supports pair programming, mob programming, and collaborative workflows where attribution should reflect everyone who contributed, not just whoever typed **git commit**.

# CAVEATS

Part of the **git-extras** package. Amends the last commit, which rewrites its hash, so avoid using it on commits already pushed to a shared branch. Both name and email are required; the command has no flags and does not validate its arguments. Coauthor emails must match the contributor's platform account for GitHub/GitLab to link the attribution to a profile.

# HISTORY

git coauthor is part of **git-extras**, the community-maintained collection of Git utility scripts, added to support GitHub's co-author trailer convention for attributing collaborative work.

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

[git-commit](/man/git-commit)(1), [git-authors](/man/git-authors)(1), [git-extras](/man/git-extras)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md#git-coauthor)```

<!-- verified: 2026-07-17 -->
