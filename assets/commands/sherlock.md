# TAGLINE

Find usernames across social networks

# TLDR

Search for a username and **save results** to file

```sherlock [username] --output [path/to/file]```

Search **multiple usernames** saving to directory

```sherlock [username1] [username2] --folderoutput [path/to/directory]```

Search using **Tor network**

```sherlock --tor [username]```

Use **unique Tor circuit** per request

```sherlock --unique-tor [username]```

Search using a **proxy**

```sherlock [username] --proxy [proxy_url]```

Search and **open results** in browser

```sherlock [username] --browse```

Search **specific sites** only

```sherlock [username] --site github --site twitter```

# SYNOPSIS

**sherlock** [_OPTIONS_] _username_ [_username_...]

# PARAMETERS

**--output, -o** _file_
> Save results to specified file

**--folderoutput, -fo** _directory_
> Save results for multiple users to directory

**--csv**
> Output results in CSV format

**--xlsx**
> Output results in Excel format

**--site** _site_name_
> Limit search to specific site(s) (can be repeated)

**--tor, -t**
> Route requests through Tor network

**--unique-tor, -u**
> Use new Tor circuit for each request

**--proxy, -p** _url_
> Route through specified proxy (e.g., socks5://127.0.0.1:1080)

**--timeout** _seconds_
> Request timeout in seconds (default: 60)

**--print-all**
> Show all results including sites where username not found

**--print-found**
> Show only sites where username was found

**--browse, -b**
> Open found URLs in default browser

**--nsfw**
> Include NSFW sites in search

**--json, -j** _file_
> Load custom site data from JSON file

**--verbose, -v, -d, --debug**
> Show extra debugging output

**--version**
> Display version information

# DESCRIPTION

**Sherlock** is an OSINT (Open Source Intelligence) tool that searches for usernames across 400+ social networks and websites simultaneously. It helps locate online presence and connected accounts by querying each platform's user lookup functionality.

Results are saved to text files named after each searched username. The tool supports various output formats including CSV and Excel for further analysis. Network routing through Tor or proxies provides anonymity during searches.

# CAVEATS

Rate limiting by target sites may cause false negatives. Some sites require authentication or have regional restrictions. Results should be verified manually as username availability does not confirm identity. Excessive use may trigger IP blocks from target platforms. Tor routing significantly increases search time.

# HISTORY

**Sherlock** was created by **Siddharth Dushantha** and first released in **2019**. The project quickly gained popularity in the security and OSINT community for its ease of use and extensive site coverage. Named after the famous detective, it is maintained as an open-source project on GitHub with active community contributions adding new site support.

# SEE ALSO

[tor](/man/tor)(1), [curl](/man/curl)(1), [wget](/man/wget)(1)
