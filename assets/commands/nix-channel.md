# TLDR

**List channels**

```nix-channel --list```

**Add channel**

```nix-channel --add [https://nixos.org/channels/nixpkgs-unstable] [nixpkgs]```

**Update channels**

```nix-channel --update```

**Remove channel**

```nix-channel --remove [nixpkgs]```

**Update specific channel**

```nix-channel --update [nixpkgs]```

**Show generation**

```nix-channel --list-generations```

# SYNOPSIS

**nix-channel** [_options_]

# PARAMETERS

**--list**
> List subscribed channels.

**--add** _URL_ _NAME_
> Subscribe to channel.

**--update** [_NAME_]
> Update channels.

**--remove** _NAME_
> Unsubscribe from channel.

**--list-generations**
> Show channel generations.

**--help**
> Display help information.

# DESCRIPTION

**nix-channel** manages Nix channel subscriptions. Channels provide package sets.

The tool handles channel URLs. Alternative to flakes for package sources.

nix-channel manages package channels.

# CAVEATS

Legacy approach. Consider flakes instead. Per-user channels.

# HISTORY

nix-channel is the traditional **Nix** way of subscribing to package repositories.

# SEE ALSO

[nix](/man/nix)(1), [nix-env](/man/nix-env)(1), [nixos-rebuild](/man/nixos-rebuild)(1)

