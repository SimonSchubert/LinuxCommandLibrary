# TAGLINE

Validate Unbound DNS configuration files

# TLDR

**Check default configuration file**

```unbound-checkconf```

**Check specific configuration file**

```unbound-checkconf [/etc/unbound/unbound.conf]```

**Print specific option value**

```unbound-checkconf -o [verbosity]```

**Check configuration quietly** (no output on success)

```unbound-checkconf -q [/etc/unbound/unbound.conf]```

# SYNOPSIS

**unbound-checkconf** [_options_] [_configfile_]

# PARAMETERS

**-h**
> Display help and exit.

**-f**
> Print full pathname with chroot applied. Use with the -o option.

**-o** _option_
> Print the value of a specific option to stdout.

**-q**
> Quiet mode, suppress output on success.

# DESCRIPTION

**unbound-checkconf** validates the Unbound DNS resolver configuration file for syntax errors and configuration problems. It checks the specified file or the default configuration location if no file is given.

The tool verifies configuration syntax, checks for valid option values, and ensures referenced files (like key files and certificates) exist and are readable. Running this before restarting Unbound prevents service disruption from configuration errors.

The -o option extracts specific configuration values, useful for scripting or verifying settings. For disabled options, an empty line is printed.

# EXIT STATUS

Returns 0 if the configuration is valid, 1 if errors are found. Error messages indicate the nature and location of problems.

# CAVEATS

Some errors (like missing auto-generated files) only appear at runtime. Does not validate remote server connectivity. Default configuration path varies by installation.

# HISTORY

**unbound-checkconf** is part of the Unbound DNS resolver developed by NLnet Labs. Unbound was designed as a modern, secure, validating recursive DNS resolver with DNSSEC support, intended as an alternative to BIND for resolver-only deployments.

# SEE ALSO

[unbound](/man/unbound)(8), [unbound-control](/man/unbound-control)(8), [unbound-host](/man/unbound-host)(1)
