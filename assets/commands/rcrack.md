# TAGLINE

Crack password hashes using rainbow tables

# TLDR

**Crack a single hash** using rainbow tables

```rcrack [path/to/tables] -h [5d41402abc4b2a76b9719d911017c592]```

**Crack hashes from a file**

```rcrack [path/to/tables] -l [hashes.txt]```

**Crack LM hashes** from a pwdump file

```rcrack [path/to/tables] -lm [pwdump.txt]```

**Crack NTLM hashes** from a pwdump file

```rcrack [path/to/tables] -ntlm [pwdump.txt]```

**Use multiple table directories**

```rcrack [tables1/] [tables2/] -h [hash]```

# SYNOPSIS

**rcrack** _table_path_ [_table_path_...] -h _hash_

**rcrack** _table_path_ -l _hash_file_

**rcrack** _table_path_ -lm _pwdump_file_

**rcrack** _table_path_ -ntlm _pwdump_file_

# PARAMETERS

**-h** _HASH_
> Crack a single hash

**-l** _FILE_
> Load hashes from file (one per line)

**-lm** _FILE_
> Load LM hashes from pwdump file

**-ntlm** _FILE_
> Load NTLM hashes from pwdump file

**-t** _DIR_
> Rainbow tables directory

**-o** _FILE_
> Write cracked passwords to output file

**-p** _NUM_
> Number of threads to use

**-s**
> Display cracking statistics

**-u**
> Display username with cracked password

# SUPPORTED ALGORITHMS

**lm**
> LAN Manager hash (up to 7 characters)

**ntlm**
> NT LAN Manager hash (up to 15 characters)

**md5**
> MD5 hash (up to 15 characters)

**sha1**
> SHA-1 hash (up to 20 characters)

**sha256**
> SHA-256 hash (up to 20 characters)

# DESCRIPTION

**rcrack** is a rainbow table-based password cracker from the RainbowCrack project. It uses pre-computed tables to perform time-memory trade-off attacks, finding plaintext passwords from hash values much faster than brute-force methods.

Rainbow tables must be generated beforehand using **rtgen** and sorted with **rtsort**. The tables encode chains of hash computations that allow quick lookup of passwords matching a given hash. Table files have **.rt** or **.rtc** (compressed) extensions.

The tool is particularly effective against LM and NTLM hashes from Windows systems. LM hashes are split into two 7-character halves, making them especially vulnerable. NTLM is stronger but still susceptible to rainbow table attacks for common passwords.

# CAVEATS

Rainbow tables require significant storage space (gigabytes to terabytes) and must match the hash algorithm and character set of the target passwords. Salted hashes cannot be cracked with rainbow tables. Modern password storage uses salting and slow hash functions (bcrypt, scrypt) specifically to defeat rainbow table attacks. Only use on systems you own or have authorization to test.

# HISTORY

RainbowCrack was developed by **Zhu Shuanglei** (Philippe Oechslin's rainbow table concept) and first released around **2003**. The project demonstrated the practical danger of unsalted password hashes and contributed to improved password storage practices. The tool showed that LM hashes could be cracked in minutes, leading to Microsoft deprecating LM hash storage in Windows Vista.

# SEE ALSO

[ophcrack](/man/ophcrack)(1), [hashcat](/man/hashcat)(1), [john](/man/john)(1), [rtgen](/man/rtgen)(1)
