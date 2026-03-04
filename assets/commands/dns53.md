# TAGLINE

Dynamic DNS client for Amazon Route53

# TLDR

**Update** DNS records with current IP address

```dns53 update [domain] [record_name]```

**Run** in daemon mode for automatic updates

```dns53 daemon --domain [domain] --record [name]```

**Check** current IP and configuration

```dns53 status```

# SYNOPSIS

**dns53** [_command_] [_options_]

# PARAMETERS

**-d, --domain** _DOMAIN_
> Domain hosted in Route53

**-r, --record** _RECORD_
> DNS record name to update

**-i, --interval** _SECONDS_
> Update interval in seconds (daemon mode)

**-t, --ttl** _SECONDS_
> TTL for DNS records (default: 300)

**--access-key** _KEY_
> AWS access key ID

**--secret-key** _KEY_
> AWS secret access key

**--region** _REGION_
> AWS region (default: us-east-1)

**-c, --config** _FILE_
> Configuration file path

**-v, --verbose**
> Enable verbose output

**-h, --help**
> Display help and exit

**--version**
> Display version and exit

# DESCRIPTION

**dns53** is a dynamic DNS client specifically designed for Amazon Route53. It automatically updates DNS A records with the current public IP address of the machine it's running on, making it ideal for home servers or dynamic IP environments.

The tool can run once to update a record or in daemon mode for continuous monitoring. It uses AWS credentials to authenticate with Route53 API and modify DNS records.

# CONFIGURATION

Configuration file format (JSON):

```json
{
  "domain": "example.com",
  "record": "home.example.com",
  "ttl": 300,
  "access_key": "AKIA...",
  "secret_key": "..."
}
```

# CAVEATS

Requires valid AWS credentials with Route53 permissions. API calls may incur AWS charges. IP detection relies on external services which must be reachable. Daemon mode runs continuously consuming system resources.

# HISTORY

**dns53** was created to fill the gap for dynamic DNS support in Amazon Route53, which doesn't natively support dynamic updates like traditional DNS servers. It provides a lightweight solution for users wanting to run services on dynamic IPs with AWS DNS.

# SEE ALSO

[route53](/man/route53)(1), [aws](/man/aws)(1), [curl](/man/curl)(1), [dig](/man/dig)(1)