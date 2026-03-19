# TAGLINE

Report bugs in Debian packages

# TLDR

Generate a **bug report** about a package

```reportbug package```

Report a bug about **general problems** (not package-specific)

```reportbug other```

Write bug report to a **file** instead of emailing

```reportbug -o filename package```

**Query existing bugs** without filing a report

```reportbug --query-only [package]```

Report a bug with specific **severity**

```reportbug --severity [serious] [package]```

**Attach a file** to the bug report

```reportbug --attach [screenshot.png] [package]```

# SYNOPSIS

**reportbug** [_options_] _package_

# PARAMETERS

**-o**, **--output** _file_
> Write bug report to file instead of sending by email.

**--severity** _level_
> Set bug severity: critical, grave, serious, important, normal, minor, wishlist.

**--query-only**
> Query existing bugs without filing a report.

**--attach** _file_
> Attach a file to the bug report.

**--include** _file_
> Include file contents in the message body.

**--tag** _tag_
> Add a tag to the report.

**--email** _address_
> Set sender email address.

**--smtphost** _host_
> Use specified SMTP server.

**--mode** _mode_
> Operating mode: novice, standard, advanced, expert.

**--template**
> Output a template report to stdout.

# DESCRIPTION

**reportbug** is the official bug reporting tool for Debian-based distributions. It generates bug reports with system information and sends them to the Debian Bug Tracking System via email.

The tool guides users through providing necessary information about the bug and the affected package.

# CAVEATS

Requires email configuration for sending reports. Use "other" as package name for infrastructure or general issues.

# HISTORY

Part of **Debian** quality assurance infrastructure. Provides standardized bug reporting for the Debian ecosystem.

# SEE ALSO

[apt](/man/apt)(8), [dpkg](/man/dpkg)(1)
