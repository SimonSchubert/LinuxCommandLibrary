# TAGLINE

YAML syntax and style linter

# TLDR

**Lint a YAML file**

```yamllint [file.yaml]```

**Lint all YAML files** in a directory recursively

```yamllint [path/to/directory]```

**Use a specific configuration file**

```yamllint -c [.yamllint.yaml] [file.yaml]```

**Use a predefined configuration** (relaxed or default)

```yamllint -d relaxed [file.yaml]```

**Output in parsable format** for editors

```yamllint -f parsable [file.yaml]```

**Strict mode** (exit non-zero on warnings)

```yamllint -s [file.yaml]```

**List files that would be linted**

```yamllint --list-files [path]```

# SYNOPSIS

**yamllint** [_options_] [_file_or_dir ..._]

# PARAMETERS

**-c**, **--config-file** _file_
> Use specified configuration file.

**-d**, **--config-data** _data_
> Configuration as YAML string or preset name (default, relaxed).

**-f**, **--format** _format_
> Output format: standard, parsable, github, gitlab, colored, auto.

**-s**, **--strict**
> Return non-zero exit code on warnings (not just errors).

**--no-warnings**
> Suppress warning messages in output.

**--list-files**
> List files that would be processed without linting.

**-v**, **--version**
> Display version and exit.

**-h**, **--help**
> Display help message and exit.

# DESCRIPTION

**yamllint** is a linter for YAML files that checks for syntax validity and style issues. Beyond basic syntax checking, it detects problems like duplicate keys, line length violations, trailing spaces, indentation inconsistencies, and truthy value ambiguities.

Configuration is loaded from **.yamllint**, **.yamllint.yaml**, or **.yamllint.yml** in the current or parent directories, **$YAMLLINT_CONFIG_FILE**, or **~/.config/yamllint/config**.

The tool provides multiple output formats suitable for different use cases: human-readable, editor integration, and CI systems (GitHub Actions, GitLab CI).

# CAVEATS

yamllint validates YAML syntax and style but does not validate against schemas. For schema validation, use tools like **ajv** or language-specific validators. By default, only errors cause non-zero exit; use **-s** for strict mode where warnings also fail.

# HISTORY

yamllint was created by **Adrien Vergé** and first released in **2016**. It was developed to address the need for a comprehensive YAML linter that checks both syntax and style issues. Written in Python, it has become a standard tool in CI/CD pipelines for validating configuration files, Ansible playbooks, Kubernetes manifests, and other YAML-based infrastructure code.

# SEE ALSO

[yq](/man/yq)(1), [jsonlint](/man/jsonlint)(1), [ansible-lint](/man/ansible-lint)(1)
