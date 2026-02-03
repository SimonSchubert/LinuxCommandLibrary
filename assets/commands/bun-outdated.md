# TLDR

**Check for outdated packages**

```bun outdated```

**Output as JSON**

```bun outdated --json```

# SYNOPSIS

**bun** **outdated** [_options_]

# PARAMETERS

**--json**
> Output in JSON format.

# DESCRIPTION

**bun outdated** checks for packages in your project that have newer versions available. It compares installed versions against the latest available versions in the registry.

The output shows current version, wanted version (matching semver range), and latest version for each outdated package.

# SEE ALSO

[bun](/man/bun)(1), [bun-update](/man/bun-update)(1), [bun-list](/man/bun-list)(1)
