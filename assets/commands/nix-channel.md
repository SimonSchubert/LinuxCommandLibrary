# TAGLINE

manages Nix channel subscriptions

# TLDR

**List subscribed channels**

```nix-channel --list```

**Add a channel**

```nix-channel --add [https://nixos.org/channels/nixpkgs-unstable] [nixpkgs]```

**Update all channels**

```nix-channel --update```

**Update a specific channel**

```nix-channel --update [nixpkgs]```

**Remove a channel**

```nix-channel --remove [nixpkgs]```

**Rollback to a previous channel generation**

```nix-channel --rollback```

**List channel generations**

```nix-channel --list-generations```

# SYNOPSIS

**nix-channel** [_options_]

# PARAMETERS

**--list**
> Print names and URLs of all subscribed channels.

**--add** _URL_ [_NAME_]
> Subscribe to a channel. If _NAME_ is omitted, defaults to the last component of the URL with -stable or -unstable suffixes removed.

**--update** [_NAMES..._]
> Download Nix expressions of subscribed channels and make them the default for nix-env operations. Optionally update only the named channels.

**--remove** _NAME_
> Unsubscribe from a channel.

**--rollback** [_GENERATION_]
> Revert the previous call to `--update`. Optionally specify a generation number.

**--list-generations**
> Show channel generations.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**nix-channel** manages Nix channel subscriptions. Channels are URLs that point to a Nix expression tarball providing a set of packages and NixOS modules.

The list of subscribed channels is stored in `~/.nix-channels`. After updating, channel expressions are symlinked from `~/.nix-defexpr/` and become available to `nix-env` and other Nix tools. Nix flakes are the modern alternative to channels.

# CAVEATS

Channels are a legacy approach; Nix flakes are recommended for new projects. Channels are per-user unless configured system-wide on NixOS. Running `--update` requires network access to download channel expressions.

# HISTORY

nix-channel has been part of the **Nix** package manager since its early releases by Eelco Dolstra. It is the traditional mechanism for subscribing to package repositories, predating the flakes system introduced experimentally in Nix 2.4.

# SEE ALSO

[nix](/man/nix)(1), [nix-env](/man/nix-env)(1), [nix-build](/man/nix-build)(1), [nix-shell](/man/nix-shell)(1), [nixos-rebuild](/man/nixos-rebuild)(1)

