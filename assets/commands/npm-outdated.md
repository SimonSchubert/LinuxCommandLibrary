# TAGLINE

checks the registry for newer versions of installed packages

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

**Include nested (transitive) dependencies**

```npm outdated --all```

**Parseable tab-separated output**

```npm outdated --parseable```

# SYNOPSIS

**npm outdated** [_options_] [_packages_...]

# PARAMETERS

**-g**, **--global**
> Check globally installed packages instead of the local project.

**--json**
> Output as JSON (machine-parseable).

**-l**, **--long**
> Extended output including package type (dependencies, devDependencies, peerDependencies, optionalDependencies) and homepage.

**-p**, **--parseable**
> Tab-separated output suitable for parsing.

**--all**
> Show all outdated packages, including meta-dependencies (transitive/nested), not just direct dependencies.

**--omit** _type_
> Exclude a dependency group (dev, optional, peer). May be set multiple times.

**-w**, **--workspace** _name_
> Run the command within the named workspace(s).

**-ws**, **--workspaces**
> Run across all configured workspaces.

**--include-workspace-root**
> Include the workspace root when running with --workspaces.

# DESCRIPTION

**npm outdated** checks the registry for newer versions of installed packages. It reports the currently installed version, the maximum version satisfying the semver range in package.json (**wanted**), and the latest version tagged in the registry (**latest**).

Color coding in terminal output: **red** indicates an available update within your semver range (safe to run `npm update`); **yellow** indicates a newer version exists that exceeds your semver range (requires a manual bump).

# OUTPUT COLUMNS

```
Package   Current  Wanted  Latest  Location            Depended by
lodash    4.17.0   4.17.21 4.17.21 node_modules/lodash my-app

Current     - Currently installed version
Wanted      - Max version satisfying semver range
Latest      - Version tagged "latest" in the registry
Location    - Location in the dependency tree
Depended by - Package depending on this one
Package type - (with --long) dependencies/devDependencies/peer/optional
```

# EXAMPLE

```bash
$ npm outdated
Package  Current  Wanted  Latest
express  4.17.1   4.18.2  4.18.2
lodash   4.17.0   4.17.21 4.17.21
```

# CAVEATS

Only shows direct dependencies by default; pass **--all** to include transitive ones. The command only reports — it never installs or modifies anything. Use **npm update** to apply updates within semver ranges, or bump the version in package.json for major upgrades. Exits with a non-zero status when outdated packages are found, which can break CI pipelines.

# HISTORY

npm outdated was added to npm to help developers identify packages that need updating, complementing npm update.

# SEE ALSO

[npm](/man/npm)(1), [npm-update](/man/npm-update)(1), [npm-ls](/man/npm-ls)(1)
