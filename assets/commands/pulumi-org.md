# TAGLINE

Manage Pulumi Cloud organizations

# TLDR

**Set default organization**

```pulumi org set-default [org]```

**Get default organization**

```pulumi org get-default```

**List organizations**

```pulumi org search```

# SYNOPSIS

**pulumi** **org** _command_ [_options_]

# PARAMETERS

**set-default** _org_
> Set default organization.

**get-default**
> Show default organization.

**search**
> List available organizations.

# DESCRIPTION

**pulumi org** manages Pulumi Cloud organizations. Organizations group users, stacks, and settings. Set default organization for new stacks and operations.

# INSTALL

```pacman: sudo pacman -S pulumi```

```apk: sudo apk add pulumi```

```brew: brew install pulumi```

```nix: nix profile install nixpkgs#pulumi```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-whoami](/man/pulumi-whoami)(1)

