# TAGLINE

Interactive read-eval-print loop for Git

# TLDR

**Start git REPL**

```git repl```

**Run command in REPL**

```status```

**Show log in REPL**

```log --oneline -10```

**Exit REPL**

```exit```

# SYNOPSIS

**git repl**

# DESCRIPTION

**git repl** provides an interactive shell for Git commands. Part of git-extras, it starts a read-eval-print loop where commands can be entered without the "git" prefix; input starting with `!` runs as a raw shell command instead, and `ls` is mapped to `git ls-files`.

The REPL simplifies exploratory Git sessions by reducing typing. Command history (via readline) is available across the session. Exit with "exit", "quit", or Ctrl-D.

# CAVEATS

Part of git-extras package. Commands run without "git" prefix. Shell features limited.

# HISTORY

git repl is part of **git-extras**, providing an interactive environment for frequent git users.

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

[git](/man/git)(1), [tig](/man/tig)(1), [git-extras](/man/git-extras)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md#git-repl)```

<!-- verified: 2026-07-17 -->
