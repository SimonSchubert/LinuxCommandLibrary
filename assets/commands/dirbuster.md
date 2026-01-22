# TLDR

Start in **GUI mode**

```dirbuster -u [http://example.com]```

Start in **headless mode**

```dirbuster -H -u [http://example.com]```

Set **file extensions** to scan

```dirbuster -e [txt,html]```

Enable **verbose output**

```dirbuster -v```

Set **report location**

```dirbuster -r [path/to/report.txt]```

# SYNOPSIS

**dirbuster** [_options_]

# DESCRIPTION

**dirbuster** brute-forces directories and filenames on web servers. It uses wordlists to discover hidden web content and has both graphical and headless modes.

Commonly used in penetration testing to find administrative interfaces, backup files, and other hidden resources.

# PARAMETERS

**-u** _url_
> Target URL

**-H**
> Headless mode (no GUI)

**-e** _extensions_
> File extensions to scan

**-v**
> Verbose output

**-r** _file_
> Report output location

**-l** _wordlist_
> Wordlist file path

**-t** _threads_
> Number of threads

# CAVEATS

Use only against authorized targets. Java-based, requires Java runtime. Consider dirb or gobuster for faster scanning. Part of Kali Linux security tools.

# SEE ALSO

[dirb](/man/dirb)(1), [gobuster](/man/gobuster)(1), [nikto](/man/nikto)(1)
