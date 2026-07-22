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
> Add overrides to **package.json** that pin vulnerable transitive dependencies to safe versions.

**--json**
> Output the audit report as JSON.

**-P**, **--prod**
> Audit only production dependencies (skip _devDependencies_).

**-D**, **--dev**
> Audit only development dependencies.

**--no-optional**
> Skip optional dependencies during the audit.

**--audit-level** _LEVEL_
> Minimum severity to report: _low_, _moderate_, _high_, or _critical_ (default: _low_).

**--ignore** _CVE_
> Suppress reporting for a specific advisory by its identifier.

**--ignore-unfixable**
> Skip advisories that have no available patch.

**--ignore-registry-errors**
> Exit with code 0 when the registry returns a non-200 status, only failing if real vulnerabilities are found.

# DESCRIPTION

**pnpm audit** scans project dependencies for known security vulnerabilities using the npm advisory database. It reports affected packages, severity levels, and available patched versions.

The **--fix** option attempts to automatically update vulnerable packages to safe versions. Use **--prod** or **--dev** to limit scanning to production or development dependencies respectively. The **--audit-level** option sets the minimum severity threshold for reporting (low, moderate, high, critical).

# CAVEATS

Requires network access. Uses npm advisory database.

# HISTORY

pnpm audit was added for **security vulnerability** scanning in dependencies.

# INSTALL

```dnf: sudo dnf install pnpm```

```pacman: sudo pacman -S pnpm```

```apk: sudo apk add pnpm```

```zypper: sudo zypper install pnpm```

```brew: brew install pnpm```

```nix: nix profile install nixpkgs#pnpm```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pnpm](/man/pnpm)(1), [npm-audit](/man/npm-audit)(1)

