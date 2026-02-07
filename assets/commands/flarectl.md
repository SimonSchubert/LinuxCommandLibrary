# TAGLINE

Cloudflare management from the command line

# TLDR

**List DNS records**

```flarectl dns list --zone [example.com]```

**Create DNS record**

```flarectl dns create --zone [example.com] --name [www] --type [A] --content [1.2.3.4]```

**Delete DNS record**

```flarectl dns delete --zone [example.com] --id [record_id]```

**List zones**

```flarectl zone list```

**Purge cache**

```flarectl zone purge --zone [example.com] --everything```

**List firewall rules**

```flarectl firewall rules list --zone [example.com]```

# SYNOPSIS

**flarectl** _command_ _subcommand_ [_options_]

# SUBCOMMANDS

**zone**
> Manage zones.

**dns**
> Manage DNS records.

**firewall**
> Manage firewall rules.

**user**
> User information.

# PARAMETERS

**--zone** _zone_
> Zone name.

**--name** _name_
> Record name.

**--type** _type_
> Record type.

**--content** _content_
> Record content.

# DESCRIPTION

**Flarectl** is the official command-line interface for managing Cloudflare services. It provides programmatic access to Cloudflare's API, enabling automation of DNS management, zone configuration, firewall rules, and CDN settings without using the web dashboard.

The tool supports common operations including creating and modifying DNS records, managing zone settings like caching and security features, configuring firewall rules and access controls, and retrieving analytics data. Authentication uses API tokens or legacy API keys stored in environment variables or configuration files.

Flarectl is particularly useful for infrastructure-as-code workflows, CI/CD pipelines, and bulk operations across multiple domains. It outputs results in human-readable format by default, with JSON output available for scripting and automation.

# SEE ALSO

[cloudflared](/man/cloudflared)(1)

