# TAGLINE

cron job monitoring service CLI

# TLDR

**Sync cron jobs with Cronitor**

```cronitor sync```

**Execute command with monitoring**

```cronitor exec [monitor-key] -- [command]```

**List all cron jobs**

```cronitor list```

**Check monitor status**

```cronitor status```

**Send telemetry ping**

```cronitor ping [monitor-key]```

**Start web dashboard**

```cronitor dash```

**Configure API key**

```cronitor configure --api-key [key]```

# SYNOPSIS

**cronitor** [_global_options_] _command_ [_options_]

# DESCRIPTION

**cronitor** is the CLI companion for Cronitor, a cloud-based monitoring service for cron jobs and scheduled tasks. The tool monitors cron job execution, tracks timing and frequency, and sends alerts when jobs fail, miss their schedule, or run longer than expected.

The CLI automatically syncs cron jobs from the system to the Cronitor service, wraps command execution to send telemetry pings, and provides a dashboard for viewing job status. It helps teams maintain reliability of scheduled maintenance tasks, backups, and automated processes by ensuring timely notification of problems.

# COMMANDS

**sync**
> Sync cron jobs to Cronitor

**exec**
> Execute command with monitoring

**list**
> List and search cron jobs

**ping**
> Send telemetry ping

**status**
> View monitor status

**dash**
> Start web dashboard

**configure**
> Save configuration

**shell**
> Run cron-like shell

**update**
> Update to latest version

# GLOBAL OPTIONS

**-k**, **--api-key** _key_
> Cronitor API key

**-c**, **--config** _file_
> Config file path

**--env** _name_
> Cronitor environment

**-n**, **--hostname** _name_
> Host identifier

**-u**, **--users** _list_
> Comma-separated user list

**-v**, **--verbose**
> Verbose output

**-l**, **--log** _file_
> Debug log file

# CONFIGURATION

**~/.config/cronitor/cronitor.json**
> User configuration file containing API key, environment, hostname, and other settings.

# CAVEATS

Requires Cronitor account and API key. Use sudo for system-wide crontab monitoring. Includes MCP server for AI tool integration.

# SEE ALSO

[cron](/man/cron)(8), [crontab](/man/crontab)(1)
