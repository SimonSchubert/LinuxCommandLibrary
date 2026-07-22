# TAGLINE

Remove stored Pulumi backend credentials

# TLDR

**Logout from current backend**

```pulumi logout```

**Logout from specific backend**

```pulumi logout [url]```

**Logout from all backends**

```pulumi logout --all```

# SYNOPSIS

**pulumi** **logout** [_options_] [_url_]

# PARAMETERS

**--all**
> Logout from all backends.

**--local**
> Logout from local backend.

# DESCRIPTION

**pulumi logout** removes stored credentials for a Pulumi backend. Does not affect deployed resources or state, only local authentication.

# INSTALL

```pacman: sudo pacman -S pulumi```

```apk: sudo apk add pulumi```

```brew: brew install pulumi```

```nix: nix profile install nixpkgs#pulumi```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-login](/man/pulumi-login)(1)

