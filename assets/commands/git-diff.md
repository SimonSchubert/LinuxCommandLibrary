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

# DESCRIPTION

**git diff** shows differences between commits, branches, working directory, and staging area. It's essential for reviewing changes before committing and understanding what changed between versions.

By default, it shows unstaged changes (working directory vs index). With --staged, it shows what will be committed. Between commits, it shows all changes.

# COMMON PATTERNS

```bash
# What changed in working directory
git diff

# What will be committed
git diff --staged

# Changes in last commit
git diff HEAD~1

# Changes between branches
git diff main..feature

# Changes in a file over time
git diff HEAD~5 -- file.txt
```

# SEE ALSO

[git](/man/git)(1), [git-log](/man/git-log)(1), [diff](/man/diff)(1), [vimdiff](/man/vimdiff)(1)
