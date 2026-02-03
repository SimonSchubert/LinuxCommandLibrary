# TLDR

**Edit package definition**

```nix edit nixpkgs#[package]```

**Edit with specific editor**

```EDITOR=vim nix edit nixpkgs#[package]```

# SYNOPSIS

**nix edit** _installable_ [_options_]

# PARAMETERS

_installable_
> Package to edit (e.g., nixpkgs#hello).

# DESCRIPTION

**nix edit** opens the Nix expression for a package in your editor. Useful for inspecting or modifying package definitions. Uses $EDITOR environment variable.

# SEE ALSO

[nix](/man/nix)(1), [nix-search](/man/nix-search)(1)

