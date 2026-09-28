# TAGLINE

divides a change into multiple changes

# TLDR

**Split the working-copy change** interactively

```jj split```

**Split a specific revision**

```jj split -r [rev]```

Move **specific files** into the first change

```jj split [file1] [file2]```

Split with a **description** for the selected part

```jj split -m "[message]" [path/to/file]```

Split into two **sibling** changes instead of parent and child

```jj split -p [file]```

**Extract** selected changes into a new commit on top of another revision

```jj split -o [destination] [file]```

Force **interactive** hunk selection even with filesets

```jj split -i [path/to/dir]```

# SYNOPSIS

**jj split** [_options_] [_filesets_...]

# PARAMETERS

_FILESETS_
> Files matching any of these go into the selected (first) change.

**-r**, **--revision** _REV_
> Revision to split (default: @).

**-i**, **--interactive**
> Interactively choose which parts to split. Default when no filesets are given.

**--tool** _NAME_
> Diff editor to use (implies **--interactive**).

**-m**, **--message** _MESSAGE_
> Description for the selected changes, without opening an editor.

**--editor**
> Open an editor for the description even when **--message** is given.

**-p**, **--parallel**
> Make the two parts siblings instead of parent and child.

**-o**, **--onto** _REVSETS_
> Put the selected changes into a new commit on the given revision(s); the rest stays in place.

**-A**, **--insert-after** _REVSETS_
> Insert the selected changes as a new commit after the given revision(s).

**-B**, **--insert-before** _REVSETS_
> Insert the selected changes as a new commit before the given revision(s).

# DESCRIPTION

**jj split** divides a revision into two. A diff editor opens on the changes in the revision; edit the right side until it contains what should go into the first commit. After closing the editor, the selected changes stay in the original commit and the remaining changes move into a new child commit, with descendants rebased on top.

With **-p** the two parts become siblings on the same parent. With **-o**, **-A** or **-B** the selected changes are extracted to a new commit at a different location, which is a quick way to move part of a change elsewhere in the history.

# CAVEATS

Splitting an empty commit is not supported; use **jj new** instead. You are prompted for descriptions of the split commits unless **-m** is used.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[jj](/man/jj)(1), [jj-squash](/man/jj-squash)(1), [jj-describe](/man/jj-describe)(1), [jj-diffedit](/man/jj-diffedit)(1), [jj-parallelize](/man/jj-parallelize)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-split)```

<!-- verified: 2026-09-29 -->
