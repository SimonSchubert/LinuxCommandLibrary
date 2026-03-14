# TAGLINE

Scan dependencies for known vulnerabilities using the OSV database

# TLDR

**Scan a directory recursively**

```osv-scanner scan -r [directory]```

**Scan a specific lockfile**

```osv-scanner scan --lockfile [package-lock.json]```

**Scan an SBOM file**

```osv-scanner scan --sbom [sbom.json]```

**Output results as JSON**

```osv-scanner scan -r [directory] --format json```

**Scan a Docker image**

```osv-scanner scan --docker [image:tag]```

**Scan and generate a guided remediation report**

```osv-scanner fix -r [directory]```

# SYNOPSIS

**osv-scanner** _command_ [_options_] [_targets_]

# PARAMETERS

**scan**
> Scan dependencies for vulnerabilities.

**fix**
> Generate guided remediation suggestions.

**-r**, **--recursive** _DIR_
> Scan directory recursively for lockfiles and manifests.

**--lockfile** _FILE_
> Scan a specific lockfile (auto-detects ecosystem).

**--sbom** _FILE_
> Scan an SBOM file (supports SPDX and CycloneDX).

**--docker** _IMAGE_
> Scan a Docker image for vulnerabilities.

**--format** _FORMAT_
> Output format: table (default), json, markdown, sarif.

**--config** _FILE_
> Path to osv-scanner.toml configuration file.

**--call-analysis**
> Enable call graph analysis to filter unreachable vulnerabilities (Go, Rust).

**--no-ignore**
> Do not respect ignore entries in the config file.

**--verbosity** _LEVEL_
> Set verbosity level: error, warn, info, verbose.

**--help**
> Display help information.

# DESCRIPTION

**osv-scanner** scans project dependencies for known vulnerabilities by querying the **OSV.dev** database, which aggregates vulnerability data from multiple sources including GitHub Advisory Database, PyPI, RubyGems, and crates.io.

The tool automatically detects and parses lockfiles from most major package ecosystems including npm, pip, Go modules, Cargo, Maven, NuGet, and more. It can also scan SBOM files in SPDX or CycloneDX formats and Docker container images.

The **fix** subcommand provides guided remediation by suggesting version upgrades that resolve detected vulnerabilities while minimizing breaking changes.

Call graph analysis (supported for Go and Rust) can reduce false positives by determining whether vulnerable code paths are actually reachable from the project.

# CAVEATS

Requires network access to query the OSV.dev database. Vulnerability coverage depends on data submitted to OSV by various ecosystems. Call graph analysis is only available for Go and Rust projects.

# HISTORY

osv-scanner was released by **Google** in **December 2022** as a frontend for the OSV.dev vulnerability database. It was designed to provide a free, open-source alternative for dependency scanning. The **fix** subcommand for guided remediation was added in 2024.

# SEE ALSO

[npm-audit](/man/npm-audit)(1), [trivy](/man/trivy)(1), [grype](/man/grype)(1), [snyk](/man/snyk)(1)

