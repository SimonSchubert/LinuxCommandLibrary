# TLDR

**Extract hash from ZIP**

```zip2john [archive.zip] > [hash.txt]```

**Extract specific file**

```zip2john [archive.zip]::[file.txt] > [hash.txt]```

**Then crack with John**

```john [hash.txt]```

**Show cracked password**

```john --show [hash.txt]```

# SYNOPSIS

**zip2john** [_options_] _archive.zip_ [> _hash.txt_]

# DESCRIPTION

**zip2john** extracts password hashes from ZIP files. It prepares hashes for John the Ripper.

Hash extraction works on encrypted ZIPs. Both PKZIP and AES encryption.

Output is John-compatible format. Pipe to file for cracking.

Multiple files in archive handled. Each produces hash entry.

Used with John the Ripper for recovery. Dictionary and brute-force attacks.

# USAGE WORKFLOW

1. Extract hash: `zip2john archive.zip > hash.txt`
2. Crack hash: `john hash.txt`
3. View result: `john --show hash.txt`

# CAVEATS

For authorized recovery only. Strong passwords take time. Part of John the Ripper suite.

# HISTORY

**zip2john** is part of **John the Ripper** password cracker. It enables ZIP password recovery.

# SEE ALSO

[john](/man/john)(1), [rar2john](/man/rar2john)(1), [pdf2john](/man/pdf2john)(1)
