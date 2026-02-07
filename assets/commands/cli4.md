# TAGLINE

Cloudflare API v4 command-line client

# TLDR

**List all zones** (domains) in your Cloudflare account

```cli4 /zones```

**Get details for a specific zone** by ID

```cli4 /zones/[zone_id]```

**Purge entire cache** for a zone

```cli4 --delete /zones/[zone_id]/purge_cache purge_everything:=true```

**List DNS records** for a zone

```cli4 /zones/[zone_id]/dns_records```

**Create a DNS record**

```cli4 --post /zones/[zone_id]/dns_records type:='"A"' name:='"www"' content:='"192.0.2.1"'```

**Delete a DNS record**

```cli4 --delete /zones/[zone_id]/dns_records/[record_id]```

**Update a page rule**

```cli4 --put /zones/[zone_id]/pagerules/[rule_id] status:='"active"'```

# SYNOPSIS

**cli4** [_options_] _/endpoint_ [_data_...]

# PARAMETERS

**--get**
> HTTP GET request (default).

**--post**
> HTTP POST request.

**--put**
> HTTP PUT request.

**--patch**
> HTTP PATCH request.

**--delete**
> HTTP DELETE request.

**-q**, **--quiet**
> Suppress output.

**-v**, **--verbose**
> Verbose output including HTTP headers.

**-r**, **--raw**
> Output raw JSON without formatting.

**-d**, **--dump**
> Dump the request instead of executing it.

# DESCRIPTION

**cli4** is a command-line tool for interacting with the Cloudflare API v4. It provides direct access to all Cloudflare API endpoints, allowing management of zones, DNS records, firewall rules, page rules, and other Cloudflare features from the terminal.

The tool uses a simple syntax where API endpoints are specified as paths and data is passed as key-value pairs. JSON values use the **:=** operator for proper typing, while string assignment uses **=**. Authentication is handled via environment variables or a configuration file.

cli4 is particularly useful for automation and scripting Cloudflare operations. It can be integrated into CI/CD pipelines for cache purging, DNS updates, or firewall rule management.

# CONFIGURATION

**~/.cloudflare/cloudflare.cfg**
> Stores API credentials (email, key, or token) as an alternative to environment variables.

# CAVEATS

Requires authentication via **CF_API_EMAIL** and **CF_API_KEY** environment variables, or **CF_API_TOKEN** for API tokens. Zone IDs must be retrieved separately; they are not the domain name. Rate limiting applies per Cloudflare API documentation.

# HISTORY

cli4 was created as an unofficial Python-based CLI for Cloudflare's API v4, which was released in **2014**. It provides a lightweight alternative to Cloudflare's official tools, focusing on direct API access rather than high-level abstractions.

# SEE ALSO

[wrangler](/man/wrangler)(1), [curl](/man/curl)(1), [flarectl](/man/flarectl)(1)
