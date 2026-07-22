# TAGLINE

Hard-reset a branch to match its remote, cleaning untracked files

# TLDR

**Sync current branch** with its upstream

```git sync```

**Sync with a specific remote and branch**

```git sync [origin] [main]```

**Sync but keep untracked/ignored files**

```git sync --soft```

**Sync without a confirmation prompt**

```git sync --force```

# SYNOPSIS

**git** **sync** [_remote_ _branch_] [_-s_ | _--soft_] [_-f_ | _--force_]

# PARAMETERS

_REMOTE_ _BRANCH_
> Remote and branch to sync with; defaults to the current branch's configured upstream.

**-s**, **--soft**
> Skip `git clean -d -f -x` after resetting, keeping untracked and ignored files.

**-f**, **--force**
> Skip the confirmation prompt.

**-h**, **--help**
> Display usage information.

# DESCRIPTION

**git sync** is a git-extras command that fetches the given (or upstream-tracked) remote branch and then runs `git reset --hard` to make the current branch match it exactly. Unless `-s`/`--soft` is given, it also runs `git clean -d -f -x` afterward, deleting every untracked and ignored file in the working tree.

It asks for confirmation before running unless `-f`/`--force` is passed.

# CAVEATS

This is destructive: local commits not on the remote, uncommitted changes, and (without `-s`) untracked/ignored files are all discarded. It is not a fetch-and-rebase or fetch-and-merge; unlike `git pull`, divergent local work is thrown away rather than integrated.

# INSTALL

```zypper: sudo zypper install git-sync```

```brew: brew install git-sync```

```nix: nix profile install nixpkgs#git-sync```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git-fetch](/man/git-fetch)(1), [git-reset](/man/git-reset)(1), [git-clean](/man/git-clean)(1), [git-extras](/man/git-extras)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md#git-sync)```

<!-- verified: 2026-07-17 -->
