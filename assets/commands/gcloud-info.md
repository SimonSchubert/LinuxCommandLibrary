# TLDR

**Show SDK information**

```gcloud info```

**Show installation path**

```gcloud info --format='value(installation.sdk_root)'```

**Show account info**

```gcloud info --format='value(config.account)'```

**Output as YAML**

```gcloud info --format=yaml```

# SYNOPSIS

**gcloud info** [_options_]

# PARAMETERS

**--format** _FORMAT_
> Output format: yaml, json, value.

**--run-diagnostics**
> Check connectivity and permissions.

**--anonymize**
> Omit personal information.

**--help**
> Display help information.

# DESCRIPTION

**gcloud info** displays information about the gcloud CLI installation and configuration. It shows SDK version, Python version, installation path, and current settings.

The command helps troubleshoot issues by revealing the environment gcloud is running in. Diagnostics mode tests connectivity to GCP services.

gcloud info is useful for debugging and verifying SDK setup.

# CAVEATS

May contain sensitive account information. Diagnostic tests require network access.

# HISTORY

gcloud info is part of the **Google Cloud SDK** diagnostic tools, providing visibility into CLI configuration and environment.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-config](/man/gcloud-config)(1)
