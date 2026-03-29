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

**Fail CI if high or critical vulnerabilities found**

```grype [image] --fail-on high```

**Show only vulnerabilities with available fixes**

```grype [image] --only-fixed```

**Scan and exclude specific paths**

```grype dir:[path] --exclude "[glob_pattern]"```

# SYNOPSIS

**grype** [_options_] _source_

# PARAMETERS

**-o**, **--output** _format_
> Report format (table, json, cyclonedx, cyclonedx-json, sarif, template).

**-f**, **--fail-on** _severity_
> Return exit code 2 if vulnerability found at severity level or higher (negligible, low, medium, high, critical).

**--only-fixed**
> Show only vulnerabilities with available fixes.

**--only-notfixed**
> Show only vulnerabilities without available fixes.

**--by-cve**
> Organize results by CVE rather than original vulnerability ID.

**--add-cpes-if-none**
> Generate CPEs for packages that lack them.

**-s**, **--scope** _scope_
> Layer analysis scope (squashed, all-layers).

**--exclude** _glob_
> Exclude paths matching the given glob pattern.

**--platform** _platform_
> Container platform specifier (e.g., linux/arm64).

**-q**, **--quiet**
> Suppress logging output.

**-v**, **--verbose**
> Increase verbosity (-v for info, -vv for debug).

**-c**, **--config** _file_
> Specify configuration file.

**--file** _path_
> Write report output to a file instead of stdout.

**--vex** _document_
> Apply VEX documents to filter results.

# DESCRIPTION

**grype** is a vulnerability scanner for container images and filesystems. It identifies known security vulnerabilities in packages and dependencies by comparing against vulnerability databases.

The tool integrates with CI/CD pipelines and produces reports in various formats. It works with the same sources as Syft for comprehensive software composition analysis.

# SOURCE TYPES

**image**: Container image (default)
**dir:**: Local directory
**file:**: Single file
**sbom:**: SBOM file (Syft, CycloneDX, SPDX)
**registry:**: Remote container registry

# CAVEATS

Database updates needed regularly. False positives possible. Coverage depends on ecosystem. Large images scan slowly.

# HISTORY

**grype** was created by **Anchore** as part of their open source security tooling alongside Syft. It emerged around **2020** to address container security scanning needs with a focus on accuracy and integration.

# SEE ALSO

[syft](/man/syft)(1), [trivy](/man/trivy)(1), [snyk](/man/snyk)(1)
