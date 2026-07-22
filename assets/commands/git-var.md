# TAGLINE

Display Git logical variables

# TLDR

**Show Git variables**

```git var -l```

**Show editor**

```git var GIT_EDITOR```

**Show author identity**

```git var GIT_AUTHOR_IDENT```

**Show committer identity**

```git var GIT_COMMITTER_IDENT```

**Show configured pager**

```git var GIT_PAGER```

# SYNOPSIS

**git** **var** [_variable_]

# PARAMETERS

**-l**
> List all variables.

# DESCRIPTION

**git var** shows Git logical variables such as the configured editor, pager, and author/committer identity. These values are resolved from environment variables and Git configuration, following Git's own lookup order (e.g. `$GIT_EDITOR` falls back to `core.editor`, then `$VISUAL`, then `$EDITOR`).

Other recognized variables include `GIT_SEQUENCE_EDITOR` (editor for `git rebase -i`), `GIT_DEFAULT_BRANCH`, `GIT_SHELL_PATH`, `GIT_ATTR_SYSTEM`/`GIT_ATTR_GLOBAL`, and `GIT_CONFIG_SYSTEM`/`GIT_CONFIG_GLOBAL`.

The command is useful in scripts that need to query Git's resolved settings without parsing config files directly.

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

[git-config](/man/git-config)(1), [git-commit](/man/git-commit)(1)

# RESOURCES

```[Documentation](https://git-scm.com/docs/git-var)```

```[Source code](https://github.com/git/git)```

<!-- verified: 2026-07-17 -->
