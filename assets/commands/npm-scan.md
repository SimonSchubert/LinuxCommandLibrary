# TAGLINE

Supply chain security scanner for npm packages

# TLDR

**Scan a single package** before installing it

```npm-scan [package_name]```

**Scan the project lockfile** and all resolved dependencies

```npm-scan scan-lockfile```

**Export findings as JSON** for further processing

```npm-scan [package_name] --json```

**Fail a CI pipeline** when a critical threat is found

```npm-scan scan-lockfile --fail-on critical```

**Install globally** with npm

```npm install -g @lateos/npm-scan```

# SYNOPSIS

**npm-scan** [_package_name_ | **scan-lockfile**] [_options_]

# DESCRIPTION

**npm-scan** is a command-line supply chain security scanner for the npm ecosystem. It combines static and behavioral analysis to flag malicious behavior in packages that signature-based tools miss, including obfuscated code, credential and token exfiltration, kernel-level attacks, and worm-like self-propagation.

The tool can inspect an individual package by name before it is installed, or audit every dependency resolved in a project's lockfile with the **scan-lockfile** subcommand. Analysis runs locally without telemetry, which makes it suitable for offline use and for gating untrusted dependencies.

npm-scan is designed to slot into CI/CD pipelines: it can emit machine-readable JSON and return a non-zero exit status when a finding meets a chosen severity threshold, so a build can be blocked automatically.

# PARAMETERS

**scan-lockfile**

> Scan all dependencies pinned in the project lockfile rather than a single named package.

**--json**

> Print findings as JSON instead of the human-readable report, suitable for piping into other tools.

**--fail-on** _SEVERITY_

> Exit with a non-zero status when a finding at or above _SEVERITY_ (for example **critical**) is detected. Use this to break a CI build on dangerous dependencies.

# CAVEATS

Detection is heuristic, so results can include false positives and false negatives, treat them as signals rather than proof. npm-scan is dual-licensed: **MIT** for individuals, open-source projects, and evaluation, with a separate paid Business License Agreement required for commercial production use.

# SEE ALSO

[npm-audit](/man/npm-audit)(1), [osv-scanner](/man/osv-scanner)(1), [trivy](/man/trivy)(1), [npm](/man/npm)(1)

# RESOURCES

```[Source code](https://github.com/lateos-ai/npm-scan)```

```[Homepage](https://lateos.ai/npm-scan)```

<!-- verified: 2026-06-17 -->
