# TAGLINE

manages which paths from a Jujutsu working-copy commit are present on disk

# TLDR

**List** the patterns currently present in the working copy

```jj sparse list```

**Edit** the patterns in an editor

```jj sparse edit```

**Reset** the patterns so every file is present

```jj sparse reset```

**Keep only** selected paths (clear first, then add)

```jj sparse set --clear --add [path/to/directory]```

**Add** a path without dropping the rest

```jj sparse set --add [path/to/directory]```

**Add several** paths

```jj sparse set --add [path/to/dir1] --add [path/to/dir2]```

**Remove** a path from the working copy

```jj sparse set --remove [path/to/directory]```

**Materialize nothing** (empty working copy)

```jj sparse set --clear```

# SYNOPSIS

**jj sparse** (_list_ | _edit_ | _reset_ | _set_ [_options_])

# SUBCOMMANDS

**list**
> Print the patterns that are currently present in the working copy. A newly cloned or initialized repo has a single pattern matching everything from the repo root, rendered as **.**.

**edit**
> Open an editor on the pattern list so you can add or drop paths by hand.

**reset**
> Restore the default pattern set that includes all files in the working copy.

**set**
> Update the pattern set from flags. Combine **--clear** with **--add** to replace the list, or use **--add** / **--remove** to change it in place.

# PARAMETERS

**--add** _PATTERN_
> Include this path (or other pattern) in the working copy. Repeatable.

**--remove** _PATTERN_
> Drop this path from the working copy. Repeatable.

**--clear**
> Start from an empty set (no files present). Usually combined with **--add**.

# DESCRIPTION

**jj sparse** controls which paths from the working-copy commit are written to the working copy on disk. The commit itself still holds the full tree; only the checked-out files change. That is the Jujutsu counterpart of Git sparse checkout, implemented natively rather than through Git's sparse-checkout machinery.

Typical use is a large repo where you only need a subdirectory: `jj sparse set --clear --add lib` leaves `lib/` (and whatever else you add) on disk and omits the rest. `jj sparse list` shows the current patterns; `jj sparse reset` puts every file back.

# CAVEATS

Subcommand of **jj**. Patterns apply to the current workspace's working copy, not to other workspaces of the same repo. Git's own sparse-checkout is not used and is listed as unsupported in Jujutsu's Git-compatibility notes.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-14 -->

# SEE ALSO

[jj](/man/jj)(1), [jj-file](/man/jj-file)(1), [jj-file-list](/man/jj-file-list)(1), [git-sparse-checkout](/man/git-sparse-checkout)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-sparse)```

<!-- verified: 2026-09-14 -->
