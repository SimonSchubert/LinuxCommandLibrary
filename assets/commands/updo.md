# TAGLINE

Uptime monitoring CLI with alerting support

# TLDR

**Monitor a website**

```updo monitor [https://example.com]```

**Monitor with custom refresh interval and timeout**

```updo monitor --refresh [10] --timeout [5] [https://example.com]```

**Monitor with Slack webhook alerts**

```updo monitor --webhook-url "[https://hooks.slack.com/...]" [https://example.com]```

# SYNOPSIS

**updo** **monitor** [_options_] _URL_...

# PARAMETERS

**--refresh** _seconds_
> Refresh interval in seconds (default: 5).

**--timeout** _seconds_
> Request timeout in seconds (default: 10).

**--count** _n_
> Number of checks to perform (0 = infinite, the default).

**--webhook-url** _url_
> Webhook URL for alerts (Slack or Discord).

**--assert-text** _text_
> Expected response body text used to validate each check.

**--simple**
> Print plain text output instead of the interactive TUI.

# DESCRIPTION

**updo** is a command-line tool for monitoring website uptime and performance. It provides real-time metrics including response time, SSL certificate expiry, and uptime percentage. Supports multi-target monitoring, multi-region AWS Lambda deployment, Prometheus and Grafana integration, and webhook alerts for Slack and Discord.

# HISTORY

**updo** was created by **Owloops** and is written in **Go**.

# INSTALL

```aur: yay -S updo```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[ping](/man/ping)(1), [curl](/man/curl)(1), [httpstat](/man/httpstat)(1)
