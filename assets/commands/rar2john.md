# TLDR

**Extract hash from RAR file**

```rar2john [archive.rar] > [hash.txt]```

**Multiple archives**

```rar2john [file1.rar] [file2.rar] > [hashes.txt]```

**Then crack with John**

```john [hash.txt]```

# SYNOPSIS

**rar2john** _file_...

# DESCRIPTION

**rar2john** extracts password hashes from encrypted RAR archives for cracking with John the Ripper. It supports RAR3 and RAR5 encryption formats.

Part of John the Ripper suite.

# EXAMPLES

```bash
# Extract hash
rar2john encrypted.rar > rar.hash

# Crack with wordlist
john --wordlist=/usr/share/wordlists/rockyou.txt rar.hash

# Show cracked password
john --show rar.hash

# Use hashcat instead
rar2john archive.rar | cut -d: -f2 > hash.txt
hashcat -m 13000 hash.txt wordlist.txt
```

# HASH FORMAT

```
archive.rar:$rar5$16$abc123...$15$...
```

# RAR VERSIONS

```
RAR3 - Older format, faster to crack
RAR5 - Modern format, stronger encryption
```

# CAVEATS

Part of John the Ripper jumbo. Strong passwords may take very long. Use legally and ethically.

# HISTORY

rar2john is part of **John the Ripper** by **Solar Designer** and the Openwall community, providing RAR hash extraction.

# SEE ALSO

[john](/man/john)(1), [zip2john](/man/zip2john)(1), [pdf2john](/man/pdf2john)(1), [hashcat](/man/hashcat)(1)
