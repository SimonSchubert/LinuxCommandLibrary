# TAGLINE

Conceal messages in text file whitespace

# TLDR

**Extract** message from file

```stegsnow [path/to/file.txt]```

Extract **compressed** and **password-protected** message

```stegsnow -C -p [password] [path/to/file.txt]```

Show **storage capacity**

```stegsnow -S -l 72 [path/to/file.txt]```

**Conceal** message in text file

```stegsnow -m '[message]' [path/to/file.txt] [path/to/output.txt]```

Conceal from **message file** with compression

```stegsnow -C -f [path/to/message.txt] [path/to/file.txt] [path/to/output.txt]```

Conceal with **compression and password**

```stegsnow -C -p [password] -m '[message]' [path/to/file.txt] [path/to/output.txt]```

# SYNOPSIS

**stegsnow** [**-CQS**] [**-p** _passwd_] [**-l** _line-len_] [**-f** _file_ | **-m** _message_] [_infile_ [_outfile_]]

# PARAMETERS

**-C**
> Enable compression (concealing) or decompression (extracting)

**-Q**
> Quiet mode; suppress statistics

**-S**
> Show approximate storage capacity

**-p** _password_
> Encrypt/decrypt with password (up to 1170 characters)

**-l** _line-length_
> Maximum line length (default: 80)

**-f** _file_
> Conceal contents of specified file

**-m** _message_
> Conceal specified text string

# DESCRIPTION

**stegsnow** (also known as SNOW) conceals messages in text files by appending tabs and spaces at line endings. These whitespace characters are invisible when viewing the file, providing steganographic encoding. The tool encodes data using sequences of spaces and tabs, typically storing 3 bits per 8 columns.

Features include built-in Huffman compression optimized for English text and encryption using the ICE algorithm in cipher-feedback mode. A marker tab indicates the data start position, allowing file headers to remain intact.

# CAVEATS

Storage capacity depends on line lengths in the cover file. Very short lines provide less hiding space. Non-text data should use external compression (gzip) before concealment. Whitespace-stripping tools or editors may corrupt hidden data.

# HISTORY

**SNOW** (Steganographic Nature Of Whitespace) was created by **Matthew Kwan** in **1996**. The program is one of the earliest and most well-known text-based steganography tools, using the simple but effective technique of encoding data in trailing whitespace that is invisible to casual observers.

# SEE ALSO

[steghide](/man/steghide)(1), [outguess](/man/outguess)(1), [gzip](/man/gzip)(1)
