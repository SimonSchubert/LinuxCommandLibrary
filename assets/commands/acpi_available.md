# TAGLINE

test for ACPI support on the system

# TLDR

**Check** if ACPI is available on the system

```acpi_available && echo "ACPI supported"```

Check exit status for **scripting**

```if acpi_available; then echo "ACPI available"; fi```

# SYNOPSIS

**acpi_available**

# DESCRIPTION

**acpi_available** is a simple utility that tests whether ACPI (Advanced Configuration and Power Interface) support is available on the current system. It returns exit status 0 if ACPI is supported and 1 if not, making it useful in shell scripts for conditional execution.

ACPI provides information about power management, thermal zones, batteries, and hardware configuration. This tool helps scripts determine whether they can use ACPI-dependent features like battery monitoring or suspend/hibernate functions.

# CAVEATS

This tool only checks for basic ACPI availability, not whether specific ACPI features (like battery or thermal) are supported. The tool is part of acpid and may not be installed by default on all systems.

# HISTORY

**acpi_available** is part of the **acpid** (ACPI daemon) package, which has been a standard component in Linux power management since the early **2000s**. It was developed to help scripts and applications detect ACPI support.

# SEE ALSO

[acpi](/man/acpi)(1), [acpid](/man/acpid)(8), [apm_available](/man/apm_available)(1)
