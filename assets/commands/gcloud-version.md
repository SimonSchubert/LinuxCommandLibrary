# TAGLINE

displays SDK version information

# TLDR

**Show gcloud version**

```gcloud version```

**Show all component** versions

```gcloud version --format=json```

**Brief version**

```gcloud --version```

# SYNOPSIS

**gcloud version** [_options_]

# PARAMETERS

**--format** _FORMAT_
> Output format: text, json, yaml.

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
