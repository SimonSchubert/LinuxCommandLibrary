# TAGLINE

restructures a series of sequential commits to be parallel siblings

# TLDR

**Make a range of revisions** siblings of each other

```jj parallelize [rev1]::[rev2]```

Parallelize the **current revision and its parent**

```jj parallelize @-::@```

Parallelize **specific revisions** by change ID

```jj parallelize [xyz] [abc]```

# SYNOPSIS

**jj** **parallelize** [_revsets_...]

# PARAMETERS

_REVSETS_
> The revisions to parallelize. Also accepted with **-r**.

# DESCRIPTION

**jj parallelize** declares that a set of revisions are independent of each other: they stop being ancestors or descendants of one another and become siblings. Running **jj parallelize 1::2** on a linear history 0-1-2-3 makes 1 and 2 both children of 0, and 3 becomes a merge of 1 and 2.

Revisions outside the set keep their relationships: former ancestors of a revision in the set stay ancestors, and former descendants stay descendants. Because of this, parallelizing non-adjacent revisions such as **'1 | 3'** with 2 in between is a no-op.

Useful for splitting a stack of independent changes so they can be reviewed or merged separately.

# CAVEATS

If the revisions are not actually independent, the new siblings may contain conflicts, which jj records in the commits for later resolution.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[jj](/man/jj)(1), [jj-rebase](/man/jj-rebase)(1), [jj-split](/man/jj-split)(1), [jj-simplify-parents](/man/jj-simplify-parents)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-parallelize)```

<!-- verified: 2026-09-29 -->
