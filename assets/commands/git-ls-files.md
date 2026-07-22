# TAGLINE

List files in index and working tree

# TLDR

**List tracked files**

```git ls-files```

**List untracked files**

```git ls-files --others```

**List ignored files**

```git ls-files --ignored --exclude-standard```

**List modified files**

```git ls-files --modified```

**List deleted files**

```git ls-files --deleted```

# SYNOPSIS

**git ls-files** [_options_] [_files_]

# PARAMETERS

**--cached**, **-c**
> Show staged files (default).

**--modified**, **-m**
> Show modified files.

**--deleted**, **-d**
> Show deleted files.

**--others**, **-o**
> Show untracked files.

**--ignored**
> Show ignored files.

**--exclude-standard**
> Use standard exclusions.

**--stage**, **-s**
> Show staging info.

**-x** _pattern_, **--exclude** _pattern_
> Skip files matching pattern.

**-z**
> Terminate entries with NUL instead of newline, for safe scripting.

**--full-name**
> Show paths relative to the repository root, not the current directory.

**--help**
> Display help information.

# DESCRIPTION

**git ls-files** lists files in the index and working tree. It can show tracked, untracked, ignored, modified, and deleted files, making it valuable for scripting and automation.

The command provides low-level access to Git's file tracking state. Various flags control which file categories to display. It is commonly used in scripts to enumerate files matching certain criteria, such as finding all untracked files or listing everything ignored by `.gitignore`.

# CAVEATS

Shows index state, not commits. Output format varies by options. Useful for scripting.

# HISTORY

git ls-files is a core **Git** plumbing command for inspecting the index, used both directly and by other git commands.

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

[git-status](/man/git-status)(1), [git-ls-tree](/man/git-ls-tree)(1)

# RESOURCES

```[Source code](https://github.com/git/git)```

```[Homepage](https://git-scm.com/)```

```[Documentation](https://git-scm.com/docs/git-ls-files)```

<!-- verified: 2026-07-17 -->
