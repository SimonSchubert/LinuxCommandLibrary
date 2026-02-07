# TAGLINE

web directory brute-force scanner

# TLDR

Scan webserver using **default wordlist**

```dirb [https://example.org]```

Scan using **custom wordlist**

```dirb [https://example.org] [path/to/wordlist.txt]```

Scan **non-recursively**

```dirb [https://example.org] -r```

Scan with **custom user-agent and cookie**

```dirb [https://example.org] -a [user_agent_string] -c [cookie_string]```

# SYNOPSIS

**dirb** _url_ [_wordlist_] [_options_]

# DESCRIPTION

**dirb** is a web content scanner that brute-forces directories and files on HTTP-based web servers. It uses dictionary-based attacks to discover hidden resources.

Commonly used in security testing and penetration testing to find unlinked content, backup files, and administrative interfaces.

# PARAMETERS

**-r**
> Don't search recursively

**-a** _agent_
> Custom User-Agent string

**-c** _cookie_
> Set cookie for requests

**-H** _header_
> Add custom header

**-o** _file_
> Output results to file

**-z** _ms_
> Add delay between requests

**-S**
> Silent mode (don't show tested words)

# CAVEATS

Use only against authorized targets. Rate limiting may be needed to avoid detection. Default wordlists may not cover all cases. Part of security testing tools.

# SEE ALSO

[gobuster](/man/gobuster)(1), [nikto](/man/nikto)(1), [dirbuster](/man/dirbuster)(1)
