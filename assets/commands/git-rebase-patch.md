# TAGLINE

Rebase with patch application

# TLDR

**Rebase and apply patch**

```git rebase-patch [patch_file]```

# SYNOPSIS

**git** **rebase-patch** _patch_file_

# DESCRIPTION

**git rebase-patch** finds where an old patch file still applies and replays it onto the current HEAD. This git-extras command is for patches that no longer apply cleanly to HEAD: it walks backward through parent commits, testing the patch against each historical tree with a temporary index, until it finds one it applies to. It then manufactures a commit there and cherry-picks it forward onto the current branch.

This is useful for reviving an old, bit-rotted patch without manually figuring out which commit it was written against.

# CAVEATS

Part of git-extras package. Only searches back along the first-parent chain from HEAD; if the patch was based on a commit outside that chain, it will not be found.

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

[git-rebase](/man/git-rebase)(1), [git-am](/man/git-am)(1), [git-cherry-pick](/man/git-cherry-pick)(1), [git-extras](/man/git-extras)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md#git-rebase-patch)```

<!-- verified: 2026-07-17 -->
