# TLDR

Check currently **running kernel**

```sudo spectre-meltdown-checker```

Check with **explanations** of mitigations

```sudo spectre-meltdown-checker --explain```

Check **specific variants**

```sudo spectre-meltdown-checker --variant [1|2|3|3a|4|l1tf|msbds|taa]```

Output in **machine-readable format**

```sudo spectre-meltdown-checker --batch [text|json|nrpe|prometheus|short]```

Check a **non-running kernel**

```sudo spectre-meltdown-checker --kernel [path/to/kernel]```

Skip **/sys interface**

```sudo spectre-meltdown-checker --no-sysfs```

**Update** microcode database

```sudo spectre-meltdown-checker --update-fwdb```

# SYNOPSIS

**spectre-meltdown-checker** [_OPTIONS_]

# PARAMETERS

**--kernel** _file_
> Specify kernel image file to check

**--config** _file_
> Specify kernel configuration file

**--map** _file_
> Specify System.map file

**--live**
> Force live mode when files are specified

**--variant** _variant_
> Check specific vulnerability variant (repeatable)

**--cve** _cve_
> Check specific CVE (repeatable)

**--explain**
> Provide human-readable mitigation explanations

**--batch** _format_
> Machine-readable output: text, short, json, nrpe, prometheus

**--no-color**
> Disable color output

**-v, --verbose**
> Increase verbosity (repeatable)

**--paranoid**
> Apply stricter mitigation criteria

**--hw-only**
> Check CPU information only

**--no-sysfs**
> Skip /sys interface

**--sysfs-only**
> Use only /sys interface

**--update-fwdb**
> Update local CPU microcode database

# DESCRIPTION

**spectre-meltdown-checker** detects CPU vulnerabilities and verifies mitigations for Spectre, Meltdown, and related speculative execution attacks. It operates in live mode (analyzing the running kernel) or offline mode (inspecting kernel files).

The tool checks for various vulnerability variants including Spectre v1/v2, Meltdown (v3), SSB (v4), L1TF, MDS variants (MSBDS, MFBDS, MLPDS), TAA, and others. It reports vulnerability status and whether proper mitigations are in place.

# RETURN CODES

**0**: Not vulnerable
**2**: Vulnerable
**3**: Unknown status
**255**: Error occurred

# CAVEATS

Requires root privileges for full analysis. Results depend on kernel version, CPU microcode, and configuration. False positives/negatives possible on unusual configurations. Mitigations may impact performance. Keep the tool updated for new vulnerability checks.

# HISTORY

**spectre-meltdown-checker** was created by **Stephane Lesimple** in response to the Spectre and Meltdown vulnerabilities disclosed in January **2018**. These CPU vulnerabilities affected most modern processors and required coordinated disclosure with Intel, AMD, and ARM. The tool has been continuously updated to detect new speculative execution vulnerabilities.

# SEE ALSO

[lscpu](/man/lscpu)(1), [dmesg](/man/dmesg)(1), [uname](/man/uname)(1)
