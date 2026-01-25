# TLDR

**Update statistics** for a virtual host

```awstats -config [virtualhostname] -update```

**Generate HTML report** for a virtual host

```awstats -config [virtualhostname] -output```

**Update statistics and generate report** in one command

```awstats -config [virtualhostname] -update -output```

**Generate report for a specific month**

```awstats -config [virtualhostname] -output -month [01] -year [2024]```

**Display help** and usage information

```awstats -h```

# SYNOPSIS

**awstats** **-config** _virtualhostname_ [_OPTIONS_]

# PARAMETERS

**-config** _virtualhostname_
> Specify the virtual host name to select the configuration file.

**-update**
> Update statistics from the log file (default action).

**-output**
> Generate the main HTML report. Statistics are only updated if -update is also specified.

**-month** _MM_
> Specify month for report output (01-12).

**-year** _YYYY_
> Specify year for report output.

**-h**
> Display usage information.

# DESCRIPTION

**AWStats** (Advanced Web Statistics) is a powerful log file analyzer that generates advanced web, streaming, FTP, or mail server statistics in graphical web pages. It processes log files to provide detailed information about visitors, pages, hits, search engines, keywords, robots, broken links, and more.

AWStats works both as a CGI script and from the command line. It uses a partial information file to efficiently process large log files incrementally. The tool supports log formats from major server software including Apache (NCSA combined/XLF/ELF or common/CLF format), IIS (W3C log format), and various proxy, streaming, and mail servers.

Configuration files are searched in order: **awstats._virtualhostname_.conf**, **awstats.conf**, or a full path. These must be located in /etc/awstats, /usr/local/etc/awstats, or /etc.

# ENVIRONMENT

**AWSTATS_FORCE_CONFIG**
> If defined, AWStats uses this value as the config regardless of command line.

# CAVEATS

AWStats requires Perl with the Encode module. The configuration file must be properly set up with log file paths and site information before running. Statistics are cumulative, so processing the same log entries multiple times will produce incorrect results unless using AWStats' built-in tracking of processed entries.

# HISTORY

AWStats was created by Laurent Destailleur and first released in **2000**. It became one of the most popular open-source web analytics tools before the rise of JavaScript-based analytics like Google Analytics. The project continues to be maintained on SourceForge and GitHub, providing server-side log analysis that doesn't require JavaScript or client-side tracking.

# SEE ALSO

[webalizer](/man/webalizer)(1), [goaccess](/man/goaccess)(1), [analog](/man/analog)(1), [apache2](/man/apache2)(8)
