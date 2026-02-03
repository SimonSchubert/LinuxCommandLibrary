# TLDR

**Bruteforce API endpoints**

```kr brute [https://api.example.com] -w [wordlist.txt]```

**Bruteforce with specific methods**

```kr brute [url] -w [wordlist.txt] -X GET,POST```

**Bruteforce with headers**

```kr brute [url] -w [wordlist.txt] -H "Authorization: Bearer [token]"```

# SYNOPSIS

**kr** **brute** [_options_] _target_

# PARAMETERS

**-w** _wordlist_
> Wordlist file for bruteforcing.

**-X** _methods_
> HTTP methods to use.

**-H** _header_
> Add custom header.

**-t** _threads_
> Number of concurrent threads.

**-o** _file_
> Output file.

# DESCRIPTION

**kr brute** performs traditional wordlist-based bruteforce against API endpoints. Part of Kiterunner, an API endpoint discovery tool by Assetnote. Tests various HTTP methods and paths to discover hidden endpoints.

# SEE ALSO

[kiterunner-wordlist](/man/kiterunner-wordlist)(1), [gobuster](/man/gobuster)(1)

