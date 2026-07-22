# TAGLINE

Remove files matching a pattern from the trash can

# TLDR

Remove all files named **foo** from trash

```trash-rm foo```

Remove all files ending with **.o** from trash

```trash-rm '*.o'```

Remove files with a specific **original path** from trash

```trash-rm /absolute/path/to/file```

# SYNOPSIS

**trash-rm** _PATTERN_

# DESCRIPTION

**trash-rm** removes from the trash can all files matching the given pattern. It permanently deletes matching trashed files according to the freedesktop.org Trash specification. The pattern is matched against the original file name or path.

# INSTALL

```dnf: sudo dnf install trash-cli```

```pacman: sudo pacman -S trash-cli```

```apk: sudo apk add trash-cli```

```zypper: sudo zypper install trash-cli```

```brew: brew install trash-cli```

```nix: nix profile install nixpkgs#trash-cli```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[trash](/man/trash)(1), [trash-put](/man/trash-put)(1), [trash-list](/man/trash-list)(1), [trash-empty](/man/trash-empty)(1), [trash-restore](/man/trash-restore)(1)
