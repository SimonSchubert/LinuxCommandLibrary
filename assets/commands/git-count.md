# TAGLINE

Count commits in repository

# TLDR

**Count total commits**

```git count```

**Count commits by author**

```git count --all```

# SYNOPSIS

**git count** [_options_]

# PARAMETERS

**--all**
> Count commits per author.

**--help**
> Display help information.

# DESCRIPTION

**git count** shows the total number of commits in the repository. With the --all flag, it shows commit counts broken down by author.

The command provides a quick overview of repository activity and contributor participation. It's simpler than parsing **git shortlog** output manually.

With the **--all** flag, it produces a ranked list of contributors by commit count, making it useful for project statistics and activity reports.

# CAVEATS

Part of git-extras package. Counts commits on current branch. Merge commits included.

# HISTORY

git count is part of **git-extras**, providing simple commit counting that complements git shortlog.

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

[git-count-objects](/man/git-count-objects)(1), [git-shortlog](/man/git-shortlog)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

<!-- verified: 2026-07-17 -->
