# TAGLINE

identifies outdated dependencies in package.json

# TLDR

**Check for updates**

```ncu```

**Update package.json**

```ncu -u```

**Check specific packages**

```ncu [lodash] [react]```

**Check packages matching a regex**

```ncu "/^@types\//"```

**Exclude packages**

```ncu --reject [typescript]```

**Interactive mode**, choosing which upgrades to apply

```ncu -i```

Only upgrade to **minor or patch** versions

```ncu -u --target minor```

Ignore versions **published less than 7 days ago**

```ncu --cooldown [7d]```

Check **all workspaces** of a monorepo

```ncu --workspaces```

Check **globally installed** packages

```ncu -g```

# SYNOPSIS

**ncu** [_options_] [_filter_]

# PARAMETERS

**-u**, **--upgrade**
> Overwrite package file with upgraded versions instead of only printing them.

**-i**, **--interactive**
> Interactive prompts for each dependency; implies -u.

**-t**, **--target** _VALUE_
> Version to upgrade to: latest (default), newest, greatest, minor, patch, semver, @tag.

**-f**, **--filter** _PATTERN_
> Only include package names matching a string, glob, list or /regex/.

**-x**, **--reject** _PATTERN_
> Exclude matching packages.

**--dep** _SECTIONS_
> Check only these dependency sections: dev, optional, peer, prod, packageManager.

**-g**, **--global**
> Check global packages instead of the current project.

**-p**, **--packageManager** _PM_
> npm (default), yarn, pnpm, deno, bun or staticRegistry.

**--peer**
> Check peer dependencies of installed packages and filter updates to compatible versions.

**--deep**
> Run recursively in the current directory (alias for --packageFile '\*\*/package.json').

**-w**, **--workspaces**
> Run on all workspaces. **--workspace** _NAME_ selects specific ones.

**--pre** _N_
> Include prerelease versions (1 to enable).

**-c**, **--cooldown** _PERIOD_
> Minimum age of a version before it is considered, e.g. 7 (days), 7d, 12h, 30m.

**-m**, **--minimal**
> Do not upgrade versions already satisfied by the current range.

**--format** _LIST_
> Output formatting: dep, group, ownerChanged, repo, time, lines, installedVersion, cooldown.

**-e**, **--errorLevel** _N_
> 2 exits non-zero if any package needs updating (useful in CI).

**-j**, **--jsonAll**
> Output the new package file as JSON.

**--jsonUpgraded**
> Output only the upgraded dependencies as JSON.

**-d**, **--doctor**
> Install upgrades one at a time and run tests to find the breaking ones. Requires -u.

**--packageFile** _PATH_
> Package file(s) location (default ./package.json).

**-r**, **--registry** _URL_
> Registry to use when looking up versions.

**--cache**
> Cache versions to ~/.ncu-cache.json.

# DESCRIPTION

**ncu** (npm-check-updates) upgrades the dependencies in package.json to the latest versions, ignoring the specified version ranges. By default it only prints the available upgrades as "current range -> new version"; nothing is modified.

It compares the version ranges declared in package.json against the registry, not the versions installed in node_modules.

Upgrade mode (-u) rewrites package.json while preserving the range operators (^, ~). Run npm install (or the equivalent) afterward to actually install updates; the --install option controls whether ncu offers to do this.

Target levels control update scope: patch allows only patch updates, minor allows minor and patch, and latest allows major upgrades.

Options can be stored in a **.ncurc** file (JSON, YAML or JS) in the project directory.

# CAVEATS

Updates package.json but doesn't install. Major upgrades can contain breaking changes; test after updating. ncu does not check actual compatibility unless --peer or --doctor is used.

# HISTORY

**npm-check-updates** was created around **2013** by Tomas Junnonen and has long been maintained by Raine Revere. It fills a gap in npm's workflow: npm update only installs versions within the existing ranges, while ncu rewrites the ranges themselves.

# SEE ALSO

[npm](/man/npm)(1), [yarn](/man/yarn)(1), [pnpm](/man/pnpm)(1), [npm-outdated](/man/npm-outdated)(1), [npm-update](/man/npm-update)(1)

# RESOURCES

```[Source code](https://github.com/raineorshine/npm-check-updates)```

<!-- verified: 2026-09-29 -->
