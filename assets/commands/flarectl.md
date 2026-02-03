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

**flarectl** is the Cloudflare CLI tool. Manages DNS records, zones, firewall rules, and other Cloudflare settings from the command line.

# SEE ALSO

[cloudflared](/man/cloudflared)(1)

