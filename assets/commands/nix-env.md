# TLDR

**Install package**

```nix-env -iA nixpkgs.[package]```

**Uninstall package**

```nix-env -e [package]```

**List installed packages**

```nix-env -q```

**Search packages**

```nix-env -qaP [pattern]```

**Upgrade all packages**

```nix-env -u```

**Rollback to previous generation**

```nix-env --rollback```

**List generations**

```nix-env --list-generations```

# SYNOPSIS

**nix-env** [_options_] _operation_

# PARAMETERS

**-i**, **--install**
> Install packages.

**-e**, **--uninstall**
> Remove packages.

**-u**, **--upgrade**
> Upgrade packages.

**-q**, **--query**
> Query packages.

**-A**, **--attr**
> Install by attribute.

**--rollback**
> Rollback generation.

**-p** _profile_
> Use profile.

# DESCRIPTION

**nix-env** manages Nix user environments. It installs, upgrades, and removes packages in user profiles, with the ability to rollback to previous states.

Each operation creates a new generation, preserving previous states.

# PROFILES

```
~/.nix-profile        - Default profile
/nix/var/nix/profiles - System profiles
```

# CAVEATS

Consider using declarative config (home-manager) instead. Generations use disk space. -A for attribute paths is faster.

# HISTORY

nix-env is part of **Nix**, a purely functional package manager created by **Eelco Dolstra** in his 2006 PhD thesis at Utrecht University.

# SEE ALSO

[nix](/man/nix)(1), [nix-shell](/man/nix-shell)(1), [nix-store](/man/nix-store)(1), [home-manager](/man/home-manager)(1)
