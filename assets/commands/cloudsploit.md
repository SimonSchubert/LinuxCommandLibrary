# TAGLINE

Open-source cloud security posture management scanner

# TLDR

**Run a scan with default settings**

```cloudsploit scan```

**Scan a specific cloud provider**

```cloudsploit scan --cloud [aws]```

**Scan with a specific compliance framework**

```cloudsploit scan --compliance [hipaa]```

**Output results as JSON**

```cloudsploit scan --json [output.json]```

**Run a specific plugin only**

```cloudsploit scan --plugin [pluginName]```

**Scan with a custom config file**

```cloudsploit scan --config [config.js]```

**Output results as CSV**

```cloudsploit scan --csv [output.csv]```

# SYNOPSIS

**cloudsploit** _command_ [_options_]

# PARAMETERS

**scan**
> Run security scan against cloud infrastructure.

**--cloud** _provider_
> Target cloud provider: aws, azure, gcp, oracle.

**--compliance** _framework_
> Check against a compliance framework (hipaa, pci, cis). CIS runs both Level 1 and Level 2 controls.

**--plugin** _name_
> Run only the specified plugin.

**--json** _file_
> Output results in JSON format to the specified file.

**--csv** _file_
> Output results in CSV format to the specified file.

**--junit** _file_
> Output results in JUnit XML format.

**--config** _file_
> Use a custom configuration file for credentials and settings.

**--suppress** _plugins_
> Suppress specific plugins from results.

**--remediate** _plugins_
> Attempt automatic remediation for the specified plugins. Takes a comma-separated list of plugin names.

# DESCRIPTION

**CloudSploit** is an open-source cloud security scanner that detects security risks and misconfigurations across AWS, Azure, GCP, Oracle Cloud, and GitHub. It checks for hundreds of security issues including public S3 buckets, overly permissive IAM policies, unencrypted databases, and exposed services.

The tool operates in two phases: a collection phase that queries cloud APIs to gather infrastructure metadata, and a scanning phase that analyzes the data to identify misconfigurations and security risks. Results are categorized by severity (OK, WARN, FAIL, UNKNOWN) with descriptions and remediation guidance.

CloudSploit supports compliance mapping to frameworks like CIS Benchmarks, PCI-DSS, and HIPAA, helping organizations meet regulatory requirements. It can be integrated into CI/CD pipelines for continuous security monitoring.

# CAVEATS

Requires appropriate cloud credentials with read permissions configured in config.js or environment variables. Scanning large environments may take significant time and incur API costs. Some checks require specific permissions that may not be available in restricted accounts. Automated remediation should be tested in non-production environments first.

# HISTORY

CloudSploit was originally created by **CloudSploit Inc.**, which was acquired by **Aqua Security** in **2019**. First released around **2015**, it grew to support multiple cloud providers and became one of the foundational open-source tools in the cloud security posture management (CSPM) space. Aqua continues to maintain the open-source version while offering a commercial SaaS platform.

# SEE ALSO

[prowler](/man/prowler)(1)
