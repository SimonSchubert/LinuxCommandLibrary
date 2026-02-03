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

# DESCRIPTION

**hashid** is a Python tool that identifies hash types by analyzing their length and character patterns. It supports over 220 unique hash types including MD5, SHA variants, NTLM, bcrypt, and salted hashes. Useful for penetration testing and security analysis to determine which cracking tool and mode to use.

# SEE ALSO

[hashcat](/man/hashcat)(1), [john](/man/john)(1)

