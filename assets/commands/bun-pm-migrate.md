# TAGLINE

Migrate from another package manager to Bun

# TLDR

**Migrate from npm/yarn/pnpm to Bun**

```bun pm migrate```

# SYNOPSIS

**bun** **pm** **migrate**

# DESCRIPTION

**bun pm migrate** converts a project from npm, yarn, or pnpm to use Bun's package manager. It reads existing lockfiles (package-lock.json, yarn.lock, or pnpm-lock.yaml) and creates a bun.lock file, preserving the resolved dependency versions from the original lockfile.

Note that `bun install` also performs automatic lockfile migration when no bun.lock exists, so this command is primarily useful for explicit one-time migration without installing packages.

# CAVEATS

Review the generated bun.lock to ensure dependency resolution matches expectations. Some edge cases with complex dependency trees may require manual adjustment. The original lockfile is preserved and can be removed manually after verification.

# SEE ALSO

[bun](/man/bun)(1), [bun-pm](/man/bun-pm)(1), [bun-install](/man/bun-install)(1), [npm](/man/npm)(1), [yarn](/man/yarn)(1), [pnpm](/man/pnpm)(1)
