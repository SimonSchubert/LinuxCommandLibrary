# TAGLINE

wireless regulatory domain agent

# TLDR

**Set the regulatory domain** for wireless

```sudo crda```

**Manually trigger regulatory** domain update

```sudo crda --help```

**Check current regulatory settings** (use iw instead)

```iw reg get```

**Set regulatory country** (use iw instead)

```sudo iw reg set [US]```

# SYNOPSIS

**crda** [_options_]

# PARAMETERS

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**CRDA** (Central Regulatory Domain Agent) is a userspace agent that provides wireless regulatory domain information to the Linux kernel. It responds to kernel requests for regulatory rules based on the configured country code.

The Linux wireless subsystem requires knowledge of regional regulations that control which frequencies, power levels, and modes wireless devices can use. Different countries have different legal restrictions on wireless spectrum, and CRDA ensures devices comply by loading the appropriate rules from a signed regulatory database.

CRDA runs automatically when the kernel needs regulatory information, typically during boot or when wireless devices are configured. The regulatory database contains country-specific rules covering permissible frequency ranges, maximum transmission power, DFS (Dynamic Frequency Selection) requirements, and indoor/outdoor restrictions. CRDA verifies the cryptographic signature of the database to prevent tampering with regulatory rules.

# CAVEATS

CRDA is considered legacy; modern Linux kernels (4.15+) can load the regulatory database directly without CRDA. The regulatory database must be properly signed. Incorrect regulatory settings can cause wireless interference or legal issues.

# HISTORY

CRDA was developed as part of the Linux wireless-regdb project to manage wireless regulatory compliance. It was created to separate regulatory policy from the kernel, allowing updates without kernel changes. Modern kernels have incorporated this functionality, making CRDA optional on newer systems.

# SEE ALSO

[iw](/man/iw)(1), [regdbdump](/man/regdbdump)(8), [wireless-regdb](/man/wireless-regdb)(7)
