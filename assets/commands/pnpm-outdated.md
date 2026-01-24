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

**pnpm outdated** checks for outdated packages. It compares installed vs latest.

Shows current and latest versions. Identifies update candidates.

Color-coded output. Red for major, yellow for minor.

Workspace support with recursive. Check all packages at once.

Faster than npm outdated. Uses pnpm's efficient algorithms.

# CAVEATS

Requires pnpm. Network access needed. May show unwanted major updates.

# HISTORY

**pnpm outdated** is part of **pnpm**, the fast and disk-efficient package manager created as an alternative to npm.

# SEE ALSO

[pnpm](/man/pnpm)(1), [npm-outdated](/man/npm-outdated)(1), [yarn](/man/yarn)(1)
