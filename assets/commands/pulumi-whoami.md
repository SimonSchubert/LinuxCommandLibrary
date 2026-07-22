# TAGLINE

Show current Pulumi user and backend

# TLDR

**Show current user**

```pulumi whoami```

**Show detailed info**

```pulumi whoami -v```

**Show in JSON format**

```pulumi whoami --json```

# SYNOPSIS

**pulumi** **whoami** [_options_]

# PARAMETERS

**-v**, **--verbose**
> Show detailed information.

**--json**
> Output as JSON.

# DESCRIPTION

**pulumi whoami** displays the currently logged-in user and backend. Shows username, organization, and backend URL. Useful for verifying authentication status.

# INSTALL

```pacman: sudo pacman -S pulumi```

```apk: sudo apk add pulumi```

```brew: brew install pulumi```

```nix: nix profile install nixpkgs#pulumi```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-login](/man/pulumi-login)(1), [pulumi-logout](/man/pulumi-logout)(1)

