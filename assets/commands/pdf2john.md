# TLDR

**Extract hash from PDF**

```pdf2john [encrypted.pdf] > [hash.txt]```

**Multiple PDFs**

```pdf2john [file1.pdf] [file2.pdf] > [hashes.txt]```

**Then crack with John**

```john [hash.txt]```

# SYNOPSIS

**pdf2john** _file_...

# DESCRIPTION

**pdf2john** extracts password hashes from encrypted PDF files for cracking with John the Ripper. It supports PDF encryption versions used in different Acrobat versions.

The extracted hash can be used with John the Ripper or Hashcat.

# WORKFLOW

```bash
# 1. Extract hash
pdf2john document.pdf > pdf.hash

# 2. Crack with John
john --wordlist=/usr/share/wordlists/rockyou.txt pdf.hash

# 3. Show cracked password
john --show pdf.hash
```

# HASH FORMAT

```
document.pdf:$pdf$2*3*128*-4*1*16*abc123...
```

# SUPPORTED VERSIONS

```
PDF 1.1-1.3 (40-bit RC4)
PDF 1.4    (128-bit RC4)
PDF 1.5+   (128/256-bit AES)
```

# CAVEATS

Part of John the Ripper suite. Strong passwords may take long. Use legally and ethically.

# HISTORY

pdf2john is part of **John the Ripper**, the password cracker originally by **Solar Designer**, extended with format-specific extractors.

# SEE ALSO

[john](/man/john)(1), [hashcat](/man/hashcat)(1), [rar2john](/man/rar2john)(1), [zip2john](/man/zip2john)(1)
