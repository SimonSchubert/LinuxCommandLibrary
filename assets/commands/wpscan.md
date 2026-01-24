# TLDR

**Scan WordPress site**

```wpscan --url [https://example.com]```

**Enumerate users**

```wpscan --url [https://example.com] -e u```

**Enumerate plugins**

```wpscan --url [https://example.com] -e vp```

**Enumerate themes**

```wpscan --url [https://example.com] -e vt```

**Full enumeration**

```wpscan --url [https://example.com] -e ap,at,u```

**Password brute force**

```wpscan --url [https://example.com] -U [admin] -P [passwords.txt]```

**Use API token**

```wpscan --url [https://example.com] --api-token [TOKEN]```

**Output to file**

```wpscan --url [https://example.com] -o [output.txt]```

# SYNOPSIS

**wpscan** [_--url url_] [_-e enumerate_] [_-U user_] [_-P passwords_] [_options_]

# PARAMETERS

**--url** _URL_
> Target URL.

**-e** _LIST_
> Enumeration options.

**-U** _USER_
> Username for brute force.

**-P** _FILE_
> Password wordlist.

**--api-token** _TOKEN_
> WPScan API token.

**-o** _FILE_
> Output file.

**-f** _FORMAT_
> Output format (cli, json, etc.).

**--random-user-agent**
> Random user agent.

**--wp-content-dir** _DIR_
> wp-content directory.

**--detection-mode** _MODE_
> Detection mode (mixed, passive, aggressive).

**--force**
> Don't check if target is WordPress.

**-v**
> Verbose mode.

# ENUMERATION OPTIONS

**u**
> Users.

**vp**
> Vulnerable plugins.

**ap**
> All plugins.

**vt**
> Vulnerable themes.

**at**
> All themes.

**cb**
> Config backups.

**dbe**
> DB exports.

# DESCRIPTION

**wpscan** is a WordPress security scanner. It identifies vulnerabilities, misconfigurations, and weak credentials.

User enumeration finds valid usernames through various techniques. These can be used for targeted attacks.

Plugin and theme enumeration identifies installed components. Vulnerable plugins are a major attack vector for WordPress.

The vulnerability database requires an API token. Free tokens have limited requests; paid tokens provide more.

Password brute forcing tests credentials. Rate limiting may apply; use responsibly.

Detection modes balance stealth versus thoroughness. Aggressive mode may trigger security plugins.

# CAVEATS

Only use with authorization. May trigger security alerts. API token needed for vulnerability data. Resource intensive for full scans.

# HISTORY

**WPScan** was created by the **WPScan Team** around **2011**. It became the standard WordPress security assessment tool, used by security professionals and bug bounty hunters.

# SEE ALSO

[nmap](/man/nmap)(1), [nikto](/man/nikto)(1), [sqlmap](/man/sqlmap)(1), [burp](/man/burp)(1)
