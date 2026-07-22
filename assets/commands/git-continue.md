# TAGLINE

Resume the in-progress rebase, merge, cherry-pick, or revert

# TLDR

**Continue whichever operation is currently paused**

```git continue```

# SYNOPSIS

**git continue**

# DESCRIPTION

**git continue** is a **git-extras** command that resumes whichever operation Git currently has paused, without you needing to remember or look up the exact command.

It checks the repository's git-dir for the state files Git leaves behind mid-operation (**CHERRY_PICK_HEAD**, **MERGE_HEAD**, **REBASE_HEAD**, **REVERT_HEAD**) to work out whether a cherry-pick, merge, rebase, or revert is in progress, then runs the matching **--continue** for it, e.g. **git rebase --continue**.

The same script also implements **git-abort** (installed as a second name pointing at the same file): it picks its behavior by inspecting its own invoked name, running **--abort** instead of **--continue** for whichever operation is detected.

# CAVEATS

Errors out with "No active operation found" if nothing is paused, and lists all of them if it somehow detects more than one. Conflicts must still be resolved and staged yourself before continuing; this command only saves you from typing the operation-specific continue command. Requires **git-extras** to be installed.

# HISTORY

git continue is part of **git-extras**, the community-maintained collection of Git utility scripts.

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

[git-abort](/man/git-abort)(1), [git-rebase](/man/git-rebase)(1), [git-merge](/man/git-merge)(1), [git-cherry-pick](/man/git-cherry-pick)(1), [git-revert](/man/git-revert)(1), [git-extras](/man/git-extras)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md#git-continue)```

<!-- verified: 2026-07-17 -->
