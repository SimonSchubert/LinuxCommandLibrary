# TLDR

**Query package dependencies**

```nix-store -q --references [/nix/store/...path]```

**Query reverse dependencies**

```nix-store -q --referrers [/nix/store/...path]```

**Show dependency tree**

```nix-store -q --tree [/nix/store/...path]```

**Garbage collect**

```nix-store --gc```

**Optimize store**

```nix-store --optimise```

**Verify store integrity**

```nix-store --verify --check-contents```

# SYNOPSIS

**nix-store** _operation_ [_options_] [_paths_...]

# PARAMETERS

**-q**, **--query**
> Query mode.

**--gc**
> Garbage collect.

**--optimise**
> Deduplicate store.

**--verify**
> Verify store integrity.

**--references**
> Show dependencies.

**--referrers**
> Show reverse dependencies.

**--tree**
> Show dependency tree.

**--delete**
> Delete paths.

# DESCRIPTION

**nix-store** manages the Nix store (/nix/store). It handles garbage collection, optimization, queries, and store maintenance operations.

The Nix store contains all packages and their dependencies as immutable paths.

# STORE LAYOUT

```
/nix/store/
├── hash-name/           # Package paths
├── hash-name.drv        # Derivations
└── .links/              # Hard link pool
```

# CAVEATS

Don't manually modify /nix/store. Garbage collection only removes unreferenced paths. Optimization uses hard links.

# HISTORY

nix-store is a core **Nix** tool, providing low-level access to the Nix store since the project's inception.

# SEE ALSO

[nix-env](/man/nix-env)(1), [nix-build](/man/nix-build)(1), [nix-collect-garbage](/man/nix-collect-garbage)(1)
