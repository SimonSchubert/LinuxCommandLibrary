# TAGLINE

manages Nix flakes

# TLDR

**Show flake outputs**

```nix flake show```

**Update** all inputs in flake.lock

```nix flake update```

Update **a single input**

```nix flake update [nixpkgs]```

**Initialize** a flake in the current directory

```nix flake init```

Initialize from a **template**

```nix flake init -t [templates#rust]```

**Check** that the flake evaluates and run its checks

```nix flake check```

Show flake **metadata** and locked inputs

```nix flake metadata [github:NixOS/nixpkgs]```

Create **missing lock entries** without updating existing ones

```nix flake lock```

# SYNOPSIS

**nix** **flake** _subcommand_ [_options_]

# PARAMETERS

**show** [_flake_]
> Show the outputs provided by a flake. **--all-systems** includes every system, **--json** gives machine-readable output.

**update** [_inputs_...]
> Update the lock file, all inputs by default. **--flake** _url_ selects another flake than the current directory.

**lock**
> Create missing lock file entries without updating existing ones.

**init**, **new** _dir_
> Create a flake in the current (or given) directory from a template (**-t**).

**check**
> Check whether the flake evaluates and run its tests. **--all-systems** checks every system.

**metadata**, **info**
> Show flake metadata such as the locked revision and input tree.

**archive**
> Copy a flake and all its inputs to a store.

**clone**
> Clone a flake's repository.

**prefetch**, **prefetch-inputs**
> Download a flake source tree, or the inputs of a flake, into the Nix store.

**--help**
> Display help information.

# DESCRIPTION

**nix3-flake** is the manual page for **nix flake**, the command for creating, modifying and querying flakes. A flake is a source tree (usually a Git repository) with a **flake.nix** at its root declaring its **inputs** (dependencies) and **outputs** (packages, dev shells, NixOS configurations and so on). Input versions are pinned in **flake.lock**.

Flakes are referenced with flakerefs such as **nixpkgs**, **github:NixOS/nixpkgs/nixos-unstable**, **git+https://example.org/repo** or a path like **.**; an output is selected with **#**, e.g. **.#default**.

# CAVEATS

There is no **nix3** executable: the new-CLI man pages are named nix3-_subcommand_ (man nix3-flake, man nix3-flake-update). Run the commands as **nix flake**.

Requires the **nix-command** and **flakes** experimental features. In a Git repository only files tracked by Git are visible to the flake, so **git add** new files first. **nix flake update** used to update the flake given as argument; it now takes input names and uses **--flake** to select the flake.

# HISTORY

Flakes and **nix flake** were introduced as an experimental feature in **Nix 2.4** (2021). **nix flake info** is an older alias of **nix flake metadata**. Nix 2.19 (2023) changed **nix flake update** to accept input names, replacing **nix flake lock --update-input**.

# INSTALL

```apt: sudo apt install nix-bin```

```dnf: sudo dnf install nix```

```pacman: sudo pacman -S nix```

```apk: sudo apk add nix```

```zypper: sudo zypper install nix```

```nix: nix profile install nixpkgs#nix```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[nix](/man/nix)(1), [nix-flake](/man/nix-flake)(1), [nix3-build](/man/nix3-build)(1), [nix-flake-show](/man/nix-flake-show)(1), [nix-flake-init](/man/nix-flake-init)(1), [nix-registry](/man/nix-registry)(1)

# RESOURCES

```[Source code](https://github.com/NixOS/nix)```

```[Documentation](https://nix.dev/manual/nix/latest/command-ref/new-cli/nix3-flake.html)```

<!-- verified: 2026-09-29 -->
