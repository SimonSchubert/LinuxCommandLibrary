# TLDR

**Scan a container image** for vulnerabilities

```trivy image [image_name:tag]```

**Scan the local filesystem**

```trivy fs [path/to/directory]```

**Scan a git repository**

```trivy repo [https://github.com/user/repo]```

**Scan configuration files** (Terraform, Kubernetes, etc.)

```trivy config [path/to/configs]```

**Output results in JSON format**

```trivy image --format json [image_name]```

**Only show critical and high vulnerabilities**

```trivy image --severity CRITICAL,HIGH [image_name]```

**Ignore unfixed vulnerabilities**

```trivy image --ignore-unfixed [image_name]```

**Scan and generate SBOM**

```trivy image --format cyclonedx [image_name]```

# SYNOPSIS

**trivy** [_global options_] _command_ [_command options_] _target_

# PARAMETERS

**image**, **i**
> Scan a container image for vulnerabilities.

**filesystem**, **fs**
> Scan a local filesystem or directory.

**repository**, **repo**
> Scan a remote git repository.

**config**, **conf**
> Scan configuration files for misconfigurations.

**kubernetes**, **k8s**
> Scan a Kubernetes cluster.

**rootfs**
> Scan a root filesystem (e.g., extracted container image).

**sbom**
> Scan an SBOM file for vulnerabilities.

**server**, **s**
> Run Trivy in server mode.

**plugin**, **p**
> Manage Trivy plugins.

**--severity** _levels_
> Comma-separated list of severity levels to show: **UNKNOWN**, **LOW**, **MEDIUM**, **HIGH**, **CRITICAL**.

**--format** _format_
> Output format: **table**, **json**, **sarif**, **template**, **cyclonedx**, **spdx**, **spdx-json**, **github**.

**--output** _file_
> Write results to a file.

**--ignore-unfixed**
> Only show vulnerabilities that have a fix available.

**--pkg-types** _types_
> Comma-separated list of package types to scan.

**--scanners** _scanners_
> Comma-separated list of scanners: **vuln**, **misconfig**, **secret**, **license**.

**--cache-dir** _dir_
> Specify cache directory for database.

**-q**, **--quiet**
> Suppress progress bar and log output.

**-d**, **--debug**
> Enable debug mode.

**-v**, **--version**
> Display version information.

**-h**, **--help**
> Display help message.

# DESCRIPTION

**Trivy** is a comprehensive security scanner developed by Aqua Security. It detects vulnerabilities in OS packages and application dependencies, infrastructure misconfigurations, exposed secrets, and software license issues.

Trivy supports multiple targets including container images, filesystems, git repositories, virtual machine images, and Kubernetes clusters. It integrates with CI/CD pipelines and can output results in various formats for different tools and platforms.

The vulnerability database is automatically downloaded and cached. Trivy can generate Software Bill of Materials (SBOM) in CycloneDX and SPDX formats, and can also scan existing SBOM files for known vulnerabilities.

# CAVEATS

The vulnerability database download requires internet access on first run. For air-gapped environments, the database can be pre-downloaded and specified via **--cache-dir** or hosted on a private OCI registry. Container image scanning requires a working container runtime or access to the registry.

# HISTORY

Trivy was created by **Teppei Fukuda** and first released in **2019** as a container vulnerability scanner. It was acquired by **Aqua Security** in **2019** and has since expanded to become a comprehensive security scanner. In **2023**, **tfsec** (Terraform security scanner) was merged into Trivy, consolidating Aqua's open-source security tools. Trivy has become one of the most widely adopted open-source vulnerability scanners.

# SEE ALSO

[docker](/man/docker)(1), [tfsec](/man/tfsec)(1), [grype](/man/grype)(1), [syft](/man/syft)(1), [snyk](/man/snyk)(1)
