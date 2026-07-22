# TAGLINE

Show differences between commits and files

# TLDR

**Show unstaged changes**

```git diff```

**Show staged changes**

```git diff --staged```

**Diff between branches**

```git diff [branch1]..[branch2]```

**Diff specific file**

```git diff [file.txt]```

**Show word-level diff**

```git diff --word-diff```

**Show stat summary**

```git diff --stat```

**Diff between commits**

```git diff [commit1] [commit2]```

**Diff against merge base** (changes on a branch since it diverged)

```git diff [main]...[feature-branch]```

# SYNOPSIS

**git diff** [_options_] [_commit_] [**--**] [_path_...]

# PARAMETERS

**--staged**, **--cached**
> Compare staged changes to last commit.

**--stat**
> Show diffstat summary.

**--word-diff**
> Show word-level changes.

**--color-words**
> Colored word diff.

**--name-only**
> Show only changed file names.

**--name-status**
> Show names and change status.

**-U** _n_, **--unified** _n_
> Lines of context.

**--no-index**
> Compare files outside repository.

**--diff-filter** _filter_
> Filter by change type (A, D, M, R).

**-b**, **--ignore-space-change**
> Ignore whitespace changes.

**-w**, **--ignore-all-space**
> Ignore all whitespace.

**-M**, **--find-renames**
> Detect and report renamed files.

**-C**, **--find-copies**
> Detect and report copied files.

# DESCRIPTION

**git diff** shows differences between commits, branches, working directory, and staging area. It is essential for reviewing changes before committing and understanding what changed between versions.

By default, it shows unstaged changes (working directory vs index). With --staged, it shows what will be committed. When given two commits or branches, it shows all changes between them.

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

[git](/man/git)(1), [git-log](/man/git-log)(1), [diff](/man/diff)(1), [vimdiff](/man/vimdiff)(1)
