# TAGLINE

Create a flake in the current directory from a template

# TLDR

**Initialize a flake** using the default template

```nix flake init```

**Initialize from a built-in template**

```nix flake init -t [templates#simpleContainer]```

**Initialize from a GitHub repository template**

```nix flake init -t [github:owner/repo#template]```

# SYNOPSIS

**nix flake init** [**-t** _template_] [_flags_]

# PARAMETERS

**-t**, **--template** _FLAKE_
> The template to use. Defaults to `templates#templates.default`. The template is a flake reference optionally followed by `#<attr>` to select a specific template attribute.

# DESCRIPTION

**nix flake init** creates a new `flake.nix` in the current directory by copying the files from a template flake. It will not overwrite existing files.

The default template source is the `nixpkgs` flakes template registry. Templates are identified by a flake reference plus an optional attribute path (e.g. `templates#python`). After initialization, any `welcomeText` defined in the template is printed to the terminal.

# CAVEATS

Will not overwrite existing files. Nix flakes must be enabled in the Nix configuration (`experimental-features = nix-command flakes`).

# HISTORY

Nix flakes were introduced as an experimental feature in **Nix 2.4** (2021) to provide reproducible, composable builds. The `nix flake init` subcommand is part of the new-style `nix` CLI (`nix3`).

# SEE ALSO

[nix-flake](/man/nix-flake)(1), [nix-flake-show](/man/nix-flake-show)(1), [nix](/man/nix)(1)

