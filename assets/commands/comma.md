# TAGLINE

Run software without installing it using Nix

# TLDR

**Run a command** without installing it

```, [command]```

**Run a command** from a specific package

```, [command] --from [package]```

# SYNOPSIS

**,** [_command_] [_args_...]

# DESCRIPTION

**comma** (invoked as **,**) runs software without installing it permanently. It wraps **nix shell -c** and **nix-index** to search nixpkgs for the binary, temporarily install the relevant package, and run the command.

If multiple packages provide the same command, comma prompts you to select which package to use. Results are cached so subsequent runs of the same command reuse the previous selection.

Comma requires a working Nix installation and an up-to-date nix-index database.

# CAVEATS

Requires Nix package manager. The nix-index database must be updated for accurate results. First run of a command may be slow due to package download. Cached paths are invalidated by garbage collection.

# SEE ALSO

[nix](/man/nix)(1), [nix-shell](/man/nix-shell)(1)
