# TLDR

**Get information about your own IP address**

```ipinfo```

**Look up details for a specific IP address**

```ipinfo [8.8.8.8]```

**Get IP information in JSON format**

```ipinfo [1.1.1.1] --json```

**Look up information for multiple IPs**

```ipinfo [8.8.8.8] [1.1.1.1]```

**Look up ASN information**

```ipinfo [AS15169]```

**Get specific field** (city, country, org, etc.)

```ipinfo [8.8.8.8] --field [city]```

**Use an API token** for higher rate limits

```ipinfo [8.8.8.8] --token [your_token]```

# SYNOPSIS

**ipinfo** [_IP_|_ASN_] [_options_]

# PARAMETERS

**--json**
> Output in JSON format

**--field** _FIELD_
> Return only the specified field (ip, city, region, country, org, etc.)

**--token** _TOKEN_
> API token for authentication and higher rate limits

**--csv**
> Output in CSV format

**--no-color**
> Disable colored output

**--version**
> Display version information

**--help**
> Display help information

# DESCRIPTION

**ipinfo** is the official command-line client for the IPinfo.io geolocation API. It provides IP address information including geographic location, ISP, organization, and ASN data.

The tool can look up any public IP address or ASN, returning details such as city, region, country, coordinates, timezone, and hosting provider. It supports both individual lookups and bulk queries, with output in plain text, JSON, or CSV formats.

# CAVEATS

Requires internet connectivity to reach the IPinfo.io API. Free tier has rate limits; register for an API token for higher quotas. Private/internal IP addresses cannot be geolocated. Geolocation accuracy varies by region and IP type.

# HISTORY

Developed by **IPinfo.io**, a geolocation data provider founded in **2013**. The CLI tool provides command-line access to the same data available through their web API, which serves billions of requests daily for IP intelligence data.

# SEE ALSO

[curl](/man/curl)(1), [whois](/man/whois)(1), [dig](/man/dig)(1), [geoiplookup](/man/geoiplookup)(1)
