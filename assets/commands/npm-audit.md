# TAGLINE

scans for security vulnerabilities

# TLDR

**Audit dependencies**

```npm audit```

**Fix vulnerabilities**

```npm audit fix```

**Force fix (breaking changes)**

```npm audit fix --force```

**Output as JSON**

```npm audit --json```

**Audit production only**

```npm audit --omit=dev```

**Set minimum severity level**

```npm audit --audit-level=[high]```

**Dry run fix** (preview changes without applying)

```npm audit fix --dry-run```

# SYNOPSIS

**npm** **audit** [_options_]

# PARAMETERS

**fix**
> Automatically install compatible updates to fix vulnerabilities.

**--force**
> Force updates to latest version, even with breaking changes.

**--json**
> Output results in JSON format.

**--omit** _TYPE_
> Omit dependency type from audit (dev, optional, or peer). Replaces deprecated --production flag.

**--audit-level** _LEVEL_
> Minimum severity to trigger non-zero exit: low, moderate, high, critical.

**--dry-run**
> Preview what audit fix would change without applying.

**--package-lock-only**
> Only modify package-lock.json, skip node_modules updates.

**--parseable**
> Display vulnerabilities in parseable output format.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**npm audit** scans project dependencies for known security vulnerabilities by checking them against the npm advisory database. It reports the severity level (low, moderate, high, critical), the vulnerable package, and the dependency path.

The **npm audit fix** subcommand automatically installs compatible updates to resolve vulnerabilities. Using **--force** allows major version updates that may introduce breaking changes. The command exits with a non-zero code if vulnerabilities are found, making it suitable for CI/CD pipelines.

# CAVEATS

Requires network access to check the npm advisory database. The --force flag may install updates with breaking changes; always review with --dry-run first. The --production flag is deprecated in npm 8+; use --omit=dev instead.

# HISTORY

npm audit was introduced in **npm 6** (2018) to provide automated security vulnerability scanning. It replaced the third-party `nsp` (Node Security Platform) tool that npm acquired.

# SEE ALSO

[npm](/man/npm)(1), [npm-fund](/man/npm-fund)(1), [snyk](/man/snyk)(1)
