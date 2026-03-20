# TAGLINE

Read tree information into index

# TLDR

**Read tree into index**

```git read-tree [tree-ish]```

**Merge trees**

```git read-tree -m [base] [ours] [theirs]```

**Read with prefix**

```git read-tree --prefix=[dir/] [tree-ish]```

**Merge and update working tree**

```git read-tree -m -u [base] [ours] [theirs]```

**Reset index**

```git read-tree --reset HEAD```

**Empty the index**

```git read-tree --empty```

**Dry run to check for errors**

```git read-tree -n -m [tree-ish]```

# SYNOPSIS

**git read-tree** [_options_] _tree-ish_

# PARAMETERS

_TREE-ISH_
> Tree to read.

**-m**
> Merge mode.

**-u**
> Update working tree.

**--reset**
> Same as -m, discard unmerged.

**--prefix=**_DIR/_
> Keep current index contents and read tree into subdirectory at prefix.

**-i**
> Only update index, do not check working tree for consistency with current head.

**-n**, **--dry-run**
> Check for errors without updating the index or working tree.

**-v**
> Show progress of checking files out.

**--trivial**
> Only perform merge for trivial cases, leave conflicts unresolved.

**--aggressive**
> Resolve more cases internally during three-way merge.

**--index-output** _FILE_
> Write results to specified file instead of $GIT_INDEX_FILE.

**--empty**
> Instead of reading tree into the index, empty it.

**--no-sparse-checkout**
> Disable sparse checkout support even if core.sparseCheckout is true.

**--help**
> Display help information.

# DESCRIPTION

**git read-tree** reads tree information into the index. It is a plumbing command used internally by porcelain commands like `git checkout` and `git merge` to manipulate the staging area.

The command can read a single tree or perform three-way merges of trees. It updates the index without touching the working tree unless the `-u` flag is specified to synchronize the working directory.

# CAVEATS

Plumbing command. Usually invoked by other commands. Can overwrite index state.

# HISTORY

git read-tree is a core **Git** plumbing command implementing index manipulation, used internally by checkout, merge, and other commands.

# SEE ALSO

[git-write-tree](/man/git-write-tree)(1), [git-ls-tree](/man/git-ls-tree)(1), [git-checkout](/man/git-checkout)(1), [git-merge](/man/git-merge)(1)
