# TLDR

**Check outdated packages**

```npm outdated```

**Check global packages**

```npm outdated -g```

**Output as JSON**

```npm outdated --json```

**Check specific package**

```npm outdated [package]```

**Long format output**

```npm outdated --long```

# SYNOPSIS

**npm outdated** [_options_] [_packages_...]

# PARAMETERS

**-g**, **--global**
> Check global packages.

**--json**
> JSON output.

**--long**
> Extended information.

**--depth** _n_
> Max depth to check.

**--all**
> Show all packages.

# DESCRIPTION

**npm outdated** checks the registry for newer versions of installed packages. It shows current, wanted (by semver range), and latest versions.

Color coding: red for major updates, yellow for minor updates.

# OUTPUT COLUMNS

```
Package   Current  Wanted  Latest  Location
lodash    4.17.0   4.17.21 4.17.21 node_modules/lodash

Current - Installed version
Wanted  - Max version satisfying semver
Latest  - Latest version in registry
```

# EXAMPLE

```bash
$ npm outdated
Package  Current  Wanted  Latest
express  4.17.1   4.18.2  4.18.2
lodash   4.17.0   4.17.21 4.17.21
```

# CAVEATS

Only shows direct dependencies by default. Doesn't update packages. Use npm update to apply updates.

# HISTORY

npm outdated was added to npm to help developers identify packages that need updating, complementing npm update.

# SEE ALSO

[npm](/man/npm)(1), [npm-update](/man/npm-update)(1), [npm-ls](/man/npm-ls)(1)
