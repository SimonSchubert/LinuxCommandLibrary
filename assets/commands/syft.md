# TAGLINE

Generate software bill of materials from images

# TLDR

**Generate SBOM for container image**

```syft [alpine:latest]```

**Generate SBOM in JSON format**

```syft [alpine:latest] -o json```

**Generate CycloneDX format SBOM**

```syft [alpine:latest] -o cyclonedx-json```

**Generate SPDX format SBOM**

```syft [alpine:latest] -o spdx-json```

**Scan a local directory**

```syft dir:[/path/to/project]```

**Scan a Docker archive**

```syft docker-archive:[image.tar]```

**Output multiple formats**

```syft [image] -o spdx-json=[sbom.spdx.json] -o cyclonedx-json=[sbom.cdx.json]```

# SYNOPSIS

**syft** [_source_] [_options_]

**syft** _command_ [_options_]

# PARAMETERS

**-o**, **--output** _format_
> Output format: syft-table, syft-json, cyclonedx-json, cyclonedx-xml, spdx-json, spdx-tag-value, github-json.

**-s**, **--scope** _scope_
> Layer selection: squashed (default), all-layers, deep-squashed.

**--platform** _platform_
> Platform for container images (e.g., linux/arm64).

**--source-name** _name_
> Set name of target being analyzed.

**--source-version** _version_
> Set version of target being analyzed.

**-t**, **--template** _file_
> Path to Go template file for custom output.

**-q**, **--quiet**
> Suppress all logging output.

**-v**, **--verbose**
> Increase verbosity (-v = info, -vv = debug).

**--select-catalogers** _list_
> Add, remove, and filter catalogers.

**-c**, **--config** _file_
> Path to configuration file.

**-h**, **--help**
> Display help information.

**--version**
> Display version information.

# SOURCE TYPES

**docker:**_image_ - Use Docker daemon

**podman:**_image_ - Use Podman daemon

**registry:**_image_ - Pull from registry directly

**docker-archive:**_file_ - Docker save tarball

**oci-archive:**_file_ - OCI archive tarball

**oci-dir:**_path_ - OCI layout directory

**dir:**_path_ - Filesystem directory

**file:**_path_ - Single file

# DESCRIPTION

**syft** is a CLI tool for generating Software Bill of Materials (SBOM) from container images and filesystems. It identifies packages, libraries, and dependencies across multiple ecosystems.

Supported ecosystems include container images (Docker, OCI, Podman, Singularity), programming languages (Java, Python, JavaScript, Ruby, Go, Rust, .NET), and Linux distributions (Alpine, Debian, RHEL, and more).

Output formats include industry standards like CycloneDX and SPDX for compliance requirements, as well as native formats for integration with Anchore tools. Generated SBOMs can be used with vulnerability scanners like Grype.

# CAVEATS

Accuracy depends on package metadata quality in images. Some dynamically linked or vendored dependencies may not be detected. Large images take significant time to scan. Registry authentication may be required for private images.

# HISTORY

**syft** was created by Anchore as an open-source SBOM generation tool. It addresses growing supply chain security requirements and software transparency regulations. The tool supports multiple SBOM standards to meet compliance needs across different industries.

# SEE ALSO

[grype](/man/grype)(1), [docker](/man/docker)(1), [trivy](/man/trivy)(1), [cosign](/man/cosign)(1)
