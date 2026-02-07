# TAGLINE

validate GRUB configuration script syntax

# TLDR

Check a GRUB script file for **syntax errors**

```grub-script-check [path/to/grub.cfg]```

Display each line of input after reading (**verbose**)

```grub-script-check -v [path/to/grub.cfg]```

Check script from **stdin**

```cat [path/to/script] | grub-script-check```

Display **help**

```grub-script-check --help```

# SYNOPSIS

**grub-script-check** [_options_] [_file_]

# PARAMETERS

**-v**, **--verbose**
> Display each line of input after reading it

**--help**
> Display help message

**--version**
> Display version information

# DESCRIPTION

**grub-script-check** validates GRUB configuration scripts for syntax errors. It parses the GRUB scripting language used in configuration files like grub.cfg and reports any syntax problems.

If no file path is provided, the tool reads from standard input. This is useful for validating generated configurations or testing script fragments before deployment.

# CAVEATS

Only checks syntax, not semantic correctness. Valid syntax doesn't guarantee the configuration will boot properly. Cannot verify that referenced files or modules exist.

# HISTORY

grub-script-check is part of GRUB 2, providing validation for GRUB's configuration scripting language. The scripting capability was introduced in GRUB 2 to replace the simpler configuration format of GRUB Legacy.

# SEE ALSO

[grub-mkconfig](/man/grub-mkconfig)(8), [grub-install](/man/grub-install)(8), [update-grub](/man/update-grub)(8)
