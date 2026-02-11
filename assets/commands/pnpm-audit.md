# TAGLINE

Check pnpm dependencies for vulnerabilities

# TLDR

**Run security audit**

```pnpm audit```

**Fix vulnerabilities**

```pnpm audit --fix```

**JSON output**

```pnpm audit --json```

**Audit production only**

```pnpm audit --prod```

# SYNOPSIS

**pnpm audit** [_options_]

# PARAMETERS

**--fix**
> Automatically fix vulnerabilities.

**--json**
> Output as JSON.

**--prod**
> Only audit production dependencies.

**--dev**
> Only audit dev dependencies.

**--audit-level** _LEVEL_
> Minimum severity to report.

# DESCRIPTION

**pnpm audit** scans project dependencies for known security vulnerabilities using the npm advisory database. It reports affected packages, severity levels, and available patched versions.

The **--fix** option attempts to automatically update vulnerable packages to safe versions. Use **--prod** or **--dev** to limit scanning to production or development dependencies respectively. The **--audit-level** option sets the minimum severity threshold for reporting (low, moderate, high, critical).

# CAVEATS

Requires network access. Uses npm advisory database.

# HISTORY

pnpm audit was added for **security vulnerability** scanning in dependencies.

# SEE ALSO

[pnpm](/man/pnpm)(1), [npm-audit](/man/npm-audit)(1)

