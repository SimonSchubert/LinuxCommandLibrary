# TAGLINE

custom wordlist generator from website content

# TLDR

Create a **wordlist** from URL with 2 links depth

```cewl -d 2 -w [path/to/wordlist.txt] [url]```

Output **alphanumeric** wordlist with minimum 5 characters

```cewl --with-numbers -m 5 [url]```

Output wordlist with **debug** and **email** addresses

```cewl --debug -e [url]```

Use HTTP **authentication**

```cewl --auth_type [basic|digest] --auth_user [username] --auth_pass [password] [url]```

Use a **proxy**

```cewl --proxy_host [host] --proxy_port [port] [url]```

# SYNOPSIS

**cewl** [_options_] _url_

# DESCRIPTION

**cewl** (Custom Word List generator) spiders a website and creates a wordlist from the content found. This wordlist can be used for password cracking, especially when targeting organizations where passwords may be based on company-specific terms.

The tool follows links to a configurable depth and extracts unique words meeting length requirements.

# PARAMETERS

**-d, --depth** _n_
> Spider to link depth n (default: 2)

**-w, --write** _file_
> Write wordlist to file

**-m, --min_word_length** _n_
> Minimum word length

**--with-numbers**
> Include words with numbers

**-e, --email**
> Include email addresses

**--debug**
> Enable debug output

**--auth_type** _type_
> Authentication type: basic or digest

**--auth_user** _user_
> Authentication username

**--auth_pass** _pass_
> Authentication password

**--proxy_host** _host_
> Proxy host

**--proxy_port** _port_
> Proxy port

# CAVEATS

Only use on websites you have authorization to spider. Aggressive spidering may trigger rate limiting or blocking. Large sites may produce very large wordlists.

# SEE ALSO

[john](/man/john)(1), [hashcat](/man/hashcat)(1), [crunch](/man/crunch)(1)
