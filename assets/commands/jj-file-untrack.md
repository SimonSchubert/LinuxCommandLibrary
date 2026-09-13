# TAGLINE

stops tracking specified paths in the Jujutsu working copy

# TLDR

**Stop tracking** an ignored file or directory

```jj file untrack [path/to/file]```

Stop tracking **several ignored paths**

```jj file untrack [path/to/file1] [path/to/directory]```

# SYNOPSIS

**jj file untrack** _filesets_...

# PARAMETERS

_FILESETS_
> Paths to stop tracking. Required. Each path must already be ignored (for example by **.gitignore** or, in a colocated workspace, **.git/info/exclude**).

# DESCRIPTION

**jj file untrack** stops tracking specified paths in the working copy. The files remain on disk, but they are no longer snapshotted into the working-copy commit.

This is the usual way to drop a previously tracked file from the current change while keeping it locally — Git's `git rm --cached`. The path must already match an ignore rule; otherwise the next snapshot would pick it up again. Add a **.gitignore** (or **.git/info/exclude**) pattern first, then untrack.

# CAVEATS

Subcommand of **jj**. At least one fileset is required. Untracking fails if the path is not already ignored. Not the same as **jj bookmark untrack**.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-13 -->

# SEE ALSO

[jj-file](/man/jj-file)(1), [jj-file-track](/man/jj-file-track)(1), [jj-file-list](/man/jj-file-list)(1), [git-rm](/man/git-rm)(1), [jj](/man/jj)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-file-untrack)```

<!-- verified: 2026-09-13 -->
