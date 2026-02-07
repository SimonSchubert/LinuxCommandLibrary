# TAGLINE

Scan dependencies for known security vulnerabilities

# TLDR

**Audit dependencies** for security vulnerabilities

```bun audit```

**Output audit results** in JSON format

```bun audit --json```

# SYNOPSIS

**bun** **audit** [_options_]

# PARAMETERS

**--json**
> Output results in JSON format.

# DESCRIPTION

**bun audit** scans your project's dependencies defined in bun.lock for known security vulnerabilities. It queries the same vulnerability database used by npm audit (GitHub Advisory Database).

The command reports vulnerabilities categorized by severity: low, moderate, high, or critical. It checks direct dependencies, devDependencies, bundledDependencies, and optionalDependencies.

# CAVEATS

Only catches known, documented vulnerabilities. Does not detect zero-day exploits, malware, misconfigurations, or issues in deeply nested transitive dependencies. A clean audit report does not guarantee complete security.

# HISTORY

**bun audit** was introduced in Bun v1.2.15, providing npm audit-compatible security scanning for Bun projects.

# SEE ALSO

[bun](/man/bun)(1), [bun-install](/man/bun-install)(1), [npm-audit](/man/npm-audit)(1)
