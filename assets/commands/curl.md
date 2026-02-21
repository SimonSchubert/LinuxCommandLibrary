# TAGLINE

transfer data with URLs

# TLDR

**Download** file

```curl -O [https://example.com/file.zip]```

**Save** to specific file

```curl -o [filename] [https://example.com/file]```

**POST** data

```curl -X POST -d ["key=value"] [https://api.example.com]```

**Follow** redirects

```curl -L [https://example.com]```

**Send** JSON

```curl -H ["Content-Type: application/json"] -d ['{"key":"value"}'] [https://api.example.com]```

**Show** headers

```curl -I [https://example.com]```

# SYNOPSIS

**curl** [_options_] [_URL_...]

# DESCRIPTION

**curl** is a command-line tool for transferring data with URLs. It supports HTTP, HTTPS, FTP, and many other protocols, making it essential for web development, API testing, and file transfers.

The tool is ubiquitous in scripts, CI/CD pipelines, and system administration.

# PARAMETERS

**-O**, **--remote-name**
> Save with remote filename

**-o**, **--output** _file_
> Save to specified file

**-L**, **--location**
> Follow redirects

**-X**, **--request** _method_
> HTTP method (GET, POST, PUT, DELETE)

**-d**, **--data** _data_
> Send POST data

**-H**, **--header** _header_
> Add custom header

**-u**, **--user** _user:pass_
> Authentication

**-I**, **--head**
> Fetch headers only

**-v**, **--verbose**
> Verbose output

**-s**, **--silent**
> Silent mode

**-f**, **--fail**
> Fail silently on HTTP errors

**-k**, **--insecure**
> Allow insecure SSL connections

# CONFIGURATION

**~/.curlrc**
> Default options loaded on every curl invocation (one option per line).

**~/.netrc**
> Stores authentication credentials for remote hosts (used with --netrc).

# CAVEATS

Silent failures by default (use -f to change). Large downloads show progress by default (use -s for scripts). Cookie files need management. SSL certificate issues require -k (insecure). Complex syntax for advanced features.

# HISTORY

**curl** originated in **1996** as httpget (by Rafael Sagula, with Daniel Stenberg contributing), was renamed to urlget in 1997 when FTP support was added, and became **curl** with version 4.0 in **March 1998**. It is one of the most widely used command-line tools for data transfer.

# SEE ALSO

[wget](/man/wget)(1), [http](/man/http)(1), [fetch](/man/fetch)(1)
