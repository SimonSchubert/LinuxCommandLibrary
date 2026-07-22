# TAGLINE

Compare content of tree objects

# TLDR

**Compare two trees**

```git diff-tree [tree1] [tree2]```

**Show changes in commit**

```git diff-tree -p [commit]```

**Show changed files**

```git diff-tree --name-only [commit]```

**Raw output**

```git diff-tree --raw [commit]```

# SYNOPSIS

**git** **diff-tree** [_options_] _tree-ish_ [_tree-ish_] [_files_...]

# PARAMETERS

**-r**
> Recurse into subtrees.

**-p**, **--patch**
> Generate patch.

**--raw**
> Raw diff format.

**--name-only**
> Show file names only.

**--name-status**
> Show status and names.

**-s**
> Suppress diff output.

**--stdin**
> Read commits from stdin, one per line; each is compared with its parent(s).

**--root**
> Include the initial commit as a big-bang diff against the empty tree (only meaningful with **--stdin** or a single _tree-ish_).

**-c**, **--cc**
> Show a combined diff for merge commits instead of only listing changed files.

# DESCRIPTION

**git diff-tree** compares the content and mode of blobs found via two tree objects, providing low-level access to Git's internal tree comparison mechanism. This plumbing command forms the foundation for examining differences between commits, branches, or any tree-like structures in Git's object database.

The command accepts one or two tree-ish arguments and outputs the differences in various formats. It can process commits via stdin, enabling efficient batch processing of history. While rarely needed in daily Git use, it underpins many higher-level operations and is essential for scripts and custom diff tools.

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

[git-diff](/man/git-diff)(1), [git-diff-index](/man/git-diff-index)(1)
