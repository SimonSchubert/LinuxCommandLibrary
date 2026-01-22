# TLDR

**Scan a directory for IaC misconfigurations**

```checkov -d [path/to/directory]```

**Scan a specific file**

```checkov -f [path/to/file.tf]```

**Scan with a specific framework**

```checkov -d [path/to/directory] --framework [terraform|kubernetes|cloudformation]```

**Run only specific checks**

```checkov -d [path/to/directory] --check [CKV_AWS_1,CKV_AWS_2]```

**Skip specific checks**

```checkov -d [path/to/directory] --skip-check [CKV_AWS_1]```

**Output results in JSON format**

```checkov -d [path/to/directory] --output json```

**Scan a Terraform plan file**

```checkov -f [tfplan.json] --framework terraform_plan```

# SYNOPSIS

**checkov** [**-d** _directory_] [**-f** _file_] [**--framework** _framework_] [**--check** _checks_] [**--skip-check** _checks_] [**--output** _format_] [_options..._]

# DESCRIPTION

**Checkov** is a static code analysis tool for infrastructure as code (IaC) that detects security and compliance misconfigurations. It supports Terraform, CloudFormation, Kubernetes, Helm, Dockerfile, ARM templates, and other frameworks.

The tool includes over 750 built-in policies covering industry standards like CIS Benchmarks, PCI, and HIPAA. It uses graph-based scanning to analyze resource dependencies and detect complex configuration issues.

Checkov also performs software composition analysis (SCA) and secrets detection using regex, keywords, and entropy-based detection.

# PARAMETERS

**-d, --directory** _path_
> Directory to scan

**-f, --file** _path_
> Specific file to scan

**--framework** _framework_
> IaC framework: terraform, cloudformation, kubernetes, helm, dockerfile, etc.

**--check** _ids_
> Run only specific checks by ID

**--skip-check** _ids_
> Skip specific checks by ID

**--output** _format_
> Output format: cli, json, junitxml, sarif

**--compact**
> Show only failed checks

**--list**
> List all available checks

# CAVEATS

Custom policies can be written in Python or YAML. For accurate Terraform scanning, consider scanning the plan output (**terraform plan -out=tfplan && terraform show -json tfplan > tfplan.json**) rather than just the source files.

# HISTORY

**Checkov** was originally developed by **Bridgecrew.io** and has since been acquired by **Palo Alto Networks** as part of their Prisma Cloud platform. It remains open source and actively maintained on GitHub.

# SEE ALSO

[terraform](/man/terraform)(1), [kubectl](/man/kubectl)(1), [tfsec](/man/tfsec)(1)
