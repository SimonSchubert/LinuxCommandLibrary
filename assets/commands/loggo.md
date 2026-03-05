# TAGLINE

Terminal app for structured JSON log streaming

# TLDR

**Stream logs from a file**

```loggo stream -f [path/to/logfile]```

**Stream logs from piped input**

```cat [logfile] | loggo stream```

**Stream Kubernetes logs**

```kubectl logs -f [pod_name] | loggo stream```

# SYNOPSIS

**loggo** _command_ [_options_]

# DESCRIPTION

**loggo** is a rich terminal UI for digesting JSON-based structured log streams. It can stream parsed logs from persisted files and from piped input, and provides tools for creating log templates.

It works with applications running locally, on Kubernetes clusters, GCP Stack Driver (Google Logs), and many other sources. The TUI is built with tview and tcell for interactive log browsing and filtering.

# CAVEATS

Designed for JSON-formatted logs. Non-JSON log formats may not be parsed correctly.

# HISTORY

**loggo** was created by **aurc** and is written in **Go**.

# SEE ALSO

[jq](/man/jq)(1), [lnav](/man/lnav)(1)
