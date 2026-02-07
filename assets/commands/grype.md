# TAGLINE

vulnerability scanner for container images and filesystems

# TLDR

**Scan container image**

```grype [image:tag]```

**Scan directory**

```grype dir:[path]```

**Scan SBOM file**

```grype sbom:[sbom.json]```

**Output in JSON**

```grype [image] -o json```

**Only show high/critical**

```grype [image] --only-fixed --fail-on high```

**Scan with specific database**

```grype [image] --db-cache-dir [path]```

# SYNOPSIS

**grype** [_options_] _source_

# PARAMETERS

**-o**, **--output** _format_
> Output format (table, json, cyclonedx, sarif).

**--only-fixed**
> Show only vulnerabilities with fixes.

**--fail-on** _severity_
> Fail if vulnerability at severity found.

**--add-cpes-if-none**
> Generate CPEs if missing.

**-q**, **--quiet**
> Suppress output.

**--by-cve**
> Group by CVE.

**--db** _location_
> Database location.

**--exclude** _glob_
> Exclude paths.

# DESCRIPTION

**grype** is a vulnerability scanner for container images and filesystems. It identifies known security vulnerabilities in packages and dependencies by comparing against vulnerability databases.

The tool integrates with CI/CD pipelines and produces reports in various formats. It works with the same sources as Syft for comprehensive software composition analysis.

# SOURCE TYPES

**image**: Container image
**dir:**: Local directory
**file:**: Single file
**sbom:**: SBOM file
**registry:**: Remote registry

# CAVEATS

Database updates needed regularly. False positives possible. Coverage depends on ecosystem. Large images scan slowly.

# HISTORY

**grype** was created by **Anchore** as part of their open source security tooling alongside Syft. It emerged around **2020** to address container security scanning needs with a focus on accuracy and integration.

# SEE ALSO

[syft](/man/syft)(1), [trivy](/man/trivy)(1), [snyk](/man/snyk)(1), [clair](/man/clair)(1)
