# TAGLINE

sets or removes the executable bit for paths in a Jujutsu repository

# TLDR

**Make a file executable** in the working copy

```jj file chmod x [path/to/file]```

The same using the **executable** alias

```jj file chmod executable [path/to/file]```

**Make a file non-executable** (normal)

```jj file chmod n [path/to/file]```

The same using the **normal** alias

```jj file chmod normal [path/to/file]```

Make **several files** executable

```jj file chmod x [path/to/file1] [path/to/file2]```

Change the bit in a **specific revision**

```jj file chmod -r [revision] x [path/to/file]```

# SYNOPSIS

**jj file chmod** [**-r** _revset_] _mode_ _filesets_...

# PARAMETERS

_MODE_
> **x** (alias **executable**) sets the executable bit. **n** (alias **normal**) clears it.

_FILESETS_
> Paths whose executable bit should change. Required.

**-r**, **--revision** _REVSET_
> Revision to update (default: working-copy commit **@**).

# DESCRIPTION

**jj file chmod** sets or clears the executable bit on paths in a Jujutsu repository. Unlike POSIX **chmod**, it also works on Windows, on conflicted files, and on arbitrary revisions, because it records the bit in the commit rather than only in the working-tree inode.

The working copy is a first-class commit, so with no **-r** the change is applied to **@**. Pass **-r** to rewrite another revision (descendants are rebased as usual).

# CAVEATS

Subcommand of **jj**. Only the executable bit is changed; other Unix permission bits are not stored. Rewriting a revision other than **@** rebases descendants.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-13 -->

# SEE ALSO

[jj-file](/man/jj-file)(1), [jj-file-list](/man/jj-file-list)(1), [chmod](/man/chmod)(1), [git-update-index](/man/git-update-index)(1), [jj](/man/jj)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-file-chmod)```

<!-- verified: 2026-09-13 -->
