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

**prowler** performs security assessments on cloud environments. It checks against CIS benchmarks and best practices.

AWS scanning covers IAM, S3, EC2, RDS, and many services. Hundreds of security checks are included.

Multi-cloud support includes Azure and GCP. Similar checks adapted for each provider.

Output formats include JSON, CSV, and HTML. Reports integrate with security dashboards.

Severity filtering focuses on critical issues. Prioritize findings by risk level.

# CAVEATS

Requires cloud credentials with read access. Large accounts may take time. Some checks need specific permissions.

# HISTORY

**Prowler** was created by **Toni de la Fuente** for AWS security auditing. It has grown to support multiple cloud providers and compliance frameworks.

# SEE ALSO

[aws-cli](/man/aws-cli)(1), [scout](/man/scout)(1), [cloudsploit](/man/cloudsploit)(1)
