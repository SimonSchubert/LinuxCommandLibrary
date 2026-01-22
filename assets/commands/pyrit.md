# TLDR

Display **benchmark** speed

```pyrit benchmark```

List **available cores**

```pyrit list_cores```

Set target **ESSID**

```pyrit -e "[ESSID]" create_essid```

**Analyze** capture file

```pyrit -r [file.cap] analyze```

**Import** passwords to database

```pyrit -i [wordlist.txt] import_passwords```

**Export** passwords

```pyrit -o [output.txt] export_passwords```

Generate **PMKs** for passwords

```pyrit batch```

**Attack** using database

```pyrit -r [file.cap] attack_db```

# SYNOPSIS

**pyrit** [**-e** _essid_] [**-r** _file_] [**-i** _file_] [**-o** _file_] _command_

# COMMANDS

**benchmark**
> Test cracking speed

**list_cores**
> Show available processing units

**create_essid**
> Create ESSID in database

**analyze**
> Analyze capture file

**import_passwords**
> Import wordlist to database

**export_passwords**
> Export passwords from database

**batch**
> Compute PMKs for all passwords

**attack_db**
> Crack password using precomputed PMKs

**attack_passthrough**
> Crack using passwords directly

# DESCRIPTION

**pyrit** accelerates WPA/WPA2 password cracking using GPU computing. It pre-computes Pairwise Master Keys (PMKs) from passwords and ESSIDs, storing them in a database for rapid testing against captured handshakes.

The tool leverages CUDA, OpenCL, and CPU cores to maximize computational throughput, making dictionary attacks against WPA significantly faster.

# CAVEATS

Authorized security testing only. GPU support requires appropriate drivers. Database can grow large. Effectiveness depends on password being in wordlist.

# HISTORY

**pyrit** was created for WiFi security research and penetration testing. It demonstrated the vulnerability of weak WPA passwords to GPU-accelerated attacks.

# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [hashcat](/man/hashcat)(1), [wifite](/man/wifite)(1)
