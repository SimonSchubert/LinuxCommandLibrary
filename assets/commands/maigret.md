# TAGLINE

OSINT tool for collecting information about usernames across social

# TLDR

**Search username across sites**

```maigret [username]```

**Search with specific sites**

```maigret [username] --site [twitter] --site [github]```

**Output to file**

```maigret [username] -o [report.txt]```

**Generate HTML report**

```maigret [username] --html```

# SYNOPSIS

**maigret** [_options_] _username_

# PARAMETERS

**-o** _file_
> Output results to file.

**--html**
> Generate HTML report.

**--pdf**
> Generate PDF report.

**--site** _name_
> Check specific site only.

**--timeout** _seconds_
> Request timeout.

**--tor**
> Use Tor network.

**--proxy** _url_
> Use HTTP proxy.

**-a**, **--all-sites**
> Check all available sites.

# DESCRIPTION

**maigret** is an OSINT tool for collecting information about usernames across social networks and websites. Searches hundreds of platforms to find accounts associated with a username. Generates detailed reports for investigations.

# CAVEATS

For authorized security research and OSINT investigations only. Respect privacy and applicable laws.

# SEE ALSO

[sherlock](/man/sherlock)(1)

