# TAGLINE

Alias for deploying infrastructure changes

# TLDR

**Update stack (alias for up)**

```pulumi update```

**Update with auto-approval**

```pulumi update --yes```

**Update a specific stack**

```pulumi update --stack [stack_name]```

**Preview changes as JSON**

```pulumi update --json```

# SYNOPSIS

**pulumi** **update** [_options_]

# DESCRIPTION

**pulumi update** is an alias for **pulumi up**. Creates or updates infrastructure by comparing desired state with current resources and applying changes.

# INSTALL

```pacman: sudo pacman -S pulumi```

```apk: sudo apk add pulumi```

```brew: brew install pulumi```

```nix: nix profile install nixpkgs#pulumi```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-up](/man/pulumi-up)(1), [pulumi-preview](/man/pulumi-preview)(1), [pulumi-destroy](/man/pulumi-destroy)(1)

