# TAGLINE

manages named references to revisions in Jujutsu

# TLDR

**Create bookmark at current revision**

```jj bookmark create [name]```

**Create bookmark at specific revision**

```jj bookmark create [name] -r [revision]```

**List bookmarks**

```jj bookmark list```

**Delete bookmark**

```jj bookmark delete [name]```

**Move bookmark**

```jj bookmark move [name] --to [revision]```

# SYNOPSIS

**jj** **bookmark** _subcommand_ [_options_]

# SUBCOMMANDS

**create** _name_
> Create new bookmark.

**delete** _name_
> Delete bookmark.

**list**
> List all bookmarks.

**move** _name_
> Move bookmark to different revision.

**track**
> Track remote bookmark.

# PARAMETERS

**-r**, **--revision** _rev_
> Target revision.

**--to** _rev_
> Destination for move.

# DESCRIPTION

**jj bookmark** manages named references to revisions in Jujutsu. Similar to Git branches, bookmarks point to specific commits and can be pushed to/pulled from remotes. Bookmarks follow commits when they are rewritten.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[jj](/man/jj)(1), [jj-git-push](/man/jj-git-push)(1)

