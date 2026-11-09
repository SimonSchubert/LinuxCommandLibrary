# TAGLINE

Cloudflare API v4 command-line client

# TLDR

**List all zones** (domains) in your Cloudflare account

```cli4 /zones```

**Get details for a zone** by name

```cli4 /zones/:[example.com]```

**Purge entire cache** for a zone

```cli4 --post purge_everything=true /zones/:[example.com]/purge_cache```

**List DNS records** for a zone

```cli4 /zones/:[example.com]/dns_records```

**Create a DNS record**

```cli4 --post name=[www] type=[A] content=[192.0.2.1] /zones/:[example.com]/dns_records```

**Delete a DNS record**

```cli4 --delete /zones/:[example.com]/dns_records/:[www.example.com]```

**Update a page rule**

```cli4 --put status=[active] /zones/:[example.com]/pagerules/[rule_id]```

**Print results as YAML**

```cli4 --yaml /zones```

**List available API commands**

```cli4 --dump```

# SYNOPSIS

**cli4** [_options_] [_item=value_|_item=@file_|_@file_...] _/command_...

# PARAMETERS

**-G**, **--get**
> HTTP GET request (default).

**-O**, **--post**
> HTTP POST request.

**-U**, **--put**
> HTTP PUT request.

**-P**, **--patch**
> HTTP PATCH request.

**-D**, **--delete**
> HTTP DELETE request.

**-j**, **--json**
> Output as JSON.

**-y**, **--yaml**
> Output as YAML.

**-n**, **--ndjson**
> Output as newline-delimited JSON.

**-i**, **--image**
> Output an image result.

**-r**, **--raw**
> Return the raw API response, including paging information.

**-q**, **--quiet**
> Suppress output.

**-v**, **--verbose**
> Show debugging output.

**-d**, **--dump**
> List the API commands the client knows about and exit.

**-e**, **--examples**
> Display usage examples.

**-A**, **--openapi** _URL_
> Read and list API commands from an OpenAPI definition.

**-b**, **--binary**
> Treat an uploaded file as binary.

**-p**, **--profile** _NAME_
> Use the named profile from the configuration file.

**--header** _HEADER_
> Add an HTTP header to the request.

**-w**, **--warnings** _True|False_
> Enable or disable warnings.

**-V**, **--version**
> Show version information.

**-h**, **--help**
> Show usage.

# DESCRIPTION

**cli4** is a command-line tool for interacting with the Cloudflare API v4. It provides direct access to Cloudflare API endpoints, allowing management of zones, DNS records, firewall rules, page rules, and other Cloudflare features from the terminal.

Endpoints are given as paths and data as **item=value** arguments, which must come before the path. **true**, **false** and **none** are converted automatically, **item==123** sends a number, values wrapped in **[]** or **{}** are parsed as JSON, and **item=@file** reads a value from a file. Prefixing a path element with a colon, as in **/zones/:example.com**, looks up the identifier by name.

# CONFIGURATION

**.cloudflare.cfg**, **~/.cloudflare.cfg**, **~/.cloudflare/cloudflare.cfg**
> Store API credentials (email, key, or token) as an alternative to environment variables.

# CAVEATS

Requires credentials via **CLOUDFLARE_EMAIL** and **CLOUDFLARE_API_KEY**, or **CLOUDFLARE_API_TOKEN**. These replace the older **CF_API_EMAIL**, **CF_API_KEY** and **CF_API_TOKEN** names. Rate limiting applies per Cloudflare API documentation.

The **python-cloudflare** repository is archived and v2.19 of its library no longer receives updates. Cloudflare's replacement Python library is **cloudflare-python**; for current command-line work consider **flarectl** or **wrangler**.

# HISTORY

cli4 shipped with **python-cloudflare**, Cloudflare's Python library for API v4. The repository was archived after development moved to **cloudflare-python**.

# SEE ALSO

[wrangler](/man/wrangler)(1), [curl](/man/curl)(1), [flarectl](/man/flarectl)(1), [jq](/man/jq)(1)

# RESOURCES

```[Source code](https://github.com/cloudflare/python-cloudflare)```

<!-- verified: 2026-11-09 -->
