# TAGLINE

Scan dependencies for known security vulnerabilities

# TLDR

**Audit dependencies** for known security vulnerabilities

```bun audit```

**Only report high and critical** vulnerabilities

```bun audit --audit-level=[high]```

**Audit only production dependencies**, skipping devDependencies

```bun audit --prod```

**Ignore one or more vulnerabilities** by CVE ID (repeat flag)

```bun audit --ignore [CVE-2023-12345] --ignore [CVE-2023-67890]```

**Output raw JSON** from the registry (for CI parsing)

```bun audit --json```

# SYNOPSIS

**bun** **audit** [_options_]

# PARAMETERS

**--audit-level**=_level_
> Only report vulnerabilities of this severity or higher. Values: **low**, **moderate**, **high**, **critical**.

**--prod**
> Audit only production dependencies, ignoring **devDependencies**.

**--ignore** _CVE_
> Ignore a specific CVE. Can be repeated to ignore multiple advisories.

**--json**
> Print the raw JSON response from the npm registry instead of the formatted report.

# DESCRIPTION

**bun audit** sends the list of installed packages and versions (resolved from **bun.lock**) to the npm registry and prints a report of any vulnerabilities returned. The registry cross-references the GitHub Advisory Database, so coverage matches what **npm audit** would report.

The command categorizes findings by severity (**low**, **moderate**, **high**, **critical**) and covers direct dependencies, **devDependencies**, **bundledDependencies**, and **optionalDependencies**.

# EXIT STATUS

**0**
> No vulnerabilities were found.

**1**
> One or more vulnerabilities were reported.

# CAVEATS

Only catches known, documented advisories. Does not detect zero-day exploits, malware, misconfigurations, or supply-chain attacks not yet reported. A clean audit does not guarantee security. Requires **bun.lock** to be present, so run **bun install** first. Unlike **npm audit fix**, **bun audit** currently has no automatic fix mode - you must bump versions manually.

# HISTORY

**bun audit** was introduced in **Bun v1.2.15** (mid 2025), providing **npm audit**-compatible security scanning for projects using the Bun package manager.

# SEE ALSO

[bun](/man/bun)(1), [bun-install](/man/bun-install)(1), [npm-audit](/man/npm-audit)(1), [snyk](/man/snyk)(1)
