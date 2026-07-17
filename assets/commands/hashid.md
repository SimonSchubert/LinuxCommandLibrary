# TAGLINE

python tool that identifies hash types by analyzing their length and character

# TLDR

**Identify hash type**

```hashid '[hash]'```

**Identify from file**

```hashid [hashes.txt]```

**Show extended hash types**

```hashid -e '[hash]'```

**Show Hashcat mode numbers**

```hashid -m '[hash]'```

**Show John the Ripper formats**

```hashid -j '[hash]'```

**Output to file**

```hashid -o [output.txt] '[hash]'```

# SYNOPSIS

**hashid** [_options_] _hash_|_file_

# PARAMETERS

**-e**, **--extended**
> List all possible hash types including salted.

**-m**, **--mode**
> Show Hashcat mode numbers.

**-j**, **--john**
> Show John the Ripper formats.

**-o**, **--outfile** _file_
> Write output to file.

**-h**, **--help**
> Display help information.

**--version**
> Show program version.

# DESCRIPTION

**hashID** is a Python 3 tool that identifies hash types by analyzing their length and character patterns using regular expressions. It supports over 220 unique hash types including MD5, SHA variants, NTLM, bcrypt, and salted hashes. It can analyze a single hash, a file of hashes, or a whole directory. Useful for penetration testing and security analysis to determine which cracking tool and mode to use.

# CAVEATS

Identification is based on pattern matching (length and character set), so results are probabilistic, not definitive; many hash types share the same format (e.g. MD5 and NTLM are both 32 hex characters).

# SEE ALSO

[hashcat](/man/hashcat)(1), [john](/man/john)(1)

# RESOURCES

```[Source code](https://github.com/psypanda/hashID)```
```[Homepage](https://psypanda.github.io/hashID/)```

<!-- verified: 2026-07-17 -->
