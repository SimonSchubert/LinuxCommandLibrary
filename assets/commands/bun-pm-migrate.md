# TLDR

**Migrate from npm/yarn** to Bun

```bun pm migrate```

# SYNOPSIS

**bun** **pm** **migrate**

# DESCRIPTION

**bun pm migrate** converts a project from npm or yarn to use Bun's package manager. It reads existing lockfiles (package-lock.json or yarn.lock) and creates a bun.lockb file.

This preserves your resolved dependency versions while switching to Bun's faster package management.

# CAVEATS

Review the generated bun.lockb to ensure dependency resolution matches expectations. Some edge cases may require manual adjustment.

# SEE ALSO

[bun](/man/bun)(1), [bun-pm](/man/bun-pm)(1), [bun-install](/man/bun-install)(1)
