# TAGLINE

ASN/IP lookup, network reconnaissance, and OSINT tool

# TLDR

Lookup an **IP address** with AS path trace

```asn [8.8.8.8]```

Lookup an **autonomous system** by number

```asn [AS15169]```

Lookup a **hostname** with trace

```asn [github.com]```

Perform a **detailed trace** with RPKI validation and hijack detection

```asn -d [8.8.8.8]```

Lookup **without tracing**

```asn -n [1.1.1.1]```

Search for all **ASNs matching** a name

```asn -a [google]```

**Shodan scan** multiple targets for CVEs, open ports, and hostnames

```asn -s [1.1.1.1] [8.8.8.8]```

**Bulk geolocate** IPs from a log file

```asn -g < [access.log]```

List all **CIDR blocks** allocated to a country

```asn -c [germany]```

Output results as **pretty-printed JSON**

```asn -J [AS15169]```

# SYNOPSIS

**asn** [_options_] [_target_]

**asn** [**-v**] **-l** [_server options_]

# PARAMETERS

**-t**
> Enable AS path trace to target (default behavior for IP targets).

**-n**
> Disable path tracing for IP targets. Disable additional INETNUM/origin lookups for AS targets.

**-d**
> Enable detailed trace mode with RPKI validation, route leak detection, and BGP hijack warnings.

**-a**
> ASN suggestion mode. Find all AS numbers and names matching the target string.

**-u**
> Transit/upstream lookup. Analyze BGP updates and AS paths to infer transit providers.

**-c**
> Country CIDR mode. Output all IPv4/IPv6 blocks allocated to the specified country.

**-g**
> Bulk geolocation mode. Extract and geolocate all IP addresses from input with occurrence statistics.

**-s**
> Shodan InternetDB scan. Query for CVEs, CPEs, tags, open ports, and hostnames. Supports multiple mixed targets and stdin.

**-o**
> Force interpretation of target as an organization name, bypassing automatic target type detection.

**-j**
> Compact JSON output for programmatic consumption.

**-J**
> Pretty-printed JSON output for readability.

**-m**
> Monochrome mode. Disable all colored output.

**-4**
> Force IPv4-only connectivity during traces and server mode.

**-l** [_bind_address_] [_bind_port_]
> Launch server mode. Starts a web interface for browser-based lookups and traceroutes. Default binding is 127.0.0.1:49200.

**-v**
> Verbose/debug mode. Display all queried URLs and log output to $HOME/asndebug.log.

**-h**
> Display usage information.

# SERVER OPTIONS

**--allow** _host[,host,...]_
> Restrict connections to specified hosts.

**--allowfile** _file_
> Restrict connections using a host list file.

**--deny** _host[,host,...]_
> Block specified hosts from connecting.

**--denyfile** _file_
> Block hosts listed in a file.

**-m**, **--max-conns** _n_
> Maximum simultaneous connections (default: 100).

# DESCRIPTION

**asn** is a comprehensive network reconnaissance and OSINT command-line tool written in Bash. It performs lookups on IP addresses, AS numbers, prefixes, hostnames, URLs, and organization names, combining data from numerous sources to produce detailed reports.

For AS numbers, the tool retrieves organization name, RIR allocation region, IXP presence, global AS ranking, BGP statistics, peering relationships, and BGP incident history including hijacks and route leaks over the past 12 months.

For IP addresses, it performs route lookups with ASN data, IP reputation scoring from multiple threat intelligence feeds, abuse contact information, and optional AS path tracing using mtr. The detailed trace mode adds RPKI route origin validation at each hop, detecting potential route leaks and BGP hijacks.

Additional modes support bulk IP geolocation from log files, country-level CIDR block enumeration, Shodan-based vulnerability scanning, transit provider identification through BGP update analysis, and organization-based network range discovery.

The tool can operate as a self-hosted web server, providing browser-based access and a JSON API for integration with other tools. Server mode supports access controls, custom bind addresses, and can be deployed as a systemd service.

Data sources include Team Cymru, PeeringDB, CAIDA ASRank, RIPEStat, ipinfo.io, ip-api, Shodan InternetDB, GreyNoise, IPQualityScore, Cloudflare Radar, ISC DSHIELD, NIST NVD, and the Prefix WhoIs project.

# CONFIGURATION

**$HOME/.asnrc**
> Shell configuration file for overriding defaults. Supports settings such as MTR_ROUNDS, DETAILED_TRACE, FORCE_IPV4, MAX_CONCURRENT_SHODAN_REQUESTS, MONOCHROME_MODE, and server bind address/port.

**$HOME/.asn/ipinfo_token**
> ipinfo.io API token for enhanced geolocation data.

**$HOME/.asn/iqs_token**
> IPQualityScore API token for advanced threat intelligence.

**$HOME/.asn/cloudflare_token**
> Cloudflare Radar API token for BGP incident data.

System-wide token files in /etc/asn/ are also supported and are preferred for server mode deployments.

# CAVEATS

Requires Bash v4.2 or later. Path tracing with mtr requires root privileges or CAP_NET_RAW capability. Several external dependencies must be installed: curl, whois, bind9-host (or equivalent), mtr, jq, ipcalc, grepcidr, nmap, ncat, and aha. Some features depend on optional API tokens for full functionality. The tool queries numerous external services, so an active internet connection is required.

# HISTORY

**asn** was created by **nitefood** as a quick OSINT command-line utility for investigating network data during incident response. It was featured in the Security Trails blog as a notable ASN lookup technique. The project is open source, licensed under MIT, and actively maintained with contributions from the community. It has grown from a simple lookup script into a comprehensive network reconnaissance platform with server mode, JSON API, and integration with major threat intelligence feeds.

# SEE ALSO

[mtr](/man/mtr)(8), [whois](/man/whois)(1), [nmap](/man/nmap)(1), [dig](/man/dig)(1), [traceroute](/man/traceroute)(1), [jq](/man/jq)(1), [curl](/man/curl)(1)
