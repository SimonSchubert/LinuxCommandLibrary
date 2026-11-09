# TAGLINE

Check for Advanced Power Management support

# TLDR

**Check** if APM is available

```apm_available && echo "APM supported"```

Use in **script conditionals**

```if apm_available; then apm -l; fi```

# SYNOPSIS

**apm_available**

# PARAMETERS

This command takes no arguments.

# DESCRIPTION

**apm_available** tests whether Advanced Power Management (APM) support is available on the current system by checking for the /proc/apm file. It returns exit status 0 if APM is supported, 1 if not, and 2 if arguments are supplied.

This utility is useful in scripts that need to choose between APM and ACPI for power management queries.

# CAVEATS

APM is deprecated on modern systems in favor of ACPI. Most modern hardware only supports ACPI. The tool checks for APM BIOS availability, not functionality. Debian dropped this command from powermgmt-base in version 1.35, so current releases no longer ship it.

# HISTORY

**apm_available** was added to Debian's **powermgmt-base** package, which took **on_ac_power** over from apmd, and was removed in **2019** as no longer used by anything.

# SEE ALSO

[apm](/man/apm)(1), [acpi_available](/man/acpi_available)(1), [acpi](/man/acpi)(1)

# RESOURCES

```[Source code](https://salsa.debian.org/debian/powermgmt-base)```

<!-- verified: 2026-11-09 -->
