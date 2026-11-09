# TAGLINE

cron job monitoring service CLI

# TLDR

**Sign in** to a Cronitor account

```cronitor auth login```

**Sync cron jobs with Cronitor**

```cronitor sync```

**Preview a sync** without changing anything

```cronitor sync --dry-run```

**Execute command with monitoring**

```cronitor exec [monitor-key] "[command]"```

**List all cron jobs**

```cronitor list```

**Check monitor status**

```cronitor status```

**Report a job as completed**

```cronitor ping [monitor-key] --complete```

**Start web dashboard**

```cronitor dash --port [9000]```

**List monitors**

```cronitor monitor list```

# SYNOPSIS

**cronitor** [_global_options_] _command_ [_options_]

# COMMANDS

**auth**
> Log in, log out and show credential status.

**sync**
> Sync cron jobs to Cronitor (alias: **discover**).

**exec**
> Execute command with monitoring.

**list**
> List and search cron jobs.

**ping**
> Send a telemetry event with **--run**, **--complete**, **--fail**, **--ok** or **--tick**.

**status**
> View monitor status.

**dash**
> Start web dashboard.

**configure**
> Save configuration.

**shell**
> Run cron-like shell.

**update**
> Update to latest version.

**monitor**, **statuspage**, **issue**, **notification**, **integration**, **connect**
> Manage Cronitor resources from the command line.

# GLOBAL OPTIONS

**-k**, **--api-key** _key_
> Cronitor API key. Prefer the **CRONITOR_API_KEY** variable, since flags appear in shell history.

**-c**, **--config** _file_
> Config file path.

**--env** _name_
> Cronitor environment.

**-n**, **--hostname** _name_
> Host identifier. Default: system hostname.

**-u**, **--users** _list_
> Comma-separated list of users whose crontabs to include. Default: current user only.

**-p**, **--ping-api-key** _key_
> Telemetry Events API key. Prefer **CRONITOR_PING_API_KEY**.

**--ping-api-host** _host_
> Telemetry host for pings, such as **eu.cronitor.link**. Default: **cronitor.link**.

**--api-version** _date_
> Cronitor API version.

**-v**, **--verbose**
> Verbose output.

**-l**, **--log** _file_
> Debug log file.

# DESCRIPTION

**cronitor** is the CLI companion for Cronitor, a cloud-based monitoring service for cron jobs and scheduled tasks. The tool monitors cron job execution, tracks timing and frequency, and sends alerts when jobs fail, miss their schedule, or run longer than expected.

**cronitor sync** imports cron jobs into the Cronitor service and updates the crontab so that monitored jobs report their runs. **cronitor exec** wraps a single command to send telemetry, and **cronitor dash** starts a self-hosted web dashboard for managing cron jobs.

# CONFIGURATION

**/etc/cronitor/cronitor.json**
> Default configuration file on Linux and macOS. Use **--config** or **CRONITOR_CONFIG** to select another file, such as **~/.config/cronitor/cronitor.json** when the system path is not writable.

# CAVEATS

Requires a Cronitor account and credentials. **cronitor sync** rewrites crontab lines and adds a **SHELL=** line pointing at Cronitor's wrapper script; **cronitor sync --format=exec** reverts to plain **cronitor exec** lines. Use sudo for system-wide crontab monitoring. **cronitor auth logout** revokes the credential, so scheduled jobs using it stop authenticating.

# SEE ALSO

[cron](/man/cron)(8), [crontab](/man/crontab)(1)

# RESOURCES

```[Source code](https://github.com/cronitorio/cronitor-cli)```

```[Homepage](https://cronitor.io)```

```[Documentation](https://cronitor.io/docs/using-cronitor-cli)```

<!-- verified: 2026-11-09 -->
