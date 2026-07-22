# TAGLINE

Common shell library for Git scripts

# TLDR

**Source for git scripts**

```. "$(git --exec-path)/git-sh-setup"```

# SYNOPSIS

**git-sh-setup**

# DESCRIPTION

**git-sh-setup** is an internal shell library that provides common functions for Git scripts. It includes utilities for repository validation, directory navigation, color output, and error handling.

Key functions include `require_work_tree`, `cd_to_toplevel`, `die`, and `git_pager`. Scripts source this library to get consistent behavior across Git shell commands.

# CAVEATS

Internal library, not a command. Must be sourced, not executed. Used by git shell scripts.

# HISTORY

git-sh-setup is part of **Git's** internal infrastructure, providing shared functionality for shell-based git commands and hooks.

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

[git-sh-i18n](/man/git-sh-i18n)(1)

# RESOURCES

```[Source code](https://github.com/git/git)```

```[Homepage](https://git-scm.com/)```

```[Documentation](https://git-scm.com/docs/git-sh-setup)```

<!-- verified: 2026-07-17 -->
