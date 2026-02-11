# TAGLINE

List outdated pnpm packages

# TLDR

**Check outdated packages**

```pnpm outdated```

**Check specific package**

```pnpm outdated [package-name]```

**Check in production only**

```pnpm outdated --prod```

**Check dev dependencies**

```pnpm outdated --dev```

**Check globally installed**

```pnpm outdated -g```

**Long format output**

```pnpm outdated --long```

# SYNOPSIS

**pnpm outdated** [_--prod_] [_--dev_] [_-g_] [_packages_]

# PARAMETERS

**--prod**
> Production dependencies only.

**--dev**
> Development dependencies only.

**-g**, **--global**
> Global packages.

**--long**
> Show extended info.

**--recursive**, **-r**
> Check all workspace packages.

**--filter** _PATTERN_
> Filter packages.

# DESCRIPTION

**pnpm outdated** checks for packages that have newer versions available by comparing installed versions against the registry. It displays a table showing the current, wanted (matching semver range), and latest versions for each outdated package.

The output uses color coding to distinguish major (red) from minor (yellow) version bumps. Use **--prod** or **--dev** to filter by dependency type, **-g** for global packages, and **-r** to check all workspace packages in a monorepo. The **--long** flag shows additional details including the package homepage.

# CAVEATS

Requires pnpm. Network access needed. May show unwanted major updates.

# HISTORY

**pnpm outdated** is part of **pnpm**, the fast and disk-efficient package manager created as an alternative to npm.

# SEE ALSO

[pnpm](/man/pnpm)(1), [npm-outdated](/man/npm-outdated)(1), [yarn](/man/yarn)(1)
