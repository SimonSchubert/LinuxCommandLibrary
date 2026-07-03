# TAGLINE

npm supply chain behavioral threat scanner

# TLDR

**Scan a package for malicious patterns**

```npm-scan [package-name]```

**Scan a lockfile**

```npm-scan scan-lockfile```

**Export findings as JSON**

```npm-scan [package-name] --json > [findings.json]```

**Fail CI on critical findings**

```npm-scan scan-lockfile --fail-on critical```

# SYNOPSIS

**npm-scan** [_package_] [_options_]
**npm-scan** **scan-lockfile** [_options_]

# PARAMETERS

**scan-lockfile**
> Analyze dependencies in the current project lockfile.

**--json**
> Output findings as JSON.

**--fail-on** _SEVERITY_
> Exit with non-zero status when findings meet or exceed the given severity.

**scan**
> Explicit scan subcommand (used with **npx @lateos/npm-scan scan**).

# DESCRIPTION

**npm-scan** is a CLI supply-chain security tool for the npm ecosystem. It combines static and behavioral analysis to detect attack patterns that **npm audit**, Snyk, and Socket often miss: obfuscated payloads, credential stealers, eBPF rootkits, memory extraction, GitHub author spoofing, AI-platform key targeting, and worm-like propagation via stolen tokens.

The tool ships 23 detectors validated against real campaigns (IronWorm, Miasma, dependency confusion). It runs entirely locally with no telemetry or cloud dependency, supports policy-as-code YAML allowlists, and exports CycloneDX, SPDX, and SARIF formats. A GitHub Action is available for CI/CD integration.

Free for individuals and open-source evaluation; commercial production use requires a BLA license.

# CAVEATS

Behavioral detection may produce false positives on legitimate packages with unusual install scripts. Complement **npm audit** rather than replacing it — together they cover CVE databases and behavioral threats.

# SEE ALSO

[npm-audit](/man/npm-audit)(1), [socket](/man/socket)(1), [snyk](/man/snyk)(1)

# RESOURCES

```[Source code](https://github.com/lateos-ai/npm-scan)```

```[Homepage](https://lateos.ai/npm-scan)```

<!-- verified: 2026-07-03 -->