# TLDR

**Scan the current project** for vulnerable dependencies

```safety scan```

**Check a requirements file** for known vulnerabilities

```safety check -r [requirements.txt]```

**Scan and output results as JSON**

```safety scan --output json```

**Generate an SBOM** (Software Bill of Materials)

```safety scan --output sbom```

**Check installed packages** in the current environment

```safety check```

**Show detailed vulnerability information**

```safety check -r [requirements.txt] --full-report```

# SYNOPSIS

**safety** [_command_] [_options_]

# PARAMETERS

**scan**
> Scan a Python project for dependency vulnerabilities and malicious packages

**check**
> Check Python dependencies for known security vulnerabilities

**-r**, **--requirements** _FILE_
> Path to requirements file to check

**--output** _FORMAT_
> Output format: text, json, sbom, or html

**--full-report**
> Display full vulnerability report with remediation details

**--key** _API_KEY_
> Use a Safety API key for access to the full vulnerability database

**--help**
> Display help information

# DESCRIPTION

**Safety** is a Python dependency vulnerability scanner that checks packages against Safety DB, a database of known security vulnerabilities. It identifies vulnerable and malicious packages in development environments, CI/CD pipelines, and production systems.

The tool scans requirements files, project directories, or the entire Python environment. It provides detailed vulnerability information with CVE references and suggests secure package versions for remediation.

Safety supports multiple output formats including plain text, JSON, HTML, and SBOM (Software Bill of Materials) for integration with security workflows and compliance requirements.

# CAVEATS

The free version uses a vulnerability database updated monthly. The full database with 3x more vulnerabilities requires a paid subscription. Safety CLI 3 requires Python 3.9 or higher; older Python versions must use the Docker image.

# HISTORY

Safety was developed by **PyUp.io** as an open-source tool to improve Python supply chain security. The project maintains Safety DB, one of the most comprehensive Python vulnerability databases. Version 3.0 introduced expanded scanning capabilities and SBOM support.

# SEE ALSO

[pip-audit](/man/pip-audit)(1), [pip](/man/pip)(1), [bandit](/man/bandit)(1), [pipenv](/man/pipenv)(1)
