# TAGLINE

Show commit logs with file-level diff information

# TLDR

**Show commit logs with diffs**

```git whatchanged```

**Show for specific file**

```git whatchanged [file]```

**Show with stat**

```git whatchanged --stat```

**Limit output**

```git whatchanged -n [10]```

**Show since date**

```git whatchanged --since="[2 weeks ago]"```

# SYNOPSIS

**git** **whatchanged** [_options_] [_paths_...]

# PARAMETERS

**-n** _num_
> Limit number of commits.

**--stat**
> Show diffstat.

**--since** _date_
> Commits since date.

**--until** _date_
> Commits until date.

**-p**
> Show patch.

# DESCRIPTION

**git whatchanged** shows logs with the difference each commit introduces. It is essentially equivalent to `git log --raw --no-merges`, making it easier to see which files were affected by each commit.

# CAVEATS

This command is deprecated and scheduled for removal in a future Git release. Use `git log --raw` instead. When limiting output to a path, add `--` before the path to avoid ambiguity with branch names, e.g. `git whatchanged -- [file]`.

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

[git-log](/man/git-log)(1), [git-diff](/man/git-diff)(1)

# RESOURCES

```[Documentation](https://git-scm.com/docs/git-whatchanged)```

<!-- verified: 2026-07-17 -->
