# TAGLINE

displays SDK version information

# TLDR

**Show gcloud version**

```gcloud version```

**Show versions as JSON**

```gcloud version --format=json```

**Same information via the top-level flag**

```gcloud --version```

**Show versions as YAML**

```gcloud version --format=yaml```

# SYNOPSIS

**gcloud version** [_options_]

# PARAMETERS

**--format** _FORMAT_
> Output format, such as json, yaml, text or value. Available on all gcloud commands.

**--help**
> Display help information.

# DESCRIPTION

**gcloud version** displays the version of the Google Cloud SDK and installed components. It shows version numbers for gcloud, bq, gsutil, and other SDK tools.

The command helps verify which SDK version is installed and identify if updates are available. Component versions help with troubleshooting and compatibility checks.

gcloud version is useful for documenting environment details and ensuring consistency.

# CAVEATS

Version may differ from latest available. Component versions vary independently.

# HISTORY

gcloud version is part of the **Google Cloud SDK** diagnostic commands, providing version information for all installed components.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-components](/man/gcloud-components)(1)

# RESOURCES

```[Homepage](https://cloud.google.com/sdk)```

```[Documentation](https://docs.cloud.google.com/sdk/gcloud/reference/version)```

<!-- verified: 2026-11-09 -->
