# TAGLINE

Scan dependencies for known security vulnerabilities

# TLDR

**Audit dependencies** for known security vulnerabilities

```bun audit```

**Only report high and critical** vulnerabilities

```bun audit --audit-level=[high]```

**Audit only production dependencies**, skipping devDependencies

```bun audit --prod```

**Ignore advisories** by GHSA or numeric ID (repeat flag)

```bun audit --ignore [GHSA-xxxx-xxxx-xxxx] --ignore [1112918]```

**Upgrade vulnerable packages** within their allowed semver ranges

```bun audit fix```

**Preview the fix plan** without installing anything

```bun audit fix --dry-run```

**Fix across major versions**, rewriting your own package.json ranges

```bun audit fix --latest```

**Output raw JSON** from the registry (for CI parsing)

```bun audit --json```

# SYNOPSIS

**bun** **audit** [_options_]

**bun** **audit** **fix** [**--latest**] [**--dry-run**] [_options_]

# PARAMETERS

**--audit-level**=_level_
> Only report vulnerabilities of this severity or higher. Values: **low**, **moderate**, **high**, **critical**.

**-p**, **-P**, **--prod**, **--production**
> Only audit packages reachable through **dependencies**, **optionalDependencies**, or **peerDependencies**.

**--omit**=_type_
> Skip packages only reachable through the given dependency type: **dev**, **optional**, or **peer**. Repeatable. **--omit=dev** is the same as **--prod**.

**--ignore** _id_
> Ignore an advisory by GHSA ID or numeric advisory ID. Repeatable. CVE IDs are not part of the registry data and do not match.

**--json**
> Print the raw JSON response from the registry instead of the formatted report. The JSON is unfiltered; **--audit-level** and **--ignore** only affect the exit code. With **fix**, prints a JSON object describing the plan and result.

**fix**
> Upgrade each vulnerable package to the lowest non-vulnerable version that every dependent's range allows, then install and re-audit.

**--latest**
> (**fix**) Let ranges in your own **package.json**, catalogs, and **overrides** be rewritten so fixes can cross major versions.

**--dry-run**
> (**fix**) Print the fix plan without installing.

# DESCRIPTION

**bun audit** reads the package list from **bun.lock** (no **node_modules** required), sends it to the npm registry's advisory endpoint, and prints a report of any vulnerabilities returned, with severity, a short description, and a link to each advisory. Packages from a scoped registry are sent to that registry instead; if it has no advisory endpoint, they are listed as skipped.

Plain **bun audit** never modifies **package.json**, **bun.lock**, or **node_modules**. **bun audit fix** changes **bun.lock** and **node_modules**, and only rewrites **package.json** where an exact pin (dependency, catalog entry, or **overrides** rule) blocks a fix. Packages that cannot be fixed are reported as either blocked by a dependent's range or having no published fixed version.

# EXIT STATUS

**0**
> No vulnerabilities remain after applying **--audit-level** and **--ignore**.

**1**
> One or more vulnerabilities were reported, or the registry request failed or returned an unreadable response.

# CAVEATS

Only catches known, documented advisories. Does not detect zero-day exploits, malware, misconfigurations, or supply-chain attacks not yet reported. A clean audit does not guarantee security. Requires **bun.lock**, so run **bun install** first. The filtering options are CLI-only; to apply them on every run, put them in a **package.json** script. **bun audit fix** rejects **--prod**, **--frozen-lockfile**, and **--no-save**, since it must write **bun.lock**.

# HISTORY

**bun audit** was introduced in **Bun v1.2.15** (2025), providing **npm audit**-compatible security scanning for projects using the Bun package manager. **bun audit fix** was added in 2026 as part of a round of pnpm-parity package manager features.

# SEE ALSO

[bun](/man/bun)(1), [bun-install](/man/bun-install)(1), [bun-update](/man/bun-update)(1), [npm-audit](/man/npm-audit)(1), [snyk](/man/snyk)(1)

# RESOURCES

```[Source code](https://github.com/oven-sh/bun)```

```[Documentation](https://bun.com/docs/pm/cli/audit)```

<!-- verified: 2026-11-23 -->
