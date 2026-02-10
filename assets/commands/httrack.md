# TAGLINE

website copier that downloads websites to a local directory for offline browsing

# TLDR

**Mirror a website** to the current directory

```httrack [https://example.com]```

**Mirror a website** to a specific directory

```httrack [https://example.com] -O [path/to/output]```

**Mirror a website** with a specific depth limit

```httrack [https://example.com] -r[3]```

**Continue an interrupted download**

```httrack --continue```

**Update an existing mirror**

```httrack --update```

**Mirror a website** using a proxy

```httrack [https://example.com] -P [proxy:8080]```

**Mirror only specific file types**

```httrack [https://example.com] +*.pdf +*.jpg -* ```

**Limit download speed** (bytes per second)

```httrack [https://example.com] -A[102400]```

# SYNOPSIS

**httrack** [_url_] [_-options_] [_+filters_] [_-filters_]

**httrack** --mirror _url_ -O _path_

**httrack** --continue | --update

# PARAMETERS

**-O**, **--path** _PATH_
> Output/project path

**-w**, **--mirror**
> Mirror websites (default mode)

**-W**, **--mirror-wizard**
> Mirror websites with interactive wizard

**-g**, **--get-files**
> Get files without mirroring structure

**-i**, **--continue**
> Continue an interrupted download

**-r** _N_, **--depth** _N_
> Set link depth limit (default: unlimited)

**-m** _N_, **--max-files** _N_
> Maximum number of files to download

**-M** _N_, **--max-size** _N_
> Maximum total size in bytes

**-E** _N_, **--max-time** _N_
> Maximum mirror time in seconds

**-A** _N_, **--max-rate** _N_
> Maximum transfer rate (bytes/second)

**-c** _N_, **--sockets** _N_
> Number of simultaneous connections

**-T** _N_, **--timeout** _N_
> Connection timeout in seconds

**-R** _N_, **--retries** _N_
> Number of retry attempts

**-P**, **--proxy** _HOST:PORT_
> Use proxy server

**-K** _N_, **--keep-links** _N_
> Keep original link format (0=relative, 2=absolute)

**-x**, **--replace-external**
> Replace external links with error page

**-n**, **--near**
> Get non-HTML files near links

**-t**, **--test**
> Test links only, do not download

**-q**, **--quiet**
> Quiet mode, no output

**-v**, **--verbose**
> Verbose output

**-s0**, **--robots=0**
> Ignore robots.txt

**-h**, **--help**
> Display help

# FILTERS

**+**_pattern_
> Include URLs matching pattern

**-**_pattern_
> Exclude URLs matching pattern

**+*.pdf**
> Include all PDF files

**-*.exe**
> Exclude all EXE files

**+example.com/*  -***
> Only mirror from specific domain

# DESCRIPTION

**httrack** is a website copier that downloads websites to a local directory for offline browsing. It preserves the original site structure, converting links to work locally. The mirrored site can be browsed offline using any web browser.

The tool follows links to specified depths, downloads files, and reconstructs relative paths. It supports HTTP and HTTPS protocols, authentication, cookies, and proxy servers. Filters control which files are downloaded using wildcard patterns.

HTTrack can update previously mirrored sites, downloading only changed files. It handles interrupted downloads gracefully with the continue option. The **webhttrack** command provides a browser-based graphical interface.

# CAVEATS

Mirroring websites may violate terms of service or copyright laws. Always check robots.txt and site policies. JavaScript-rendered content and dynamically generated pages may not mirror correctly. Some sites employ anti-scraping measures that can block HTTrack. CGI scripts and server-side functionality will not work in the offline copy. Large sites can consume significant disk space and bandwidth.

# HISTORY

HTTrack was created by **Xavier Roche** and first released in **1998**. Written in C, it became one of the most popular open-source website mirroring tools. The project provides both command-line and GUI interfaces across Windows, Linux, and other Unix-like systems. Development continues with regular updates to handle modern web technologies.

# SEE ALSO

[wget](/man/wget)(1), [curl](/man/curl)(1), [webhttrack](/man/webhttrack)(1)
