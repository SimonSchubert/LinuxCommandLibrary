# TLDR

**Analyze** one or more log files in interactive mode

```goaccess [path/to/logfile1] [path/to/logfile2] ...```

Use a specific **log-format** or pre-defined format

```goaccess [path/to/logfile] --log-format=[format|combined]```

Analyze a log from **stdin**

```tail -f [path/to/logfile] | goaccess -```

Analyze a log and write to **HTML** file in real-time

```goaccess [path/to/logfile] -o [path/to/file.html] --real-time-html```

# SYNOPSIS

**goaccess** [_options_] _logfile_

# PARAMETERS

**-o**, **--output** _FILE_
> Output to specified file (HTML, JSON, or CSV based on extension)

**--log-format** _FORMAT_
> Specify log format string or use predefined: COMBINED, COMMON, etc.

**--real-time-html**
> Enable real-time HTML report updates via WebSocket

**--ws-url** _URL_
> WebSocket URL for real-time HTML

**-a**, **--agent-list**
> Enable full user-agent parsing

**-d**, **--with-output-resolver**
> Enable IP resolver for geolocation

**-e**, **--exclude-ip** _IP_
> Exclude specific IP from statistics

**--ignore-panel** _PANEL_
> Ignore specific panel in output

**--geoip-database** _FILE_
> GeoIP database for geolocation

# DESCRIPTION

**goaccess** is an open-source real-time web log analyzer and interactive viewer. It parses web server logs (Apache, Nginx, etc.) and displays statistics in a terminal dashboard or generates HTML/JSON/CSV reports.

Features include real-time analysis with streaming logs, geolocation lookup, user agent parsing, and detailed metrics for visitors, requests, referrers, 404 errors, operating systems, and browsers.

The interactive terminal mode provides a ncurses-based dashboard with drill-down capabilities. HTML reports can update in real-time via WebSocket connections.

# CAVEATS

Log format must match the actual log format; mismatches cause parsing failures. Real-time HTML requires a running goaccess process. Large log files may require significant memory for processing.

# HISTORY

goaccess was created by Gerardo Orellana and first released in **2009**. It gained popularity as a lightweight, privacy-respecting alternative to cloud-based analytics services, particularly useful for quick server log analysis.

# SEE ALSO

[awstats](/man/awstats)(1), [webalizer](/man/webalizer)(1), [nginx](/man/nginx)(8), [apache2](/man/apache2)(8)
