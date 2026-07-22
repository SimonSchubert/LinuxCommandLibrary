# TAGLINE

Display Pulumi environment diagnostics

# TLDR

**Show Pulumi version and environment info**

```pulumi about```

**Show output as JSON**

```pulumi about --json```

**Include transitive plugin dependencies**

```pulumi about --transitive```

**Show info for a specific stack**

```pulumi about --stack [org/project/dev]```

# SYNOPSIS

**pulumi** **about** [_options_]

# PARAMETERS

**-j**, **--json**
> Emit output as JSON, suitable for scripting.

**-t**, **--transitive**
> Include transitive language plugin dependencies in the output.

**-s**, **--stack** _name_
> Run against a specific stack (defaults to the currently selected stack).

# DESCRIPTION

**pulumi about** displays diagnostic information about the local Pulumi environment. Output covers the Pulumi CLI version, the host OS and architecture, the active backend (Pulumi Cloud, S3, Azure Blob, etc.), the current user, and the language runtime plus any installed resource plugins.

When run inside a Pulumi project, it also reports the project name, runtime, and the currently selected stack. The information is primarily intended for support tickets and CI debugging — Pulumi staff frequently ask for the output when triaging bug reports.

# CAVEATS

The output includes paths and stack identifiers; redact sensitive values before sharing publicly. Some fields are only populated inside a Pulumi project directory.

# INSTALL

```pacman: sudo pacman -S pulumi```

```apk: sudo apk add pulumi```

```brew: brew install pulumi```

```nix: nix profile install nixpkgs#pulumi```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-version](/man/pulumi-version)(1), [pulumi-stack](/man/pulumi-stack)(1)
