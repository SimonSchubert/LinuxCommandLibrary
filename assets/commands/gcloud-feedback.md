# TAGLINE

open a feedback form for the Google Cloud CLI

# TLDR

**Open the feedback form** in the browser

```gcloud feedback```

**Attach a log file** to the feedback

```gcloud feedback --log-file [path/to/gcloud.log]```

# SYNOPSIS

**gcloud feedback** [**--log-file=**_LOG_FILE_] [_GCLOUD_WIDE_FLAGS_...]

# PARAMETERS

**--log-file** _FILE_
> Path to a `gcloud` log file to attach (typically from `~/.config/gcloud/logs/`). When provided, gcloud reads the log and pastes a link to it into the new-issue URL along with the trace info so the CLI team can reproduce the problem.

**gcloud wide flags**
> All global flags apply: `--help`, `--quiet`, `--verbosity`, `--configuration`, `--user-output-enabled`, `--log-http`, etc.

# DESCRIPTION

**gcloud feedback** opens the official Google Cloud CLI issue tracker in your default browser, pre-filled with system information (gcloud version, platform, Python version) so reports don't start empty. It is the recommended way to report bugs or request features for the CLI itself; for feedback on specific Google Cloud products, use their in-console "Send feedback" widgets.

With `--log-file`, gcloud opens the log, strips sensitive headers, and makes it easy to share a recent failure trace with the filed report.

# CAVEATS

Requires a browser — on headless machines the URL is printed to stdout instead. Logs may contain resource names and project IDs; review before pasting into a public issue. For security vulnerabilities, use the private security contact, not the public issue tracker.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-help](/man/gcloud-help)(1), [gcloud-version](/man/gcloud-version)(1)
