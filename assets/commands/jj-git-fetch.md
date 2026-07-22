# TAGLINE

fetches changes from Git remotes into a Jujutsu repository

# TLDR

**Fetch from default remote**

```jj git fetch```

**Fetch from specific remote**

```jj git fetch --remote [origin]```

**Fetch all remotes**

```jj git fetch --all-remotes```

**Fetch specific branch**

```jj git fetch --branch [main]```

# SYNOPSIS

**jj** **git** **fetch** [_options_]

# PARAMETERS

**--remote** _name_
> Remote to fetch from.

**--all-remotes**
> Fetch from all remotes.

**--branch** _name_
> Fetch specific branch.

# DESCRIPTION

**jj git fetch** fetches changes from Git remotes into a Jujutsu repository. Updates remote-tracking branches. Works with the Git backend to sync with remote repositories.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[jj](/man/jj)(1), [jj-git-push](/man/jj-git-push)(1)

