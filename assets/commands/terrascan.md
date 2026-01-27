# TLDR

**Initialize Terrascan** (download policies)

```terrascan init```

**Scan current directory**

```terrascan scan```

**Scan specific directory**

```terrascan scan -d [/path/to/terraform]```

**Scan with specific IaC type**

```terrascan scan -i [terraform]```

**Scan Kubernetes manifests**

```terrascan scan -i k8s -d [/path/to/manifests]```

**Output results as JSON**

```terrascan scan -o json```

**Skip specific rules**

```terrascan scan --skip-rules "[AC_AWS_001,AC_AWS_002]"```

**Scan remote repository**

```terrascan scan -r git -u [https://github.com/user/repo]```

# SYNOPSIS

**terrascan** [_command_] [_options_]

# COMMANDS

**init**: Initialize Terrascan and download policies.

**scan**: Scan IaC for security violations.

**server**: Run as API server.

**version**: Display version information.

**help**: Show help for commands.

# PARAMETERS

**-c**, **--config-path** _file_
> Configuration file path.

**-d**, **--iac-dir** _path_
> Directory to scan.

**-f**, **--iac-file** _file_
> Specific file to scan.

**-i**, **--iac-type** _type_
> IaC type: terraform, k8s, helm, kustomize.

**-t**, **--policy-type** _type_
> Policy type: all, aws, azure, gcp, k8s.

**-o**, **--output** _format_
> Output format: human, json, yaml, xml.

**-r**, **--remote-type** _type_
> Remote type: git.

**-u**, **--remote-url** _url_
> Remote repository URL.

**--skip-rules** _rules_
> Comma-separated rules to skip.

**--severity** _level_
> Minimum severity: low, medium, high.

**--find-vuln**
> Check for container vulnerabilities.

**-l**, **--log-level** _level_
> Log level: debug, info, warn, error.

**-x**, **--log-type** _type_
> Log type: console, json.

# DESCRIPTION

**Terrascan** is a static code analyzer for Infrastructure as Code (IaC). It scans Terraform, Kubernetes, Helm, and Kustomize configurations for security misconfigurations and compliance violations.

The tool comes with 500+ policies covering AWS, Azure, GCP, and Kubernetes best practices. It can integrate into CI/CD pipelines to prevent insecure configurations from being deployed.

Terrascan can run as a CLI tool, API server, or Kubernetes admission controller. Custom policies can be written using Rego (Open Policy Agent's policy language).

Policies are stored in ~/.terrascan and automatically downloaded on first run or via `terrascan init`.

# CAVEATS

Requires Go or pre-built binary. Policy updates require running init. Some policies may generate false positives requiring rule exclusions. Scanning large codebases can be resource-intensive.

# HISTORY

**Terrascan** was originally developed by Accurics and is now maintained by Tenable. It provides pre-deployment security scanning for cloud-native infrastructure, helping organizations implement security as code practices.

# SEE ALSO

[tfsec](/man/tfsec)(1), [checkov](/man/checkov)(1), [tflint](/man/tflint)(1), [opa](/man/opa)(1)
