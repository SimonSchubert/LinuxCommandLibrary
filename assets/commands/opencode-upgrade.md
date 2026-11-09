# TAGLINE

Update OpenCode to the latest version

# TLDR

**Upgrade** OpenCode to the latest version

```opencode upgrade```

**Upgrade** to a specific version

```opencode upgrade [v0.1.48]```

Upgrade using a specific **installation method**

```opencode upgrade -m [curl|npm|pnpm|bun|brew]```

Upgrade to **OpenCode 2** and remove OpenCode 1

```opencode upgrade --major```

# SYNOPSIS

**opencode upgrade** [_target_] [_options_]

# PARAMETERS

_target_
> Version to install. Defaults to the latest version.

**-m**, **--method** _method_
> The installation method that was used: curl, npm, pnpm, bun or brew.

**--major**
> Upgrade to OpenCode 2 and remove OpenCode 1.

# DESCRIPTION

**opencode upgrade** updates the OpenCode installation to the latest available version or to a specific one.

# CAVEATS

Requires internet access to download the latest release. May require elevated permissions depending on the installation location of the OpenCode binary.

# SEE ALSO

[opencode](/man/opencode)(1), [opencode-uninstall](/man/opencode-uninstall)(1)

# RESOURCES

```[Source code](https://github.com/anomalyco/opencode)```

```[Homepage](https://opencode.ai)```

```[Documentation](https://opencode.ai/docs/cli)```

<!-- verified: 2026-11-09 -->
