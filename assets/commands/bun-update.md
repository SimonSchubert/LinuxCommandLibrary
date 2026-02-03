# TLDR

**Update all packages** to latest compatible versions

```bun update```

**Update a specific package**

```bun update [package]```

**Update to latest versions** ignoring semver ranges

```bun update --latest```

# SYNOPSIS

**bun** **update** [_options_] [_packages..._]

# PARAMETERS

**--latest**
> Update to latest versions, ignoring version ranges in package.json.

# DESCRIPTION

**bun update** updates installed packages to newer versions. By default, it respects semver ranges defined in package.json. Use **--latest** to update beyond those constraints.

# CAVEATS

Using **--latest** may introduce breaking changes. Always review changelogs and test thoroughly after major updates.

# SEE ALSO

[bun](/man/bun)(1), [bun-outdated](/man/bun-outdated)(1), [bun-install](/man/bun-install)(1)
