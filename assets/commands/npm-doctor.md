# TAGLINE

runs diagnostics to check npm environment health

# TLDR

**Run npm environment diagnostics**

```npm doctor```

**Run with a specific registry**

```npm doctor --registry [https://registry.npmjs.org]```

# SYNOPSIS

**npm** **doctor** [_--registry registry_]

# DESCRIPTION

**npm doctor** runs a set of diagnostics to verify the npm environment is healthy. It checks: npm can reach the configured registry, the installed version of node and npm are supported, the npm cache is not corrupt, global and local bin directories exist and are on **PATH**, the packages tree has correct ownership, and the git binary is available.

Each check is reported as **OK** or shows the specific problem. If any check fails, the exit code is non-zero.

# CAVEATS

Some checks require network access. On restricted systems (CI, air-gapped), registry connectivity checks will fail. Cache verification can be slow on large caches.

# SEE ALSO

[npm](/man/npm)(1), [npm-cache](/man/npm-cache)(1), [npm-install](/man/npm-install)(1)

