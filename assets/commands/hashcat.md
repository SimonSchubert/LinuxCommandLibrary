# TAGLINE

high-performance password recovery tool that uses CPU, GPU, and other hardware

# TLDR

**Run a dictionary attack** on MD5 hashes

```hashcat -m 0 -a 0 [hashes.txt] [wordlist.txt]```

**Crack SHA-256 hashes** with a wordlist and output to file

```hashcat -m 1400 -a 0 -o [cracked.txt] [hashes.txt] [wordlist.txt]```

**Brute-force attack** with a mask (8 lowercase characters)

```hashcat -m 0 -a 3 [hashes.txt] '?l?l?l?l?l?l?l?l'```

**Run benchmark** to test system performance

```hashcat -b```

**Show already cracked passwords** from potfile

```hashcat -m 0 --show [hashes.txt]```

**Crack bcrypt hashes** using GPU

```hashcat -m 3200 -a 0 -D 2 [hashes.txt] [wordlist.txt]```

**Resume a previous session**

```hashcat --restore```

**Crack NTLM hashes** with rules

```hashcat -m 1000 -a 0 -r [rules/best64.rule] [hashes.txt] [wordlist.txt]```

# SYNOPSIS

**hashcat** [_options_] _hashfile_ [_dictionary_|_mask_]

**hashcat** -m _hashtype_ -a _attackmode_ [_options_] _hashfile_ _wordlist_

# PARAMETERS

**-m**, **--hash-type** _NUM_
> Hash type (0=MD5, 1000=NTLM, 1400=SHA256, 1800=SHA512crypt, 3200=bcrypt)

**-a**, **--attack-mode** _NUM_
> Attack mode (0=dictionary, 1=combinator, 3=brute-force, 6=hybrid, 7=hybrid)

**-o**, **--outfile** _FILE_
> Output file for recovered passwords

**-r**, **--rules-file** _FILE_
> Rule file for word mangling

**-D**, **--opencl-device-types** _NUM_
> Device types (1=CPU, 2=GPU, 3=FPGA/DSP/Co-Processor)

**-w**, **--workload-profile** _NUM_
> Workload profile (1=low, 2=default, 3=high, 4=nightmare)

**-b**, **--benchmark**
> Run benchmark on all hash types

**--show**
> Show cracked passwords from potfile

**--remove**
> Remove hashes from file once cracked

**--restore**
> Restore previous session

**--session** _NAME_
> Name session for restore capability

**--status**
> Enable automatic status updates

**--runtime** _SECS_
> Abort after specified seconds

**-1**, **-2**, **-3**, **-4**
> Define custom character sets for masks

**-i**, **--increment**
> Enable mask increment mode

**--increment-min** _NUM_
> Start mask length for increment

**--increment-max** _NUM_
> Stop mask length for increment

**-h**, **--help**
> Show help message

**-V**, **--version**
> Show version

# MASK CHARSETS

**?l**
> Lowercase letters (a-z)

**?u**
> Uppercase letters (A-Z)

**?d**
> Digits (0-9)

**?s**
> Special characters

**?a**
> All printable characters (?l?u?d?s)

**?b**
> Binary (0x00-0xff)

# DESCRIPTION

**hashcat** is a high-performance password recovery tool that uses CPU, GPU, and other hardware accelerators to crack hashed passwords. It supports over 300 hash types including MD5, SHA-family, bcrypt, WPA, and many application-specific formats.

The tool offers multiple attack modes: dictionary attacks use wordlists, brute-force uses masks to generate candidates, combinator joins words from multiple dictionaries, and hybrid modes combine approaches. Rules can transform dictionary words to match common password patterns.

Hashcat maintains a potfile storing cracked hashes to avoid redundant work. Sessions can be paused and restored. The tool automatically optimizes for available hardware and supports distributed cracking across multiple machines.

# CAVEATS

Password cracking is CPU/GPU intensive and generates significant heat. Only use on systems you own or have explicit authorization to test. Large wordlists and complex attacks may run for days or weeks. GPU drivers must be properly installed for hardware acceleration. Some hash types (bcrypt, scrypt) are intentionally slow to crack.

# HISTORY

Hashcat was created by **Jens Steube** (atom) with the first version released in **2009**. Originally closed-source, it became open-source in **December 2015**. The project evolved from CPU-only (hashcat-legacy) to GPU-accelerated (oclHashcat) and eventually unified as hashcat supporting multiple platforms. It became the world's fastest password recovery tool, pioneering techniques like rule-based attacks and optimized GPU kernels.

# SEE ALSO

[john](/man/john)(1), [hydra](/man/hydra)(1), [ophcrack](/man/ophcrack)(1), [aircrack-ng](/man/aircrack-ng)(1)
