# TLDR

**Run a scan with default settings**

```cloudsploit scan```

**Scan specific cloud provider**

```cloudsploit scan --cloud [aws|azure|gcp|oracle]```

**Scan with specific compliance framework**

```cloudsploit scan --compliance [hipaa|pci|cis]```

**Output results as JSON**

```cloudsploit scan --json [output.json]```

**Run specific plugin only**

```cloudsploit scan --plugin [pluginName]```

**Scan with custom config file**

```cloudsploit scan --config [config.js]```

# SYNOPSIS

**cloudsploit** _command_ [_options_]

# PARAMETERS

**scan**
> Run security scan against cloud infrastructure.

**--cloud** _provider_
> Target cloud provider: aws, azure, gcp, oracle.

**--compliance** _framework_
> Check against compliance framework (hipaa, pci, cis).

**--plugin** _name_
> Run only specified plugin.

**--json** _file_
> Output results in JSON format.

**--csv** _file_
> Output results in CSV format.

**--config** _file_
> Use custom configuration file.

**--suppress** _plugins_
> Suppress specific plugins from results.

**--remediate**
> Attempt automatic remediation (where supported).

# DESCRIPTION

**CloudSploit** is an open-source cloud security scanner that detects security risks and misconfigurations across AWS, Azure, GCP, and Oracle Cloud. It checks for hundreds of security issues including public S3 buckets, overly permissive IAM policies, unencrypted databases, and exposed services.

The tool runs plugins that query cloud APIs to assess configuration against security best practices. Results are categorized by severity (OK, WARN, FAIL, UNKNOWN) with descriptions and remediation guidance.

CloudSploit supports compliance mapping to frameworks like CIS Benchmarks, PCI-DSS, and HIPAA, helping organizations meet regulatory requirements. It can be integrated into CI/CD pipelines for continuous security monitoring.

# CAVEATS

Requires appropriate cloud credentials with read permissions. Scanning large environments may take significant time and incur API costs. Some checks require specific permissions that may not be available in restricted accounts. Automated remediation should be tested in non-production first.

# HISTORY

CloudSploit was created by **Aqua Security** (originally CloudSploit Inc., acquired in 2019) as an open-source cloud security posture management tool. First released around **2015**, it grew to support multiple cloud providers and became one of the foundational tools in the cloud security space. Aqua continues to maintain the open-source version while offering a commercial SaaS platform.

# SEE ALSO

[prowler](/man/prowler)(1), [scout-suite](/man/scout-suite)(1), [steampipe](/man/steampipe)(1)
