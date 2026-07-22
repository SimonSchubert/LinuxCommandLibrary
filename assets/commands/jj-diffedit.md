# TAGLINE

opens a diff editor to interactively modify the changes in a revision

# TLDR

**Edit revision in diff editor**

```jj diffedit```

**Edit specific revision**

```jj diffedit -r [revision]```

**Edit range between revisions**

```jj diffedit --from [rev1] --to [rev2]```

# SYNOPSIS

**jj** **diffedit** [_options_]

# PARAMETERS

**-r**, **--revision** _rev_
> Revision to edit.

**--from** _rev_
> Base revision for comparison.

**--to** _rev_
> Target revision to modify.

# DESCRIPTION

**jj diffedit** opens a diff editor to interactively modify the changes in a revision. Allows adding, removing, or changing hunks in a commit. The editor shows the diff and saves modifications back to the revision.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[jj](/man/jj)(1), [jj-diff](/man/jj-diff)(1), [jj-split](/man/jj-split)(1)

