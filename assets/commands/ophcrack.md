# TAGLINE

windows password cracker that uses rainbow tables to recover passwords from LM

# TLDR

**Crack passwords from a pwdump file** using rainbow tables

```ophcrack -g -d [path/to/tables] -f [hashes.txt]```

**Crack with specific tables** and multiple threads

```ophcrack -g -d [path/to/tables] -t [xp_free_fast] -f [hashes.txt] -n [4]```

**Crack and save results** to a file

```ophcrack -g -d [path/to/tables] -f [hashes.txt] -o [cracked.txt]```

**Enable bruteforce** alongside rainbow tables

```ophcrack -g -B -d [path/to/tables] -f [hashes.txt]```

**Run in quiet mode** with logging

```ophcrack -g -q -d [path/to/tables] -f [hashes.txt] -l [log.txt]```

**Launch GUI mode**

```ophcrack```

# SYNOPSIS

**ophcrack** [_options_]

**ophcrack** -g -d _tables_dir_ -f _hash_file_

# PARAMETERS

**-g**
> Disable GUI, run in command-line mode

**-d** _DIR_
> Specify rainbow tables base directory

**-t** _TABLES_
> Specify tables to use (table_name,start,end:...)

**-f** _FILE_
> Load hashes from pwdump or session file

**-o** _FILE_
> Write output in pwdump format

**-l** _FILE_
> Log all output to file

**-n** _NUM_
> Number of threads to use

**-a**
> Disable audit mode (default)

**-A**
> Enable audit mode

**-b**
> Disable bruteforce

**-B**
> Enable bruteforce (default)

**-c** _FILE_
> Specify configuration file

**-e**
> Do not display empty passwords

**-i**
> Hide usernames in output

**-I**
> Show usernames (default)

**-p** _NUM_
> Preload level (0=none, 1=index, 2=index+end, 3=all)

**-q**
> Quiet mode

**-r**
> Start cracking immediately (GUI only)

**-s**
> Disable session auto-saving

**-S** _FILE_
> Session file for auto-saving progress

**-u**
> Display statistics

**-D**
> Display debugging information

**-h**
> Show help

# DESCRIPTION

**ophcrack** is a Windows password cracker that uses rainbow tables to recover passwords from LM and NTLM hashes. It implements a time-memory trade-off technique, pre-computing hash chains that dramatically speed up the cracking process.

The tool can crack Windows NT, 2000, XP, Vista, 7, 8, and 10 passwords. Free rainbow tables are available for common password patterns, with paid tables offering higher success rates. It can import hashes from pwdump files, SAM/SYSTEM registry files, or by dumping directly from local/remote Windows systems.

Ophcrack provides both GUI and command-line interfaces. The GUI includes real-time graphs analyzing password strength distribution. A LiveCD version allows booting directly on a Windows machine to extract and crack passwords without installing software.

# CAVEATS

Rainbow tables require significant disk space (hundreds of MB to tens of GB). LM hashes are limited to passwords up to 14 characters and are case-insensitive. NTLM hashes are harder to crack. Success depends on having appropriate tables for the password character set. Only use on systems you own or have authorization to test.

# HISTORY

Ophcrack was developed by **Philippe Oechslin** at EPFL (Swiss Federal Institute of Technology) and first released in **2004**. Oechslin invented the rainbow table technique as an improvement over earlier time-memory trade-off methods. The tool demonstrated the weakness of LM hash storage, contributing to Microsoft's decision to deprecate LM hashes in Windows Vista and later versions.

# SEE ALSO

[hashcat](/man/hashcat)(1), [john](/man/john)(1), [pwdump](/man/pwdump)(1), [rcrack](/man/rcrack)(1)
