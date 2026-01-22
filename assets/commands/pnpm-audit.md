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

**pnpm audit** checks for security vulnerabilities. Scans dependencies.

The tool reports known security issues. Integrates with npm registry.

pnpm audit finds vulnerabilities.

# CAVEATS

Requires network access. Uses npm advisory database.

# HISTORY

pnpm audit was added for **security vulnerability** scanning in dependencies.

# SEE ALSO

[pnpm](/man/pnpm)(1), [npm-audit](/man/npm-audit)(1)

