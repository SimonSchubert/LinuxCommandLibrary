# TAGLINE

removes unreferenced store paths from the Nix store

# TLDR

**Collect garbage**

```nix-collect-garbage```

**Delete old generations**

```nix-collect-garbage -d```

**Delete generations older than days**

```nix-collect-garbage --delete-older-than [30d]```

**Dry run**

```nix-collect-garbage --dry-run```

# SYNOPSIS

**nix-collect-garbage** [_options_]

# PARAMETERS

**-d**, **--delete-old**
> Delete old profile generations.

**--delete-older-than** _period_
> Delete generations older than period.

**--dry-run**
> Show what would be deleted.

**--max-freed** _bytes_
> Stop after freeing bytes.

# DESCRIPTION

**nix-collect-garbage** removes unreferenced store paths from the Nix store. Frees disk space by deleting packages not linked from any profile or garbage collection root.

# SEE ALSO

[nix-store](/man/nix-store)(1), [nix-env](/man/nix-env)(1)

