# TAGLINE

List Zapier integration versions

# TLDR

**List versions**

```zapier-platform versions```

**Include deprecated versions**

```zapier-platform versions --all```

**Output as JSON**

```zapier-platform versions --format json```

# SYNOPSIS

**zapier-platform** **versions** [_options_]

# PARAMETERS

**-a**, **--all**
> List all versions, including deprecated versions.

**-f**, **--format** _format_
> Output format: **plain**, **json**, **raw**, **row** or **table** (default).

**-d**, **--debug**
> Show extra debugging output.

# DESCRIPTION

**zapier-platform versions** lists the versions of your integration available for use in Zapier automations. Use **--format json** or **raw** to pipe the output into tools such as **jq**.

# CAVEATS

The binary is **zapier-platform**. The old **zapier** name was deprecated in zapier-platform-cli 18.0.0 and removed in 19.0.0.

# SEE ALSO

[zapier](/man/zapier)(1), [zapier-history](/man/zapier-history)(1), [zapier-push](/man/zapier-push)(1)

# RESOURCES

```[Source code](https://github.com/zapier/zapier-platform)```

```[Documentation](https://github.com/zapier/zapier-platform/blob/main/packages/cli/docs/cli.md)```

<!-- verified: 2026-11-09 -->
