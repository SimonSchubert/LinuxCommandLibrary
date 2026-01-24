# TLDR

**Scan file with rules**

```yara [rules.yar] [file]```

**Scan directory recursively**

```yara -r [rules.yar] [directory]```

**Scan process**

```yara [rules.yar] [pid]```

**Show matching strings**

```yara -s [rules.yar] [file]```

**Show metadata**

```yara -m [rules.yar] [file]```

**Multiple rule files**

```yara [rules1.yar] [rules2.yar] [file]```

**Scan with timeout**

```yara -a [30] [rules.yar] [file]```

**Count matches**

```yara -c [rules.yar] [file]```

# SYNOPSIS

**yara** [_-r_] [_-s_] [_-m_] [_-a timeout_] [_options_] _rules_ _target_

# PARAMETERS

**-r**
> Recursive directory scan.

**-s**
> Show matching strings.

**-m**
> Show metadata.

**-c**
> Count matches only.

**-a** _SECONDS_
> Timeout per file.

**-n**
> Negate (show non-matches).

**-g**
> Show tags.

**-e**
> Show namespace.

**-w**
> Disable warnings.

**-f**
> Fast matching mode.

**-p** _N_
> Parallel threads.

**-d** _VAR=VAL_
> Define external variable.

# DESCRIPTION

**yara** matches patterns against files or processes. It's the primary tool for malware classification and detection.

Rules define patterns using strings, regular expressions, and conditions. They describe characteristics of malware families or suspicious behavior.

String matching finds literal text, hex bytes, or regex patterns. Conditions combine matches with logic for precise detection.

Process scanning examines memory of running programs. This detects malware that may not be present on disk.

Metadata in rules provides context: author, description, severity, and references. This aids incident response.

External variables enable parameterized rules. Thresholds and settings can be adjusted without modifying rules.

# CAVEATS

Rules require expertise to write well. False positives need tuning. Memory-resident malware harder to detect. Regular rule updates needed.

# HISTORY

**YARA** was created by **Victor M. Alvarez** at **VirusTotal** around **2007**. It became the standard for malware classification, used by antivirus vendors, incident responders, and researchers.

# SEE ALSO

[clamav](/man/clamav)(1), [strings](/man/strings)(1), [file](/man/file)(1), [ssdeep](/man/ssdeep)(1)
