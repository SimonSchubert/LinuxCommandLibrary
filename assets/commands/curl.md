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

# COMMON USES

**Download file:**
```bash
curl -O https://example.com/file.zip
curl -o myfile.zip https://example.com/download
```

**API calls:**
```bash
# GET request
curl https://api.example.com/users

# POST JSON
curl -X POST \
  -H "Content-Type: application/json" \
  -d '{"name":"John","age":30}' \
  https://api.example.com/users

# With authentication
curl -u username:password https://api.example.com/data
```

**Headers:**
```bash
# View response headers
curl -I https://example.com

# Custom headers
curl -H "Authorization: Bearer TOKEN" \
  https://api.example.com/secure
```

# FEATURES

- Multiple protocols (HTTP, HTTPS, FTP, SFTP, etc.)
- Authentication (Basic, Digest, OAuth, etc.)
- Cookie support
- Proxy support
- SSL/TLS
- Rate limiting
- Resume transfers
- Multiple simultaneous transfers

# CAVEATS

Silent failures by default (use -f to change). Large downloads show progress by default (use -s for scripts). Cookie files need management. SSL certificate issues require -k (insecure). Complex syntax for advanced features.

# HISTORY

**curl** was created by Daniel Stenberg in **1997** (originally httpget), becoming one of the most widely used command-line tools for data transfer.

# SEE ALSO

[wget](/man/wget)(1), [http](/man/http)(1), [fetch](/man/fetch)(1)
