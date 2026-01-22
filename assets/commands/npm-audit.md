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

```npm audit --production```

**Set audit level**

```npm audit --audit-level=[high]```

# SYNOPSIS

**npm** **audit** [_options_]

# PARAMETERS

**fix**
> Automatically fix issues.

**--force**
> Force updates (may break).

**--json**
> JSON output format.

**--production**
> Production deps only.

**--audit-level** _LEVEL_
> Minimum severity.

**--help**
> Display help information.

# DESCRIPTION

**npm audit** scans for security vulnerabilities. Checks packages against known issues.

The command reports security advisories. Can automatically fix some issues.

npm audit checks security.

# CAVEATS

Requires network. May suggest breaking updates. Review before force fixing.

# HISTORY

npm audit was added to **npm 6** to provide automated security vulnerability scanning.

# SEE ALSO

[npm](/man/npm)(1), [npm-fund](/man/npm-fund)(1), [snyk](/man/snyk)(1)

