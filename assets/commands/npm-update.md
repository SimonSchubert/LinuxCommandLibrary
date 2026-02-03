# TLDR

**Update all packages**

```npm update```

**Update specific package**

```npm update [package-name]```

**Update global packages**

```npm update -g```

**Update to latest (beyond semver)**

```npm update [package] --latest```

**Dry run update**

```npm update --dry-run```

# SYNOPSIS

**npm** **update** [_packages_...] [_options_]

# PARAMETERS

**-g**, **--global**
> Update global packages.

**--save**
> Update package.json.

**--dry-run**
> Preview updates.

# DESCRIPTION

**npm update** updates packages to latest versions within semver range specified in package.json. Updates package-lock.json. Use npm outdated first to see available updates.

# SEE ALSO

[npm](/man/npm)(1), [npm-outdated](/man/npm-outdated)(1)

