# TAGLINE

Multi-ecosystem package vulnerability checker

# TLDR

**Check a specific package version**

```deptrust check npm lodash 4.17.20```

**Check the latest version**

```deptrust check pypi requests latest```

**Output results as JSON**

```deptrust check --json cargo serde latest```

**Suggest the safest available version**

```deptrust suggest npm lodash```

**Compare two versions**

```deptrust compare npm lodash 4.17.20 4.17.21```

# SYNOPSIS

**deptrust** _command_ [_ecosystem_] [_package_] [_version_]

# PARAMETERS

**check**
> Query known vulnerabilities for a package version.

**suggest**
> Return the newest version with an **allow** recommendation.

**compare**
> Compare risk between two versions of the same package.

**version**
> Show the installed **deptrust** version.

**mcp**
> Start the MCP server for agent integrations.

**--json**
> Emit structured JSON output.

# DESCRIPTION

**deptrust** is a Go CLI that checks package versions for known vulnerabilities across npm, PyPI, crates.io, Go modules, RubyGems, NuGet, Maven, Packagist, pub.dev, CocoaPods, Hex.pm, Hackage, and GitHub Actions. It queries OSV and the GitHub Advisory Database directly — no hosted deptrust service required.

Each check returns a **recommendation**: **block** (critical/high), **review** (medium/unknown or recent publish), or **allow** (no blocking vulnerabilities found). **allow** does not prove a package is safe. JSON output includes advisory coverage, risk score, vulnerability details, and provider errors.

Also runs as a local MCP server and integrates with Codex and Claude Code via install hooks that vet package commands before they execute.

# CAVEATS

Provider coverage varies by ecosystem; partial or missing coverage returns **unknown**, which should not be treated as safe. GitHub Actions branch refs and major-only tags add review signals even when technically valid.

# SEE ALSO

[npm-audit](/man/npm-audit)(1), [osv-scanner](/man/osv-scanner)(1), [snyk](/man/snyk)(1)

# RESOURCES

```[Source code](https://github.com/clidey/deptrust)```

<!-- verified: 2026-07-11 -->