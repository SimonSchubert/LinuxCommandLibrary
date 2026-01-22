# TLDR

**Search for exploits** by keywords

```searchsploit [apache] [struts]```

**Search in titles only**

```searchsploit -t [oracle] [windows]```

**Perform exact match search**

```searchsploit -e "[Microsoft IIS 6.0]"```

**Search by CVE ID**

```searchsploit --cve [2021-44228]```

**Copy exploit to current directory**

```searchsploit -m [39446]```

**Examine/display exploit content**

```searchsploit -x [39446]```

**Output results as JSON**

```searchsploit -j [linux kernel] [3.2]```

**Exclude terms from results**

```searchsploit [linux kernel] --exclude="(PoC)|/dos/"```

**Update the database**

```searchsploit -u```

# SYNOPSIS

**searchsploit** [_options_] _term1_ [_term2_...] [_termN_]

**searchsploit** --cve _CVE-ID_

**searchsploit** -m _EDB-ID_

# PARAMETERS

**-c**, **--case**
> Case-sensitive search

**-e**, **--exact**
> Exact match search

**-s**, **--strict**
> Strict search; disable fuzzy version matching

**-t**, **--title**
> Search exploit titles only (default: title and path)

**--exclude** _TERM_
> Exclude results containing term

**-p**, **--path**
> Show full path to exploit file

**-m**, **--mirror** _ID_
> Copy exploit to current directory

**-x**, **--examine** _ID_
> Display exploit content

**-j**, **--json**
> Output in JSON format

**-w**
> Show exploit-db.com URLs

**--cve** _ID_
> Search by CVE identifier

**--id** _ID_
> Search by Exploit-DB ID

**-u**, **--update**
> Update local database

**-h**, **--help**
> Display help

# DESCRIPTION

**searchsploit** is a command-line tool for searching the Exploit Database (exploit-db.com) archive locally. It provides offline access to thousands of public exploits, shellcodes, papers, and vulnerability information maintained by Offensive Security.

The tool searches both exploit titles and file paths by default. Multiple search terms are combined with AND logic—all terms must match. Use quotes for exact phrases and exclude patterns with **--exclude**. Results show the exploit title and local path.

Once an exploit is found, use **-m** to copy it to your current directory or **-x** to view its content. The **--cve** option searches by CVE identifier for known vulnerabilities. The database requires periodic updates with **-u**.

# CAVEATS

Exploits are provided for authorized security testing only. Many exploits require modification for specific targets. Code should be reviewed and understood before use. Some exploits may be outdated or non-functional. The local database must be updated regularly to include recent exploits.

# HISTORY

SearchSploit is part of the **Exploit Database** project maintained by **Offensive Security**, the creators of Kali Linux. The Exploit Database was launched in **2004** as a public archive of exploits for penetration testers and security researchers. SearchSploit provides offline access to this database, essential for testing in air-gapped environments. The database includes exploits from various sources and continues to grow with community contributions.

# SEE ALSO

[msfconsole](/man/msfconsole)(1), [nmap](/man/nmap)(1), [nikto](/man/nikto)(1)
