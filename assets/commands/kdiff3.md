# TLDR

**Compare two files**

```kdiff3 [file1] [file2]```

**Three-way comparison**

```kdiff3 [base] [file1] [file2]```

**Compare directories**

```kdiff3 [dir1] [dir2]```

**Merge with output**

```kdiff3 [base] [file1] [file2] -o [merged]```

**Auto-select non-conflicting**

```kdiff3 [base] [file1] [file2] --auto```

# SYNOPSIS

**kdiff3** [_options_] [_files/directories_...]

# PARAMETERS

**-o** _file_
> Output merged file.

**--auto**
> Automatically select non-conflicting changes.

**-m**, **--merge**
> Merge mode.

**--cs** _setting=value_
> Configuration setting.

**--qall**
> Quiet (auto-mode only).

**-L1**, **-L2**, **-L3** _label_
> Labels for inputs.

# DESCRIPTION

**KDiff3** is a file and directory comparison and merge tool. It supports two-way and three-way comparisons, making it suitable for resolving merge conflicts and reviewing changes.

KDiff3 highlights differences with colors and allows selecting which version to use for each conflict. It integrates with version control systems as a merge tool.

# GIT INTEGRATION

```bash
# Configure as merge tool
git config --global merge.tool kdiff3
git config --global mergetool.kdiff3.path /usr/bin/kdiff3

# Configure as diff tool
git config --global diff.tool kdiff3
```

# CAVEATS

Requires KDE libraries. Three-way merge needs common ancestor. Large files may be slow. Binary files not compared.

# HISTORY

KDiff3 was created by **Joachim Eibl** as a Qt/KDE application for comparing and merging files. It became a popular choice for resolving version control conflicts.

# SEE ALSO

[diff](/man/diff)(1), [meld](/man/meld)(1), [vimdiff](/man/vimdiff)(1), [git-mergetool](/man/git-mergetool)(1)
