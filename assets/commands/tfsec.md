# TAGLINE

Terraform static security scanner

# TLDR

**Scan the current directory** for security issues

```tfsec```

**Scan a specific directory**

```tfsec [path/to/terraform]```

**Output results in JSON format**

```tfsec --format json```

**Exclude specific checks** from the scan

```tfsec -e [check1,check2]```

**Scan with a specific tfvars file**

```tfsec --tfvars-file [terraform.tfvars]```

**Only show high severity issues**

```tfsec --minimum-severity HIGH```

**Save results to a file**

```tfsec --format json --out [results.json]```

**Exclude directories** from the scan

```tfsec --exclude-path [path/to/exclude]```

# SYNOPSIS

**tfsec** [_options_] [_directory_]

# PARAMETERS

**--format** _format_
> Output format: **default**, **json**, **csv**, **checkstyle**, **sarif**, **junit**, **gif**, or **text**.

**--out** _file_
> Write results to a file instead of stdout.

**-e**, **--exclude** _checks_
> Comma-separated list of check IDs to exclude from the scan.

**--exclude-path** _path_
> Exclude specific directories from scanning.

**--minimum-severity** _level_
> Filter results by minimum severity: **LOW**, **MEDIUM**, **HIGH**, or **CRITICAL**.

**--tfvars-file** _file_
> Include variable values from a tfvars file in the scan.

**--config-file** _file_
> Use a custom configuration file (default: tfsec-config.json).

**--no-colour**, **--no-color**
> Disable colored output (useful for CI pipelines).

**--soft-fail**
> Exit with code 0 even if issues are found.

**--include-ignored**
> Include results that have been marked as ignored.

**--include-passed**
> Include checks that passed in the output.

**--version**
> Display version information and exit.

**-h**, **--help**
> Display help message and exit.

# DESCRIPTION

**tfsec** is a static analysis security scanner for Terraform code. It analyzes Terraform files to detect potential security misconfigurations, policy violations, and best practice issues before infrastructure is deployed.

The scanner runs locally and in CI/CD pipelines, providing developer-friendly output with documented checks. It supports multiple output formats for integration with various tools and platforms. Issues are categorized by severity to help prioritize remediation efforts.

tfsec can be configured via command-line flags, configuration files, or environment variables (prefixed with **TFSEC_**). Inline comments can also be used to ignore specific warnings in Terraform files.

# CAVEATS

tfsec is being deprecated and merged into **Trivy**. For new projects, consider using **trivy config** instead. Existing tfsec users should plan migration to Trivy for continued updates and support.

# HISTORY

tfsec was created by **Liam Galvin** and released in **2019** as an open-source Terraform security scanner. It was later acquired by **Aqua Security** in **2021** and became part of their open-source security tooling portfolio. In **2023**, Aqua announced that tfsec would be merged into their comprehensive security scanner **Trivy**, with tfsec entering maintenance mode.

# SEE ALSO

[trivy](/man/trivy)(1), [terraform](/man/terraform)(1), [checkov](/man/checkov)(1), [terrascan](/man/terrascan)(1)
