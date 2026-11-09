# TAGLINE

Deploy integration to Zapier

# TLDR

**Build and upload** the integration

```zapier-platform push```

**Create a snapshot version** for testing

```zapier-platform push --snapshot [LABEL]```

**Push without reinstalling dependencies**

```zapier-platform push --skip-dep-install```

# SYNOPSIS

**zapier-platform** **push** [_options_]

# PARAMETERS

**--snapshot** _label_
> Create a snapshot version named **0.0.0-LABEL** for development and testing.

**--disable-dependency-detection**
> Disable smart file inclusion.

**--skip-dep-install**, **--skip-npm-install**
> Skip installing a fresh copy of dependencies.

**-d**, **--debug**
> Show extra debugging output.

# DESCRIPTION

**zapier-platform push** builds and uploads the current integration. It is the same as running **zapier-platform build** and **zapier-platform upload** in sequence.

# CAVEATS

The binary is **zapier-platform**. The old **zapier** name was deprecated in zapier-platform-cli 18.0.0 and removed in 19.0.0.

# SEE ALSO

[zapier](/man/zapier)(1), [zapier-build](/man/zapier-build)(1), [zapier-versions](/man/zapier-versions)(1)

# RESOURCES

```[Source code](https://github.com/zapier/zapier-platform)```

```[Documentation](https://github.com/zapier/zapier-platform/blob/main/packages/cli/docs/cli.md)```

<!-- verified: 2026-11-09 -->
