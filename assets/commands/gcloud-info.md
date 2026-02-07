# TAGLINE

display gcloud installation and configuration details

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

**gcloud info** provides a comprehensive snapshot of the Google Cloud SDK installation and runtime environment. The output includes SDK version, installation directory, Python interpreter location and version, configured account and project, and active configuration name.

This information is invaluable for troubleshooting when gcloud commands behave unexpectedly or when seeking help, as it reveals environmental factors that may affect command execution. The --run-diagnostics flag goes further by performing active connectivity tests to Google Cloud services, helping identify network or firewall issues.

The --format option allows extracting specific values programmatically, useful for scripts that need to determine installation paths or active configuration settings. The --anonymize flag removes personally identifiable information from the output, making it safe to include in bug reports or support requests without exposing account details.

# CAVEATS

May contain sensitive account information. Diagnostic tests require network access.

# HISTORY

gcloud info is part of the **Google Cloud SDK** diagnostic tools, providing visibility into CLI configuration and environment.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-config](/man/gcloud-config)(1)
