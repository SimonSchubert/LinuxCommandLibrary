# TAGLINE

Scan dependencies for known security vulnerabilities

# TLDR

**Audit dependencies** for security vulnerabilities

```bun audit```

**Only report high and critical** vulnerabilities

```bun audit --audit-level=high```

**Audit only production dependencies**

```bun audit --prod```

**Ignore a specific vulnerability** by CVE ID

```bun audit --ignore [CVE-2023-12345]```

**Output audit results** in JSON format

```bun audit --json```

# SYNOPSIS

**bun** **audit** [_options_]

# PARAMETERS

**--json**
> Output results in JSON format

**--audit-level**=_level_
> Minimum severity to report: low, moderate, high, or critical

**--prod**
> Only audit production dependencies, ignoring devDependencies

**--ignore** _CVE_
> Ignore a specific vulnerability by CVE ID (can be specified multiple times)

# DESCRIPTION

**bun audit** scans your project's dependencies defined in bun.lock for known security vulnerabilities. It queries the same vulnerability database used by npm audit (GitHub Advisory Database).

The command reports vulnerabilities categorized by severity: low, moderate, high, or critical. It checks direct dependencies, devDependencies, bundledDependencies, and optionalDependencies.

# CAVEATS

Only catches known, documented vulnerabilities. Does not detect zero-day exploits, malware, misconfigurations, or issues in deeply nested transitive dependencies. A clean audit report does not guarantee complete security. Requires a bun.lock file to be present.

# HISTORY

**bun audit** was introduced in Bun v1.2.15, providing npm audit-compatible security scanning for Bun projects.

# SEE ALSO

[bun](/man/bun)(1), [bun-install](/man/bun-install)(1), [npm-audit](/man/npm-audit)(1)
