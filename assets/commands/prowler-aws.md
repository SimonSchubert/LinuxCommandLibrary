# TAGLINE

AWS cloud security assessment

# TLDR

**Run AWS security assessment**

```prowler aws```

**Run specific checks**

```prowler aws -c [iam_password_policy] [s3_bucket_public_access]```

**Run checks for specific services**

```prowler aws -s [s3] [iam]```

**Run with compliance framework**

```prowler aws --compliance [cis_2.0_aws]```

**Filter by severity**

```prowler aws --severity [critical] [high]```

**Output to file in JSON format**

```prowler aws -M json-ocsf -o [results/]```

**List all available checks**

```prowler aws -l```

# SYNOPSIS

**prowler aws** [_options_]

# PARAMETERS

**-c**, **--checks** _checks_
> Specific checks to run.

**-s**, **--services** _services_
> Services to check (iam, s3, ec2, etc.).

**-e**, **--excluded-checks** _checks_
> Exclude specific checks from execution.

**--excluded-services** _services_
> Exclude specific services from scanning.

**--compliance** _framework_
> Compliance framework (cis, gdpr, hipaa, etc.).

**--severity** _levels_
> Filter checks by severity (critical, high, medium, low, informational).

**-M**, **--output-modes** _format_
> Output format (csv, json-asff, json-ocsf, html).

**-o**, **--output-directory** _dir_
> Output directory.

**-l**, **--list-checks**
> List all available checks.

**--list-services**
> List all available services.

**-p**, **--profile** _name_
> AWS profile.

**-f**, **--filter-region** _region_
> AWS region(s) to scan.

**--security-hub**
> Send findings to AWS Security Hub.

# DESCRIPTION

**prowler aws** performs security assessment of AWS accounts. It checks configuration against best practices and compliance frameworks such as CIS, NIST 800, PCI-DSS, GDPR, HIPAA, and others. Identifies misconfigurations, vulnerabilities, and compliance gaps. Results can be output in multiple formats and optionally sent to AWS Security Hub.

# SEE ALSO

[prowler](/man/prowler)(1), [aws](/man/aws)(1)

