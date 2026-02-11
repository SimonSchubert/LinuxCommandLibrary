# TAGLINE

Find and fix security vulnerabilities

# TLDR

**Test project for vulnerabilities**

```snyk test```

**Test specific file**

```snyk test --file=[package.json]```

**Monitor project continuously**

```snyk monitor```

**Test container image**

```snyk container test [image:tag]```

**Test IaC files**

```snyk iac test [/path/to/terraform/]```

**Test code for issues**

```snyk code test```

**Authenticate**

```snyk auth```

**Ignore specific vulnerability**

```snyk ignore --id=[SNYK-JS-LODASH-567746]```

# SYNOPSIS

**snyk** _command_ [_--file file_] [_--severity-threshold level_] [_options_] [_target_]

# PARAMETERS

**test**
> Test project for vulnerabilities.

**monitor**
> Record project snapshot for monitoring.

**container test** _IMAGE_
> Test container image.

**container monitor** _IMAGE_
> Monitor container image.

**iac test** _PATH_
> Test Infrastructure as Code.

**code test**
> Test source code (SAST).

**auth** [_TOKEN_]
> Authenticate with Snyk.

**ignore**
> Ignore an issue.

**wizard**
> Interactive remediation.

**policy**
> Manage .snyk policy file.

**--file** _FILE_
> Manifest file to test.

**--severity-threshold** _LEVEL_
> Only report: low, medium, high, critical.

**--json**
> Output as JSON.

**--sarif**
> Output as SARIF.

**--all-projects**
> Test all projects in directory.

**--fail-on** _TYPE_
> Fail on: all, upgradable, patchable.

**--prune-repeated-subdependencies**
> Prune repeated dependencies.

**-d**, **--debug**
> Debug output.

**--org** _ORG_
> Specify organization.

# DESCRIPTION

**Snyk** finds and fixes vulnerabilities in code, dependencies, containers, and infrastructure as code. It integrates into development workflows, CI/CD pipelines, and provides continuous monitoring.

Dependency testing scans package manifests (package.json, requirements.txt, pom.xml, etc.) against Snyk's vulnerability database. Results show CVEs, severity, and available fixes.

Container scanning analyzes Docker images layer by layer, identifying vulnerable packages in base images and application dependencies. Recommendations include secure base image alternatives.

Infrastructure as Code testing catches misconfigurations in Terraform, CloudFormation, Kubernetes, and other IaC files before deployment. Issues include security groups, encryption settings, and access controls.

Static analysis (code test) finds security issues in source code: injection flaws, hardcoded secrets, and other vulnerabilities.

The monitor command creates a snapshot in Snyk's service for ongoing vulnerability alerting as new CVEs are discovered.

# CAVEATS

Requires account for full functionality. Some features need paid plans. Internet required for database access. Large projects take time to scan. False positives possible. Not all package ecosystems fully supported.

# HISTORY

**Snyk** was founded in **2015** by Guy Podjarny. The name is "kyns" (open source security) reversed. Starting with JavaScript dependency scanning, it expanded to containers, IaC, and code analysis. The company raised significant funding and became a leader in developer security tools.

# SEE ALSO

[npm-audit](/man/npm-audit)(1), [safety](/man/safety)(1), [trivy](/man/trivy)(1), [checkov](/man/checkov)(1)
