# TAGLINE

Build Zapier integration for deployment

# TLDR

**Build integration** into a pushable zip

```zapier-platform build```

**Build without dependency detection**

```zapier-platform build --disable-dependency-detection```

**Build without reinstalling dependencies**

```zapier-platform build --skip-dep-install```

# SYNOPSIS

**zapier-platform** **build** [_options_]

# PARAMETERS

**--disable-dependency-detection**
> Disable smart file inclusion. Use when dynamic **require** calls cause "Cannot find module" errors.

**--skip-dep-install**, **--skip-npm-install**
> Skip installing a fresh copy of dependencies. Helpful for yarn, pnpm or local copies.

**-d**, **--debug**
> Show extra debugging output.

# DESCRIPTION

**zapier-platform build** creates a pushable zip from the current directory. It copies the code to a temporary folder, adds the **zapierwrapper.js** entry point, generates and validates the app definition, detects dependencies with esbuild and writes **build/build.zip** and **build/source.zip**.

To include extra files, add an **includeInBuild** array of regexp paths to **.zapierapprc**. The command is typically followed by **zapier-platform upload**.

# CAVEATS

The binary is **zapier-platform**. The old **zapier** name was deprecated in zapier-platform-cli 18.0.0 and removed in 19.0.0.

# SEE ALSO

[zapier](/man/zapier)(1), [zapier-push](/man/zapier-push)(1)

# RESOURCES

```[Source code](https://github.com/zapier/zapier-platform)```

```[Documentation](https://github.com/zapier/zapier-platform/blob/main/packages/cli/docs/cli.md)```

<!-- verified: 2026-11-09 -->
