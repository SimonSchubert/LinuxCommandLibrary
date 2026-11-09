# TAGLINE

Open-source cloud security posture management scanner

# TLDR

**Run a scan** from a checkout of the repository

```./index.js --config [config.js]```

**Scan a specific cloud provider**

```./index.js --config [config.js] --cloud [aws]```

**Scan with a specific compliance framework**

```./index.js --config [config.js] --compliance [hipaa]```

**Save results as JSON** and hide passing checks

```./index.js --config [config.js] --json [output.json] --ignore-ok```

**Run a specific plugin only**

```./index.js --config [config.js] --plugin [acmValidation]```

**Fail a CI job** when non-passing results are found

```./index.js --config [config.js] --console [none] --exit-code```

**Output results as CSV**

```./index.js --config [config.js] --csv [output.csv]```

**Run in Docker** with AWS credentials

```docker run -e AWS_ACCESS_KEY_ID=[key] -e AWS_SECRET_ACCESS_KEY=[secret] [cloudsploit:0.0.1] --compliance=pci```

# SYNOPSIS

**./index.js** [_options_]

**cloudsploit-scan** [_options_]

# PARAMETERS

**--config** _file_
> Configuration file containing cloud credentials (see config_example.js). If omitted, the default AWS credential chain is used.

**--cloud** _provider_
> Cloud to run plugins for: aws, azure, github, google, oracle, or alibaba. If omitted, it is derived from the config file. Repeatable.

**--compliance** _program_
> Only return results applicable to hipaa, pci, cis, cis1, or cis2. **cis** runs both Level 1 and Level 2 controls. Repeatable.

**--plugin** _name_
> Run only the specified plugin (see exports.js), e.g. acmValidation.

**--json** _file_
> Write results as JSON to the specified file.

**--csv** _file_
> Write results as CSV to the specified file.

**--junit** _file_
> Write results as JUnit XML to the specified file.

**--collection** _file_
> Write the full collection of raw cloud API data as JSON.

**--console** _format_
> Console output format: none, text, or table (default).

**--ignore-ok**
> Ignore passing (OK) results.

**--exit-code**
> Exit with a non-zero status if non-passing results are found.

**--suppress** _pattern_
> Suppress results matching a regular expression in the form pluginId:region:resourceId. Repeatable.

**--remediate** _plugin_
> Run remediation for the provided plugin. Repeatable.

**--govcloud**
> AWS only: enable GovCloud mode.

**--china**
> AWS only: enable AWS China mode.

**--skip-paginate**
> AWS only: skip pagination (for debugging).

**-h**, **--help**
> Show the help message.

# DESCRIPTION

**CloudSploit** is an open-source cloud security scanner that detects security risks and misconfigurations across AWS, Azure, Google Cloud, Oracle Cloud, Alibaba Cloud, and GitHub. It checks for hundreds of security issues including public S3 buckets, overly permissive IAM policies, unencrypted databases, and exposed services.

The tool operates in two phases: a collection phase that queries cloud APIs to gather infrastructure metadata, and a scanning phase that analyzes the data to identify misconfigurations and security risks. Results are categorized by status (OK, WARN, FAIL, UNKNOWN) with descriptions and remediation guidance.

CloudSploit supports compliance mapping to frameworks like CIS Benchmarks, PCI-DSS, and HIPAA, helping organizations meet regulatory requirements. It can be integrated into CI/CD pipelines for continuous security monitoring.

CloudSploit is normally run from a checkout of the repository after **npm install**. There is no **scan** subcommand; the package installs its entry point as **cloudsploit-scan**.

# CAVEATS

Requires appropriate cloud credentials with read permissions, configured in a config file or, for AWS, the default credential chain. Scanning large environments may take significant time and incur API costs. Some checks require specific permissions that may not be available in restricted accounts. Automated remediation needs separately configured write credentials and should be tested in non-production environments first.

# HISTORY

CloudSploit was originally created by **CloudSploit Inc.**, which was acquired by **Aqua Security** in **2019**. First released around **2015**, it grew to support multiple cloud providers and became one of the foundational open-source tools in the cloud security posture management (CSPM) space. Aqua continues to maintain the open-source version while offering a commercial SaaS platform.

# SEE ALSO

[prowler](/man/prowler)(1)

# RESOURCES

```[Source code](https://github.com/aquasecurity/cloudsploit)```

<!-- verified: 2026-11-09 -->
