# TAGLINE

identifies outdated dependencies in package

# TLDR

**Check for updates**

```ncu```

**Update package.json**

```ncu -u```

**Check specific packages**

```ncu [lodash] [react]```

**Check packages matching pattern**

```ncu "/^@types/"```

**Exclude packages**

```ncu --reject [typescript]```

**Interactive mode**

```ncu -i```

**Check only minor updates**

```ncu --target minor```

**Show peer dependencies**

```ncu --peer```

# SYNOPSIS

**ncu** [_-u_] [_-i_] [_--target level_] [_--reject pattern_] [_options_] [_packages_]

# PARAMETERS

**-u**, **--upgrade**
> Update package.json.

**-i**, **--interactive**
> Interactive mode.

**-t**, **--target** _LEVEL_
> Update target (latest, minor, patch, semver).

**-f**, **--filter** _PATTERN_
> Only include matching packages.

**-x**, **--reject** _PATTERN_
> Exclude matching packages.

**-g**, **--global**
> Check global packages.

**-p**, **--packageManager** _PM_
> Package manager (npm, yarn, pnpm).

**--peer**
> Check peer dependencies.

**-d**, **--deep**
> Check workspaces.

**--pre**
> Include prerelease versions.

**--format** _FMT_
> Output format.

**--doctor**
> Test upgrades one by one.

# DESCRIPTION

**ncu** (npm-check-updates) identifies outdated dependencies in package.json. It shows available updates without installing them.

The tool compares installed versions against npm registry. Output shows current version, wanted version, and latest version for each package.

Update mode (-u) modifies package.json with new versions. Run npm install afterward to actually install updates.

Interactive mode lets you select which packages to update. This is useful when upgrading incrementally or avoiding certain updates.

Target levels control update scope: patch allows only patch updates (1.0.x), minor allows minor (1.x.x), and latest allows any version.

Filter and reject patterns focus on specific packages. Regex patterns match package names.

# CAVEATS

Updates package.json but doesn't install. Breaking changes possible with major updates. Test after updating. Doesn't check actual compatibility.

# HISTORY

**npm-check-updates** was created around **2014** to fill a gap in npm's update workflow. npm update installs updates but doesn't modify package.json, while ncu updates the file for explicit version control.

# SEE ALSO

[npm](/man/npm)(1), [yarn](/man/yarn)(1), [pnpm](/man/pnpm)(1), [npm-outdated](/man/npm-outdated)(1)
