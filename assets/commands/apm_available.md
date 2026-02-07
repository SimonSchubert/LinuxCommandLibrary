# TAGLINE

Check for Advanced Power Management support

# TLDR

**Check** if APM is available

```apm_available && echo "APM supported"```

Use in **script conditionals**

```if apm_available; then apm -l; fi```

# SYNOPSIS

**apm_available**

# DESCRIPTION

**apm_available** tests whether Advanced Power Management (APM) support is available on the current system. It returns exit status 0 if APM is supported and 1 if not.

This utility is useful in scripts that need to choose between APM and ACPI for power management queries.

# CAVEATS

APM is deprecated on modern systems in favor of ACPI. Most modern hardware only supports ACPI. The tool checks for APM BIOS availability, not functionality.

# HISTORY

**apm_available** is part of the apmd package from the **1990s** and early **2000s**, when APM was the standard power management interface for PCs.

# SEE ALSO

[apm](/man/apm)(1), [acpi_available](/man/acpi_available)(1), [acpi](/man/acpi)(1)
