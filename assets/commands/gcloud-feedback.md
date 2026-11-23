# TAGLINE

provide feedback to the Google Cloud CLI team

# TLDR

**Send feedback**, including the log of the most recent gcloud command

```gcloud feedback```

**Attach a specific log file** from an earlier run

```gcloud feedback --log-file=[path/to/logfile]```

**Find recent log files** to attach

```ls -t ~/.config/gcloud/logs/*/*.log | head```

# SYNOPSIS

**gcloud feedback** [**--log-file=**_LOG_FILE_] [_GCLOUD_WIDE_FLAG_...]

# PARAMETERS

**--log-file=**_LOG_FILE_
> Path to the log file from a prior gcloud run. Without it, the log of the most recent command is used. gcloud writes its logs under `~/.config/gcloud/logs/` (or the configured config directory).

**GCLOUD WIDE FLAGS**
> All global flags apply, e.g. `--account`, `--configuration`, `--project`, `--quiet`, `--verbosity`, `--log-http`, `--help`.

# DESCRIPTION

**gcloud feedback** lists the support channels for the Google Cloud CLI (paid Google Cloud support packages and the public Google Cloud CLI issue tracker) and helps you use one of them by opening a web browser to the relevant page. Where possible, information about the current installation and configuration, such as the gcloud version, platform, and details from the log file, is pre-populated in the form fields.

It is meant for problems with the CLI itself; feedback on individual Google Cloud products is better sent through the console or the product's own support channels.

# CAVEATS

Needs a web browser to complete the report. Log files can contain project IDs, resource names, and request details; review the pre-filled report before submitting it to the public issue tracker. Report security vulnerabilities privately rather than through the public tracker.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-help](/man/gcloud-help)(1), [gcloud-version](/man/gcloud-version)(1)

# RESOURCES

```[Documentation](https://docs.cloud.google.com/sdk/gcloud/reference/feedback)```

<!-- verified: 2026-11-23 -->
