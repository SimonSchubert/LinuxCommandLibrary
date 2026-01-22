# TLDR

**Brute-force** alphanumeric password (4-8 chars)

```fcrackzip [-b|--brute-force] [-l|--length] 4-8 [-c|--charset] aA1 [archive]```

Brute-force with **custom charset**

```fcrackzip [-v|--verbose] [-b|--brute-force] [-l|--length] 3 [-c|--charset] a:$% [archive]```

Brute-force with **special characters**

```fcrackzip [-b|--brute-force] [-l|--length] 4 [-c|--charset] a! [archive]```

Brute-force **starting** from specific password

```fcrackzip [-b|--brute-force] [-l|--length] 5 [-c|--charset] 1 [-p|--init-password] 12345 [archive]```

Crack using **wordlist**

```fcrackzip [-u|--use-unzip] [-D|--dictionary] [-p|--init-password] [wordlist] [archive]```

**Benchmark** cracking performance

```fcrackzip [-B|--benchmark]```

# SYNOPSIS

**fcrackzip** [_options_] _archive_

# DESCRIPTION

**fcrackzip** cracks password-protected ZIP archives using brute-force or dictionary attacks. It can test passwords against the archive's encryption.

Security research and recovery tool for forgotten passwords.

# PARAMETERS

**-b, --brute-force**
> Use brute-force mode

**-D, --dictionary**
> Use dictionary mode

**-l, --length** _min-max_
> Password length range

**-c, --charset** _set_
> Character set (a=lowercase, A=uppercase, 1=digits, !=special)

**-p, --init-password** _pass_
> Starting password or wordlist

**-u, --use-unzip**
> Use unzip to verify

**-v, --verbose**
> Verbose output

**-B, --benchmark**
> Performance benchmark

# CAVEATS

Use only on archives you own or have permission to access. Brute-force is slow for long passwords. Dictionary attacks are faster for common passwords.

# SEE ALSO

[zip](/man/zip)(1), [unzip](/man/unzip)(1), [john](/man/john)(1)
