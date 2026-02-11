# TAGLINE

AWS cloud security assessment

# TLDR

**Run AWS security assessment**

```prowler aws```

**Run specific checks**

```prowler aws --checks [iam_password_policy] [s3_bucket_public_access]```

**Run with compliance framework**

```prowler aws --compliance [cis_2.0_aws]```

**Output to file**

```prowler aws -M json -o [results/]```

# SYNOPSIS

**prowler aws** [_options_]

# PARAMETERS

**--checks** _checks_
> Specific checks to run.

**--services** _services_
> Services to check (iam, s3, ec2, etc.).

**--compliance** _framework_
> Compliance framework (cis, gdpr, hipaa, etc.).

**-M**, **--output-modes** _format_
> Output format (json, csv, html).

**-o**, **--output-directory** _dir_
> Output directory.

**--profile** _name_
> AWS profile.

**--region** _region_
> AWS region.

# DESCRIPTION

**prowler aws** performs security assessment of AWS accounts. Checks configuration against best practices and compliance frameworks. Identifies misconfigurations, vulnerabilities, and compliance gaps.

# SEE ALSO

[prowler](/man/prowler)(1), [aws](/man/aws)(1)

