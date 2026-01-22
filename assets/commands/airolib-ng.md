# TLDR

**Create** a new database

```airolib-ng [database.db] --init```

**Import** a wordlist

```airolib-ng [database.db] --import passwd [wordlist.txt]```

**Import** an ESSID

```airolib-ng [database.db] --import essid [essid_file.txt]```

**Batch process** (pre-compute PMKs)

```airolib-ng [database.db] --batch```

**Verify** database integrity

```airolib-ng [database.db] --verify```

Show database **statistics**

```airolib-ng [database.db] --stats```

# SYNOPSIS

**airolib-ng** _database_ _operation_ [_options_]

# DESCRIPTION

**airolib-ng** manages databases of pre-computed Pairwise Master Keys (PMKs) for WPA/WPA2 cracking. Computing PMKs is the slow part of WPA cracking; pre-computing them for common ESSIDs and passwords dramatically speeds up attacks.

The tool creates SQLite databases that aircrack-ng can use directly, trading storage space for cracking speed.

# PARAMETERS

**--init**
> Initialize a new database

**--import passwd** _file_
> Import passwords from wordlist

**--import essid** _file_
> Import ESSIDs from file

**--import cowpatty** _file_
> Import cowpatty hash file

**--batch**
> Compute all missing PMKs

**--batch --essid** _name_
> Compute PMKs for specific ESSID

**--verify** [_all_]
> Verify database integrity

**--stats**
> Show database statistics

**--clean** [_all_]
> Remove computed PMKs

**--sql** _query_
> Execute SQL query

# CAVEATS

Pre-computation only helps for known ESSIDs. Database files can become very large. PMKs are ESSID-specific; generic wordlist attacks don't benefit. Computing PMKs is CPU-intensive.

# HISTORY

**airolib-ng** was added to the aircrack-ng suite to enable practical attacks against WPA/WPA2 networks by pre-computing the expensive PBKDF2 operations.

# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [genpmk](/man/genpmk)(1), [cowpatty](/man/cowpatty)(1)
