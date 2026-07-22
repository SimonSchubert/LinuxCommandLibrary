# TAGLINE

removes tags from the repository

# TLDR

**Delete a tag**

```jj tag delete [tagname]```

**Delete multiple tags**

```jj tag delete [tag1] [tag2]```

# SYNOPSIS

**jj** **tag** **delete** _name_...

# DESCRIPTION

**jj tag delete** removes tags from the repository. Tags are lightweight references pointing to specific commits. Deleting a tag does not affect the underlying commit.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[jj](/man/jj)(1), [jj-tag](/man/jj-tag)(1), [jj-tag-list](/man/jj-tag-list)(1)

