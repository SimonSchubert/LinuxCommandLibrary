# TAGLINE

Update installed packages

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
> Update to latest versions, ignoring version ranges in package.json (also rewrites the manifest).

**--no-save**
> Update installed packages without modifying `package.json` or `bun.lockb`.

**--save-text-lockfile**
> Generate the human-readable `bun.lock` text lockfile alongside the binary one.

**-d**, **--dev**
> Limit the update to `devDependencies`.

**--production**
> Limit the update to non-dev dependencies.

**--frozen-lockfile**
> Fail if the lockfile would need to change (CI safety check).

**--dry-run**
> Show what would change without writing to disk.

# DESCRIPTION

**bun update** upgrades installed packages to newer versions, refreshing `node_modules` and the lockfile. By default it respects the semver ranges declared in `package.json`; **--latest** lifts that restriction and writes the newest available version back to the manifest.

When called without package names, every dependency is considered. Naming one or more packages limits the operation to those entries (and their transitive graph).

# CAVEATS

**--latest** can pull in major-version bumps and break the project. The binary `bun.lockb` is not human-diffable; use `--save-text-lockfile` (or `bun install --save-text-lockfile`) to maintain a `bun.lock` file for code review.

# INSTALL

```pacman: sudo pacman -S bun```

```brew: brew install bun```

```nix: nix profile install nixpkgs#bun```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[bun](/man/bun)(1), [bun-outdated](/man/bun-outdated)(1), [bun-install](/man/bun-install)(1)
