# TAGLINE

Multi-cloud security assessment tool

# TLDR

**Run AWS security audit**

```prowler aws```

**Scan specific services**

```prowler aws --services [s3] [iam] [ec2]```

**Output to file**

```prowler aws -M json -o [report.json]```

**Use specific profile**

```prowler aws -p [profile_name]```

**Scan Azure**

```prowler azure```

**Scan GCP**

```prowler gcp```

**Run specific checks**

```prowler aws -c [check11] [check12]```

# SYNOPSIS

**prowler** _provider_ [_--services list_] [_-M format_] [_options_]

# PARAMETERS

**aws**
> Audit AWS account.

**azure**
> Audit Azure subscription.

**gcp**
> Audit GCP project.

**--services** _LIST_
> Services to audit.

**-c**, **--checks** _LIST_
> Specific checks.

**-p**, **--profile** _NAME_
> AWS profile.

**-M**, **--output-modes** _FORMAT_
> Output format.

**-o**, **--output-filename** _FILE_
> Output file.

**--severity** _LEVEL_
> Filter by severity.

# DESCRIPTION

**prowler** performs automated security assessments on cloud environments by running hundreds of checks against CIS benchmarks, compliance frameworks (GDPR, HIPAA, PCI-DSS), and provider-specific best practices. It supports AWS, Azure, GCP, Kubernetes, GitHub, and Microsoft 365, adapting its checks to each platform's security model.

Scans can be targeted to specific services, individual checks, or severity levels to focus on the most critical findings. Output is available in JSON, CSV, and HTML formats for integration with security dashboards and CI/CD pipelines.

The tool requires read-only credentials for the target environment and uses the provider's standard authentication (AWS profiles, Azure service principals, GCP service accounts).

# CAVEATS

Requires cloud credentials with read access. Large accounts may take time. Some checks need specific permissions.

# HISTORY

**Prowler** was created by **Toni de la Fuente** for AWS security auditing. It has grown to support multiple cloud providers and compliance frameworks.

# SEE ALSO

[aws-cli](/man/aws-cli)(1), [scout](/man/scout)(1), [cloudsploit](/man/cloudsploit)(1)
